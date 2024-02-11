package com.mydata.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sell implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String customername;
	
	private String mobileno;
	
	private String date;
	
	private String medicinename;
	
	private int cost;
	
	private int quantity;
	
	private float total;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMedicinename() {
		return medicinename;
	}

	public void setMedicinename(String medicinename) {
		this.medicinename = medicinename;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Sell(int id, String customername, String mobileno, String date, String medicinename, int cost, int quantity,
			float total) {
		super();
		this.id = id;
		this.customername = customername;
		this.mobileno = mobileno;
		this.date = date;
		this.medicinename = medicinename;
		this.cost = cost;
		this.quantity = quantity;
		this.total = total;
	}

	public Sell() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Sell [id=" + id + ", customername=" + customername + ", mobileno=" + mobileno + ", date=" + date
				+ ", medicinename=" + medicinename + ", cost=" + cost + ", quantity=" + quantity + ", total=" + total
				+ "]";
	}

	
	}

	
	

	
	
	
	


