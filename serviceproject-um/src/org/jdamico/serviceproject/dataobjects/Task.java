package org.jdamico.serviceproject.dataobjects;

import java.util.Date;

public class Task {
	/*
	 * <task name="" id="" docurl="" eta="" initdate="" enddate="" type="">
              task description
          </task>
	 */

	private String name;
	private int id;
	private String docurl;
	private String eta;
	private Date initDate;
	private Date endDate;
	private int type;
	private String taskDescription;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDocurl() {
		return docurl;
	}
	public void setDocurl(String docurl) {
		this.docurl = docurl;
	}
	public Date getInitDate() {
		return initDate;
	}
	public void setInitDate(Date initDate) {
		this.initDate = initDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	public String getEta() {
		return eta;
	}
	public void setEta(String eta) {
		this.eta = eta;
	}
	public Task(String name, int id, String docurl, String eta, Date initDate,
			Date endDate, int type, String taskDescription) {
		super();
		this.name = name;
		this.id = id;
		this.docurl = docurl;
		this.eta = eta;
		this.initDate = initDate;
		this.endDate = endDate;
		this.type = type;
		this.taskDescription = taskDescription;
	}
	
	
	
	
	
	
	
	
}
