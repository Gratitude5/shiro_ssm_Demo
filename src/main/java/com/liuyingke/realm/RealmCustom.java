package com.liuyingke.realm;

import com.liuyingke.model.UUser;
import com.liuyingke.service.UPermissionService;
import com.liuyingke.service.URoleService;
import com.liuyingke.service.UUserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ；刘迎科 on  2017/10/23.
 */
public class RealmCustom extends AuthorizingRealm {

    @Autowired
    private UUserService userService;

    @Autowired
    private URoleService roleService;

    @Autowired
    private UPermissionService permissionService;

    /**
     * 返回 权限信息
     * @param principal
     * @return
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        //1.获取 用户名
        String email=principal.getPrimaryPrincipal().toString();
        //2.根据 用户名 调用数据库 查看该用户下的角色 以及 权限

        //3.添加 角色 以及 权限
        SimpleAuthorizationInfo simpleInfo = new SimpleAuthorizationInfo();

        simpleInfo.setRoles(roleService.findRolesByEmail(email));
        simpleInfo.setStringPermissions(permissionService.findPermissionByEmail(email));
        return simpleInfo;
    }

    /**
     * 验证登录信息
     * 返回 登录信息
     * @param token
     * @return
     * @throws AuthenticationException
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //1.获取 用户名 密码
        String email=token.getPrincipal().toString();
       // String pswd=new String((char[])token.getCredentials());

        //2.通过 调用数据库来验证登录信息是否正确
        UUser user=userService.findUserByEmail(email);

        //3.如果 一切 正确 返回
        SimpleAuthenticationInfo simpleinfo =new SimpleAuthenticationInfo(user.getEmail(),user.getPswd(),getName());

        return simpleinfo;
    }
}
