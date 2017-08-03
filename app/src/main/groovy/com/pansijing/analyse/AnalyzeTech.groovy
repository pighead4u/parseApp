package com.pansijing.analyse

/**
 * @author pighead4u
 * @time 2017/8/3-9:14.
 * @desc 分析反编译的包名，推测出技术
 */
class AnalyzeTech {

    def static parseJsonTech(Set<String> data) {
        def gson = "com.google.gson"
        def fastJson = "com.alibaba.fastjson"

        if (data.contains(gson)) {
            PrintUtils.printMarkdownMessage("JSON序列化框架：gson")
        }
        if (data.contains(fastJson)) {
            PrintUtils.printMarkdownMessage("JSON序列化框架：fastjson")
        }


    }

    def static parseImageLoader(Set<String> data) {
        def glide = "com.bumptech.glide"
        def picasso = "com.squareup.picasso"
        def universalimageloader = "com.nostra13.universalimageloader.core"

        if (data.contains(glide)) {
            PrintUtils.printMarkdownMessage("图片加载框架：glide")
        }

        if (data.contains(picasso)) {
            PrintUtils.printMarkdownMessage("图片加载框架：picasso")
        }

        if (data.contains(universalimageloader)) {
            PrintUtils.printMarkdownMessage("图片加载框架：universalimageloader")
        }

    }

    def static parseMapTech(Set<String> data) {
        def baiduMap = "com.baidu.location"
        def gaoDeMap = "com.amap.api.maps"

        if (data.contains(baiduMap)) {
            PrintUtils.printMarkdownMessage("定位与地图：百度地图")
        }
        if (data.contains(gaoDeMap)) {
            PrintUtils.printMarkdownMessage("定位与地图：高德地图")
        }
    }

    def static parsePayTech(Set<String> data) {
        def alipay = "com.alipay.sdk"
        def union = "com.unionpay"
        def weiXin = "com.wxapi"
        def jd = "com.jdpaysdk.author"

        if (data.contains(alipay)) {
            PrintUtils.printMarkdownMessage("支付：支付宝")
        }

        if (data.contains(union)) {
            PrintUtils.printMarkdownMessage("支付：银联支付")
        }

        if (data.contains(weiXin)) {
            PrintUtils.printMarkdownMessage("支付：微信支付")
        }

        if (data.contains(jd)) {
            PrintUtils.printMarkdownMessage("支付：JD支付")
        }
    }

    def static parsePush(Set<String> data) {
        def xiaoMiPush = "com.xiaomi.push.thrift"
        def umengPush = "com.ta.utdid2"
        def jPush = "cn.jpush.android"
        def geTui = "com.igexin"
        def baiduPush = "com.baidu.android.pushservice"
        def gsm = "com.google.android.gms"

        if (data.contains(xiaoMiPush)) {
            PrintUtils.printMarkdownMessage("推送技术：小米推送")
        }
        if (data.contains(umengPush)) {
            PrintUtils.printMarkdownMessage("推送技术：umeng推送")
        }
        if (data.contains(jPush)) {
            PrintUtils.printMarkdownMessage("推送技术：极光推送")
        }
        if (data.contains(geTui)) {
            PrintUtils.printMarkdownMessage("推送技术：个推推送")
        }
        if (data.contains(baiduPush)) {
            PrintUtils.printMarkdownMessage("推送技术：百度推送")
        }
        if (data.contains(gsm)) {
            PrintUtils.printMarkdownMessage("推送技术：google-gsm推送")
        }
    }

