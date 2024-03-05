import java.sql.*;
class D 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelr", "president", "admin"); 
		Statement stmt = con.createStatement();
		String sql1 = "INSERT INTO PERSON VALUES(1, 'ARJUN', 22)";
		String sql2 = "INSERT INTO PERSON VALUES(2, 'DEVANSH', 25)";
		String sql3 = "INSERT INTO PERSON VALUES(3, 'ISHAN', 20)";
		String sql4 = "INSERT INTO PERSON VALUES(4, 'VIJAY', 21)";
		String sql5 = "INSERT INTO PERSON VALUES(5, 'KIRAN', 29)";
		String sql6 = "INSERT INTO PERSON VALUES(6, 'RAHUL', 29)";
		String sql7 = "INSERT INTO PERSON VALUES(7, 'ANANYA', 24)";
		String sql8 = "INSERT INTO PERSON VALUES(8, 'SHRUTI', 26)";
		stmt.execute(sql1);
		stmt.execute(sql2);
		stmt.execute(sql3);
		stmt.execute(sql4);
		stmt.execute(sql5);
		stmt.execute(sql6);
		stmt.execute(sql7);
		stmt.execute(sql8);
		System.out.println("done");
	}
}
