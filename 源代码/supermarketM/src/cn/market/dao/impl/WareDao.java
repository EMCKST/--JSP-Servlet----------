package cn.market.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.market.bean.Warehouse;
import cn.market.dao.IWareDao;
import cn.market.util.Tool;

public class WareDao implements IWareDao {
	
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	private int i;
	private Warehouse ware;
	private String sql = null;
	private List<Warehouse> list = new ArrayList<Warehouse>();

	@Override
	public List<Warehouse> queryWare() {
		// TODO Auto-generated method stub
		conn = Tool.getConn();
		String sql = "SELECT * FROM warehouse";
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				ware = new Warehouse();
				
				ware.setId(rs.getInt(1));
				ware.setG_name(rs.getString(2));
				ware.setStock(rs.getInt(3));
				
				list.add(ware);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Warehouse queryWareById(int id) {
		// TODO Auto-generated method stub
		conn = Tool.getConn();
		String sql = "select * from warehouse where id=?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			rs.next();
			
			ware = new Warehouse();
			
			ware.setId(rs.getInt(1));
			ware.setG_name(rs.getString(2));
			ware.setStock(rs.getInt(3));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ware;
	}

	@Override
	public int updateWarehouse(Warehouse ware) {
		// TODO Auto-generated method stub
		conn = Tool.getConn();
		String sql = "update warehouse set stock=? where id=?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, ware.getStock());
			pst.setInt(2, ware.getId());
			
			i = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

}
