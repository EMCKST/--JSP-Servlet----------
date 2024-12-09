package cn.market.dao;

import java.util.List;

import cn.market.bean.Record;

public interface IRecordDao {
	//查询全部记录
	List<Record> queryRecord();
	
	//添加记录
	int addRecord(Record rec);
}
