package chap18_3_junbi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String DB_NAME = "sample";
		String DB_USER = "sampleuser";
		String DB_PASS = "sampleuser";
		String dburl = "jdbc:mysql://localhost/" + DB_NAME;
		String sql =
				"""
				SELECT
				  e.id AS id,
				  e.name AS name,
				  e.age AS age,
				  d.name AS dept
				FROM emp e
				  LEFT OUTER JOIN dept d
				  ON e.dept_id = d.id
				ORDER BY ID ASC
				""";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			String err = e.getMessage();
			throw new IllegalStateException(err);
		}
		
		try (Connection conn = DriverManager.getConnection(dburl, DB_USER, DB_PASS)) {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			ResultSet rs = pStmt.executeQuery(sql);
			while (rs.next()) {
				System.out.print(rs.getInt("id"));
				System.out.print(" ");
				System.out.print(rs.getString("name"));
				System.out.print(" ");
				System.out.print(rs.getInt("age"));
				System.out.print(" ");
				System.out.print(rs.getString("dept"));
				System.out.println();
			}
		} catch (SQLException e) {
			String err = e.getMessage();
			throw new IllegalStateException(err);
		}

	}

}
