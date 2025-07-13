//Write a Java program to perform CRUD (Create, Read, Update, Delete) operations using JDBC.
//Use PreparedStatement to manage an emp1 table (with fields like srno, name, salary).
//Use Statement to create a stud table using execute().
//Use PreparedStatement to delete a library table using execute().
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Employee {
	
public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1","root","root");
		PreparedStatement p=c.prepareStatement("Insert into emp1 values(?,?,?,?,?,?)");
		p.setInt(1,1);
		p.setString(2, "Raghav");
		p.setInt(3, 101);
		p.setInt(4, 10000);
		p.setString(5,"Pune");
		p.setInt(6, 10);
		p.executeUpdate();
		PreparedStatement q=c.prepareStatement("Select * from emp1");
		ResultSet r=q.executeQuery();
		while(r.next()) {
			System.out.println(" "+r.getInt("srno")+" "+r.getString("name")+" "+r.getInt("empid")+" "+r.getInt("empsal")+" "+r.getString("empcity")+" "+r.getInt("empage"));
		}
		
		
		Statement s =c.createStatement(); 
		s.execute("Create table stud(rollno int,name varchar (78),class varchar (34),attendance boolean,idno int,division char)");
		
		PreparedStatement p1=c.prepareStatement("drop table library");
		p1.execute();
		
		c.close();
	}
	}


