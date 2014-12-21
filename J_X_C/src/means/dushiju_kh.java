package means;

import java.sql.ResultSet;
import java.sql.SQLException;
import DBmanager.DBmanager;
import JXC.jxc_kh;
import User.User;

public class dushiju_kh {
	public void dushuju(){

    	jxc_kh j=new jxc_kh();
    	DBmanager d = DBmanager.getInstance();//第一步
    	d.getcon();//第二步
    	String sql = "select * from users";//第三步
		ResultSet rs = d.query(sql);//第四步
		try {
			while (rs.next()) {
				int s0=rs.getInt("uId");
				String s1 = rs.getString("uqc");
				String s2 = rs.getString("ujc");
				String s3 = rs.getString("uAdress");
				String s4 = rs.getString("email");
				String s5 = rs.getString("ukhyh");
				String s6 = rs.getString("uyhzh");
				String s7 = rs.getString("uuzbm");
				String s8 = rs.getString("ucz");
				String s9 = rs.getString("ulxr");
				String s10 = rs.getString("udh");
				String s11=rs.getString("ugsdh");
				User user=new User(s0,s1,s3,s2,s4,s5,s6,s7,s8,s9,s10,s11);
					j.add(user);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		d.close();//第五步
    
	}
}
