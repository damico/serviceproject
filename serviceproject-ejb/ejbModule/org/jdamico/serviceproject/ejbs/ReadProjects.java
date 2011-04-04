package org.jdamico.serviceproject.ejbs;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class ReadProjects
 */
@Stateless
public class ReadProjects implements ReadProjectsRemote, ReadProjectsLocal {

    /**
     * Default constructor. 
     */
    public ReadProjects() {
        // TODO Auto-generated constructor stub
    }
    
    public String getProjectsJSON(){
    	String json = 	"{\"serviceproject\": {" +
    					"	\"projects\":[" +
    					"		{\"name\": \"project_A\"," +
    					"		 \"customer\": \"A\"" +
    					"		}," +
    					"		{\"name\": \"project_B\"," +
    					"		 \"customer\": \"B\"" +
    					"		}]," +
    					"}}";
    	return json;
    }
}
