package means;
import java.sql.ResultSet;
import java.sql.SQLException;
import DBmanager.DBmanager;
import JXC.jxc_gys;
import User.Suppliers;

public class dushuju_gys {
	public void dushuju(){

    	jxc_gys j=new jxc_gys();
    	DBmanager d = DBmanager.getInstance();//第一步
    	d.getcon();//第二步
    	String sql = "select * from gys_info";//第三步
		ResultSet rs = d.query(sql);//第四步
		try {
			while (rs.next()) {
				int s1 = rs.getInt("id");
				String s2 = rs.getString("gysqc");
				String s3 = rs.getString("jc");
				String s4 = rs.getString("yzbm");
				String s5 = rs.getString("dz");
				String s6 = rs.getString("dh");
				String s7 = rs.getString("cz");
				String s8 = rs.getString("lxr");
				String s9 = rs.getString("lxdh");
				String s10 = rs.getString("khyh");
				String s11=rs.getString("dzxx");
				Suppliers gys=new Suppliers(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11);
				j.add(gys);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		d.close();//第五步
    
	}
}
