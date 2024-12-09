package cn.market.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.market.bean.User;
import cn.market.service.IUserService;
import cn.market.service.impl.UserService;

@WebServlet("/user/login")
public class LoginController extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IUserService service = new UserService();

		String username = request.getParameter("name");
		String password = request.getParameter("pwd");

		User user = service.login(username, password);
		
		if (user != null) {
			
			HttpSession session = request.getSession();
			
			session.setAttribute("USER", user);
			
			response.sendRedirect(request.getContextPath() + "/jsp/index.jsp");
		} else {
			response.sendRedirect(request.getContextPath() + "/login.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
