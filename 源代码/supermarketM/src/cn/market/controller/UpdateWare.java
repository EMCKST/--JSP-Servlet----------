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

@WebServlet("/ware/update-ware")
public class UpdateWare extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IWareService service = new WareService();
		IRecordService rec_service = new RecordService();

		Warehouse ware = new Warehouse();

		int id = Integer.parseInt(request.getParameter("id"));
		int stock_1 = Integer.parseInt(request.getParameter("stock_1"));
		int stock_2 = Integer.parseInt(request.getParameter("stock_2"));
		String name = request.getParameter("g_name");
		int stock = stock_1 + stock_2;

		ware.setId(id);
		ware.setG_name(name);
		ware.setStock(stock);

		// 获取操作用户的姓名
		String rec_name = request.getParameter("username");
		// 添加用户的操作详情
		String oper = "修改了 " + name +" 的库存";

		boolean flag = service.updateWarehouse(ware);
		if (flag) {
			rec_service.addRecord(rec_name, oper);
			request.getRequestDispatcher("/ware/ware-list").forward(request, response);
		} else {
			response.sendRedirect(request.getContextPath() + "/jsp/update_ware.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
