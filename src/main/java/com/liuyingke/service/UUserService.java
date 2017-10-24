package com.liuyingke.service;

import com.liuyingke.model.UUser;

import java.util.Map;

/**
 * Created by ；刘迎科 on  2017/10/18.
 */
public interface UUserService {
    /**
     * 登录
     * @param map
     * @return
     */
    UUser login(Map<String, Object> map);

    /**
     * 通过邮箱|用户名查询用户信息
     * @param email
     * @return
     */
    UUser findUserByEmail(String email);
}