    def static parseNetwork(Set<String> data) {
        def asyncHttp = "com.loopj.android.http"
        def okhttp2 = "com.squareup.okhttp"
        def okhttp3 = "okhttp3"
        def retrofit2 = "retrofit2"
        def androidAsync = "com.koushikdutta.async"

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

        if (data.contains(androidAsync)) {
            PrintUtils.printMarkdownMessage("网络请求使用：androidAsync")
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
        def kotlin = "kotlin"
        def wall = "com.meituan.android.walle"

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

        if (data.contains(kotlin)) {
            PrintUtils.printMarkdownMessage("新技术：kotlin")
        }

        if (data.contains(wall)) {
            PrintUtils.printMarkdownMessage("新技术：美团快速打包-wall")
        }
    }

    def static parsePullToRefresh(Set<String> data) {
        def pullToRefresh = "com.handmark.pulltorefresh.library"
        def cube = "in.srain.cube.views.ptr"
        def shiZheFei = "com.shizhefei.fragment"
        def tkRefresh = "com.lcodecore.tkrefreshlayout"

        if (data.contains(pullToRefresh)) {
            PrintUtils.printMarkdownMessage("下拉刷新技术：pullToRefresh（这个技术有点过时）")
        }
        if (data.contains(cube)) {
            PrintUtils.printMarkdownMessage("下拉刷新技术：比较强大的下拉刷新控件")
        }

        if (data.contains(shiZheFei)) {
            PrintUtils.printMarkdownMessage("下拉刷新技术：主要用于下拉刷新加载，失败，加载，空数据，成功的界面切换")
        }
        if (data.contains(tkRefresh)) {
            PrintUtils.printMarkdownMessage("下拉刷新技术：tkRefresh下拉刷新")
        }
    }

    def static parseIMTech(Set<String> data) {
        def tecentZhiBoDanMu = "com.tencent.mm.sdk";
        def yunXin = "com.netease.nimlib"
        def shengWang = "io.agora.rtc"

        if (data.contains(tecentZhiBoDanMu)) {
            PrintUtils.printMarkdownMessage("IM：直播时的聊天--腾讯IM")
        }
        if (data.contains(yunXin)) {
            PrintUtils.printMarkdownMessage("IM：云信")
        }
        if (data.contains(shengWang)) {
            PrintUtils.printMarkdownMessage("IM：声网")
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
        def pdfium = "com.shockwave.pdfium"
        def pdfviewer = "com.github.barteksc.pdfviewer"
        def textView = "co.lujun.androidtagview"
        def eventbus = "org.greenrobot.eventbus"
        def photoview = "uk.co.senab.photoview"
        def zxing = "com.google.zxing"
        def umeng = "com.umeng"
        def bugly = "com.tencent.bugly"
        def ormlite = "com.j256.ormlite"
        def dbflow = "com.raizlabs.android.dbflow"
        def greenDao = "org.greenrobot.greendao"
        def tinker = "com.tencent.tinker.lib"
        def multidex = "android.support.multidex"
        def freeline = "com.antfortune.freeline"
        def blockcanary = "com.github.moduth.blockcanary"
        def leakcanary = "com.squareup.leakcanary"
        def qiNiuZhiBo = "com.pili.pldroid.player"
        def baoFeng = "tv.cjump.jni"
        def jieCao = "fm.jiecao.jcvideoplayer_lib"
        def ijk = "tv.danmaku.ijk.media.player"
        def exoplayer2 = "com.google.android.exoplayer2"
        def talkFun = "com.talkfun.media.player"
        def tongYongRecycleView = "com.zhy.adapter.recyclerview"
        def stetho = "com.facebook.stetho"
        def ucrop = "com.yalantis.ucrop"
        def danMu = "master.flame.danmaku.danmaku.danmaku.parser"
        def pinYin = "net.sourceforge.pinyin4j"
        def xUilts = "org.xutils.xutils"
        def gif = "pl.droidsonroids.gif"
        def viewPager = "net.lucode.hackware.magicindicator"
        def excel = "cn.zhouchaoyuan.excelpanel"
        def actionSheet = "com.baoyz.actionsheet"
        def pickerView = "com.bigkoo.pickerview"
        def boxing = "com.bilibili.boxing"
        def charting = "com.github.mikephil.charting"
        def progressbar = "com.daimajia.numberprogressbar"
        def aviProgressbar = "com.wang.avi"
        def statusbar = "com.jaeger.library"
        def roundImageView = "com.joooonho"
        def commonadapter = "com.mcxtzhang.commonadapter"
        def chuckHttp = "com.readystatesoftware.chuck"
        def klog = "com.socks.klog"
        def banner = "com.stx.xhb.xbanner"
        def autoLayout = "com.zhy.autolayout"
        def fileDownload = "com.liulishuo.filedownloader"
        def weibo = "com.sina.weibo.sdk"


        if (data.contains(indicator)) {
            PrintUtils.printMarkdownMessage("others：viewpager的indicator")
        }

        if (data.contains(pdf)) {
            PrintUtils.printMarkdownMessage("others：pdf的sdk")
        }

        if (data.contains(pdfium)) {
            PrintUtils.printMarkdownMessage("others：pdf的sdk--pdfium")
        }

        if (data.contains(pdfviewer)) {
            PrintUtils.printMarkdownMessage("others：pdf的sdk--pdfviewer")
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

        if (data.contains(bugly)) {
            PrintUtils.printMarkdownMessage("others：crash统计-bugly")
        }

        if (data.contains(ormlite)) {
            PrintUtils.printMarkdownMessage("others：ORM框架-ormlite")
        }

        if (data.contains(dbflow)) {
            PrintUtils.printMarkdownMessage("others：ORM框架-dbflow")
        }

        if (data.contains(greenDao)) {
            PrintUtils.printMarkdownMessage("others：ORM框架-greenDao")
        }

        if (data.contains(tinker)) {
            PrintUtils.printMarkdownMessage("others：热修复技术-tinker")
        }

        if (data.contains(multidex)) {
            PrintUtils.printMarkdownMessage("others：多dex-jar引用过多")
        }

        if (data.contains(freeline)) {
            PrintUtils.printMarkdownMessage("others：freeline加速开发编译")
        }

        if (data.contains(blockcanary)) {
            PrintUtils.printMarkdownMessage("others：blockcanary检测界面卡顿")
        }

        if (data.contains(leakcanary)) {
            PrintUtils.printMarkdownMessage("others：leakcanary检测内存泄漏")
        }

        if (data.contains(qiNiuZhiBo)) {
            PrintUtils.printMarkdownMessage("others：7牛直播sdk")
        }

        if (data.contains(baoFeng)) {
            PrintUtils.printMarkdownMessage("others：暴风直播sdk")
        }

        if (data.contains(jieCao)) {
            PrintUtils.printMarkdownMessage("others：节操播放器")
        }

        if (data.contains(ijk)) {
            PrintUtils.printMarkdownMessage("others：ijk直播sdk")
        }

        if (data.contains(exoplayer2)) {
            PrintUtils.printMarkdownMessage("others：google播放器exoplayer2")
        }

        if (data.contains(talkFun)) {
            PrintUtils.printMarkdownMessage("others：欢拓云播放器")
        }

        if (data.contains(tongYongRecycleView)) {
            PrintUtils.printMarkdownMessage("others：通用recycleview")
        }

        if (data.contains(stetho)) {
            PrintUtils.printMarkdownMessage("others：facebook网络调试工具-stetho")
        }

        if (data.contains(ucrop)) {
            PrintUtils.printMarkdownMessage("others：图片裁剪库")
        }

        if (data.contains(danMu)) {
            PrintUtils.printMarkdownMessage("others：烈焰大幕库-来自大B站")
        }

        if (data.contains(pinYin)) {
            PrintUtils.printMarkdownMessage("others：查询汉字拼音")
        }

        if (data.contains(xUilts)) {
            PrintUtils.printMarkdownMessage("others：xutils工具框架")
        }

        if (data.contains(gif)) {
            PrintUtils.printMarkdownMessage("others：gif框架")
        }

        if (data.contains(viewPager)) {
            PrintUtils.printMarkdownMessage("others：千变万化的ViewPager指示器")
        }

        if (data.contains(excel)) {
            PrintUtils.printMarkdownMessage("others：excel效果")
        }

        if (data.contains(actionSheet)) {
            PrintUtils.printMarkdownMessage("others：仿ios的ActionSheet菜单 ")
        }

        if (data.contains(pickerView)) {
            PrintUtils.printMarkdownMessage("others：图片选择器 ")
        }

        if (data.contains(boxing)) {
            PrintUtils.printMarkdownMessage("others：bilibili的多媒体选择器 ")
        }

        if (data.contains(charting)) {
            PrintUtils.printMarkdownMessage("others：图表库 ")
        }

        if (data.contains(progressbar)) {
            PrintUtils.printMarkdownMessage("others：daimajia的progressbar ")
        }

        if (data.contains(aviProgressbar)) {
            PrintUtils.printMarkdownMessage("others：avi的progressbar ")
        }

        if (data.contains(statusbar)) {
            PrintUtils.printMarkdownMessage("others：沉浸式的statusbar ")
        }

        if (data.contains(roundImageView)) {
            PrintUtils.printMarkdownMessage("others：圆形图片 ")
        }

        if (data.contains(commonadapter)) {
            PrintUtils.printMarkdownMessage("others：搞定所有viewgroup的adapter ")
        }

        if (data.contains(chuckHttp)) {
            PrintUtils.printMarkdownMessage("others：OkHttp客户端的应用程序内HTTP检查器 ")
        }

        if (data.contains(klog)) {
            PrintUtils.printMarkdownMessage("others：klog日志工具 ")
        }

        if (data.contains(banner)) {
            PrintUtils.printMarkdownMessage("others：图片轮播 ")
        }

        if (data.contains(autoLayout)) {
            PrintUtils.printMarkdownMessage("others：自动布局 ")
        }

        if (data.contains(fileDownload)) {
            PrintUtils.printMarkdownMessage("others：流利说的filedownload ")
        }

        if (data.contains(weibo)) {
            PrintUtils.printMarkdownMessage("others：weibo分享sdk ")
        }
    }
}
