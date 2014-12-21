package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBmanager.DBManager1;
import DBmanager.DBManager1;
import PO.Goods;


public class goods_DAO {
	DBManager1 dbManager=DBManager1.getInstance();
	
	/*
	 * 取出所有商品信息
	 */
	public List<Goods> getAllGoodsInfo(){
		List<Goods> list=new ArrayList<Goods>();
		dbManager.getConn();
		String sql="select * from goods_info";
		ResultSet resultSet=dbManager.query(sql);
		
		try {
			while(resultSet.next()){
				Goods goods=new Goods();
				String 	spmc=resultSet.getString("spmc");//商品名称
				String 	spcd=resultSet.getString("spcd");//商品产地
				String 	dw=resultSet.getString("dw");//单位
				String 	gg=resultSet.getString("gg");//规格
				String 	baoz=resultSet.getString("baoz");//包装
				String 	pzwh=resultSet.getString("pzwh");//批准文号
				String 	gysqc=resultSet.getString("gysqc");//供应商全称
				String 	bz=resultSet.getString("bz");//备注
				goods.setGoods_Name(spmc);
				goods.setGoods_Address(spcd);
				goods.setGoods_DW(dw);
				goods.setGoos_BAZ(baoz);
				goods.setGoos_BZ(bz);
				goods.setGoos_gg(gg);
				goods.setGoos_PH(pzwh);
				goods.setGoos_GYSName(gysqc);
				list.add(goods);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public List<Goods> getGoodsByName(String sql){
		List<Goods> list=new ArrayList<Goods>();
		dbManager.getConn();
		//String sql="select * from goods_info where'"+Name+"'";
		ResultSet resultSet=dbManager.query(sql);
		
		try {
			while(resultSet.next()){
				Goods goods=new Goods();
				String 	spmc=resultSet.getString("spmc");//商品名称
				String 	spcd=resultSet.getString("spcd");//商品产地
				String 	dw=resultSet.getString("dw");//单位
				String 	gg=resultSet.getString("gg");//规格
				String 	baoz=resultSet.getString("baoz");//包装
				String 	pzwh=resultSet.getString("pzwh");//批准文号
				String 	gysqc=resultSet.getString("gysqc");//供应商全称
				String 	bz=resultSet.getString("bz");//备注
				goods.setGoods_Name(spmc);
				goods.setGoods_Address(spcd);
				goods.setGoods_DW(dw);
				goods.setGoos_BAZ(baoz);
				goods.setGoos_BZ(bz);
				goods.setGoos_gg(gg);
				goods.setGoos_PH(pzwh);
				goods.setGoos_GYSName(gysqc);
				list.add(goods);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public List<Goods> getGoodsByAddress(String sql){
		List<Goods> list=new ArrayList<Goods>();
		dbManager.getConn();
		ResultSet resultSet=dbManager.query(sql);
		try {
			while(resultSet.next()){
				Goods goods=new Goods();
				String 	spmc=resultSet.getString("spmc");//商品名称
				String 	spcd=resultSet.getString("spcd");//商品产地
				String 	dw=resultSet.getString("dw");//单位
				String 	gg=resultSet.getString("gg");//规格
				String 	baoz=resultSet.getString("baoz");//包装
				String 	pzwh=resultSet.getString("pzwh");//批准文号
				String 	gysqc=resultSet.getString("gysqc");//供应商全称
				String 	bz=resultSet.getString("bz");//备注
				goods.setGoods_Name(spmc);
				goods.setGoods_Address(spcd);
				goods.setGoods_DW(dw);
				goods.setGoos_BAZ(baoz);
				goods.setGoos_BZ(bz);
				goods.setGoos_gg(gg);
				goods.setGoos_PH(pzwh);
				goods.setGoos_GYSName(gysqc);
				list.add(goods);
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
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
