package com.liuyingke.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by Administrator on 2017/8/3.
 */
public class EncodingFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO Auto-generated method stub

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)req;//获得request对象
        request.setCharacterEncoding("utf-8");

        chain.doFilter(req,resp);//请求继续向下传递,注意参数仍是方法的形参
    }

    public void destroy() {
        // TODO Auto-generated method stub

    }
}
