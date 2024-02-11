package com.mydata.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String producttype;
	
	private int code;
	
	private int total_stock;
	
	private String companyname;
	
	private float cost;
	
	private String mfgdate;
	
	private String expirydate;
	
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProducttype() {
		return producttype;
	}

	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getTotal_stock() {
		return total_stock;
	}

	public void setTotal_stock(int total_stock) {
		this.total_stock = total_stock;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getMfgdate() {
		return mfgdate;
	}

	public void setMfgdate(String mfgdate) {
		this.mfgdate = mfgdate;
	}

	public String getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Product(int id, String producttype, int code, int total_stock, String companyname, float cost,
			String mfgdate, String expirydate, String description) {
		super();
		this.id = id;
		this.producttype = producttype;
		this.code = code;
		this.total_stock = total_stock;
		this.companyname = companyname;
		this.cost = cost;
		this.mfgdate = mfgdate;
		this.expirydate = expirydate;
		this.description = description;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", producttype=" + producttype + ", code=" + code + ", total_stock=" + total_stock
				+ ", companyname=" + companyname + ", cost=" + cost + ", mfgdate=" + mfgdate + ", expirydate="
				+ expirydate + ", description=" + description + "]";
	}
	
	
}
