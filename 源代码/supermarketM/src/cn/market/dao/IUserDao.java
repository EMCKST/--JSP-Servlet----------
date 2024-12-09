package cn.market.dao;

import cn.market.bean.User;

public interface IUserDao {
	//登陆方法
	User login(String username,String password);
	
	//通过ID查找用户
	User queryById(int id);
	
	//修改密码
	int updateUser(User user);

}
