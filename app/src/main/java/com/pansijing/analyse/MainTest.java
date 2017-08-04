package com.pansijing.analyse; /**
 * Created by MirsFang on 2017/8/4.
 */

import com.pansijing.analyse.dao.PackageDAO;
import com.pansijing.analyse.db.DatabaseHelper;
import com.pansijing.analyse.model.PackageInfo;

import java.util.List;

/***
 *作者：MirsFang    
 *模式：       
 *时间：2017/08/04/下午12:23  
 *备注      
 ***/

public class MainTest {

    public static void main(String[] args) {
        DatabaseHelper.initTable();
//        insertJson();
//        insertImageLoader();
//        insertMap();
//        insertPay();
//        insertNetwork();
//        insertPull2Refresh();
//        insertPush();
//        insertIM();
//        insertKeFu();
//        insertNewTech();

        insertCrash();
        insertAPM();
        insertORM();
        insertCommonThirdLibrary();
    }

    private static void deleteTest(PackageInfo packageInfo) {
        if (PackageDAO.getInstance().deletePackageInfo(packageInfo) > 0) {
            System.out.println("删除成功");
        }
    }

    private static void updateTest(PackageInfo packageInfo) {
        packageInfo.setMsg("测试——update");
        packageInfo.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().updatePackageInfo(packageInfo);
    }

    private static void findByName() {
        //根据包名查
        List<PackageInfo> packageInfoList = PackageDAO.getInstance().getPackageInfo4Package("com.test");
        System.out.print(packageInfoList.toString());
    }

    private static PackageInfo findById(int id) {
        //          根据ID查
        PackageInfo packageInfo1 = PackageDAO.getInstance().getPackageInfo4Id(id);
        System.out.print(packageInfo1.toString());
        return packageInfo1;
    }

    private static void insertTest() {
        PackageInfo packageInfo = new PackageInfo();
        packageInfo.setName("com.test");
        packageInfo.setMsg("测试");
        packageInfo.setType("测试框架");
        packageInfo.setCreateTime(System.currentTimeMillis());
        packageInfo.setUpdateTime(System.currentTimeMillis());


        PackageDAO.getInstance().insertPackageInfo(packageInfo);
    }

    private static void insertJson() {
        PackageInfo gson = new PackageInfo();
        gson.setName("com.google.gson");
        gson.setMsg("JSON序列化框架：gson");
        gson.setType("JSON");
        gson.setCreateTime(System.currentTimeMillis());
        gson.setUpdateTime(System.currentTimeMillis());

        PackageDAO.getInstance().insertPackageInfo(gson);

        PackageInfo fastjson = new PackageInfo();
        fastjson.setName("com.alibaba.fastjson");
        fastjson.setMsg("JSON序列化框架：fastjson");
        fastjson.setType("JSON");
        fastjson.setCreateTime(System.currentTimeMillis());
        fastjson.setUpdateTime(System.currentTimeMillis());

        PackageDAO.getInstance().insertPackageInfo(fastjson);

    }

    private static void insertImageLoader() {
        PackageInfo glide = new PackageInfo();
        glide.setName("com.bumptech.glide");
        glide.setMsg("图片加载框架：glide");
        glide.setType("IMAGELOADER");
        glide.setCreateTime(System.currentTimeMillis());
        glide.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(glide);

        PackageInfo picasso = new PackageInfo();
        picasso.setName("com.squareup.picasso");
        picasso.setMsg("图片加载框架：picasso");
        picasso.setType("IMAGELOADER");
        picasso.setCreateTime(System.currentTimeMillis());
        picasso.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(picasso);

        PackageInfo uil = new PackageInfo();
        uil.setName("com.nostra13.universalimageloader.core");
        uil.setMsg("图片加载框架：UIL");
        uil.setType("IMAGELOADER");
        uil.setCreateTime(System.currentTimeMillis());
        uil.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(uil);


        PackageInfo fresco = new PackageInfo();
        fresco.setName("com.facebook.imagepipeline");
        fresco.setMsg("图片加载框架：fresco");
        fresco.setType("IMAGELOADER");
        fresco.setCreateTime(System.currentTimeMillis());
        fresco.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(fresco);
    }

