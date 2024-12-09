package cn.market.service;

import java.util.List;

import cn.market.bean.Warehouse;

public interface IWareService {
	// 查询所有库存商品
	List<Warehouse> queryWare();

	// 通过id查询商品库存
	Warehouse queryWareById(int id);

	// 修改库存
	boolean updateWarehouse(Warehouse ware);
}
