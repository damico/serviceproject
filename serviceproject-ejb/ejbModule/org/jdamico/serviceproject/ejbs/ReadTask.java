package org.jdamico.serviceproject.ejbs;

import javax.annotation.Resource;
import javax.ejb.Stateless;

import org.jdamico.serviceproject.components.Controller;

/**
 * Session Bean implementation class ReadTask
 */
@Stateless
public class ReadTask implements ReadTaskRemote, ReadTaskLocal {

    /**
     * Default constructor. 
     */
    public ReadTask() {
        // TODO Auto-generated constructor stub
    }
    
    public String prepareView(){
    	return null;
    }

	@Override
	@Resource(name="jdbc/postgres")
	public String getTasksJSON(int projectId) {
		return Controller.getInstance().getTasksJSON(projectId); 
	}

}
