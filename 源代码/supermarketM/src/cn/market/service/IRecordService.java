package cn.market.service;

import java.util.List;

import cn.market.bean.Record;

public interface IRecordService {
	// 查询全部记录
	List<Record> queryRecord();

	// 添加记录
	void addRecord(String name,String oper);  //name:操作者的姓名     oper：执行的操作
}
