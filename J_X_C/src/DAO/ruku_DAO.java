package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBmanager.DBManager1;
import PO.rukuInfo;



public class ruku_DAO {
	DBManager1 dbManager=DBManager1.getInstance();
	public List<rukuInfo> getAllInfo(){
		
		List<rukuInfo> list=new ArrayList<rukuInfo>();
		dbManager.getConn();
		String sql="select * from ruku_table";
		ResultSet resultSet=dbManager.query(sql);
		try {
			while(resultSet.next()){
				rukuInfo ruku=new rukuInfo();
				String rkph=resultSet.getString("rkph");
				String xhbh=resultSet.getString("xhbh");
				String spmc=resultSet.getString("spmc");
				String gg=resultSet.getString("gg");
				String piece=resultSet.getString("piece");
				String rkNum=resultSet.getString("rkNum");
				String rkMoney=resultSet.getString("rkMoney");
				String czy=resultSet.getString("czy");
				String jsr=resultSet.getString("jsr");
				String khqc=resultSet.getString("khqc");
				String jsfs=resultSet.getString("jsfs");
				String gys=resultSet.getString("gys");
				String rkdate=resultSet.getString("rkdate");
				ruku.setCzy(czy);
				ruku.setGg(gg);
				ruku.setGys(gys);
				ruku.setJsfs(jsfs);
				ruku.setJsr(jsr);
				ruku.setKhqc(khqc);
				ruku.setPiece(piece);
				ruku.setRkMoney(rkMoney);
				ruku.setRkdate(rkdate);
				ruku.setRkNum(rkNum);
				ruku.setRkph(rkph);
				ruku.setSpmc(spmc);
				ruku.setXhbh(xhbh);
				list.add(ruku);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public List<rukuInfo> getInfoBySQL(String sql){
		List<rukuInfo> list=new ArrayList<rukuInfo>();
		dbManager.getConn();
		ResultSet resultSet=dbManager.query(sql);
		try {
			while(resultSet.next()){
				rukuInfo ruku=new rukuInfo();
				String rkph=resultSet.getString("rkph");
				String xhbh=resultSet.getString("xhbh");
				String spmc=resultSet.getString("spmc");
				String gg=resultSet.getString("gg");
				String piece=resultSet.getString("piece");
				String rkNum=resultSet.getString("rkNum");
				String rkMoney=resultSet.getString("rkMoney");
				String czy=resultSet.getString("czy");
				String jsr=resultSet.getString("jsr");
				String khqc=resultSet.getString("khqc");
				String jsfs=resultSet.getString("jsfs");
				String gys=resultSet.getString("gys");
				String rkdate=resultSet.getString("rkdate");
				ruku.setCzy(czy);
				ruku.setGg(gg);
				ruku.setGys(gys);
				ruku.setJsfs(jsfs);
				ruku.setJsr(jsr);
				ruku.setKhqc(khqc);
				ruku.setPiece(piece);
				ruku.setRkMoney(rkMoney);
				ruku.setRkdate(rkdate);
				ruku.setRkNum(rkNum);
				ruku.setRkph(rkph);
				ruku.setSpmc(spmc);
				ruku.setXhbh(xhbh);
				list.add(ruku);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public rukuInfo getBySQL(String sql){
		dbManager.getConn();
		ResultSet resultSet=dbManager.query(sql);
		rukuInfo ruku=new rukuInfo();
		try {
			if(resultSet.next()){
				String rkph=resultSet.getString("rkph");
				String xhbh=resultSet.getString("xhbh");
				String spmc=resultSet.getString("spmc");
				String gg=resultSet.getString("gg");
				String piece=resultSet.getString("piece");
				String rkNum=resultSet.getString("rkNum");
				String rkMoney=resultSet.getString("rkMoney");
				String czy=resultSet.getString("czy");
				String jsr=resultSet.getString("jsr");
				String khqc=resultSet.getString("khqc");
				String jsfs=resultSet.getString("jsfs");
				String gys=resultSet.getString("gys");
				String rkdate=resultSet.getString("rkdate");
				ruku.setCzy(czy);
				ruku.setGg(gg);
				ruku.setGys(gys);
				ruku.setJsfs(jsfs);
				ruku.setJsr(jsr);
				ruku.setKhqc(khqc);
				ruku.setPiece(piece);
				ruku.setRkMoney(rkMoney);
				ruku.setRkdate(rkdate);
				ruku.setRkNum(rkNum);
				ruku.setRkph(rkph);
				ruku.setSpmc(spmc);
				ruku.setXhbh(xhbh);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ruku;
	}
	public boolean updateInfo(String sql){
		boolean flag=false;
		dbManager.getConn();
		int res=dbManager.update(sql);
		if(res>0){
			flag=true;
		}
		return flag;
	}
	
	
}
