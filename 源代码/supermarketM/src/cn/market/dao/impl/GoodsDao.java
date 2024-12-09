package cn.market.dao.impl;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.market.bean.Goods;
import cn.market.bean.Warehouse;
import cn.market.dao.IGoodsDao;
import cn.market.util.Tool;

public class GoodsDao implements IGoodsDao {
	
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	private int i;
	private Goods goods;
	private String sql = null;
	private List<Goods> list = new ArrayList<Goods>();

	@Override
	public List<Goods> queryGoods() {
		// TODO Auto-generated method stub

		conn = Tool.getConn();
		String sql = "SELECT * FROM GOODS";
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				goods = new Goods();
				
				goods.setId(rs.getInt(1));
				goods.setName(rs.getString(2));
				goods.setAddress(rs.getString(3));
				goods.setSpec(rs.getString(4));
				goods.setTrademark(rs.getString(5));
				goods.setP_price(rs.getDouble(6));
				goods.setT_price(rs.getDouble(7));
				goods.setPrice(rs.getDouble(8));
				goods.setQpg(rs.getString(9));
				goods.setSupplier(rs.getString(10));
				goods.setRema(rs.getString(11));
				
				list.add(goods);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Goods queryById(int id) {
		// TODO Auto-generated method stub
		conn = Tool.getConn();
		String sql = "select * from goods where id=?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			rs.next();
			
			goods = new Goods();
			
			goods.setId(rs.getInt(1));
			goods.setName(rs.getString(2));
			goods.setAddress(rs.getString(3));
			goods.setSpec(rs.getString(4));
			goods.setTrademark(rs.getString(5));
			goods.setP_price(rs.getDouble(6));
			goods.setT_price(rs.getDouble(7));
			goods.setPrice(rs.getDouble(8));
			goods.setQpg(rs.getString(9));
			goods.setSupplier(rs.getString(10));
			goods.setRema(rs.getString(11));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return goods;
	}

	@Override
	public int updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		conn = Tool.getConn();
		String sql = "update goods set name=?,address=?,spec=?,trademark=?,Pprice=?,Tprice=?,price=?,qgp=?,supplier=?,rema=? where id=?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, goods.getName());
			pst.setString(2, goods.getAddress());
			pst.setString(3, goods.getSpec());
			pst.setString(4, goods.getTrademark());
			pst.setDouble(5, goods.getP_price());
			pst.setDouble(6, goods.getT_price());
			pst.setDouble(7, goods.getPrice());
			pst.setString(8, goods.getQpg());
			pst.setString(9, goods.getSupplier());
			pst.setString(10, goods.getRema());
			pst.setInt(11, goods.getId());
			
			i = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int addGoods(Goods goods) {
		// TODO Auto-generated method stub
		conn = Tool.getConn();
		String sql = "insert into goods(name,address,spec,trademark,Pprice,Tprice,price,qgp,supplier,rema) values(?,?,?,?,?,?,?,?,?,?)";
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, goods.getName());
			pst.setString(2, goods.getAddress());
			pst.setString(3, goods.getSpec());
			pst.setString(4, goods.getTrademark());
			pst.setDouble(5, goods.getP_price());
			pst.setDouble(6, goods.getT_price());
			pst.setDouble(7, goods.getPrice());
			pst.setString(8, goods.getQpg());
			pst.setString(9, goods.getSupplier());
			pst.setString(10, goods.getRema());
			i = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int addWarehouse(Warehouse ware) {
		// TODO Auto-generated method stub
		conn = Tool.getConn();
		String sql = "insert into warehouse(g_name) values(?)";
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, ware.getG_name());
			
			i = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

}
