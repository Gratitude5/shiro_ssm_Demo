package com.liuyingke.service;

import java.util.Set;

/**
 * Created by ；刘迎科 on  2017/10/24.
 */
public interface UPermissionService {

    /**
     * 通过邮箱|用户名查询权限信息
     * @param emial
     * @return
     */
    Set<String> findPermissionByEmail(String emial);
}
