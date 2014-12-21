package DBmanager;
import java.sql.*;
import java.util.*;
import java.io.*;
public class DBmanager {
	
	private static final String DRIVERCLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL = "jdbc:sqlserver://localhost:1433;databasename=jxc_kh";
	private static final String USERNAME = "sa";
	private static final String PASSWORD = "111111";
	private Connection con=null;
	private Statement st=null;
	private ResultSet rs=null;
	private static DBmanager dbm=null;
	public DBmanager(){
		try {
			Class.forName(DRIVERCLASS);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public static DBmanager getInstance(){
		if(dbm==null){
			dbm=new DBmanager();
		}
		return dbm;
	}
	public Connection getcon(){
		try {
			con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return con;
	}
	public ResultSet query(String sql){
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	public int update(String sql){
		int i=-1;
		try {
			st=con.createStatement();
			 i=st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	public void close(){
		{
			try {
				
				if(rs!=null) rs.close();
				if(st!=null) st.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
	}
}


