package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBmanager.DBManager1;

import PO.tuihuoInfo;

public class JHtuihuo_DAO {
	DBManager1 dbManager=DBManager1.getInstance();
	public List<tuihuoInfo> getAll(){
		List<tuihuoInfo> list=new ArrayList<tuihuoInfo>();
		dbManager.getConn();
		String sql="select * from jinhuoTH_table";
		ResultSet resultSet=dbManager.query(sql);
		try {
			while(resultSet.next()){
				tuihuoInfo tuihuo=new tuihuoInfo();
				String thph=resultSet.getString("thph");
				String xhbh=resultSet.getString("xhbh");
				String spmc=resultSet.getString("spmc");
				String gg=resultSet.getString("gg");
				float piece=resultSet.getFloat("piece");
				String gys=resultSet.getString("gys");
				String czy=resultSet.getString("czy");
				String jhdz=resultSet.getString("jhdz");
				int thNum=resultSet.getInt("thNum");
				String jsfs=resultSet.getString("jsfs");
				float ThMoney=resultSet.getShort("ThMoney");
				String jhdate=resultSet.getString("jhdate");
				tuihuo.setCzy(czy);
				tuihuo.setGg(gg);
				tuihuo.setGys(gys);
				tuihuo.setJhdate(jhdate);
				tuihuo.setJhdz(jhdz);
				tuihuo.setJsfs(jsfs);
				tuihuo.setPiece(piece);
				tuihuo.setThMoney(ThMoney);
				tuihuo.setSpmc(spmc);
				tuihuo.setThNum(thNum);
				tuihuo.setThph(thph);
				tuihuo.setXhbh(xhbh);
				list.add(tuihuo);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public boolean getBySQL(String sql){
		
		dbManager.getConn();
		boolean flag=false;
		int res=dbManager.update(sql);
		if(res>0){
			flag=true;
		}
		return flag;
	}
}
