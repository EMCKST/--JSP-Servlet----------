package cn.market.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.market.bean.Warehouse;
import cn.market.service.IWareService;
import cn.market.service.impl.WareService;

@WebServlet("/ware/ware-list")
public class QueryWare extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IWareService service = new WareService();

		List<Warehouse> list = service.queryWare();

		request.setAttribute("LIST", list);

		request.getRequestDispatcher("/jsp/ware_list.jsp").forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
