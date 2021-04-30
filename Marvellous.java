//step1
import java.sql.*;  

class Marvellous	
{  
	public static void main(String args[])
	{  
		try
		{  
			//step2 : Load the driver class  
			Class.forName("org.mariadb.jdbc.Driver");  
			  
			//step3 : Create  the connection object  
			Connection con=DriverManager.getConnection  
			("jdbc:mariadb://127.0.0.1/PPA25","root","root");  
			  
			//step 4: Create the statement object  
			Statement stmt=con.createStatement();  
			  
			//step 5: Execute query  
			ResultSet rs=stmt.executeQuery("select * from student");  
			//step6 : access data from resultSet
			while(rs.next())
			{  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			} 
			
			//step 7: close the connection object  
			con.close();    
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}    
	}  
}
