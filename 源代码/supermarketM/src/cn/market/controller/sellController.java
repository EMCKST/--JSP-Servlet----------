package cn.market.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.market.bean.Goods;
import cn.market.bean.Warehouse;
import cn.market.service.IGoodsService;
import cn.market.service.IWareService;
import cn.market.service.impl.GoodsService;
import cn.market.service.impl.WareService;

@WebServlet("/sell/sell-list")
public class sellController extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IWareService w_service = new WareService();
		IGoodsService g_service = new GoodsService();
		Warehouse ware = new Warehouse();
		Goods goods = new Goods();

		List<Goods> queryGoods = g_service.queryGoods();
		List<Warehouse> queryWare = w_service.queryWare();
		
		request.setAttribute("QUERYGOODS", queryGoods);
		request.setAttribute("QUERYWARE", queryWare);

		request.getRequestDispatcher("/jsp/sell_list.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
