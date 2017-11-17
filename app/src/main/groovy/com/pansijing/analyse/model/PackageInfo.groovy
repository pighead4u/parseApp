package com.pansijing.analyse.model

import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable

/***
 * 作者：MirsFang
 * 模式：
 * 时间：2017/08/04/上午11:02
 * 备注
 ***/

@DatabaseTable(tableName = "PackageInfo")
class PackageInfo {

    @DatabaseField(generatedId = true)
    private long id;

    @DatabaseField(columnName = "name")
    private String name;//第三方库的名字

    @DatabaseField(columnName = "msg")
    private String msg;//找到后的提示

    @DatabaseField(columnName = "type")
    private String type;//该第三方库是属于什么类型，比如：推送的，地图的，新技术的

    @DatabaseField(columnName = "createTime")
    private long createTime;//创建时间

    @DatabaseField(columnName = "updateTime")
    private long updateTime;//更新时间


    public PackageInfo() {
    }

    public PackageInfo(long id, String name, String msg, String type, long createTime, long updateTime) {
        this.id = id;
        this.name = name;
        this.msg = msg;
        this.type = type;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "PackageInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", msg='" + msg + '\'' +
                ", type='" + type + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
