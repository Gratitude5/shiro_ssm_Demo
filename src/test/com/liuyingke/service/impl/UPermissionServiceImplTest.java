package com.liuyingke.service.impl;

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
public class UPermissionServiceImplTest {

    @Autowired
    private UPermissionServiceImpl permissionService;

    @Test
    public void findPermissionByEmail() throws Exception {
        Set<String> permissions = permissionService.findPermissionByEmail("tom");
        for (String p:permissions){
            System.out.println(p);
        }
    }

}