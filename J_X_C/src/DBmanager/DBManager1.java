package DBmanager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DBManager1 {
	private static final String DRIVERCLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL = "jdbc:sqlserver://localhost:1433;databasename=jxc_kh1";
	private static final String USERNAME = "sa";
	private static final String PASSWORD = "111111";
	private Connection connection=null;
	private Statement statement=null;
	private ResultSet rs=null;
	private static DBManager1 manager=null;
	private DBManager1(){
		try {
			Class.forName(DRIVERCLASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 得到当前dbmanager实例
	 * @return manager
	 */
	public static DBManager1 getInstance(){
		if(manager==null){
			manager=new DBManager1();
		}
		return manager;
	}
	public void getConn(){
		try {
		connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 执行查询
	 * @param sql
	 * @return 结果集
	 */
	public ResultSet query(String sql){
		try {
			statement=connection.createStatement();
			rs=statement.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rs;
	}
	/*
	 * 更新
	 */
	public int update(String sql){
		int i=-1;
		try {
			statement=connection.createStatement();
			i=statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	public void close(){
		try {
			if(connection!=null&&!connection.isClosed()){
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

