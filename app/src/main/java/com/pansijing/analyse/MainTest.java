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

        insertTest();
//
//        findById(3);
//
//        findByName();
//
//        updateTest(findById(3));
//
//        deleteTest(findById(3));


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
}
