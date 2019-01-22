package shop;

//JAVA-DB-Connectivity(JDBC)
import java.sql.*;

public class MemberDAO {
	
	public void update(MemberDTO dto) throws Exception {
		//1.����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.DB����
		String url = "jdbc:mysql://localhost:3307/shop";//db��
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		
		
		//3.SQL ��üȭ
		String sql = "update member set tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(2, dto.getId());
		ps.setString(1, dto.getTel());
		
		//4.SQL�� ���� ��û
		ps.executeUpdate();
		
		ps.close();
		con.close();
		
	}
	public void delete(MemberDTO dto) throws Exception {
		//1.����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.DB����
		String url = "jdbc:mysql://localhost:3307/shop";//db��
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		
		
		//3.SQL ��üȭ
		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		
		//4.SQL�� ���� ��û
		ps.executeUpdate();
		
		ps.close();
		con.close();
		
	}
	
	public void insert(MemberDTO dto) throws Exception {
		//1.����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.DB����
		String url = "jdbc:mysql://localhost:3307/shop";//db��
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		
		
		//3.SQL ��üȭ
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());
		
		//4.SQL�� ���� ��û
		ps.executeUpdate();
		
		ps.close();
		con.close();
		
	}
}
