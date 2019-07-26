package com.luoyang.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

/**
 * @Auther: Luozhen
 * @Date: 2019/4/10 16:12
 * @Description:
 */
public class AuthFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(120 >>> 16);
        System.out.println(120 >> 16);
    }
}
