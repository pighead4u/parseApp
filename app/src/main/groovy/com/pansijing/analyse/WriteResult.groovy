package com.pansijing.analyse


class WriteResult {

    def static write2File(Set<String> data, String destFile) {
        PrintUtils.printMessage("start writing to file :${destFile}")

        def result = new ArrayList()

        result.addAll(data)

        Collections.sort(result)

        new File(destFile).withWriter("utf-8") { writer ->

            for (String item : result) {
                writer.writeLine item
            }

        }

        PrintUtils.printMessage("finish writing to file :${destFile}")


    }


}