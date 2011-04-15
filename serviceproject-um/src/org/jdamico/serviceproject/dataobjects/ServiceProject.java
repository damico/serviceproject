package org.jdamico.serviceproject.dataobjects;

import java.util.List;

public class ServiceProject {
	public List<Project> projectList;

	public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}

	public ServiceProject(List<Project> projectList) {
		super();
		this.projectList = projectList;
	}
	
	
	
}
