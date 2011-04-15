package org.jdamico.serviceproject.utils;

import java.util.List;

import org.jdamico.serviceproject.dataobjects.Project;
import org.jdamico.serviceproject.dataobjects.ServiceProject;

public class ProjectJSONConverter implements JSONConverters {

	private ServiceProject sp;
	
	
	public ProjectJSONConverter(ServiceProject sp) {
		this.sp = sp;
	}

	@Override
	public String exec() {
		
		List<Project> listProjects = sp.getProjectList();
		
		StringBuffer jsonProjects  = new StringBuffer();
		
		for(int i=0; i<listProjects.size(); i++){
			String appendComma =",";
			if(i+1==listProjects.size()) appendComma = "";
			jsonProjects.append("{\"id\": "+listProjects.get(i).getId()+", \"name\": \""+listProjects.get(i).getName()+"\", \"customer\": \""+listProjects.get(i).getCustomer()+"\", \"initDate\": \""+listProjects.get(i).getInitDate()+"\" }"+appendComma);
		}
		
		//String json = "{\"name\": \"project_A\", \"customer\": \"A\", \"id\": 1 },";
		
		String json = 	"{\"serviceproject\": {" +
		"	\"projects\":[" +jsonProjects.toString()+ "]," +
		"}}";
		
		
		return json;
	}

}
