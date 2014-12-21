package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBmanager.DBManager1;
import PO.gongYingShang;


public class gys_DAO {
	DBManager1 dbManager=DBManager1.getInstance();
	
	/*
	 * 取出所有用户信息
	 */
	public List<gongYingShang> gatAllGYSInfo(){
		List<gongYingShang> list=new ArrayList<gongYingShang>();
		dbManager.getConn();
		String sql="select * from gys_info";
		ResultSet resultSet=dbManager.query(sql);
		try {
			while(resultSet.next()){
				gongYingShang gys=new gongYingShang();
				String GYS_name=resultSet.getString("gysqc");//供应商全称
				String GYS_yzbm=resultSet.getString("yzbm");//邮政编码
				String GYS_Address=resultSet.getString("dz");//地址
				String GYS_Phone=resultSet.getString("dh");//电话
				String GYS_cz=resultSet.getString("cz");//传真
				String GYS_lxr=resultSet.getString("lxr");//联系人
				String GYS_Bank=resultSet.getString("khyh");//开户银行
				String GYS_dzxx=resultSet.getString("dzxx");//电子信箱
				gys.setGYS_name(GYS_name);
				gys.setGYS_Address(GYS_Address);
				gys.setGYS_Phone(GYS_Phone);
				gys.setGYS_Bank(GYS_Bank);
				gys.setGYS_cz(GYS_cz);
				gys.setGYS_dzxx(GYS_dzxx);
				gys.setGYS_lxr(GYS_lxr);
				gys.setGYS_yzbm(GYS_yzbm);
				list.add(gys);		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	/*
	 * 通过地址取信息
	 */
	public List<gongYingShang> gatGYSInfoBySQL(String sql){
		dbManager.getConn();
		List<gongYingShang> list=new ArrayList<gongYingShang>();
		ResultSet resultSet=dbManager.query(sql);
		
		try {
			while(resultSet.next()){
				gongYingShang gys=new gongYingShang();
				String GYS_name=resultSet.getString("gysqc");//供应商全称
				String GYS_yzbm=resultSet.getString("yzbm");//邮政编码
				String GYS_Address=resultSet.getString("dz");//地址
				String GYS_Phone=resultSet.getString("dh");//电话
				String GYS_cz=resultSet.getString("cz");//传真
				String GYS_lxr=resultSet.getString("lxr");//联系人
				String GYS_Bank=resultSet.getString("khyh");//开户银行
				String GYS_dzxx=resultSet.getString("dzxx");//电子信箱
				gys.setGYS_name(GYS_name);
				gys.setGYS_Address(GYS_Address);
				gys.setGYS_Phone(GYS_Phone);
				gys.setGYS_Bank(GYS_Bank);
				gys.setGYS_cz(GYS_cz);
				gys.setGYS_dzxx(GYS_dzxx);
				gys.setGYS_lxr(GYS_lxr);
				gys.setGYS_yzbm(GYS_yzbm);
				list.add(gys);
			}		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
