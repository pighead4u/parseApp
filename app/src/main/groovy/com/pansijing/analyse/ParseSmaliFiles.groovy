package com.pansijing.analyse

import groovy.io.FileType

class ParseSmaliFiles {

    def static parseSmali(String appDir) {
        def dir = new File(appDir)
        def result = new HashSet()
        dir.eachDir { smali ->
            if (smali.getName().toLowerCase().contains("smali")) {
                def data = recordDirs(smali)
                result.addAll(data)

            }

        }

        PrintUtils.printMessage("parse smali finish!!!")

        result
    }

    def static recordDirs(File file) {
        def data = new HashSet<String>()

        file.traverse(type: FileType.FILES,
                nameFilter: ~/.*\.smali/
        ) {
            def index = it.getAbsolutePath().indexOf("smali")
            def tmpName = it.getAbsolutePath().substring(index)
            tmpName = tmpName.replace('\\', '.')
            index = tmpName.indexOf(".")
            tmpName = tmpName.substring(index + 1)
            tmpName = tmpName.reverse()
            index = tmpName.indexOf(".")
            tmpName = tmpName.substring(index + 1)
            index = tmpName.indexOf(".")
            tmpName = tmpName.substring(index + 1)
            tmpName = tmpName.reverse()

            data.add(tmpName)
        }

        data

    }

}