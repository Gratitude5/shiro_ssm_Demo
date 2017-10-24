package com.liuyingke.service;

import com.liuyingke.model.URole;

import java.util.Set;

/**
 * Created by ；刘迎科 on  2017/10/23.
 */
public interface URoleService {

    /**
     * 插入角色
     * @param role
     * @return
     */
    int insert(URole role);

    /**
     * 根据邮箱|用户名查roles
     * @param email
     * @return
     */
    Set<String> findRolesByEmail(String email);
}
