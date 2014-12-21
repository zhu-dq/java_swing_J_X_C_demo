package means;

import java.sql.ResultSet;
import java.sql.SQLException;
import DBmanager.DBmanager;
import JXC.jxc_good;
import User.Goods;

public class dushuju_good {
	public void dushuju() {

		jxc_good j = new jxc_good();
		DBmanager d = DBmanager.getInstance();// 第一步
		d.getcon();// 第二步
		String sql = "select * from goods_info";// 第三步
		ResultSet rs = d.query(sql);// 第四步
		try {
			while (rs.next()) {
				int s1 = rs.getInt("id");
				String s2 = rs.getString("spmc");
				String s3 = rs.getString("spjc");
				String s4 = rs.getString("spcd");
				String s5 = rs.getString("dw");
				String s6 = rs.getString("gg");
				String s7 = rs.getString("baoz");
				String s8 = rs.getString("ph");
				String s9 = rs.getString("pzwh");
				String s10 = rs.getString("gysqc");
				String s11 = rs.getString("bz");
				Goods good = new Goods(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10,
						s11);
				j.add(good);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		d.close();// 第五步

	}
}
