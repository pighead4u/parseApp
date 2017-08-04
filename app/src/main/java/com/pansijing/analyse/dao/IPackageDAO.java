package com.pansijing.analyse.dao;

import com.pansijing.analyse.model.PackageInfo;

import java.util.List;

/**
 * Created by MirsFang on 2017/8/4.
 */
public interface IPackageDAO {
    /**
     * 获取所有的Package信息
     *
     * @return ArrayList
     **/
    List<PackageInfo> getAllPackageInfo();

    /**
     * 获取指定Id的Package信息
     *
     * @return PackageInfo
     **/
    PackageInfo getPackageInfo4Id(Integer id);

    /**
     * 获取指定报名的Package信息
     *
     * @retrun List<PackageInfo>
     **/
    List<PackageInfo> getPackageInfo4Package(String packageName);

    /**
     * 插入一个packageInfo,假如他不存在
     **/
    void insertPackageInfo(PackageInfo packageInfo);

    /**
     * 插入一个packageInfo集合,假如他不存在
     **/
    void insertPackageInfo(List<PackageInfo> packageInfoList);

    /**
     * 插入或者更新一个packageInfo
     **/
    void updatePackageInfo(PackageInfo packageInfo);

    /**
     * 删除一个packageInfo
     **/
    int deletePackageInfo(PackageInfo packageInfo);
}
