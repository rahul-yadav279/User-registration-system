package com.jsp.user.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/Login")
public class Login extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter = resp.getWriter();
		
		printWriter.print("<html><body>");
		printWriter.print("<form action=\"Success\">\r\n"
				+ "        <label for=\"username_id\">Username</label>\r\n"
				+ "        <input type=\"text\" name=\"username\" id=\"username_id\">\r\n"
				+ "        <br>\r\n"
				+ "        <br>\r\n"
				+ "        <label for=\"password_id\">Password</label>\r\n"
				+ "        <input type=\"password\" name=\"password\" id=\"password_id\">\r\n"
				+ "        <br>\r\n"
				+ "        <br>\r\n"
				+ "       <input type = \"submit\" value = \"Submit\">"
				+ "    </form>");
		printWriter.print("</body></form>");
	}
}
