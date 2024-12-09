package cn.market.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.market.bean.Goods;
import cn.market.service.IGoodsService;
import cn.market.service.impl.GoodsService;

@WebServlet("/goods/list")
public class QueryGoods extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IGoodsService service = new GoodsService();

		List<Goods> list = service.queryGoods();

		request.setAttribute("LIST", list);

		request.getRequestDispatcher("/jsp/goods_list.jsp").forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
