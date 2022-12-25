package com.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/test1")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname =request.getParameter("username");
		String pass=request.getParameter("password");
		
		if("velocity".equals(uname)&&"pune".equals(pass)) {
			
			request.setAttribute("data", uname);
			RequestDispatcher rd =request.getRequestDispatcher("Success.jsp");
			rd.forward(request, response);
			
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("Failure.jsp");
			rd.forward(request, response);
		}
	}

}
