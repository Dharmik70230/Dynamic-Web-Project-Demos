package com.pheonix.web.welcome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeServlet
 * 
 * @author Dharmik
 */
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession();

		// set the Session timeout
		session.setMaxInactiveInterval(5);

		// print session ID
		System.out.println("Welcome Servlet Session Id :-" + session.getId());

		// retrieve the parameter
		String username = request.getParameter("username");
		session.setAttribute("uname", username);

		String url = response.encodeURL("products");

		PrintWriter out = response.getWriter();
		out.println("<h1>Welcome to Shop</h1>" +
					"<h2>The Session Timeout in "+ session.getMaxInactiveInterval() + " seconds</h2>" +
					"<h2>For Show Our Products<a href ='" + url + "'> Click Here</a></h2>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
