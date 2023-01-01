package com.nt.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

//  Write a JDBC App to display employee details who having highest salary?
//select empno , job from emp where sal=(Select max(sal) from emp);

public class SelectTest {

	private static Logger logger=Logger.getLogger(SelectTest.class);
	static {
		//Layout object
		SimpleLayout layout = new SimpleLayout();
		//create appender object having layout object
		ConsoleAppender appender = new ConsoleAppender(layout);
		//add appender object to Logger obj
		logger.addAppender(appender);
		//logger level to retrive log messages
		//logger.setLevel(Level.DEBUG);
		//logger.setLevel(Level.ALL);
		logger.setLevel(Level.INFO);
		logger.info("Log4J Setup is ready");
	}
	public static void main(String[] args) {
		logger.debug("start of main(-) method");
		Scanner sc = null;
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {


			//load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			logger.debug("Jdbc driver class is loaded");
			//Establish the connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" ,"system", "manager");
logger.info("connection established with Db s/q");
			//create Statement obj
			st = con.createStatement();
logger.debug("Jdbc statement object is created");
			//prepare SQL query
			String query = "SELECT EMPNO , ENAME , SAL ,JOB  FROM EMP";
			System.out.println(query);

			//send and execute the SQL query
			if(st!=null)
				rs =st.executeQuery(query);
			logger.info("SQL query is executed and Resultset Object is generated");

			//process the ResultSet object
			if(rs!=null) {
				if(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+ " " +rs.getString(4));
				}
logger.debug("ResultSet is processed");
			}//try
		}catch(SQLException se) {
			logger.error("Some problem in DB"+se.getErrorCode()+ " "+se.getMessage());
			se.printStackTrace();
		}
		catch(ClassNotFoundException  se) {
			logger.error("Problem in loading jdbc driver");
			se.printStackTrace();
		}
		
		catch(Exception e) {
			logger.fatal("Unknown DB Problem");
			e.printStackTrace();
		}
		finally {
			logger.debug("closing jdbc object");
			try {
				if(rs!=null)
					rs.close();
				logger.debug("ResultSet object is closed");
			}catch(SQLException se) {
				logger.debug("Problem in closing ResultSet object");
				se.printStackTrace();
			}
			try {
				if(st!=null) 
					st.close();
				logger.debug("Statement  object is closed");
			}catch(SQLException se) {
				se.printStackTrace();
				logger.debug("Problem in closing Statement object");
			}
			try {
				if(con!=null) 
					con.close();
				logger.debug("Connection   object is closed");
			}catch(SQLException se) {
				se.printStackTrace();
				logger.debug("Problem in closing connection object");
			}
			try {
				if(sc!=null) 
					sc.close();
				logger.debug(" scanner object is closed");
			}catch(Exception se) {
				se.printStackTrace();
				logger.debug("Problem in closing  scanner object");
			}
		}//finally
		logger.debug("end of main method");
	}//main

}//class
