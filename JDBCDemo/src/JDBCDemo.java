import java.sql.*;

public class JDBCDemo{
	
	public static void main(String args[]){
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp_Data","root","Sapient123");
			Statement stmt = con.createStatement();
			
			//stmt.executeUpdate("Insert into Employee (Name_emp, Id) values('Rajiv', 12)");
			ResultSet rs = stmt.executeQuery("select * from Employee");
			while(rs.next()) {
				System.out.println("Name : " + rs.getString(1));
				System.out.println("ID : " + rs.getInt(2));
				System.out.println();
			}
			
			rs.close();
			stmt.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}