package org.jdamico.serviceproject.ejbs;

import javax.annotation.Resource;
import javax.ejb.Stateless;

import org.jdamico.serviceproject.components.Controller;
import org.jdamico.serviceproject.dataobjects.Project;

/**
 * Session Bean implementation class ReadProjects
 */
@Stateless

public class ReadProjects implements ReadProjectsRemote, ReadProjectsLocal {
	
    /**
     * Default constructor. 
     */
	
    public ReadProjects() {
    }
    
    @Resource(name="jdbc/postgres")
    public String getProjectsJSON(){ 	
    	return Controller.getInstance().getProjectsJSON();
    }
    
    public void addProject(Project project){
    	Controller.getInstance().addProject(project);
    }
}
