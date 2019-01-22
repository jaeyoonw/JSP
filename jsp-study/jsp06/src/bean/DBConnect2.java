package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DBConnect2 {

	public void update(String id, String title, String user) throws Exception {
		//1.����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.-----����̹� ���� ����------");
		
		//2.DB����
		String url = "jdbc:mysql://localhost:3307/shop";
		String user2 = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user2, password);
		System.out.println("2.-------DB ���� ����-------");
		
		//3.SQL�� ��üȭ
		String sql = "update bbs set title = ?, user = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(4, user);
		
		System.out.println("3.-------SQL�� ��üȭ ����-------");
		
		//4.SQL�� ���� ��û
		ps.executeUpdate();
		System.out.println("4.-------SQL�� ���� ��û ����-------");
		
		con.close();
		ps.close();

	}
	
	public void insert(String id, String title, String content, String user) throws Exception {
		//1.����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.-----����̹� ���� ����------");
		
		//2.DB����
		String url = "jdbc:mysql://localhost:3307/shop";
		String user2 = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user2, password);
		System.out.println("2.-------DB ���� ����-------");
		
		//3.SQL�� ��üȭ
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, content);
		ps.setString(4, user);
		
		System.out.println("3.-------SQL�� ��üȭ ����-------");
		
		//4.SQL�� ���� ��û
		ps.executeUpdate();
		System.out.println("4.-------SQL�� ���� ��û ����-------");
		
		con.close();
		ps.close();
	}

}
