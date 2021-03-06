package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author amanagrawal
 */
public class RegisterServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h1>Response from register servlet</h1>");
        
        //the request param is used to fetch the data that has been passed from the html form and the name param 
        //from the form generates the data from request.
        String name=req.getParameter("user_name");
        String password=req.getParameter("user_password");
        String email=req.getParameter("user_email");
        String gender=req.getParameter("user_gender");
        String course=req.getParameter("user_course");
        out.println("<h2>Name : "+name+"</h2>");
        out.println("<h2>Password : "+password+"</h2>");
        out.println("<h2>Email : "+email+"t</h2>");
        out.println("<h2>Gender : "+gender+"</h2>");
        out.println("<h2>Course : "+course+"</h2>");
    }
    
}
