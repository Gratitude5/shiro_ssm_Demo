package com.liuyingke.utils;

import com.jagregory.shiro.freemarker.ShiroTags;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.IOException;

/**
 * Created by ；刘迎科 on  2017/10/24.
 * freemarker使用shiro标签工具类
 *  * 继承FreeMarkerConfigurer类,重写afterPropertiesSet()方法；
 * 集成shiroTags标签
 */
public class FreeMarkerConfigExtend  extends FreeMarkerConfigurer{

    public void afterPropertiesSet() throws IOException, TemplateException {
        super.afterPropertiesSet();
        Configuration cfg = this.getConfiguration();
        cfg.setSharedVariable("shiro", new ShiroTags());//shiro标签
        cfg.setNumberFormat("#");//防止页面输出数字,变成2,000
        //可以添加很多自己的要传输到页面的[方法、对象、值]
    }
}
