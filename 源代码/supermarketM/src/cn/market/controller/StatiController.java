package cn.market.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.market.bean.Record;
import cn.market.service.IRecordService;
import cn.market.service.impl.RecordService;

@WebServlet("/stati/stati-list")
public class StatiController extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IRecordService service = new RecordService();

		List<Record> list = service.queryRecord();

		request.setAttribute("LIST", list);

		request.getRequestDispatcher("/jsp/rec_list.jsp").forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}