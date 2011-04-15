package org.jdamico.serviceproject.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jdamico.serviceproject.dataobjects.Project;
import org.jdamico.serviceproject.ejbs.ReadProjectsLocal;

/**
 * Servlet implementation class ReadProjects
 */
public class ReadProjects extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadProjects() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String json = null;
		
		try{
			Context context = new InitialContext();
			ReadProjectsLocal rpl = (ReadProjectsLocal) context.lookup("java:comp/env/ejb/ReadProjects");
			json = rpl.getProjectsJSON();
		}catch(NamingException ne){
			
		}
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		
		out.println(json);
		out.flush();
		out.close();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name = request.getParameter("pname");
		String customer = request.getParameter("customer");
		
		Project project = new Project(name, customer, new Date());
		
		String json = null;
		
		try{
			Context context = new InitialContext();
			ReadProjectsLocal rpl = (ReadProjectsLocal) context.lookup("java:comp/env/ejb/ReadProjects");
			rpl.addProject(project);
		}catch(NamingException ne){
			
		}
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		
		out.println(json);
		out.flush();
		out.close();
	}

}
