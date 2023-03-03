package com.akash;



import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java.io.IOException;

public class GenericServletDemo extends GenericServlet {

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello From GenericServlet Service()");
        try{
            int a=Integer.parseInt(servletRequest.getParameter("num1"));
            int b=Integer.parseInt(servletRequest.getParameter("num2"));
            servletResponse.getWriter().println("<h1>Addition Result : "+(a+b)+"</h1>");
            servletResponse.getWriter().println("<h1>Multiplication Result: "+(a*b)+"</h1>");
            servletResponse.getWriter().println("<h1>Subtraction Result: "+(a-b)+"</h1>");
            servletResponse.getWriter().println("<h1>Division Result : "+(1.0*a/b)+"</h1>");
        }catch (Exception e){
            System.out.println("IOException Occur");
            servletResponse.getWriter().println("<h1>You are Not Eligible to hit Post Request From Here... </h1>");
        }


    }
}
