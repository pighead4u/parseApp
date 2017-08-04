package com.pansijing.analyse.dao;/**
 * Created by MirsFang on 2017/8/4.
 */

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.pansijing.analyse.db.DatabaseHelper;
import com.pansijing.analyse.model.PackageInfo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/***
 *作者：MirsFang    
 *模式：       
 *时间：2017/08/04/上午11:19  
 *备注      
 ***/

public class PackageDAO implements IPackageDAO {
    private static Logger logger = LoggerFactory.getLogger(DatabaseHelper.class);
    private static IPackageDAO packageDAO;

    public static IPackageDAO getInstance() {
        if (packageDAO == null) {
            synchronized (PackageDAO.class) {
                if (packageDAO == null) {
                    packageDAO = new PackageDAO();
                    return packageDAO;
                }
            }
        }
        return packageDAO;
    }


    private Dao<PackageInfo, Integer> getDao() {
        Dao dao = null;
        try {
            dao = DatabaseHelper.GetPackageInfoDao();
        } catch (SQLException e) {
            e.printStackTrace();
            logger.warn("获取链接失败!" + e.getMessage());
        }
        return dao;
    }


    /**
     * 获取所有的Package信息
     *
     * @return ArrayList
     **/
    @Override
    public List<PackageInfo> getAllPackageInfo() {
        List<PackageInfo> packageInfos = new ArrayList<>();

        List list = null;
        try {
            list = getDao().queryForAll();
            if (list != null && list.size() > 0) {
                packageInfos.addAll(list);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            logger.warn("查询所有Package信息失败!" + e.getMessage());
        }

        return packageInfos;
    }

    /**
     * 获取指定Id的Package信息
     *
     * @return PackageInfo
     **/
    @Override
    public PackageInfo getPackageInfo4Id(Integer id) {
        PackageInfo packageInfo = null;

        try {
            packageInfo = getDao().queryForId(id);
        } catch (SQLException e) {
            e.printStackTrace();
            logger.warn("查询id为" + id + "Package信息失败!" + e.getMessage());
        }

        return packageInfo;
    }


    /**
     * 获取指定报名的Package信息
     *
     * @retrun List<PackageInfo>
     **/
    @Override
    public List<PackageInfo> getPackageInfo4Package(String packageName) {
        List<PackageInfo> packageInfos = new ArrayList<>();

        try {
            List list = getDao().queryForEq("name", packageName);
            if (list != null && list.size() > 0) {
                packageInfos.addAll(list);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            logger.warn("查询packageName为" + packageName + "Package信息失败!" + e.getMessage());
        }

        return packageInfos;
    }


    /**
     * 插入一个packageInfo,假如他不存在
     **/
    @Override
    public void insertPackageInfo(PackageInfo packageInfo) {
        if (packageInfo == null) {
            logger.warn("插入packageInfo不能为空!");
            return;
        }

        PackageInfo packageResult = null;
        try {
            packageResult = getDao().createIfNotExists(packageInfo);
        } catch (SQLException e) {
            e.printStackTrace();
            logger.warn("插入packageInfo失败!" + e.getMessage());
        }

        if (packageResult != null) {
            logger.debug("插入packageInfo成功!" + packageResult.toString());
        }
    }


    /**
     * 插入一个packageInfo集合,假如他不存在
     **/
    @Override
    public void insertPackageInfo(List<PackageInfo> packageInfoList) {
        if (packageInfoList == null) {
            logger.warn("插入packageInfoList不能为空!");
            return;
        }

        for (PackageInfo packageInfo : packageInfoList) {
            insertPackageInfo(packageInfo);
        }
    }


    /**
     * 插入或者更新一个packageInfo
     **/
    @Override
    public void updatePackageInfo(PackageInfo packageInfo) {
        if (packageInfo == null) {
            logger.warn("插入或更新的packageInfo不能为空!");
            return;
        }

        Dao.CreateOrUpdateStatus packageResult = null;
        try {
            packageResult = getDao().createOrUpdate(packageInfo);
        } catch (SQLException e) {
            e.printStackTrace();
            logger.warn("插入或者更新packageInfo失败!" + e.getMessage());
        }

        if (packageResult != null) {
            if (packageResult.isCreated()) {
                logger.debug("插入packageInfo成功!");
            } else if (packageResult.isUpdated()) {
                logger.debug("更新packageInfo成功!");
            }
        }
    }

    /**
     * 删除一个packageInfo
     **/
    @Override
    public int deletePackageInfo(PackageInfo packageInfo) {
        int resultCode = -1;
        try {
            resultCode = getDao().delete(packageInfo);
        } catch (SQLException e) {
            e.printStackTrace();
            logger.debug("删除packageInfo失败!");
        }

        return resultCode;
    }


}
