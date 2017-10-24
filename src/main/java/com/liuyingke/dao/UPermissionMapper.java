package com.liuyingke.dao;

import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Created by ；刘迎科 on  2017/10/24.
 * 用户权限持久层
 */
@Repository
public interface UPermissionMapper {

    /**
     * 根据角色名称查询权限
     * @param rname
     * @return
     */
    Set<String> findPermissionsByRname(String rname);
}
