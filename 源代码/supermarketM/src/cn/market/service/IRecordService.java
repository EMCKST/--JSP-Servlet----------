package cn.market.service;

import java.util.List;

import cn.market.bean.Record;

public interface IRecordService {
	// ��ѯȫ����¼
	List<Record> queryRecord();

	// ��Ӽ�¼
	void addRecord(String name,String oper);  //name:�����ߵ�����     oper��ִ�еĲ���
}
