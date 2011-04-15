package org.jdamico.serviceproject.ejbs;
import javax.ejb.Local;

import org.jdamico.serviceproject.dataobjects.Project;

@Local
public interface ReadProjectsLocal {
	 public String getProjectsJSON();
	 public void addProject(Project project);
}
