package cn.market.service.impl;

import java.util.List; 

import cn.market.bean.Goods;
import cn.market.bean.Warehouse;
import cn.market.dao.IGoodsDao;
import cn.market.dao.impl.GoodsDao;
import cn.market.service.IGoodsService;

public class GoodsService implements IGoodsService {
	
	//����dao��
	private IGoodsDao goodsDao = new GoodsDao();
	//���ó�ʼ���α���
	private int i;
	//���ó�ʼ�������ͱ���
	private boolean flag;

	@Override
	public List<Goods> queryGoods() {
		// TODO Auto-generated method stub
		return goodsDao.queryGoods();
	}

	@Override
	public Goods queryById(int id) {
		// TODO Auto-generated method stub
		return goodsDao.queryById(id);
	}

	@Override
	public boolean updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		
		i = goodsDao.updateGoods(goods);
		flag = false;
		if (i>0) {
			flag = true;
		}
		
		return flag;
	}

	@Override
	public boolean addGoods(Goods goods) {
		// TODO Auto-generated method stub

		i = goodsDao.addGoods(goods);
		flag = false;
		if (i>0) {
			flag = true;
		}
		
		return flag;
	}

	@Override
	public boolean addWarehouse(Warehouse ware) {
		// TODO Auto-generated method stub
		i = goodsDao.addWarehouse(ware);
		flag = false;
		if (i>0) {
			flag = true;
		}
		
		return flag;
	}

}
