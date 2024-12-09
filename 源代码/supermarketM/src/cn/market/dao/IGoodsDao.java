package cn.market.dao;

import java.util.List;

import cn.market.bean.Goods;
import cn.market.bean.Warehouse;

public interface IGoodsDao {
	
	//��ѯ������Ʒ��Ϣ
	List<Goods> queryGoods();
	
	//����id��ѯ��Ʒ��Ϣ
	Goods queryById(int id);
	
	//�޸���Ʒ��Ϣ
	int updateGoods(Goods goods);
	
	//�����Ʒ��Ϣ
	int addGoods(Goods goods);
	
	//�ֿ������Ʒ
	int addWarehouse(Warehouse ware);
}
