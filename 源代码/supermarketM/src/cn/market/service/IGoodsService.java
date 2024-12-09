package cn.market.service;

import java.util.List;

import cn.market.bean.Goods;
import cn.market.bean.Warehouse;

public interface IGoodsService {
	// 查询所有商品信息
	List<Goods> queryGoods();

	// 根据id查询商品信息
	Goods queryById(int id);

	// 修改商品信息
	boolean updateGoods(Goods goods);

	// 添加商品信息
	boolean addGoods(Goods goods);

	// 添加仓库信息
	boolean addWarehouse(Warehouse ware);
}