    private static void insertMap() {
        PackageInfo baidu = new PackageInfo();
        baidu.setName("com.baidu.mapapi");
        baidu.setMsg("定位与地图：百度地图");
        baidu.setType("MAP");
        baidu.setCreateTime(System.currentTimeMillis());
        baidu.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(baidu);


        PackageInfo gaoDe = new PackageInfo();
        gaoDe.setName("com.amap.api.maps");
        gaoDe.setMsg("定位与地图：高德地图");
        gaoDe.setType("MAP");
        gaoDe.setCreateTime(System.currentTimeMillis());
        gaoDe.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(gaoDe);


        PackageInfo tecent = new PackageInfo();
        tecent.setName("com.tencent.map");
        tecent.setMsg("定位与地图：腾讯地图");
        tecent.setType("MAP");
        tecent.setCreateTime(System.currentTimeMillis());
        tecent.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(tecent);
    }

    private static void insertPay() {
        PackageInfo alipay = new PackageInfo();
        alipay.setName("com.alipay.sdk");
        alipay.setMsg("支付：支付宝");
        alipay.setType("PAY");
        alipay.setCreateTime(System.currentTimeMillis());
        alipay.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(alipay);

        PackageInfo union = new PackageInfo();
        union.setName("com.unionpay");
        union.setMsg("支付：银联");
        union.setType("PAY");
        union.setCreateTime(System.currentTimeMillis());
        union.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(union);

        PackageInfo wx = new PackageInfo();
        wx.setName("com.wxapi");
        wx.setMsg("支付：微信支付");
        wx.setType("PAY");
        wx.setCreateTime(System.currentTimeMillis());
        wx.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(wx);

        PackageInfo jd = new PackageInfo();
        jd.setName("com.jdpaysdk.author");
        jd.setMsg("支付：JD支付");
        jd.setType("PAY");
        jd.setCreateTime(System.currentTimeMillis());
        jd.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(jd);
    }

    private static void insertPush() {
        PackageInfo xiaomi = new PackageInfo();
        xiaomi.setName("com.xiaomi.push.service");
        xiaomi.setMsg("推送技术：小米推送");
        xiaomi.setType("PUSH");
        xiaomi.setCreateTime(System.currentTimeMillis());
        xiaomi.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(xiaomi);

        PackageInfo jpush = new PackageInfo();
        jpush.setName("cn.jpush.android");
        jpush.setMsg("推送技术：极光推送");
        jpush.setType("PUSH");
        jpush.setCreateTime(System.currentTimeMillis());
        jpush.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(jpush);

        PackageInfo getui = new PackageInfo();
        getui.setName("com.igexin");
        getui.setMsg("推送技术：个推");
        getui.setType("PUSH");
        getui.setCreateTime(System.currentTimeMillis());
        getui.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(getui);

        PackageInfo baidu = new PackageInfo();
        baidu.setName("com.baidu.android.pushservice");
        baidu.setMsg("推送技术：百度推送");
        baidu.setType("PUSH");
        baidu.setCreateTime(System.currentTimeMillis());
        baidu.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(baidu);

        PackageInfo huawei = new PackageInfo();
        huawei.setName("com.huawei.android.pushagent");
        huawei.setMsg("推送技术：华为推送");
        huawei.setType("PUSH");
        huawei.setCreateTime(System.currentTimeMillis());
        huawei.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(huawei);
    }

    private static void insertNetwork() {
        PackageInfo asyncHttp = new PackageInfo();
        asyncHttp.setName("com.loopj.android.http");
        asyncHttp.setMsg("网络请求使用：async-http");
        asyncHttp.setType("NETWORK");
        asyncHttp.setCreateTime(System.currentTimeMillis());
        asyncHttp.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(asyncHttp);

        PackageInfo okhttp = new PackageInfo();
        okhttp.setName("com.squareup.okhttp");
        okhttp.setMsg("网络请求使用：okhttp");
        okhttp.setType("NETWORK");
        okhttp.setCreateTime(System.currentTimeMillis());
        okhttp.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(okhttp);

        PackageInfo okhttp3 = new PackageInfo();
        okhttp3.setName("okhttp3");
        okhttp3.setMsg("网络请求使用：okhttp3");
        okhttp3.setType("NETWORK");
        okhttp3.setCreateTime(System.currentTimeMillis());
        okhttp3.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(okhttp3);

        PackageInfo retrofit2 = new PackageInfo();
        retrofit2.setName("retrofit2");
        retrofit2.setMsg("网络请求使用：retrofit2");
        retrofit2.setType("NETWORK");
        retrofit2.setCreateTime(System.currentTimeMillis());
        retrofit2.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(retrofit2);

        PackageInfo androidAsync = new PackageInfo();
        androidAsync.setName("com.koushikdutta.async");
        androidAsync.setMsg("网络请求使用：async-http");
        androidAsync.setType("NETWORK");
        androidAsync.setCreateTime(System.currentTimeMillis());
        androidAsync.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(androidAsync);

    }

