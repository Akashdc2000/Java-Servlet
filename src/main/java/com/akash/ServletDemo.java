package com.akash;
import javax.servlet.*;
import java.io.IOException;

public class ServletDemo implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Hello From init()");
    }

    public ServletConfig getServletConfig() {
        System.out.println("Hello From getServletConfig()");
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello From Service()");
        try{
            int a=Integer.parseInt(servletRequest.getParameter("num1"));
            int b=Integer.parseInt(servletRequest.getParameter("num2"));
            servletResponse.getWriter().println("<h1>Addition is : "+(a+b)+"</h1>");
        }catch (Exception e){
            System.out.println("Exception Occur...");
            servletResponse.getWriter().println("<h1>You are Not Eligible to hit Post Request From Here... </h1>");
        }

    }

    public String getServletInfo() {
        System.out.println("Hello From getServletInfo()");
        return null;
    }

    public void destroy() {
        System.out.println("Hello From destroy()");

    }
}