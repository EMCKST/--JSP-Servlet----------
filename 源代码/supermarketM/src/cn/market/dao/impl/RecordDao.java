package cn.market.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.market.bean.Record;
import cn.market.bean.Warehouse;
import cn.market.dao.IRecordDao;
import cn.market.util.Tool;

public class RecordDao implements IRecordDao {
	
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	private int i;
	private Record reco;
	private String sql = null;
	private List<Record> list = new ArrayList<Record>();

	@Override
	public List<Record> queryRecord() {
		// TODO Auto-generated method stub
		conn = Tool.getConn();
		String sql = "SELECT * FROM record";
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				reco = new Record();
				
				reco.setId(rs.getInt(1));
				reco.setRec(rs.getString(2));
				
				list.add(reco);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int addRecord(Record rec) {
		// TODO Auto-generated method stub
		conn = Tool.getConn();
		String sql = "insert into record(rec) values(?)";
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, rec.getRec());
			
			i = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

}
