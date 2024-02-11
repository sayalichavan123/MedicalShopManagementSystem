package com.mydata.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Catagory implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String catogoryname;
	
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCatogoryname() {
		return catogoryname;
	}

	public void setCatogoryname(String catogoryname) {
		this.catogoryname = catogoryname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Catagory(int id, String catogoryname, String description) {
		super();
		this.id = id;
		this.catogoryname = catogoryname;
		this.description = description;
	}

	public Catagory() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Catagory [id=" + id + ", catogoryname=" + catogoryname + ", description=" + description + "]";
	}

	
	
}