    private static void insertPull2Refresh() {
        PackageInfo pulltorefresh = new PackageInfo();
        pulltorefresh.setName("com.handmark.pulltorefresh.library");
        pulltorefresh.setMsg("下拉刷新：pullToRefresh（这个技术有点过时）");
        pulltorefresh.setType("PULL2REFRESH");
        pulltorefresh.setCreateTime(System.currentTimeMillis());
        pulltorefresh.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(pulltorefresh);

        PackageInfo ptr = new PackageInfo();
        ptr.setName("in.srain.cube.views.ptr");
        ptr.setMsg("下拉刷新：比较强大的下拉刷新控件-in.srain.cube.views.ptr");
        ptr.setType("PULL2REFRESH");
        ptr.setCreateTime(System.currentTimeMillis());
        ptr.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(ptr);

        PackageInfo shizhefei = new PackageInfo();
        shizhefei.setName("com.shizhefei.fragment");
        shizhefei.setMsg("下拉刷新：主要用于下拉刷新加载，失败，加载，空数据，成功的界面切换-com.shizhefei.fragment");
        shizhefei.setType("PULL2REFRESH");
        shizhefei.setCreateTime(System.currentTimeMillis());
        shizhefei.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(shizhefei);

        PackageInfo tkrefreshlayout = new PackageInfo();
        tkrefreshlayout.setName("com.lcodecore.tkrefreshlayout");
        tkrefreshlayout.setMsg("下拉刷新：tkRefresh下拉刷新");
        tkrefreshlayout.setType("PULL2REFRESH");
        tkrefreshlayout.setCreateTime(System.currentTimeMillis());
        tkrefreshlayout.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(tkrefreshlayout);
    }

    private static void insertIM() {
        PackageInfo tencent = new PackageInfo();
        tencent.setName("com.tencent.mm.sdk");
        tencent.setMsg("IM技术：腾讯");
        tencent.setType("IM");
        tencent.setCreateTime(System.currentTimeMillis());
        tencent.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(tencent);

        PackageInfo yunxin = new PackageInfo();
        yunxin.setName("com.netease.nimlib");
        yunxin.setMsg("IM技术：云信");
        yunxin.setType("IM");
        yunxin.setCreateTime(System.currentTimeMillis());
        yunxin.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(yunxin);

        PackageInfo shengWang = new PackageInfo();
        shengWang.setName("io.agora.rtc");
        shengWang.setMsg("IM技术：声网");
        shengWang.setType("IM");
        shengWang.setCreateTime(System.currentTimeMillis());
        shengWang.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(shengWang);
    }

    private static void insertKeFu() {
        PackageInfo zhiChi = new PackageInfo();
        zhiChi.setName("com.sobot.chat");
        zhiChi.setMsg("客服技术：智齿客服");
        zhiChi.setType("KEFU");
        zhiChi.setCreateTime(System.currentTimeMillis());
        zhiChi.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(zhiChi);

        PackageInfo easemob = new PackageInfo();
        easemob.setName("com.easemob");
        easemob.setMsg("客服技术：环信客服");
        easemob.setType("KEFU");
        easemob.setCreateTime(System.currentTimeMillis());
        easemob.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(easemob);
    }

