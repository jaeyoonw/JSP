package shop;

import java.sql.*;

public class BbsDAO {

		
		public void update(BbsDTO dto) throws Exception {
			//1.����̹� ����
			Class.forName("com.mysql.jdbc.Driver");
			
			//2.DB����
			String url = "jdbc:mysql://localhost:3307/shop";//db��
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			
			
			//3.SQL ��üȭ
			String sql = "update bbs set content = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(2, dto.getId());
			ps.setString(1, dto.getContent());
			
			//4.SQL�� ���� ��û
			ps.executeUpdate();
			
			ps.close();
			con.close();
			
		}
		public void delete(BbsDTO dto) throws Exception {
			//1.����̹� ����
			Class.forName("com.mysql.jdbc.Driver");
			
			//2.DB����
			String url = "jdbc:mysql://localhost:3307/shop";//db��
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			
			
			//3.SQL ��üȭ
			String sql = "delete from bbs where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			
			//4.SQL�� ���� ��û
			ps.executeUpdate();
			
			ps.close();
			con.close();
			
		}
		
		public void insert(BbsDTO dto) throws Exception {
			//1.����̹� ����
			Class.forName("com.mysql.jdbc.Driver");
			
			//2.DB����
			String url = "jdbc:mysql://localhost:3307/shop";//db��
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			
			
			//3.SQL ��üȭ
			String sql = "insert into bbs values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getTitle());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getUser());
			
			//4.SQL�� ���� ��û
			ps.executeUpdate();
			
			ps.close();
			con.close();
			
	}

}
