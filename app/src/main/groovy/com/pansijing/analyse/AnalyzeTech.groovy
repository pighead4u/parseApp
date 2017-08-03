package com.pansijing.analyse

/**
 * @author pighead4u
 * @time 2017/8/3-9:14.
 * @desc 分析反编译的包名，推测出技术
 */
class AnalyzeTech {

    def static parseJsonTech(Set<String> data) {
        def gson = "com.google.gson"

        if (data.contains(gson)) {
            PrintUtils.printMarkdownMessage("JSON序列化框架：gson")
        }


    }

    def static parseImageLoader(Set<String> data) {
        def glide = "com.bumptech.glide"
        def picasso = "com.squareup.picasso"

        if (data.contains(glide)) {
            PrintUtils.printMarkdownMessage("图片加载框架：glide")
        }

        if (data.contains(picasso)) {
            PrintUtils.printMarkdownMessage("图片加载框架：picasso")
        }

    }

    def static parseMapTech(Set<String> data) {
        def baiduMap = "com.baidu.location"

        if (data.contains(baiduMap)) {
            PrintUtils.printMarkdownMessage("定位与地图：百度地图")
        }
    }

    def static parsePayTech(Set<String> data) {
        def alipay = "com.alipay.sdk"
        def union = "com.unionpay"

        if (data.contains(alipay)) {
            PrintUtils.printMarkdownMessage("支付：支付宝")
        }

        if (data.contains(union)) {
            PrintUtils.printMarkdownMessage("支付：银联支付")
        }
    }

    def static parsePush(Set<String> data) {
        def xiaoMiPush = "com.xiaomi.push.thrift"
        def umengPush = "com.ta.utdid2"

        if (data.contains(xiaoMiPush)) {
            PrintUtils.printMarkdownMessage("推送技术：小米推送")
        }
        if (data.contains(umengPush)) {
            PrintUtils.printMarkdownMessage("推送技术：umeng推送")
        }
    }

    def static parseNetwork(Set<String> data) {
        def asyncHttp = "com.loopj.android.http"
        def okhttp2 = "com.squareup.okhttp"
        def okhttp3 = "okhttp3"
        def retrofit2 = "retrofit2"

        if (data.contains(asyncHttp)) {
            PrintUtils.printMarkdownMessage("网络请求使用：async-http")
        }

        if (data.contains(okhttp2)) {
            PrintUtils.printMarkdownMessage("网络请求使用：okhttp2/1")
        }

        if (data.contains(okhttp3)) {
            PrintUtils.printMarkdownMessage("网络请求使用：okhttp3")
        }

        if (data.contains(retrofit2)) {
            PrintUtils.printMarkdownMessage("网络请求使用：retrofit2")
        }

    }

    def static parseNewTech(Set<String> data) {
        def databinding = "android.databinding"
        def rx1 = "rx"
        def rx2 = "io.reactivex"
        def upnp = "org.bitlet.weupnp"
        def thrift = "org.apache.thrift"
        def xunfei = "com.iflytek.cloud"
        def kuaiSuDaBao = "com.mcxiaoke.packer"
        def rxbinding = "com.jakewharton.rxbinding"
        def tingYun = "com.networkbench.agent"
        def recovery = "com.zxy.recovery"
        def rxpermisson = "com.tbruyelle.rxpermissions"

        if (data.contains(databinding)) {
            PrintUtils.printMarkdownMessage("新技术：尝试了mvvm的项目结构")
        }

        if (data.contains(rx1)) {
            PrintUtils.printMarkdownMessage("新技术：使用类rxjava的版本为1")
        }

        if (data.contains(rx2)) {
            PrintUtils.printMarkdownMessage("新技术；使用类rxjava的版本为2")
        }

        if (data.contains(upnp)) {
            PrintUtils.printMarkdownMessage("新技术：UPnP 是各种各样的智能设备、无线设备和个人电脑等实现遍布全球的对等网络连接（P2P）的结构。UPnP 是一种分布式的，开放的网络架构。UPnP 是独立的媒介。")
        }

        if (data.contains(thrift)) {
            PrintUtils.printMarkdownMessage("新技术：可伸缩的跨语言服务开发框架 thrift")
        }

        if (data.contains(xunfei)) {
            PrintUtils.printMarkdownMessage("新技术：使用了讯飞语音")
        }

        if (data.contains(kuaiSuDaBao)) {
            PrintUtils.printMarkdownMessage("新技术：快速打包技术")
        }

        if (data.contains(rxbinding)) {
            PrintUtils.printMarkdownMessage("新技术：rxbingding技术")
        }

        if (data.contains(tingYun)) {
            PrintUtils.printMarkdownMessage("新技术：apm--听云")
        }

        if (data.contains(recovery)) {
            PrintUtils.printMarkdownMessage("新技术：Android Crash框架Recovery")
        }

        if (data.contains(rxpermisson)) {
            PrintUtils.printMarkdownMessage("新技术：rxpermission")
        }
    }

