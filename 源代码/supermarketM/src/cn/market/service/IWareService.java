package cn.market.service;

import java.util.List;

import cn.market.bean.Warehouse;

public interface IWareService {
	// ��ѯ���п����Ʒ
	List<Warehouse> queryWare();

	// ͨ��id��ѯ��Ʒ���
	Warehouse queryWareById(int id);

	// �޸Ŀ��
	boolean updateWarehouse(Warehouse ware);
}
