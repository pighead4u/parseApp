package com.pansijing.analyse

import brut.androlib.ApkDecoder
import brut.androlib.err.CantFindFrameworkResException
import brut.androlib.err.InFileNotFoundException
import brut.androlib.err.OutDirExistsException
import brut.directory.DirectoryException

class DecompressAPK {

    def static decompress(String source, String dest) {
        ApkDecoder decoder = new ApkDecoder()

        File apkFile = new File(source);
        decoder.setApkFile(apkFile)

        File outDir = new File(dest + File.separator + "app");
        decoder.setOutDir(outDir)

        try {
            decoder.decode();
        } catch (OutDirExistsException var22) {
            System.err.println("Destination directory ( ${outDir.getAbsolutePath()} ) already exists. Use -f switch if you want to overwrite it.");
            System.exit(1);
        } catch (InFileNotFoundException var23) {
            System.err.println("Input file (${source}) was not found or was not readable.");
            System.exit(1);
        } catch (CantFindFrameworkResException var24) {
            System.err.println("Can\'t find framework resources for package of id: " + String.valueOf(var24.getPkgId()) + ". You must install proper framework files, see project website for more info.");
            System.exit(1);
        } catch (IOException var25) {
            System.err.println("Could not modify file. Please ensure you have permission.");
            System.exit(1);
        } catch (DirectoryException var26) {
            System.err.println("Could not modify internal dex files. Please ensure you have permission.");
            System.exit(1);
        } finally {
            try {
                decoder.close();
                return outDir.getAbsolutePath()
            } catch (IOException var21) {
                ;
            }

        }
    }
}