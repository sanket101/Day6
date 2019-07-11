import java.sql.*;
import java.util.*;

public class DynamicJDBC {
	public static void main(String args[]) {
		try{
			Scanner sc = new Scanner(System.in);
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp_Data","root","Sapient123");
			
			PreparedStatement pstmt = con.prepareStatement("Insert into Employee values (?, ?)");
			
			System.out.println("Enter name : ");
			String name = sc.next();
			
			System.out.println("Enter id : ");
			int id = sc.nextInt();
			
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
			pstmt.execute();
			
			pstmt.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
