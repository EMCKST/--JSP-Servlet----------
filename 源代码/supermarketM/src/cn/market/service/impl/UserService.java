package cn.market.service.impl;

import cn.market.bean.User;
import cn.market.dao.IUserDao;
import cn.market.dao.impl.UserDao;
import cn.market.service.IUserService;

public class UserService implements IUserService {
	private IUserDao userDao = new UserDao();
	private int i;
	private boolean flag;

	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		
		return userDao.login(username, password);
	}

	@Override
	public User queryById(int id) {
		// TODO Auto-generated method stub
		return userDao.queryById(id);
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		i = userDao.updateUser(user);
		flag = false;
		if (i>0) {
			flag = true;
		}
		
		return flag;
	}
}
