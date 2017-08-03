package com.pansijing.analyse

/**
 * @author pighead4u
 * @time 2017/8/3-9:15.
 * @desc 打印工具类
 */
class PrintUtils {

    static File sFile

    def static createMarkdownFile(String fileName, String title) {
        sFile = new File(fileName)
        if (!sFile.exists()) {
            if (sFile.createNewFile()) {
                println("create ${fileName} success!!!")
            } else {
                println("create ${fileName} faiiled!!!")
            }
        }

        sFile.append("# 技术分析 \n")
        sFile.append("* author: zhuhuanhuan \n")
        sFile.append("* time: ${new Date().toString()} \n")
        sFile.append("* version: 1.0.0 \n\n")
        sFile.append("## ${title} \n")


    }

    def static printMarkdownMessage(String message) {
        sFile.append("* ${message} \n")
    }

    def static printMessage(String message) {
        println("========================================")
        println(message)
        println("========================================")
    }
}
