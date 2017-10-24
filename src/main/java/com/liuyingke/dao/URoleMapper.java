package com.liuyingke.dao;

import com.liuyingke.model.URole;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Created by ；刘迎科 on  2017/10/23.
 * 角色持久层
 */
@Repository
public interface URoleMapper {

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
