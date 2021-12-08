package com.example.demo.service;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tutorial")
public class Tutorial { 
	@Id
	private long id;
	
	private String categoryCode;
	private long   value ;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public long getValue() {
		return value;
	}
	public void setValue(long value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", categoryCode=" + categoryCode + ", value=" + value + "]";
	}
}
