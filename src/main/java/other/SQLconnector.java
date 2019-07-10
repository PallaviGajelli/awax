package other;



import  java.sql.Connection;		
import  java.sql.Statement;		
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;	

public class SQLconnector {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		try
		{
		//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
        String dbUrl = "jdbc:mysql://aa1sbby8pqpky99.c4q7z9w8jisl.us-east-1.rds.amazonaws.com:3306/ebdb?useSSL=false";					

		//Database Username		
		String username = "adminabu";	
        
		//Database Password		
		String password = "Awax1357.";				

		//Query to Execute	
		//gajelli.p@awax.co.uk = 15
		String query = "select 2fa_pin from twofactor where 2fa_user=15;";	
			
		
 	    //Load mysql jdbc driver		
   	    Class.forName("com.mysql.cj.jdbc.Driver");		//com.mysql.jdbc.Driver
   
   		//Create Connection to DB		
    	Connection con = DriverManager.getConnection(dbUrl,username,password);
    
    	
  		//Create Statement Object		
	   java.sql.Statement stmt = con.createStatement();					

			// Execute the SQL Query. Store results in ResultSet		
 		ResultSet rs= stmt.executeQuery(query);	
 		
 		//System.out.println("PIN:"+rs.getInt(1));
 
 		// While Loop to iterate through all data and print results		
		while (rs.next()){
	        		int PIN = rs.getInt(1);
	        		System.out.println("PIN:"+PIN);
	        		//String myName = rs.getString(2);
                    //String pwd = rs.getString(3);					                               
                   // System. out.println(myid+" "+myName+"  "+pwd);		
            }		
			 // closing DB Connection		
			con.close();			
		}
		catch(Exception ex)
		{
			System.out.print("This is message :" +ex);
		}
	}

}
