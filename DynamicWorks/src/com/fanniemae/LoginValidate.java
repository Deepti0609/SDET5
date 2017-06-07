package com.fanniemae;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginValidate
 */
@WebServlet("/validate.do")
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String uName = request.getParameter("uname");
		String password = request.getParameter("pwd");

		if (uName.equals("fannie") && password.equals("hello")) {
			//out.println("Welcome User: " + uName);
			request.getRequestDispatcher("Home").forward(request, response);
		} else {
			//out.println("Sorry Invalid Credentials");
			request.getRequestDispatcher("Error").include(request, response);
			out.println("</hr");
			request.getRequestDispatcher("Login.html").include(request, response);
		}
	}

}
