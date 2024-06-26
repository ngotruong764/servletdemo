package com.demo.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "StudentServlet", urlPatterns = "/StudentServlet")
public class StudentServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	/**
	 * @overview
	 * the form of url when the form data is sent to the server:
	 * 	url?field1=value1&field2=value2
	 * 
	 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html><body>");
		out.println("The student is confirmed: "+req.getParameter("firstname")+ " "+ req.getParameter("lastname"));
		out.println("</body></html>");
	}

}
