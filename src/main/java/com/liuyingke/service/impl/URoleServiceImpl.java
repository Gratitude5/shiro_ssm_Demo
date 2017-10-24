package com.liuyingke.service.impl;

import com.liuyingke.dao.URoleMapper;
import com.liuyingke.model.URole;
import com.liuyingke.service.URoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by ；刘迎科 on  2017/10/23.
 * 角色服务层
 */
@Service("roleService")
public class URoleServiceImpl implements URoleService {

    @Autowired
    private URoleMapper roleMapper;

    public int insert(URole role) {
        return roleMapper.insert(role);
    }

    public Set<String> findRolesByEmail(String email) {
        return roleMapper.findRolesByEmail(email);
    }
}
