package com.pansijing.analyse


class WriteResult {

    def static write2File(List<String> data, String destFile) {
        PrintUtils.printMessage("start writing to file :${destFile}")

        new File(destFile).withWriter("utf-8") { writer ->

            for (String item : data) {
                writer.writeLine item
            }

        }

        PrintUtils.printMessage("finish writing to file :${destFile}")


    }


}