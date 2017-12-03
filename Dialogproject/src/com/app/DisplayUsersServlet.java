package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayUsersServlet
 */
@WebServlet({ "/DisplayUsersServlet", "/Users" })
public class DisplayUsersServlet extends HttpServlet {
	

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		System.out.println("init Started.............");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(">>>>>>>Post<<<<<<<<<<<<<<<");
		//System.out.println("Name: "+request.getParameter("name"));
		//System.out.println("Email: "+request.getParameter("email"));
		//System.out.println("Password: "+request.getParameter("password"));
		//PrintWriter out = response.getWriter();
		//out.println("Registered Succesfully");
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		 	String n = request.getParameter("name");  
	        String e = request.getParameter("email");
	        String p = request.getParameter("password");
	        try
	        {
	        	 Class.forName("com.mysql.jdbc.Driver");
	             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/displayusers?verifyServerCertificate=false&useSSL=true","root","sagar" );
	                    
	  
	             PreparedStatement ps = con
	                     .prepareStatement("insert into USERDETAILS values(?,?,?)");
	  
	             ps.setString(1, n);
	             ps.setString(2, p);
	             ps.setString(3, e);
	         
	  
	             int i = ps.executeUpdate();
	             if (i > 0)
	                 out.print("You are successfully registered...");
	  	
	        }
	        catch(Exception e1)
	        {
	        	e1.printStackTrace();
	        }
	        out.close();
	        try
	        {
	        	 Class.forName("com.mysql.jdbc.Driver");
	               
	             //String selectQuery = "select * from USERDETAILS where NAME = ? AND PASSWORD = ?";
	             Connection conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/displayusers?verifyServerCertificate=false&useSSL=true","root","sagar");
	             PreparedStatement ps = conection.prepareStatement("select * from USERDETAILS ");
	
	 	
	 			
	 			ResultSet resultSet = ps.executeQuery();
	 			while(resultSet.next())
	 			{
	 			n =	resultSet.getString(1);
	 			p = resultSet.getString(2);
	 		    e =	resultSet.getString(3);
	 		    System.out.println(n);
	 			System.out.println(p);
	 			System.out.println(e);
	 			//out.print(n+""+p+""+e);
	 			out.println(n);
	            out.println(p);
	            out.println(e);
	 			}
	           
	 		
	        }
	        catch(Exception e1)
	        {
	        	e1.printStackTrace();
	        }
	        out.close();
	    	
	}

}
