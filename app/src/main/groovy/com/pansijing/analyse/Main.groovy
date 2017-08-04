package com.pansijing.analyse

import com.pansijing.analyse.dao.PackageDAO
import com.pansijing.analyse.db.DatabaseHelper

class Main {

    static final SOURCE_DIR = "D:\\workspace\\parseapk\\apks"
    static final OUTPUT_DIR = "D:\\workspace\\parseapk\\decompession"
    static final PARSE_DIR = "D:\\workspace\\parseapk\\parse\\"

    static void main(String[] args) {
        def dir = new File(SOURCE_DIR)

        dir.eachFile { file ->

            String decompessDir = DecompressAPK.decompress(file.getAbsolutePath(), OUTPUT_DIR)
            def data = ParseSmaliFiles.parseSmali(decompessDir)

            def result = new ArrayList()

            result.addAll(data)

            Collections.sort(result)

            def parseFileName = FileNameUtils.getFileName(file.getAbsolutePath())
            parseFileName = PARSE_DIR + parseFileName
            WriteResult.write2File(result, "${parseFileName}.txt")

            parseTech(result, parseFileName)

        }
    }

    static void parseTech(List<String> data, String parseFileName) {
        PrintUtils.createMarkdownFile("${parseFileName}.md", "android-app技术分析")
        DatabaseHelper.initTable()

        data.each {
            def packageInfo = PackageDAO.getInstance().getPackageInfoByName(it)
            if (packageInfo != null) {
                PrintUtils.printMarkdownMessage(packageInfo.msg)
            }
        }

        PrintUtils.printFlush()

    }

}