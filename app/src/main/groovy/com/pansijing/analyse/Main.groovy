package com.pansijing.analyse

class Main {

    static final SOURCE_DIR = "D:\\workspace\\parseapk\\apks"
    static final OUTPUT_DIR = "D:\\workspace\\parseapk\\decompession"

    static void main(String[] args) {
        def dir = new File(SOURCE_DIR)

        dir.eachFile { file ->

//            String decompessDir = DecompressAPK.decompress(file.getAbsolutePath(), OUTPUT_DIR)
            String decompessDir = OUTPUT_DIR + File.separator + "app"
            def data = ParseSmaliFiles.parseSmali(decompessDir)

            WriteResult.write2File(data, "log.txt")

            parseTech(data)

        }
    }

    static void parseTech(Set<String> data) {
        PrintUtils.createMarkdownFile("hello.md", "学而思android-app技术分析")
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