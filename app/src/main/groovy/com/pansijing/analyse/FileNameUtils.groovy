package com.pansijing.analyse

/**
 * @author pighead4u
 * @time 2017/8/3-14:58.
 * @desc 提取文件名的工具类
 */
class FileNameUtils {

    def static getFileName(String source) {
        source = source.reverse()
        def index = source.indexOf("\\")
        def subSource = source.substring(0, index).reverse()
        index = subSource.indexOf(".apk")

        subSource = subSource.substring(0, index)
    }
}
