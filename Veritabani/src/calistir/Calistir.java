package calistir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Calistir {
	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/gib", "gibuser", "1");

			PreparedStatement stmt = conn
					.prepareStatement("select * from personel");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String adi = rs.getString("adi");
				String soyadi = rs.getString("soyadi");
				String email = rs.getString("email");
				System.out.println(id + " " + adi + " " + soyadi + " " + email);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
