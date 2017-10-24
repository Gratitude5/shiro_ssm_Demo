package com.liuyingke.dao;

import com.liuyingke.model.UUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ；刘迎科 on  2017/10/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-mybatis.xml"})
public class UUserMapperTest {

    @Autowired
    private UUserMapper userMapper;

    @Test
    public void insert() throws Exception {
        UUser user=new UUser();
        user.setNickname("小鸡炖蘑菇");
        user.setEmail("json");
        user.setPswd("123456");
        user.setCreateTime(new Date());
        userMapper.insert(user);
    }

    @Test
    public void login() throws Exception{
        String email="jack";
        String pswd="123456";
        UUser user=new UUser();
        Map<String,Object> logins=new HashMap<String, Object>();
        logins.put("email",email);
        logins.put("pswd",pswd);
        user=userMapper.login(logins);
        System.out.println(user.getNickname());
    }

    @Test
    public void findUserByEmail() throws Exception{
        String email="jack";
        UUser user = userMapper.findUserByEmail(email);
        System.out.println(user.getNickname());
    }



}