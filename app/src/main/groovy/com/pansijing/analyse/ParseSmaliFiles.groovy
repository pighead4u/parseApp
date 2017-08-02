package com.pansijing.analyse

import groovy.io.FileType

class ParseSmaliFiles {

    def static parseSmali(String appDir) {
        def dir = new File(appDir)
        dir.eachDir { smali ->
            if (smali.getName().toLowerCase().contains("smali")) {
                recordDirs(smali)
            }

        }
    }

    def static recordDirs(File file) {
        def result = new HashSet<String>()

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

            result.add(tmpName)
        }

        WriteResult.write2File(result, "log.txt")

    }

}