package org.jdamico.serviceproject.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dashboard
 */
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dashboard() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		
		
		
		
		String content0 = 	"<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" +
							"<html xmlns=\"http://www.w3.org/1999/xhtml\">" +
							"<head>" +
							"    <title>ServiceProject Dashboard</title>\n" +
							"    <script src=\"js/jquery-1.3.2.debug.js\" type=\"text/javascript\"></script>\n" +
							"    <script src=\"js/json.htmTable.js\" type=\"text/javascript\"></script>\n" +
							"    <script src=\"js/json.debug.js\" type=\"text/javascript\"></script>\n" +
							"    <script src=\"js/serviceproject.js\" type=\"text/javascript\"></script>\n" +
								"    <link href=\"css/default.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
							"    <script type=\"text/javascript\">\n" + 
							

							"$(document).ready(function() {\n" +
							"	    $.ajax({" +
							"       type: \"GET\"," +
							"       url: \"ReadProjects\"," +
							"	    contentType: \"application/json; charset=utf-8\"," +
							"       dataType: \"json\"," +
							"       success: function(res) {" +
							"		$('#DynamicGridLoading').hide();" +
							"		$('#Results').append(CreateTableView(res.serviceproject.projects, \"lightPro\", true,1, \"getTasks\", \"id\",\"name\")).fadeIn();" +
							"       }" +
							"	    });" +
							"		});" +		
							
							"    </script>\n" +
							"</head>\n";
		
		
		String forms = 		"<div id='newProject'>New project:\n" +
							"<form id='newProjectForm' action='ReadProjects'>\n" +
							"<table>\n" +
							"<tr><td>Project Name:</td><td><input type='text' name='pname'></td></tr>\n" +
							"<tr><td>Customer:</td><td><input type='text' name='customer'></td></tr>\n" +
							"<tr><td>&nbsp</td><td><input type='submit' onclick=\"postForm('#newProjectForm', '#newProject')\"></td></tr>\n" +
							"</table>\n" +
							"</form>\n" +
							"</div>\n";
		
		
		String result = 	"<div id='result'>.....</div>\n";
		
		
		String content1 = 	"<body onload='bodyLoad()'>\n" +
							"<div id='title'></div><hr>" + forms + result +
							"<form id=\"form1\" >\n" +
							"	<div id=\"tasks\"></div>" +
							"    <div id=\"Results\" >\n" +
							"        <div id=\"DynamicGridLoading\" >\n" +
							"            <img src=\"images/loading.gif\" /><span> Loading Data... </span>\n" +
							"        </div>\n" +
							"    </div>\n" +
							"    </form>\n" +
							"<hr>" +
							"serviceproject 0.1" +
							" | <a href='#' onclick='newProject()'>New Project</a> </body>\n" +
							"</html>\n";
		
		out.println(content0);
		out.println(content1);
	
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
