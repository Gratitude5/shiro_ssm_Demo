package com.liuyingke.service.impl;

import com.liuyingke.dao.UPermissionMapper;
import com.liuyingke.dao.URoleMapper;
import com.liuyingke.service.UPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ；刘迎科 on  2017/10/24.
 * 权限服务层
 */
@Service("permissionService")
public class UPermissionServiceImpl implements UPermissionService {

    @Autowired
    private URoleMapper roleMapper;

    @Autowired
    private UPermissionMapper permissionMapper;

    public Set<String> findPermissionByEmail(String emial) {
        //1.根据邮箱|用户名查询到改用户所拥有的角色
        Set<String> roles= roleMapper.findRolesByEmail(emial);

        //2.根据角色名称 查询出权限
        Set<String> permissions=new HashSet<String>();
        for (String r:roles){
            Set<String> pers= permissionMapper.findPermissionsByRname(r);
            permissions.addAll(pers);
        }
        //3.返回所有该用户所有权限的集合
        return permissions;
    }
}
