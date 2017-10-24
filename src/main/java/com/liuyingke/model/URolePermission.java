package com.liuyingke.model;

/**
 * Created by ；刘迎科 on  2017/10/18.
 * 角色权限中间表实体类
 */
public class URolePermission {

    /**
     * 角色ID
     */
    private Integer rid;
    /**
     * 权限ID
     */
    private Integer pid;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
