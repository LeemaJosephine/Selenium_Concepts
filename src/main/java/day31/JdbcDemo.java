package day31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 1: Database connection details
		
		String db_url ="jdbc:mysql://localhost:3306";
		String user="root";
		String password="root";
		
		// Step 2: Establish the connection 
		
		try {
			Connection connection=DriverManager.getConnection(db_url, user, password);
			
		// Step 3: Check connection sucessful
			
				if(connection!=null) {
					
					System.out.println("Connection sucessfull");
				} else {
					
					System.out.println("Connection unsucessfull");
				}
			
				// Step 4: Perform the Operation
				
				Statement stmt = connection.createStatement();
//				String createDB ="create database db_demo1";
				String use="Use db_demo1";
//				String createTable="create table demo_table (rollno int,firstName varchar(20),marks int)";
				String select ="Select * from demo_table";
				String insert ="insert into demo_table values (107,'Jun',65),"
						+ "(108,'Ron',85),"
						+ "(109,'Tony',35)";
				//String update ="update studentMarks set rollno=106 where rollno=105";
				
				// create db
				
				//stmt.execute(createDB);
				
				
				// use db
				
				stmt.execute(use);
				
				//create table
				
				//stmt.execute(createTable);
				
				// insert data
				
				//stmt.executeUpdate(insert);
				
				// update the data
				
				//stmt.executeUpdate(update);
				
				// Selecting the data
				ResultSet rs = stmt.executeQuery(select);
				
				// iterate result set and print
				
				while(rs.next()) {
					
					System.out.println(rs.getInt("rollno")+" "+rs.getString("firstName")+" " +rs.getInt("marks"));
					
				}
				
				// close the connection
				
				connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
