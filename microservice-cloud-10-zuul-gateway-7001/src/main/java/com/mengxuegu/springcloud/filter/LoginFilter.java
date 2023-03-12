package com.mengxuegu.springcloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class LoginFilter extends ZuulFilter {

    @Override
    public String filterType() {
        System.out.println("LoginFilter filterType");
        return "pre";
    }

    @Override
    public int filterOrder() {
        System.out.println("LoginFilter filterOrder");
        return 1;// 维护自定义过滤器执行顺序，数值越小，越早执行
    }

    @Override
    public boolean shouldFilter() {
        System.out.println("LoginFilter shouldFilter");
        return true;//此过滤器是否执行
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("LoginFilter run");
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
//获取请求参数token的值
        String token = request.getParameter("token");
        if (token == null) {
            System.out.println("此操作需要先登录系统...");
            context.setSendZuulResponse(false);// 拒绝访问
            context.setResponseStatusCode(200);// 设置响应状态码
            try {
//响应结果
                context.getResponse().getWriter().write("token is empty");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        System.out.println("OK");
        return null;

    }
}
