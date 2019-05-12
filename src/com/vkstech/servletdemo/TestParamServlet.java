package com.vkstech.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestParamServlet")
public class TestParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TestParamServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Step 1 : set content type
		response.setContentType("text/html");
		
		// Step 2 : get the printWriter  
		PrintWriter out = response.getWriter();
		
		// Step 3 : read configuration params
		ServletContext context = getServletContext();
		String maxCartSize = context.getInitParameter("max-shopping-cart-size");
		String projectTeamName = context.getInitParameter("project-team-name");
		
		// Step 4 : generate the HTML content
		out.println("<html><body>");
		
		out.println("Max Cart Size = " + maxCartSize +"<br/><br/>");
		out.println("Team Name = " + projectTeamName);
		
		out.println("</body></html>");
	}

}
