package org.jdamico.serviceproject.ejbs;
import javax.ejb.Local;

@Local
public interface ReadTaskLocal {
	public String getTasksJSON(int projectId);
}
