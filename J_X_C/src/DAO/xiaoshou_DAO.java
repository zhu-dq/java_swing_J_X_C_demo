package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DBmanager.DBManager1;

import PO.xiaoShou;

public class xiaoshou_DAO {
	DBManager1 dbManager=DBManager1.getInstance();
	/*
	 * 取出所有销售信息
	 */
	public List<xiaoShou> getAllGYSInfo(){
		List<xiaoShou> list=new ArrayList<xiaoShou>();
		dbManager.getConn();
		String sql="select * from xiaoshou_info";
		ResultSet resultSet=dbManager.query(sql);
		try {
			while(resultSet.next()){
				xiaoShou shou=new xiaoShou();
				String xhph=resultSet.getString("xhph");
				String xhbh=resultSet.getString("xhbh");
				String spmc=resultSet.getString("spmc");
				String gg=resultSet.getString("gg");
				String piece=resultSet.getString("piece");
				String num=resultSet.getString("num");
				String je=resultSet.getString("je");
				String khqc=resultSet.getString("khqc");
				String xsdate=resultSet.getString("xsdate");
				String czy=resultSet.getString("czy");
				String jsr=resultSet.getString("jsr");
				shou.setXhph(xhph);
				shou.setXhbh(xhbh);
				shou.setSpmc(spmc);
				shou.setGg(gg);
				shou.setPiece(piece);
				shou.setNum(num);
				shou.setJe(je);
				shou.setKhqc(khqc);
				shou.setXsdate(xsdate);
				shou.setCzy(czy);
				shou.setJsr(jsr);
				list.add(shou);		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public List<xiaoShou> getInfoBySQL(String sql){
		List<xiaoShou> list=new ArrayList<xiaoShou>();
		dbManager.getConn();
		ResultSet resultSet=dbManager.query(sql);
		try {
			while(resultSet.next()){
				xiaoShou shou=new xiaoShou();
				String xhph=resultSet.getString("xhph");
				String xhbh=resultSet.getString("xhbh");
				String spmc=resultSet.getString("spmc");
				String gg=resultSet.getString("gg");
				String piece=resultSet.getString("piece");
				String num=resultSet.getString("num");
				String je=resultSet.getString("je");
				String khqc=resultSet.getString("khqc");
				String xsdate=resultSet.getString("xsdate");
				String czy=resultSet.getString("czy");
				String jsr=resultSet.getString("jsr");
				shou.setXhph(xhph);
				shou.setXhbh(xhbh);
				shou.setSpmc(spmc);
				shou.setGg(gg);
				shou.setPiece(piece);
				shou.setNum(num);
				shou.setJe(je);
				shou.setKhqc(khqc);
				shou.setXsdate(xsdate);
				shou.setCzy(czy);
				shou.setJsr(jsr);
				list.add(shou);		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
