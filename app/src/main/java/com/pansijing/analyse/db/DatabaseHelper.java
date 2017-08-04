package com.pansijing.analyse.db;/**
 * Created by MirsFang on 2017/8/4.
 */

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.logger.LocalLog;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.pansijing.analyse.model.PackageInfo;

import java.sql.SQLException;

/***
 *作者：MirsFang    
 *模式：       
 *时间：2017/08/04/上午10:50  
 *备注      
 ***/

public class DatabaseHelper {
    private static Dao<PackageInfo, Integer> packageDao;
    private static Logger logger = LoggerFactory.getLogger(DatabaseHelper.class);

    static {
        //只打印ERROR的信息
        System.setProperty(LocalLog.LOCAL_LOG_LEVEL_PROPERTY, "ERROR");
    }


    public static Dao GetPackageInfoDao() throws SQLException {
        if (packageDao == null) {
            packageDao = DaoManager.createDao(GetConnectionSource(),
                    PackageInfo.class);
        }
        return packageDao;
    }



    public static ConnectionSource GetConnectionSource() throws SQLException {
        String connectionString = "jdbc:sqlite:./db/Parse.db";
        return new JdbcConnectionSource(connectionString);
    }


    public static void initTable(){
        try {
            TableUtils.createTableIfNotExists(GetConnectionSource(), PackageInfo.class);
        } catch (Exception exception) {
            logger.warn("创建Commodity表失败 : " + exception.getMessage());
        }
    }

}
