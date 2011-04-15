package org.jdamico.serviceproject.utils;

import org.jdamico.serviceproject.dataobjects.ServiceProject;

public class Convert2JSONFactory {
	
	public static JSONConverters getConverter(int type, ServiceProject sp){
		switch(type){
		case Constants.PROJECTS:
			return new ProjectJSONConverter(sp);
		default:
			return null;
		}
	}

}
