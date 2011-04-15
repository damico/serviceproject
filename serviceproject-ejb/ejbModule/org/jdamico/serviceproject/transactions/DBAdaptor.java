package org.jdamico.serviceproject.transactions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jdamico.serviceproject.dataobjects.Project;
import org.jdamico.serviceproject.dataobjects.Task;


public class DBAdaptor extends DBConfig {
	private static DBAdaptor INSTANCE = null;
    public static DBAdaptor getInstance(){
            if(INSTANCE == null) INSTANCE = new DBAdaptor();
            return INSTANCE;
    }
    
	public void addProject(Project project) {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
	        con = getConnection();
	        ps = con.prepareStatement("INSERT INTO \"sp\".projects_t (project_name, project_customer, project_ts)VALUES(?,?,?)");
	        ps.setString(1, project.getName());
	        ps.setString(2, project.getCustomer());
	        ps.setTimestamp(3, new Timestamp(project.getInitDate().getTime()));
	        ps.executeUpdate();
	  
	    } catch(SQLException e) {
	        e.printStackTrace();
	    }finally{
	    	close(con, ps, null);
	    }
	}

	public List<Project> getProjects() {
		
		List<Project> result = new ArrayList<Project>();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
	        con = getConnection();
	        ps = con.prepareStatement("SELECT * FROM \"sp\".projects_t ORDER BY project_ts DESC");
	        rs = ps.executeQuery();
	        while(rs.next()){
	        	
	        	result.add(new Project(rs.getInt(1), rs.getString(2), rs.getString(3), new Date(rs.getTimestamp(4).getTime())));
	        }
	  
	    } catch(SQLException e) {
	        e.printStackTrace();
	    }finally{
	    	close(con, ps, rs);
	    }
		
		return result;
	}

	public List<Task> getTasksJSON(int projectId) {
		List<Task> result = new ArrayList<Task>();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
	        con = getConnection();
	        ps = con.prepareStatement("SELECT * FROM \"sp\".tasks_t ORDER BY tasks_ts DESC");
	        rs = ps.executeQuery();
	        while(rs.next()){
	        	
	        	result.add(new Project(rs.getInt(1), rs.getString(2), rs.getString(3), new Date(rs.getTimestamp(4).getTime())));
	        }
	  
	    } catch(SQLException e) {
	        e.printStackTrace();
	    }finally{
	    	close(con, ps, rs);
	    }
		
		return result;
	}

}
