package com.pansijing.analyse

import brut.androlib.ApkDecoder

class DecompressAPK {

    def static decompress(String source, String dest) {
        ApkDecoder decoder = new ApkDecoder()

        File apkFile = new File(source);
        decoder.setApkFile(apkFile)

        // todo 需要自动对被解析的每个app创建他们自己的文件夹
        File outDir = new File(dest + File.separator + "app")
        decoder.setOutDir(outDir)

        decoder.decode()

        decoder.close()

        PrintUtils.printMessage("decompress apk finish!!!")

        outDir.getAbsolutePath()

    }
}