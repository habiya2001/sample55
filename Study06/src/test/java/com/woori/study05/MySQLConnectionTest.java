//5. jUnit을 이용한 JDBC 연결코드를 작성한다.

package com.woori.study05;

import java.sql.DriverManager;
import org.junit.Test;
import java.sql.Connection;

public class MySQLConnectionTest {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	//jdbc:mysql://주소:포트/DB명
	private static final String URL = "jdbc:mysql://localhost:3306/spring";
	//접속 아이디, 비밀번호
	private static final String USER = "sample";
	private static final String PW = "1234";
	
	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println(con);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
