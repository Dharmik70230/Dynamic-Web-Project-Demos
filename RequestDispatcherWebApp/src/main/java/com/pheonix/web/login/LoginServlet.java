package com.pheonix.web.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 * 
 * @author dharmik.maru
 */
@WebServlet("/LoginS")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Init Method");
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//retrieve the parameter
		String uname = request.getParameter("username");
		String password = request.getParameter("passwd");

		PrintWriter out = response.getWriter();
		//check the condition
		if (uname != null && password != null && uname.equals("dharmik") && password.equals("d123")) {
			
			RequestDispatcher rd = request.getRequestDispatcher("welcome");
			rd.forward(request, response);
		} else {
			out.println("<h1 style = 'color : red'>Invalid Login</h1>");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
			
		}
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	  protected void doPost(HttpServletRequest request, HttpServletResponse
	  response) throws ServletException, IOException { 
		  // TODO Auto-generated method stub 
	doGet(request, response);
		  }
	 


}
