package cn.market.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.market.service.IGoodsService;
import cn.market.service.impl.GoodsService;

@WebServlet("/goods/details")
public class DetailsController extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IGoodsService service = new GoodsService();
		
		request.setAttribute("DETAILS", service.queryById(Integer.parseInt(request.getParameter("id"))));
		
		request.getRequestDispatcher("/jsp/details_list.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
