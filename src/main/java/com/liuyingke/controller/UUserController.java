package com.liuyingke.controller;

import com.liuyingke.service.UUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ；刘迎科 on  2017/10/23.
 * 用户控制层
 */
@Controller
public class UUserController {

    @Autowired
    private UUserService userService;

    /**
     * 登录页面
     * @return
     */
    @RequestMapping("/toLogin")
    public String isLogin(){
        return "login";
    }

    /**
     * 正在登录，验证登录
     * @param email
     * @param pswd
     * @return
     */
    @RequestMapping("/doLogin")
    public String doLogin(@RequestParam String email, @RequestParam String pswd , HttpServletRequest request){
        //1.获取 subject
        Subject subject= SecurityUtils.getSubject();

        //2.把账号密码传给token
        UsernamePasswordToken token=new UsernamePasswordToken(email,pswd);

        //3.登录 验证密码
        try {
            subject.login(token);
            return "redirect:/toHome";
        }catch (Exception e){
            request.setAttribute("errorMsg","用户名或密码错误!");
            return "login";
        }

    }

    /**
     * 登录之后的页面
     * @return
     */
    @RequestMapping("/toHome")
    public String toHome(){
        return "home";
    }


    /**
     * 跳转到Admin页面
     *
     */
    @RequestMapping("/toAdmin")
    public String toAdmin(){
        return "admin";
    }

    /**
     * 跳转到添加用户
     * @return
     */
    @RequestMapping("/toUserAdd")
    public String toUserAdd(){
        return "userAdd";
    }

    /**
     * 跳转到用户列表
     * @return
     */
    @RequestMapping("/toUserShow")
    public String toUserShow(){
        return "userShow";
    }

}
