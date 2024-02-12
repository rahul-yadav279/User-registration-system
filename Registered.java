package com.jsp.user.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.user.util.Controller;
import com.jsp.user.util.Storage;
import com.jsp.user.util.User;

@WebServlet(value = "/Registered")
public class Registered extends HttpServlet{
	static Controller controller = new Controller();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		User user = new User();

		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		user.setEmail(email);
		
		controller.addUser(user);
		
		PrintWriter printWriter = resp.getWriter();

		printWriter.print("<html><body>");
		printWriter.print("<h1>Successfully registered the user.</h1>");
		printWriter.print("<a href=\"Login?login=yes\">Log in</a>");
		printWriter.print("</body></html>");
		
		System.out.println(username);
		System.out.println(password);
		System.out.println(name);
		System.out.println(email);
	}
	
}
