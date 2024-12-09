package cn.market.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.market.bean.Warehouse;
import cn.market.service.IRecordService;
import cn.market.service.IWareService;
import cn.market.service.impl.RecordService;
import cn.market.service.impl.WareService;

@WebServlet("/sell/update-sell")
public class sellUpdate extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IWareService service = new WareService();
		IRecordService rec_service = new RecordService();
		
		Warehouse ware = new Warehouse();

		int id = Integer.parseInt(request.getParameter("id"));
		int stock = Integer.parseInt(request.getParameter("stock")) - 1;

		// 获取操作用户的姓名
		String rec_name = request.getParameter("username");
		// 添加用户的操作详情
		String oper = "售出了一件 " + request.getParameter("g_name");

		ware.setId(id);
		ware.setStock(stock);

		service.updateWarehouse(ware);
		rec_service.addRecord(rec_name, oper);
		request.getRequestDispatcher("/sell/sell-list").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
