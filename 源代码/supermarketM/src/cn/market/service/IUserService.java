package cn.market.service;

import cn.market.bean.User;

public interface IUserService {
	// 登陆方法
	User login(String username, String password);

	// 通过ID查找用户
	User queryById(int id);

	// 修改密码
	boolean updateUser(User user);
}
