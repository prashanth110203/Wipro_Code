	package PK;
	 
	import java.sql.*;
	
	
	public class JDBC_Example {
	 
	public static void main(String[] args)
	{
		
	try {
		
	Class.forName("com.mysql.cj.jdbc.Driver"); // is a static method of the Class class used to load a class dynamically at runtime.
		   
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeUser_db", "root", "123456789");
	 
	Statement stmt=con.createStatement();
	
	//CREATE TABLE
//	String sql = "CREATE TABLE STUDENTS("+"Id INT PRIMARY KEY,"+"Name VARCHAR(50),"+ "Age INT)";
//	stmt.executeUpdate(sql);
//	System.out.println("Table created successfully");
	
//	String sql = "INSERT INTO student(Id, Name, Age) Values(?,?,?)";
//	PreparedStatement ps = con.prepareStatement(sql);
//	
//	ps.setInt(1, 1);
//	ps.setString(2, "Prashanth");
//	ps.setInt(3, 20);
//	
//	int rows = ps.executeUpdate();
//	
//	System.out.println(rows+"rows inserted");
//	
//	ps.close();
//	con.close();
	 
	ResultSet rs=stmt.executeQuery(" select * from students");	
	 
	while (rs.next())
	{
		System.out.println(rs.getInt("Id") + "    " + rs.getString("Name") + "    " + rs.getInt("Age"));

	}
	con.close();
	}
		catch (Exception e)
	   {
			System.out.println(e);
	   }
	}
	 
	}