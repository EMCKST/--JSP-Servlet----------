package cn.market.service.impl;

import java.util.List; 

import cn.market.bean.Goods;
import cn.market.bean.Warehouse;
import cn.market.dao.IGoodsDao;
import cn.market.dao.impl.GoodsDao;
import cn.market.service.IGoodsService;

public class GoodsService implements IGoodsService {
	
	//调用dao类
	private IGoodsDao goodsDao = new GoodsDao();
	//设置初始整形变量
	private int i;
	//设置初始布尔类型变量
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
