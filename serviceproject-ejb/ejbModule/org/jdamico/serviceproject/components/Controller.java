package org.jdamico.serviceproject.components;

import java.util.List;

import org.jdamico.serviceproject.dataobjects.Project;
import org.jdamico.serviceproject.dataobjects.ServiceProject;
import org.jdamico.serviceproject.dataobjects.Task;
import org.jdamico.serviceproject.transactions.DBAdaptor;
import org.jdamico.serviceproject.utils.Constants;
import org.jdamico.serviceproject.utils.Convert2JSONFactory;

public class Controller {

	private static Controller INSTANCE = null;
    public static Controller getInstance(){
            if(INSTANCE == null) INSTANCE = new Controller();
            return INSTANCE;
    }
    
	public void addProject(Project project) {
		DBAdaptor.getInstance().addProject(project);
	}

	public String getProjectsJSON() {
		List<Project> projectsList =   DBAdaptor.getInstance().getProjects();
		return Convert2JSONFactory.getConverter(Constants.PROJECTS, new ServiceProject(projectsList)).exec();
	}

	public String getTasksJSON(int projectId) {
		List<Task> taskList =   DBAdaptor.getInstance().getTasksJSON(projectId);
		return null;
	}
	
}
