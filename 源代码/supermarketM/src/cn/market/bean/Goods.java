package cn.market.bean;

public class Goods {
	private int id;  //商品编号
	private String name;  //商品名称
	private String address;  //产地
	private String spec;  //规格
	private String trademark;  //商标
	private double p_price;  //进价
	private double t_price;  //批发价
	private double price;  //零售价
	private String qpg;  //保质期
	private String supplier;  //供应商
	private String rema;  //备注
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public String getTrademark() {
		return trademark;
	}
	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}
	public double getP_price() {
		return p_price;
	}
	public void setP_price(double p_price) {
		this.p_price = p_price;
	}
	public double getT_price() {
		return t_price;
	}
	public void setT_price(double t_price) {
		this.t_price = t_price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getQpg() {
		return qpg;
	}
	public void setQpg(String qpg) {
		this.qpg = qpg;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getRema() {
		return rema;
	}
	public void setRema(String rema) {
		this.rema = rema;
	}
}
