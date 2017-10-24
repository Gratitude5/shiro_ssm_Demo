package com.liuyingke.dao;

import com.liuyingke.model.URole;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Set;

/**
 * Created by ；刘迎科 on  2017/10/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-mybatis.xml"})
public class URoleMapperTest {

    @Autowired
    private URoleMapper roleMapper;

    @Test
    public void insert() throws Exception {
        URole role=new URole();
        role.setRname("普通用户");
        role.setType("666666");
       int flag= roleMapper.insert(role);
        System.out.println(flag);
    }

    @Test
    public void  findRolesByEmail() throws Exception{
        String email="jack";
        Set<String> roles= roleMapper.findRolesByEmail(email);

        for (String a:roles){
            System.out.println(a);
        }
    }

}