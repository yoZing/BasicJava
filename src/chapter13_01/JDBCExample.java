package chapter13_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class JDBCExample {
	public static void main(String[] args) throws Exception{
		// 0. JDBC 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 1. 접속정보를 이용해서 DB 접속
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "KYS95", "java");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select mem_id, mem_name, mem_hp from member");
		while (resultSet.next()) {
			String memId = resultSet.getString("mem_id");
			String memName = resultSet.getString("mem_name");
			String memHp = resultSet.getString("mem_hp");
			System.out.println(memId + ":" + memName + ":" + memHp);
		}
		resultSet.close();
		statement.close();
		connection.close();
	}
}