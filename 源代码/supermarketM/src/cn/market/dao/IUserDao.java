package cn.market.dao;

import cn.market.bean.User;

public interface IUserDao {
	//��½����
	User login(String username,String password);
	
	//ͨ��ID�����û�
	User queryById(int id);
	
	//�޸�����
	int updateUser(User user);

}
