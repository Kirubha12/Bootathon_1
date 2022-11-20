package backend;
import java.sql.*;

import carParking.In_Info;
public class Inseertion {
	Connection con = null;
	public Inseertion(String Name, String V_no, String phone, String startDate, String Address) {
		Jdbc ob = new Jdbc();
		con = ob.connectDB();
		try {
			PreparedStatement st = con.prepareStatement("Insert into vehicleInfo(Name, V_No, phone, startDate, Address,occupancy) values(?,?,?,?,?,?)");
			st.setString(1,Name);
			st.setString(2,V_no);
			st.setString(3,phone);
			st.setString(4, startDate);
			st.setString(5, Address);
			st.setString(6, "in");
			st.executeUpdate();
			System.out.println("Success");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//new Inseertion();
	}
	
}
