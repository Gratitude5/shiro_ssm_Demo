package com.liuyingke.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Set;

/**
 * Created by ；刘迎科 on  2017/10/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-mybatis.xml"})
public class UPermissionMapperTest {

    @Autowired
    private UPermissionMapper permissionMapper;

    @Test
    public void findPermissionsByRname() throws Exception {
        String rname="系统管理员";
        Set<String> permissions= permissionMapper.findPermissionsByRname(rname);
        for (String p:permissions){
            System.out.println(p);
        }
    }

}