package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DB.getConnection();
			
			conn.setAutoCommit(false);
			
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("update seller set basesalary = 2090 where departmentid = 1");
			
			int x = 1;
			
//			if(1 < 2) {
//				throw new SQLException("Fake error");
//			}
			
			int rows2 = st.executeUpdate("update seller set basesalary = 3090 where departmentid = 2");
			System.out.println("Rows1: "+ rows1);
			System.out.println("Rows2: "+ rows2);
			
			conn.commit();
		} catch(SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException e1) {				
				throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
			}			
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();//sempre fechada por último
		}
		
	}

}
