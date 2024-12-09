package cn.market.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import cn.market.bean.Record;
import cn.market.dao.IRecordDao;
import cn.market.dao.impl.RecordDao;
import cn.market.service.IRecordService;

public class RecordService implements IRecordService {
	
	// ����dao��
	private IRecordDao dao = new RecordDao();

	@Override
	public List<Record> queryRecord() {
		// TODO Auto-generated method stub
		return dao.queryRecord();
	}

	@Override
	public void addRecord(String name,String oper) {
		// TODO Auto-generated method stub
		
		//��ȡʱ��
		Date date = new Date();
		//��ʱ��ת��Ϊ�ɲ������ݿ��ʱ��
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		
		//���ü�¼����
		String rec = sqlDate+"  "+name+"  "+oper;
		
		Record record = new Record();
		record.setRec(rec);  // ����¼�Ž�record�������Ӧ�������У�׼���������ݿ�
		
		//��������ݿ�
		dao.addRecord(record);
	}

}
