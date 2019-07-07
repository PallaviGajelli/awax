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
        String dbUrl = "jdbc:mysql://localhost:3306/login_db?useSSL=false";					

		//Database Username		
		String username = "root";	
        
		//Database Password		
		String password = "swindon19";				

		//Query to Execute		
		String query = "select *  from login_table;";	
			
		
 	    //Load mysql jdbc driver		
   	    Class.forName("com.mysql.jdbc.Driver");			
   
   		//Create Connection to DB		
    	Connection con = DriverManager.getConnection(dbUrl,username,password);
    
    	
  		//Create Statement Object		
	   java.sql.Statement stmt = con.createStatement();					

			// Execute the SQL Query. Store results in ResultSet		
 		ResultSet rs= stmt.executeQuery(query);							
 
 		// While Loop to iterate through all data and print results		
		while (rs.next()){
	        		int myid = rs.getInt(1);	
	        		String myName = rs.getString(2);
                    String pwd = rs.getString(3);					                               
                    System. out.println(myid+" "+myName+"  "+pwd);		
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
