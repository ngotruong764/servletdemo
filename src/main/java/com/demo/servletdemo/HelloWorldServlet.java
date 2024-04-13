package com.demo.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "helloworld", urlPatterns = "/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// Step1: set the content type
		response.setContentType("text/html");	// response text/html to the browser
	
		// Step2: get the printWriter
		PrintWriter  out = response.getWriter();
		
		// Step3: Generate HTML content
		out.println("<html><body");
		out.println("<h2>HelloWorld</h2>");
		out.println("<hr>");
		out.println("Time on the server: "+ new Date());
		out.println("</body></html>");
		
	}
	
	

}
