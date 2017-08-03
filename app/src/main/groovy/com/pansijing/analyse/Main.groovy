package com.pansijing.analyse

class Main {

    static final SOURCE_DIR = "D:\\workspace\\parseapk\\apks"
    static final OUTPUT_DIR = "D:\\workspace\\parseapk\\decompession"
    static final PARSE_DIR = "D:\\workspace\\parseapk\\parse\\"

    static void main(String[] args) {
        def dir = new File(SOURCE_DIR)

        dir.eachFile { file ->

            String decompessDir = DecompressAPK.decompress(file.getAbsolutePath(), OUTPUT_DIR)
            def data = ParseSmaliFiles.parseSmali(decompessDir)

            def parseFileName = FileNameUtils.getFileName(file.getAbsolutePath())
            parseFileName = PARSE_DIR + parseFileName
            WriteResult.write2File(data, "${parseFileName}.txt")

            parseTech(data, parseFileName)

        }
    }

    static void parseTech(Set<String> data, String parseFileName) {
        PrintUtils.createMarkdownFile("${parseFileName}.md", "学而思android-app技术分析")
        AnalyzeTech.parseJsonTech(data)
        AnalyzeTech.parseImageLoader(data)
        AnalyzeTech.parseMapTech(data)
        AnalyzeTech.parsePayTech(data)
        AnalyzeTech.parsePush(data)
        AnalyzeTech.parseNetwork(data)
        AnalyzeTech.parsePullToRefresh(data)
        AnalyzeTech.parseIMTech(data)
        AnalyzeTech.parseKeFu(data)
        AnalyzeTech.parseOthers(data)
        AnalyzeTech.parseNewTech(data)

    }
}