package cn.market.dao;

import java.util.List;

import cn.market.bean.Record;

public interface IRecordDao {
	//��ѯȫ����¼
	List<Record> queryRecord();
	
	//��Ӽ�¼
	int addRecord(Record rec);
}
