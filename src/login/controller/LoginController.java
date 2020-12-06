package login.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import login.model.User;

public class LoginController {

	//connection to the db
	public static Connection conn() throws Exception {
	
		String URL = "jdbc:mysql://localhost/login";
	       Class.forName("com.mysql.jdbc.Driver");
	       return DriverManager.getConnection(URL, "root", "root");
	}
	
	public static String loginVerify(User u) {
		//by default if the query does not return any entries then it returns error.
		String toReturn = "error";
		
		try {
		    //query to check if the user exists.
			//get the name from the username and the password
		       String sql = "SELECT name FROM userlist WHERE username = ? AND password = ?";
		       
		       PreparedStatement ps = conn().prepareStatement(sql);
		       ps.setString(1, u.username);
		       ps.setString(2, u.password);
		       ResultSet rs = ps.executeQuery();
		       
		       while (rs.next()) {
		        	 //get the name of the user, since theres only 1 user to return.
		      	 
		      	   u.name = rs.getString(1);
		      	   
		      	   //since there is an entry; you return success
		      	 toReturn = "success";
		         }
		       
			
		}catch(Exception e) {
			e.printStackTrace();
			toReturn = "error";
		}
		
		
		return toReturn;
	}
	

}
