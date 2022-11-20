package backend;
import java.sql.*;
public class Jdbc {
	 final String DB_URL = "jdbc:mysql://localhost:3306/bootathon_1?useSSL=false";
	 final String USER = "root";
	 final String PASS = "password";
	 public Connection connectDB()
	    {
	        Connection con = null;
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            con = DriverManager.getConnection(DB_URL, USER,PASS);
	        }
	        catch (SQLException e) {
	            e.printStackTrace();
	        }
	        catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	        return con;
	    }
}
