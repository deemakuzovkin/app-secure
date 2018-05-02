package com.secure.appsecure.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.security.Principal;

@Component
public class CustomFilter implements Filter {

    @Value("${app.service.name}")
    private String appName;


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(String.format("[%s][CustomFilter] - init", appName));
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("[CustomFilter] - doFilter");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        Principal userPrincipal = request.getUserPrincipal();
        System.out.println(String.format("[SessionId] - %s;[Principal] - %s", request.getSession().getId(), userPrincipal.getName()));
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("[CustomFilter] - destroy");
    }
}
