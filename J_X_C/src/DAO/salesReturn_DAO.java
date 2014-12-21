package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DBmanager.DBManager1;
import PO.salesReturn;

public class salesReturn_DAO {
	DBManager1 dbManager=DBManager1.getInstance();
	public List<salesReturn> getAllReturn(){
		List<salesReturn> list=new ArrayList<salesReturn>();
		dbManager.getConn();
		String sql="select * from tuihuo_table";
		ResultSet resultSet=dbManager.query(sql);
		try {
			while(resultSet.next()){
				salesReturn return1=new salesReturn();
				String thph=resultSet.getString("thph");
				String xhbh=resultSet.getString("xhbh");
				String spmc=resultSet.getString("spmc");
				String gg=resultSet.getString("gg");
				String piece=resultSet.getString("piece");
				String Tnum=resultSet.getString("Tnum");
				String czy=resultSet.getString("czy");
				String jsr=resultSet.getString("jsr");
				String khqc=resultSet.getString("khqc");
				String jsfs=resultSet.getString("jsfs");
				String Tmoney=resultSet.getString("Tmoney");
				String Tdate=resultSet.getString("THdate");
				return1.setThph(thph);
				return1.setXhbh(xhbh);
				return1.setCzy(czy);
				return1.setGg(gg);
				return1.setJsfs(jsfs);
				return1.setJsr(jsr);
				return1.setTmoney(Tmoney);
				return1.setPiece(piece);
				return1.setSpmc(spmc);
				return1.setTnum(Tnum);
				return1.setKhqc(khqc);
				return1.setTdate(Tdate);
				list.add(return1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public List<salesReturn> getReturnBySQL(String sql){
			List<salesReturn> list=new ArrayList<salesReturn>();
			dbManager.getConn();
			ResultSet resultSet=dbManager.query(sql);
			try {
				while(resultSet.next()){
					salesReturn return1=new salesReturn();
					String thph=resultSet.getString("thph");
					String xhbh=resultSet.getString("xhbh");
					String spmc=resultSet.getString("spmc");
					String gg=resultSet.getString("gg");
					String piece=resultSet.getString("piece");
					String Tnum=resultSet.getString("Tnum");
					String czy=resultSet.getString("czy");
					String jsr=resultSet.getString("jsr");
					String khqc=resultSet.getString("khqc");
					String jsfs=resultSet.getString("jsfs");
					String Tmoney=resultSet.getString("Tmoney");
					String Tdate=resultSet.getString("THdate");
					return1.setThph(thph);
					return1.setXhbh(xhbh);
					return1.setCzy(czy);
					return1.setGg(gg);
					return1.setJsfs(jsfs);
					return1.setJsr(jsr);
					return1.setTmoney(Tmoney);
					return1.setPiece(piece);
					return1.setSpmc(spmc);
					return1.setTnum(Tnum);
					return1.setKhqc(khqc);
					return1.setTdate(Tdate);
					list.add(return1);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
	}
}
