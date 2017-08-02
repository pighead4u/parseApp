package com.pansijing.analyse

class Main {

    static final SOURCE_DIR = "D:\\workspace\\parseapk\\apks"
    static final OUTPUT_DIR = "D:\\workspace\\parseapk\\decompession"

    static void main(String[] args) {
        def dir = new File(SOURCE_DIR)

        dir.eachFile { file ->

//            String decompessDir = DecompressAPK.decompress(file.getAbsolutePath(), OUTPUT_DIR)
            String decompessDir = OUTPUT_DIR + File.separator + "app"
            ParseSmaliFiles.parseSmali(decompessDir)

        }
    }
}