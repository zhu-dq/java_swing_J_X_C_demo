package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DBmanager.DBManager1;
import PO.kehu;

public class kehu_DAO {
	DBManager1 dbManager=DBManager1.getInstance();
	
	/*
	 * 取出客户信息
	 */
	public List<kehu> getAllInfo(){
		List<kehu> list=new ArrayList<kehu>();
		dbManager.getConn();
		String sql="select * from kehu";
		ResultSet resultSet=dbManager.query(sql);
		try {
			while(resultSet.next()){
				kehu keHu=new kehu();
				String kh_qc=resultSet.getString("uqc");//取客户全称
				String kh_dz=resultSet.getString("uAdress");//取客户地址
				String kh_yzbm=resultSet.getString("uuzbm");//取邮政编码
				String kh_dh=resultSet.getString("udh");//取电话
				String kh_cz=resultSet.getString("ucz");//取传真
				String kh_lxr=resultSet.getString("ulxr");//取联系人
				String kh_EM=resultSet.getString("email");//取邮箱
				String kh_bank=resultSet.getString("ukhyh");//取开户银行
				String kh_bankNum=resultSet.getString("uyhzh");//取银行账号
				keHu.setKh_qc(kh_qc);
				keHu.setKh_dz(kh_dz);
				keHu.setKh_yzbm(kh_yzbm);
				keHu.setKh_dh(kh_dh);
				keHu.setKh_cz(kh_cz);
				keHu.setKh_lxr(kh_lxr);
				keHu.setKh_EM(kh_EM);
				keHu.setKh_bank(kh_bank);
				keHu.setKh_bankNum(kh_bankNum);
				list.add(keHu);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dbManager.close();
		return list;
	}
	/*
	 * 通过客户全称方式查找客户信息
	 */
	public List<kehu> getInfoByQC(String kh_QC){
		List<kehu> list=new ArrayList<kehu>();
		dbManager.getConn();
		String sql="select * from kehu where uqc='"+kh_QC+"'";
		ResultSet resultSet=dbManager.query(sql);
		
		try {
			while(resultSet.next()){
				kehu keHu=new kehu();
				String kh_qc=resultSet.getString("uqc");//取客户全称
				String kh_dz=resultSet.getString("uAdress");//取客户地址
				String kh_yzbm=resultSet.getString("uuzbm");//取邮政编码
				String kh_dh=resultSet.getString("udh");//取电话
				String kh_cz=resultSet.getString("ucz");//取传真
				String kh_lxr=resultSet.getString("ulxr");//取联系人
				String kh_EM=resultSet.getString("email");//取邮箱
				String kh_bank=resultSet.getString("ukhyh");//取开户银行
				String kh_bankNum=resultSet.getString("uyhzh");//取银行账号
				keHu.setKh_qc(kh_qc);
				keHu.setKh_dz(kh_dz);
				keHu.setKh_yzbm(kh_yzbm);
				keHu.setKh_dh(kh_dh);
				keHu.setKh_cz(kh_cz);
				keHu.setKh_lxr(kh_lxr);
				keHu.setKh_EM(kh_EM);
				keHu.setKh_bank(kh_bank);
				keHu.setKh_bankNum(kh_bankNum);
				list.add(keHu);
				
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dbManager.close();
		return list;
	}
	/*
	 * 通过客户地址查询客户
	 */
	public List<kehu> getInfoByAddress(String address){
		List<kehu> list=new ArrayList<kehu>();
		dbManager.getConn();
		String sql="select * from kehu where uAdress='"+address+"'";
		ResultSet resultSet=dbManager.query(sql);
		try {
			while(resultSet.next()){
				kehu keHu=new kehu();
				String kh_qc=resultSet.getString("uqc");//取客户全称
				String kh_dz=resultSet.getString("uAdress");//取客户地址
				String kh_yzbm=resultSet.getString("uuzbm");//取邮政编码
				String kh_dh=resultSet.getString("udh");//取电话
				String kh_cz=resultSet.getString("ucz");//取传真
				String kh_lxr=resultSet.getString("ulxr");//取联系人
				String kh_EM=resultSet.getString("email");//取邮箱
				String kh_bank=resultSet.getString("ukhyh");//取开户银行
				String kh_bankNum=resultSet.getString("uyhzh");//取银行账号
				keHu.setKh_qc(kh_qc);
				keHu.setKh_dz(kh_dz);
				keHu.setKh_yzbm(kh_yzbm);
				keHu.setKh_dh(kh_dh);
				keHu.setKh_cz(kh_cz);
				keHu.setKh_lxr(kh_lxr);
				keHu.setKh_EM(kh_EM);
				keHu.setKh_bank(kh_bank);
				keHu.setKh_bankNum(kh_bankNum);
				list.add(keHu);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dbManager.close();
		return list;
	}
}
