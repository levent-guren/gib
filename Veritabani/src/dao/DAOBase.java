package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOBase {
	private static Connection connection;

	protected Connection getConnection() {
		if (connection == null) {
			try {
				connection = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/gib", "gibuser", "1");
				connection.setAutoCommit(false);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}

	protected void close() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	protected void close(ResultSet rs) {
		try {
			rs.close();
		} catch (Exception e) {
		}
	}

	protected void close(PreparedStatement stmt, ResultSet rs) {
		try {
			stmt.close();
		} catch (Exception e) {
		} finally {
			close(rs);
		}
	}
}
