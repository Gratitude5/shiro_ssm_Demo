package com.liuyingke.model;

/**
 * Created by ；刘迎科 on  2017/10/18.
 * 用户权限实体类
 */
public class UPermission {

    private Integer pid;
    /** 操作的url */
    private String url;
    /** 操作的名称 */
    private String pname;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
