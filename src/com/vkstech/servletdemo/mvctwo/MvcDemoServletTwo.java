package com.vkstech.servletdemo.mvctwo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MvcDemoServletTwo")
public class MvcDemoServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MvcDemoServletTwo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Step 1 : get the students data from helper class (model)
		List<Student> studentList = StudentDataUtil.getStudents();
		
		// Step 2 : add students to request object
		request.setAttribute("student_list", studentList);
		
		// Step 3 : get request dispatcher
		RequestDispatcher dispatcher = request.getRequestDispatcher("view_students_two.jsp");
		
		// Step 4 : now forward to JSP
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
