package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DBConnect {
	
	public void update(String id,String tel) throws Exception {
		//1.����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.-----����̹� ���� ����------");
		
		//2.DB����
		String url = "jdbc:mysql://localhost:3307/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2.-------DB ���� ����-------");
		
		//3.SQL�� ��üȭ
		String sql = "update member set tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(2, id);
		ps.setString(1, tel);
		
		System.out.println("3.-------SQL�� ��üȭ ����-------");
		
		//4.SQL�� ���� ��û
		ps.executeUpdate();
		System.out.println("4.-------SQL�� ���� ��û ����-------");
		
		con.close();
		ps.close();
	}

	public void delete(String id) throws Exception {
		//1.����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.-----����̹� ���� ����------");
		
		//2.DB����
		String url = "jdbc:mysql://localhost:3307/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2.-------DB ���� ����-------");
		
		//3.SQL�� ��üȭ
		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		
		
		System.out.println("3.-------SQL�� ��üȭ ����-------");
		
		//4.SQL�� ���� ��û
		ps.executeUpdate();
		System.out.println("4.-------SQL�� ���� ��û ����-------");
		
		con.close();
		ps.close();

	}
	
	public void insert(String id, String pw, String name, String tel) throws Exception {
		//1.����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.-----����̹� ���� ����------");
		
		//2.DB����
		String url = "jdbc:mysql://localhost:3307/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2.-------DB ���� ����-------");
		
		//3.SQL�� ��üȭ
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		
		System.out.println("3.-------SQL�� ��üȭ ����-------");
		
		//4.SQL�� ���� ��û
		ps.executeUpdate();
		System.out.println("4.-------SQL�� ���� ��û ����-------");
		
		con.close();
		ps.close();
	}
}
