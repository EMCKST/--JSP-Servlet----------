package cn.market.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import cn.market.bean.Record;
import cn.market.dao.IRecordDao;
import cn.market.dao.impl.RecordDao;
import cn.market.service.IRecordService;

public class RecordService implements IRecordService {
	
	// 调用dao类
	private IRecordDao dao = new RecordDao();

	@Override
	public List<Record> queryRecord() {
		// TODO Auto-generated method stub
		return dao.queryRecord();
	}

	@Override
	public void addRecord(String name,String oper) {
		// TODO Auto-generated method stub
		
		//获取时间
		Date date = new Date();
		//将时间转换为可插入数据库的时间
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		
		//设置记录内容
		String rec = sqlDate+"  "+name+"  "+oper;
		
		Record record = new Record();
		record.setRec(rec);  // 将记录放进record对象相对应的属性中，准备插入数据库
		
		//插入进数据库
		dao.addRecord(record);
	}

}
