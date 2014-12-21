package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DBmanager.DBManager1;
import PO.jinhuoInfo;


public class jinhuo_DAO {
	DBManager1 dbManager=DBManager1.getInstance();
	public List<jinhuoInfo> getAll(){
		List<jinhuoInfo> list=new ArrayList<jinhuoInfo>();
		dbManager.getConn();
		String sql="select * from jinhuo_table";
		ResultSet resultSet=dbManager.query(sql);
		try {
			while(resultSet.next()){
				jinhuoInfo jinhuo=new jinhuoInfo();
				String jhph=resultSet.getString("jhph");
				String xhbh=resultSet.getString("xhbh");
				String spmc=resultSet.getString("spmc");
				String gg=resultSet.getString("gg");
				float piece=resultSet.getFloat("piece");
				int rkNum=resultSet.getInt("rkNum");
				float rkMoney=resultSet.getFloat("rkMoney");
				String czy=resultSet.getString("czy");
				String khqc=resultSet.getString("khqc");
				String jsfs=resultSet.getString("jsfs");
				String gys=resultSet.getString("gys");
				String jhdate=resultSet.getString("jhdate");
				jinhuo.setJhph(jhph);
				jinhuo.setCzy(czy);
				jinhuo.setGg(gg);
				jinhuo.setGys(gys);
				jinhuo.setJhdate(jhdate);
				jinhuo.setJsfs(jsfs);
				jinhuo.setKhqc(khqc);
				jinhuo.setPiece(piece);
				jinhuo.setRkMoney(rkMoney);
				jinhuo.setSpmc(spmc);
				jinhuo.setRkNum(rkNum);
				jinhuo.setXhbh(xhbh);
				list.add(jinhuo);
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
