package cn.market.service.impl;

import java.util.List;

import cn.market.bean.Warehouse;
import cn.market.dao.IWareDao;
import cn.market.dao.impl.WareDao;
import cn.market.service.IWareService;

public class WareService implements IWareService {

	// 调用dao类
	private IWareDao wareDao = new WareDao();
	// 设置初始整形变量
	private int i;
	// 设置初始布尔类型变量
	private boolean flag;

	@Override
	public List<Warehouse> queryWare() {
		// TODO Auto-generated method stub
		return wareDao.queryWare();
	}

	@Override
	public Warehouse queryWareById(int id) {
		// TODO Auto-generated method stub
		return wareDao.queryWareById(id);
	}

	@Override
	public boolean updateWarehouse(Warehouse ware) {
		// TODO Auto-generated method stub
		i = wareDao.updateWarehouse(ware);
		flag = false;
		if (i > 0) {
			flag = true;
		}

		return flag;
	}

}
