package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.pojo.Resume1;

/**
 * @author Pooja Karnik
 * 
 *         RESUME GENERATOR - This program is used to generate a RESUME by
 *         taking input from the user
 *
 */
@WebServlet("/Resume")
public class Resume extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Resume() {

	}

	// taking input from html page and getting its response from the jsp page
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Resume1 resume = new Resume1(request.getParameter("firstName"), request.getParameter("lastName"),
				request.getParameter("gender"), request.getParameterValues("qualification"),
				request.getParameter("dateOfBirth"), request.getParameterValues("hobbies"),
				request.getParameter("address"), request.getParameterValues("skills"), request.getParameter("email"),
				request.getParameter("website"), request.getParameter("contactNumber"),
				request.getParameter("description"));
		System.out.println(resume);

		request.setAttribute("Resume1", resume);
		RequestDispatcher view = request.getRequestDispatcher("Resume.jsp");
		view.forward(request, response);
	}

	// calls the doGet method
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