    def static parsePullToRefresh(Set<String> data) {
        def pullToRefresh = "com.handmark.pulltorefresh.library"
        def cube = "in.srain.cube.views.ptr"
        def shiZheFei = "com.shizhefei.fragment"

        if (data.contains(pullToRefresh)) {
            PrintUtils.printMarkdownMessage("下拉刷新技术：pullToRefresh（这个技术有点过时）")
        }
        if (data.contains(cube)) {
            PrintUtils.printMarkdownMessage("下拉刷新技术：比较强大的下拉刷新控件")
        }

        if (data.contains(shiZheFei)) {
            PrintUtils.printMarkdownMessage("下拉刷新技术：主要用于下拉刷新加载，失败，加载，空数据，成功的界面切换")
        }
    }

    def static parseIMTech(Set<String> data) {
        def tecentZhiBoDanMu = "com.tencent.mm.sdk";
        def yunXin = "com.netease.nimlib"

        if (data.contains(tecentZhiBoDanMu)) {
            PrintUtils.printMarkdownMessage("IM：直播时的聊天--腾讯IM")
        }
        if (data.contains(yunXin)) {
            PrintUtils.printMarkdownMessage("IM：云信")
        }
    }

    def static parseKeFu(Set<String> data) {
        def zhiChi = "com.sobot.chat"
        def huanXin = "com.easemob"

        if (data.contains(zhiChi)) {
            PrintUtils.printMarkdownMessage("客服：智齿客服")
        }

        if (data.contains(huanXin)) {
            PrintUtils.printMarkdownMessage("客服：环信")
        }
    }

    def static parseOthers(Set<String> data) {
        def indicator = "com.viewpagerindicator"
        def pdf = "com.artifex.mupdfdemo"
        def textView = "co.lujun.androidtagview"
        def eventbus = "org.greenrobot.eventbus"
        def photoview = "uk.co.senab.photoview"
        def zxing = "com.google.zxing"
        def umeng = "com.umeng"
        def ormlite = "com.j256.ormlite"
        def tinker = "com.tencent.tinker.lib"
        def multidex = "android.support.multidex"

        if (data.contains(indicator)) {
            PrintUtils.printMarkdownMessage("others：viewpager的indicator")
        }

        if (data.contains(pdf)) {
            PrintUtils.printMarkdownMessage("others：pdf的sdk")
        }

        if (data.contains(textView)) {
            PrintUtils.printMarkdownMessage("others：文本显示")
        }

        if (data.contains(eventbus)) {
            PrintUtils.printMarkdownMessage("others：消息总线技术-eventbus")
        }

        if (data.contains(photoview)) {
            PrintUtils.printMarkdownMessage("others：使用了图片放大缩小库")
        }

        if (data.contains(zxing)) {
            PrintUtils.printMarkdownMessage("others：二维码识别技术-zxing")
        }

        if (data.contains(umeng)) {
            PrintUtils.printMarkdownMessage("others：crash统计-umeng")
        }

        if (data.contains(ormlite)) {
            PrintUtils.printMarkdownMessage("others：ORM框架-ormlite")
        }

        if (data.contains(tinker)) {
            PrintUtils.printMarkdownMessage("others：热修复技术-tinker")
        }

        if (data.contains(multidex)) {
            PrintUtils.printMarkdownMessage("others：多dex-jar引用过多")
        }
    }
}
