package cn.market.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.market.bean.Goods;
import cn.market.bean.User;
import cn.market.dao.IUserDao;
import cn.market.util.Tool;

public class UserDao implements IUserDao {

	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	private int i;
	private User user;
	private String sql = null;

	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		conn = Tool.getConn();
		sql = "SELECT * from user u\n" +
				"WHERE u.username = ? and password = ?";
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, username);
			pst.setString(2, password);
			rs = pst.executeQuery();
			
			if (rs.next()) {
				user = new User();
				user.setId(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setRoleId(rs.getInt(4));
				
				return user;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public User queryById(int id) {
		// TODO Auto-generated method stub
		conn = Tool.getConn();
		String sql = "select * from user where id=?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			rs.next();
			user = new User();
			user.setId(rs.getInt(1));
			user.setUsername(rs.getString(2));
			user.setPassword(rs.getString(3));
			user.setRoleId(rs.getInt(4));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		conn = Tool.getConn();
		String sql = "update user set username=?,password=?,roleId=? where id=?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			pst.setInt(3, user.getRoleId());
			pst.setInt(4, user.getId());
			i = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
}
