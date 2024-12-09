package cn.market.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.market.bean.User;
import cn.market.service.IUserService;
import cn.market.service.impl.UserService;

@WebServlet("/user/updateUser")
public class UpdateController extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IUserService service = new UserService();
		User user = new User();
		
		int id = Integer.parseInt(request.getParameter("id"));
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		int roleId = Integer.parseInt(request.getParameter("roleId"));
		
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);
		user.setRoleId(roleId);
		
		boolean flag = service.updateUser(user);
		if (flag) {
			response.sendRedirect(request.getContextPath()+"/login.jsp");
		} else {
			response.sendRedirect(request.getContextPath()+"/jsp/editUser.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
