package com.jsp.user.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.user.util.Controller;
import com.jsp.user.util.User;

@WebServlet(value = "/Success")
public class Success extends HttpServlet{
	Controller controller = new Controller();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		PrintWriter printWriter = resp.getWriter();
		
		User findUser = controller.findUser(username);
		if(findUser!=null && findUser.getPassword().equals(password)) {
			printWriter.print("<html><body>");
			printWriter.print("<h1>Name : "+findUser.getName()+"</h1>");
			printWriter.print("<h1>Email : "+findUser.getEmail()+"</h1>");
			printWriter.print("</body></html>");
		}
		else {
			printWriter.print("<html><body>");
			printWriter.print("<h1>Opps wrong username or password :(</h1>");
		}
	}
}
