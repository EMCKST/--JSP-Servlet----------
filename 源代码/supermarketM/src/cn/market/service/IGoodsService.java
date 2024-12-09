package cn.market.service;

import java.util.List;

import cn.market.bean.Goods;
import cn.market.bean.Warehouse;

public interface IGoodsService {
	// ��ѯ������Ʒ��Ϣ
	List<Goods> queryGoods();

	// ����id��ѯ��Ʒ��Ϣ
	Goods queryById(int id);

	// �޸���Ʒ��Ϣ
	boolean updateGoods(Goods goods);

	// �����Ʒ��Ϣ
	boolean addGoods(Goods goods);

	// ��Ӳֿ���Ϣ
	boolean addWarehouse(Warehouse ware);
}
