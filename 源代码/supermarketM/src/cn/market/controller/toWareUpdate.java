package cn.market.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.market.service.IWareService;
import cn.market.service.impl.WareService;

@WebServlet("/ware/toUpdate-ware")
public class toWareUpdate extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IWareService service = new WareService();
		
		request.setAttribute("UPDATEWARE", service.queryWareById(Integer.parseInt(request.getParameter("id"))));
		
		request.getRequestDispatcher("/jsp/update_ware.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