    private static void insertNewTech() {
        PackageInfo databinding = new PackageInfo();
        databinding.setName("android.databinding");
        databinding.setMsg("新技术：databinding");
        databinding.setType("NETTECH");
        databinding.setCreateTime(System.currentTimeMillis());
        databinding.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(databinding);

        PackageInfo rx1 = new PackageInfo();
        rx1.setName("rx");
        rx1.setMsg("新技术：rx1");
        rx1.setType("NETTECH");
        rx1.setCreateTime(System.currentTimeMillis());
        rx1.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(rx1);

        PackageInfo rx2 = new PackageInfo();
        rx2.setName("io.reactivex");
        rx2.setMsg("新技术：rx2");
        rx2.setType("NETTECH");
        rx2.setCreateTime(System.currentTimeMillis());
        rx2.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(rx2);

        PackageInfo iflytek = new PackageInfo();
        iflytek.setName("com.iflytek.cloud");
        iflytek.setMsg("新技术：讯飞");
        iflytek.setType("NETTECH");
        iflytek.setCreateTime(System.currentTimeMillis());
        iflytek.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(iflytek);

        PackageInfo mcxiaoke = new PackageInfo();
        mcxiaoke.setName("com.mcxiaoke.packer");
        mcxiaoke.setMsg("新技术：快速渠道包");
        mcxiaoke.setType("NETTECH");
        mcxiaoke.setCreateTime(System.currentTimeMillis());
        mcxiaoke.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(mcxiaoke);

        PackageInfo rxbinding = new PackageInfo();
        rxbinding.setName("com.jakewharton.rxbinding");
        rxbinding.setMsg("新技术：rxbinding");
        rxbinding.setType("NETTECH");
        rxbinding.setCreateTime(System.currentTimeMillis());
        rxbinding.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(rxbinding);

        PackageInfo networkbench = new PackageInfo();
        networkbench.setName("com.networkbench.agent");
        networkbench.setMsg("新技术：听云");
        networkbench.setType("NETTECH");
        networkbench.setCreateTime(System.currentTimeMillis());
        networkbench.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(networkbench);

        PackageInfo recovery = new PackageInfo();
        recovery.setName("com.zxy.recovery");
        recovery.setMsg("新技术：crash recovery");
        recovery.setType("NETTECH");
        recovery.setCreateTime(System.currentTimeMillis());
        recovery.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(recovery);

        PackageInfo rxpermissions = new PackageInfo();
        rxpermissions.setName("com.tbruyelle.rxpermissions");
        rxpermissions.setMsg("新技术：rxpermissions");
        rxpermissions.setType("NETTECH");
        rxpermissions.setCreateTime(System.currentTimeMillis());
        rxpermissions.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(rxpermissions);

        PackageInfo kotlin = new PackageInfo();
        kotlin.setName("kotlin");
        kotlin.setMsg("新技术：kotlin");
        kotlin.setType("NETTECH");
        kotlin.setCreateTime(System.currentTimeMillis());
        kotlin.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(kotlin);

        PackageInfo walle = new PackageInfo();
        walle.setName("com.meituan.android.walle");
        walle.setMsg("新技术：walle--美团");
        walle.setType("NETTECH");
        walle.setCreateTime(System.currentTimeMillis());
        walle.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(walle);

        PackageInfo react = new PackageInfo();
        react.setName("com.facebook.react");
        react.setMsg("新技术：react native");
        react.setType("NETTECH");
        react.setCreateTime(System.currentTimeMillis());
        react.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(react);

        PackageInfo yoga = new PackageInfo();
        yoga.setName("com.facebook.yoga");
        yoga.setMsg("新技术：facebook yoga");
        yoga.setType("NETTECH");
        yoga.setCreateTime(System.currentTimeMillis());
        yoga.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(yoga);

        PackageInfo lottie = new PackageInfo();
        lottie.setName("com.airbnb.lottie");
        lottie.setMsg("新技术：airbnb lottie");
        lottie.setType("NETTECH");
        lottie.setCreateTime(System.currentTimeMillis());
        lottie.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(lottie);

        PackageInfo cardboard = new PackageInfo();
        cardboard.setName("com.google.vrtoolkit.cardboard");
        cardboard.setMsg("新技术：google cardboard");
        cardboard.setType("NETTECH");
        cardboard.setCreateTime(System.currentTimeMillis());
        cardboard.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(cardboard);

        PackageInfo luaj = new PackageInfo();
        luaj.setName("org.luaj.vm2");
        luaj.setMsg("新技术：lua on jvm");
        luaj.setType("NETTECH");
        luaj.setCreateTime(System.currentTimeMillis());
        luaj.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(luaj);
    }

