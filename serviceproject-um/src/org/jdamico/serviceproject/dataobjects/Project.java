package org.jdamico.serviceproject.dataobjects;

import java.util.Date;

public class Project {
	
	private int id;
	private String name;
	private String customer;
	private Date initDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public Date getInitDate() {
		return initDate;
	}
	public void setInitDate(Date initDate) {
		this.initDate = initDate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Project(int id, String name, String customer, Date initDate) {
		super();
		this.id = id;
		this.name = name;
		this.customer = customer;
		this.initDate = initDate;
	}
	
	public Project(String name, String customer, Date initDate) {
		this.name = name;
		this.customer = customer;
		this.initDate = initDate;
	}
	
	
	
}
