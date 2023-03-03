package com.akash;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HttpServletDemo extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);

        System.out.println("Hello From HttpServlet Service()"+req);
//        System.out.println("Number 1:"+req.getParameter("num1"));
//        System.out.println("Number 2:"+req.getParameter("num2"));
        PrintWriter ob= resp.getWriter();
        ob.println("Hello Akash Chaudhari this message from Javax Servlet...");

    }
}


