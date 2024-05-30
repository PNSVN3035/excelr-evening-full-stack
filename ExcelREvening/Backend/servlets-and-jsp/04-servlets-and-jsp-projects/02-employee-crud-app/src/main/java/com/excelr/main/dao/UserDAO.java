package com.excelr.main.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.excelr.main.model.User;

public class UserDAO 
{
	private String url = "jdbc:mysql://localhost:3306/company?useSSL=false";
	private String uname = "root";
	private String password = "admin";
	
	private static final String INSERT_USERS_SQL = "INSERT INTO EMPLOYEE" + "(NAME, EMAIL, COUNTRY) VALUES" + "(?, ?, ?);";
	
	private static final String SELECT_USER_BY_ID = "SELECT ID, NAME, EMAIL, COUNTRY FROM EMPLOYEE WHERE ID =?;";
	
	private static final String SELECT_ALL_EMPLOYEES = "SELECT * FROM EMPLOYEE";
	
	private static final String DELETE_EMPLOYEE = "DELETE FROM EMPLOYEE WHERE ID=?;";
	
	private static final String UPDATE_EMPLOYEES = "UPDATE EMPLOYEE SET NAME= ?, EMAIL= ?, COUNTRY= ?, WHERE ID= ?;";
	
	public UserDAO()
	{		
	}
	
	protected Connection getConnection()
	{
		Connection con = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, uname, password);
		}
		catch(SQLException | ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		return con;
	}
	
	public void insertUser(User user) throws SQLException
	{
		System.out.println(INSERT_USERS_SQL);
		try(Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(INSERT_USERS_SQL))
		{
			ps.setString(1,  user.getName());
			ps.setString(2,  user.getEmail());
			ps.setString(3,  user.getCountry());
			System.out.println(ps);
			ps.executeUpdate();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public User selectUser(int id)
	{
		User user = null;
		
		try(Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(SELECT_USER_BY_ID);)
		{
			ps.setInt(1,  id);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				String name = rs.getString("name");
				String email = rs.getString("email");
				String country = rs.getString("country");
				user = new User(id, name, email, country);
			}
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();			
		}
		return user;
	}
	
	public List<User> selectAllUsers()
	{
		List<User> users = new ArrayList<>();
		
		try(Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(SELECT_ALL_EMPLOYEES);)
		{
			System.out.println(ps);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) 
			{
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String country = rs.getString("country");
				users.add(new User(id, name, email, country));
			}
		}
		catch(SQLException ex)
		{
			ex.addSuppressed(ex);
		}
		return users;
	}
	
	public boolean deleteUser(int id) throws SQLException
	{
		boolean rowDeleted;
		
		try(Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(DELETE_EMPLOYEE);)
		{
			ps.setInt(1,  id);
			rowDeleted = ps.executeUpdate() > 0;
		}
		return rowDeleted;
	}
	
	public boolean updateUser(User user) throws SQLException
	{
		boolean rowUpdated;
		
		try(Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(UPDATE_EMPLOYEES);)
		{
			ps.setString(1,  user.getName());
			ps.setString(2,  user.getEmail());
			ps.setString(3,  user.getCountry());
			ps.setInt(4,  user.getId());
			
			rowUpdated = ps.executeUpdate() > 0;
		}
		return rowUpdated;
	}
	
	//to display some valid exceptions details, I am developing a separate method 
	private void printSQLException(SQLException ex)
	{
		for(Throwable e : ex)
		{
			if(e instanceof SQLException)
			{
				e.printStackTrace(System.err);
				System.out.println("SQLState: " + ((SQLException)e).getSQLState());				
				System.out.println("Error code: " + ((SQLException)e).getErrorCode());				
				System.out.println("Error Message: " + ((SQLException)e).getMessage());
				
				Throwable t = ex.getCause();
				while(t != null)
				{
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
}
