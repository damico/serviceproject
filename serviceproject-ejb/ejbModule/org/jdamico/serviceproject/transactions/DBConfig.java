package org.jdamico.serviceproject.transactions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBConfig {
	protected Connection getConnection(){
		Connection con = null;
		InitialContext ctx;
		DataSource ds;
		try {
			ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/postgres");
			con = ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return con;
	}
	
	protected void close(Connection con, PreparedStatement ps, ResultSet rs){
		if(con!=null)	try {	con.close(); } catch (SQLException e) {  e.printStackTrace(); }
		if(ps!=null)	try {	ps.close(); }  catch (SQLException e) {  e.printStackTrace(); }
		if(rs!=null)	try {	rs.close(); }  catch (SQLException e) {  e.printStackTrace(); }
	}
	
}
