package com.demo.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="testParamServlet", urlPatterns = "/TestParamServlet")
public class TestParamServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// set content type
		resp.setContentType("text/html");
		
		
		// get ServletContext
		/**
		 * the getServletContext is inherited from HttpServlet
		 * this getServetCntext is also a helper class to read/parse from web.xml
		 */
		ServletContext context = getServletContext(); // 
		
		
		// read configuration params
		String max_cart = context.getInitParameter("max-shopping-cart-size");
		String proj_team = context.getInitParameter("project-team-name");
		
		
		// get PrintWriter
		PrintWriter out = resp.getWriter();
		
		
		// generate HTML content
		out.println("<html><body>");
		out.println("max cart: "+max_cart);
		out.println("<br>project team: "+proj_team);
		out.println("</body></html>");
		
		
		
	}
}
