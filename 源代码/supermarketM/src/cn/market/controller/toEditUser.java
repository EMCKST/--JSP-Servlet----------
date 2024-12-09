package cn.market.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.market.bean.User;
import cn.market.service.IUserService;
import cn.market.service.impl.UserService;

@WebServlet("/user/toEditUser")
public class toEditUser extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IUserService userService = new UserService();
		
		User eUser = userService.queryById(Integer.parseInt(request.getParameter("id")));
		HttpSession session = request.getSession();
		
		session.setAttribute("EUSER", eUser);
		response.sendRedirect(request.getContextPath() + "/jsp/editUser.jsp");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
