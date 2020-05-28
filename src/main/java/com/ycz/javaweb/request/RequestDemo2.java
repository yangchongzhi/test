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
@WebServlet("/requestDemo2")
public class RequestDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求行数据
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String key = (String)req.getAttribute("key");
        System.out.println(key);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
