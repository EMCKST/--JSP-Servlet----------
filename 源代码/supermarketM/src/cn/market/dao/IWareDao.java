package cn.market.dao;

import java.util.List;

import cn.market.bean.Warehouse;

public interface IWareDao {
	//��ѯ���п����Ʒ
	List<Warehouse> queryWare();
	
	//ͨ��id��ѯ��Ʒ���
	Warehouse queryWareById(int id);
	
	//�޸Ŀ��
	int updateWarehouse(Warehouse ware);
}
