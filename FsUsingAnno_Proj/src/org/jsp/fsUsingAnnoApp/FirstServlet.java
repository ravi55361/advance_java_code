package org.jsp.fsUsingAnnoApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fs")
public class FirstServlet extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
		//presentation Logic
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='green'>"
				+ "<h1> Student name is "+name+" from "+place+"</h1>"
						+ "</body></html>");
		out.close();
	}
}
