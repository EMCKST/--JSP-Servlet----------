package cn.market.service;

import cn.market.bean.User;

public interface IUserService {
	// ��½����
	User login(String username, String password);

	// ͨ��ID�����û�
	User queryById(int id);

	// �޸�����
	boolean updateUser(User user);
}
