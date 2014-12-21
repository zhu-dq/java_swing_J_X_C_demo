package means;
import java.sql.ResultSet;
import java.sql.SQLException;
import DBmanager.DBmanager;
import JXC.jxc_czy;
import User.Operator;

public class dushuju_czy {
	public void dushuju(){

    	jxc_czy bank=new jxc_czy();
    	DBmanager d = DBmanager.getInstance();//第一步
    	d.getcon();//第二步
    	String sql = "select * from czy_info";//第三步
		ResultSet rs = d.query(sql);//第四步
		try {
			while (rs.next()) {
				int s1 = rs.getInt("id");
				String s2 = rs.getString("dlmc");
				String s3 = rs.getString("yhxm");
				String s4 = rs.getString("mm");
				int s5 =rs.getInt("qx");
				Operator user=new Operator(s1,s2,s3,s4,s5);
					bank.add(user);				
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		d.close();//第五步   
	}
}