    private static void insertCrash() {
        PackageInfo umeng = new PackageInfo();
        umeng.setName("com.umeng");
        umeng.setMsg("crash统计：umeng");
        umeng.setType("CRASH");
        umeng.setCreateTime(System.currentTimeMillis());
        umeng.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(umeng);

        PackageInfo bugly = new PackageInfo();
        bugly.setName("com.tencent.bugly");
        bugly.setMsg("crash统计：bugly");
        bugly.setType("CRASH");
        bugly.setCreateTime(System.currentTimeMillis());
        bugly.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(bugly);

    }

    private static void insertORM() {
        PackageInfo ormlite = new PackageInfo();
        ormlite.setName("com.j256.ormlite");
        ormlite.setMsg("ORM技术：ormlite");
        ormlite.setType("ORM");
        ormlite.setCreateTime(System.currentTimeMillis());
        ormlite.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(ormlite);

        PackageInfo dbflow = new PackageInfo();
        dbflow.setName("com.raizlabs.android.dbflow");
        dbflow.setMsg("ORM技术：dbflow");
        dbflow.setType("ORM");
        dbflow.setCreateTime(System.currentTimeMillis());
        dbflow.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(dbflow);

        PackageInfo greendao = new PackageInfo();
        greendao.setName("org.greenrobot.greendao");
        greendao.setMsg("ORM技术：greendao");
        greendao.setType("ORM");
        greendao.setCreateTime(System.currentTimeMillis());
        greendao.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(greendao);
    }

    private static void insertAPM() {
        PackageInfo blockcanary = new PackageInfo();
        blockcanary.setName("com.github.moduth.blockcanary");
        blockcanary.setMsg("APM技术：blockcanary");
        blockcanary.setType("APM");
        blockcanary.setCreateTime(System.currentTimeMillis());
        blockcanary.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(blockcanary);

        PackageInfo leakcanary = new PackageInfo();
        leakcanary.setName("com.squareup.leakcanary");
        leakcanary.setMsg("APM技术：leakcanary");
        leakcanary.setType("APM");
        leakcanary.setCreateTime(System.currentTimeMillis());
        leakcanary.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(leakcanary);

        PackageInfo stetho = new PackageInfo();
        stetho.setName("com.facebook.stetho");
        stetho.setMsg("APM技术：stetho");
        stetho.setType("APM");
        stetho.setCreateTime(System.currentTimeMillis());
        stetho.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(stetho);
    }

    private static void insertCommonThirdLibrary() {
        PackageInfo eventbus = new PackageInfo();
        eventbus.setName("org.greenrobot.eventbus");
        eventbus.setMsg("第三方技术：eventbus");
        eventbus.setType("THIRDLIBRARY");
        eventbus.setCreateTime(System.currentTimeMillis());
        eventbus.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(eventbus);

        PackageInfo butterknife = new PackageInfo();
        butterknife.setName("butterknife");
        butterknife.setMsg("第三方技术：butterknife");
        butterknife.setType("THIRDLIBRARY");
        butterknife.setCreateTime(System.currentTimeMillis());
        butterknife.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(butterknife);

        PackageInfo cocos2dx = new PackageInfo();
        cocos2dx.setName("org.cocos2dx.lib");
        cocos2dx.setMsg("第三方技术：cocos2dx");
        cocos2dx.setType("THIRDLIBRARY");
        cocos2dx.setCreateTime(System.currentTimeMillis());
        cocos2dx.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(cocos2dx);

        PackageInfo jsoup = new PackageInfo();
        jsoup.setName("org.jsoup");
        jsoup.setMsg("第三方技术：jsoup");
        jsoup.setType("THIRDLIBRARY");
        jsoup.setCreateTime(System.currentTimeMillis());
        jsoup.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(jsoup);

        PackageInfo zxing = new PackageInfo();
        zxing.setName("com.google.zxing");
        zxing.setMsg("第三方技术：zxing");
        zxing.setType("THIRDLIBRARY");
        zxing.setCreateTime(System.currentTimeMillis());
        zxing.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(zxing);

        PackageInfo freeline = new PackageInfo();
        freeline.setName("com.antfortune.freeline");
        freeline.setMsg("第三方技术：freeline");
        freeline.setType("THIRDLIBRARY");
        freeline.setCreateTime(System.currentTimeMillis());
        freeline.setUpdateTime(System.currentTimeMillis());
        PackageDAO.getInstance().insertPackageInfo(freeline);
    }

}
