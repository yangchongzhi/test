package com.ycz.javaweb.request;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Yang Chongzhi
 * @date 2020-4-14 20:53
 */
@WebServlet("/requestDemo1")
public class RequestDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求行数据
        String method = req.getMethod();
        String remoteUser = req.getRemoteAddr();
        String requestURI = req.getRequestURI();
        StringBuffer requestURL = req.getRequestURL();
        String contextPath = req.getContextPath();
        String queryString = req.getQueryString();
        String protocol = req.getProtocol();
        System.out.println(method);
        System.out.println(remoteUser);
        System.out.println(requestURI);
        System.out.println(requestURL);
        System.out.println(contextPath);
        System.out.println(queryString);
        System.out.println(protocol);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
