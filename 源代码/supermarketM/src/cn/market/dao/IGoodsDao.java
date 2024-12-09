package cn.market.dao;

import java.util.List;

import cn.market.bean.Goods;
import cn.market.bean.Warehouse;

public interface IGoodsDao {
	
	//查询所有商品信息
	List<Goods> queryGoods();
	
	//根据id查询商品信息
	Goods queryById(int id);
	
	//修改商品信息
	int updateGoods(Goods goods);
	
	//添加商品信息
	int addGoods(Goods goods);
	
	//仓库添加商品
	int addWarehouse(Warehouse ware);
}
