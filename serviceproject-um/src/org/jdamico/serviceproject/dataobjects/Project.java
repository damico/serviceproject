package org.jdamico.serviceproject.dataobjects;

import java.util.Date;

public class Project {
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
	
	public Project(String name, String customer, Date initDate) {
		super();
		this.name = name;
		this.customer = customer;
		this.initDate = initDate;
	}
	
	
}
