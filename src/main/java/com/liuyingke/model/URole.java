package com.liuyingke.model;

/**
 * Created by ；刘迎科 on  2017/10/18.
 * 角色实体类
 */
public class URole {

    private Integer rid;
    /**角色名称*/
    private String rname;
    /**角色类型*/
    private String type;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
