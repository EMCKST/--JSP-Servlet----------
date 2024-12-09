package cn.market.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.market.bean.Goods;
import cn.market.service.IGoodsService;
import cn.market.service.IRecordService;
import cn.market.service.impl.GoodsService;
import cn.market.service.impl.RecordService;

@WebServlet("/goods/update-goods")
public class UpdateGoods extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IGoodsService service = new GoodsService();
		IRecordService rec_service = new RecordService();

		Goods goods = new Goods();

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String spec = request.getParameter("spec");
		String trademark = request.getParameter("trademark");
		double p_price = Double.parseDouble(request.getParameter("p_price"));
		double t_price = Double.parseDouble(request.getParameter("t_price"));
		double price = Double.parseDouble(request.getParameter("price"));
		String qpg = request.getParameter("qpg");
		String supplier = request.getParameter("supplier");
		String rema = request.getParameter("rema");

		// 获取操作用户的姓名
		String rec_name = request.getParameter("username");
		// 添加用户的操作详情
		String oper = "修改了商品   " + name;

		goods.setId(id);
		goods.setName(name);
		goods.setAddress(address);
		goods.setSpec(spec);
		goods.setTrademark(trademark);
		goods.setP_price(p_price);
		goods.setT_price(t_price);
		goods.setPrice(price);
		goods.setQpg(qpg);
		goods.setSupplier(supplier);
		goods.setRema(rema);

		boolean flag = service.updateGoods(goods);
		if (flag) {
			rec_service.addRecord(rec_name, oper);
			request.getRequestDispatcher("/goods/list").forward(request, response);
		} else {
			response.sendRedirect(request.getContextPath() + "/jsp/update_goods.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
