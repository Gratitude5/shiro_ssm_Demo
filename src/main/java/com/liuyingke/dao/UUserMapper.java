package com.liuyingke.dao;

import com.liuyingke.model.UUser;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Set;

/**
 * Created by ；刘迎科 on  2017/10/18.
 * 用户持久层
 */
@Repository
public interface UUserMapper {
    /**
     * 插入用户
     * @param record
     * @return
     */
    int insert(UUser record);

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

    /**
     * 通过用户名查询权限信息
     * @param userName
     * @return
     */
    Set<String> getPermissions(String userName);
}
