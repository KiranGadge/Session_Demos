package com.Brand.model;

import java.util.ArrayList;
import java.util.List;

public class Brand {

	private int brandid;
	
	private String bname;
	private List<Product> productlist = new ArrayList<>();
	
	
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Brand(int bid, String bname, List<Product> productlist) {
		super();
		this.brandid = bid;
		this.bname = bname;
		this.productlist = productlist;
	}
	
	public Brand(int brandid, String bname) {
		super();
		this.brandid = brandid;
		this.bname = bname;
	}
	public int getBid() {
		return brandid;
	}
	public void setBid(int bid) {
		this.brandid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public List<Product> getProductlist() {
		return productlist;
	}
	public void setProductlist(List<Product> productlist) {
		this.productlist = productlist;
	}
	
	@Override
	public String toString() {
		return "Brand [brandid=" + brandid + ", bname=" + bname + ", productlist=" + productlist + "]";
	}
}
