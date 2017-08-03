package com.pansijing.analyse

import brut.androlib.ApkDecoder

class DecompressAPK {

    def static decompress(String source, String dest) {
        PrintUtils.printMessage("start decompressing ${source}")

        ApkDecoder decoder = new ApkDecoder()

        File apkFile = new File(source)
        decoder.setApkFile(apkFile)

        def data = FileNameUtils.getFileName(source)
        File outDir = new File(dest + File.separator + data)
        decoder.setOutDir(outDir)

        decoder.decode()

        decoder.close()

        PrintUtils.printMessage("decompress apk finish!!!")

        outDir.getAbsolutePath()

    }


}