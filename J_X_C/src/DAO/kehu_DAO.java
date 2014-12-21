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
	 * ȡ���ͻ���Ϣ
	 */
	public List<kehu> getAllInfo(){
		List<kehu> list=new ArrayList<kehu>();
		dbManager.getConn();
		String sql="select * from kehu";
		ResultSet resultSet=dbManager.query(sql);
		try {
			while(resultSet.next()){
				kehu keHu=new kehu();
				String kh_qc=resultSet.getString("uqc");//ȡ�ͻ�ȫ��
				String kh_dz=resultSet.getString("uAdress");//ȡ�ͻ���ַ
				String kh_yzbm=resultSet.getString("uuzbm");//ȡ��������
				String kh_dh=resultSet.getString("udh");//ȡ�绰
				String kh_cz=resultSet.getString("ucz");//ȡ����
				String kh_lxr=resultSet.getString("ulxr");//ȡ��ϵ��
				String kh_EM=resultSet.getString("email");//ȡ����
				String kh_bank=resultSet.getString("ukhyh");//ȡ��������
				String kh_bankNum=resultSet.getString("uyhzh");//ȡ�����˺�
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
	 * ͨ���ͻ�ȫ�Ʒ�ʽ���ҿͻ���Ϣ
	 */
	public List<kehu> getInfoByQC(String kh_QC){
		List<kehu> list=new ArrayList<kehu>();
		dbManager.getConn();
		String sql="select * from kehu where uqc='"+kh_QC+"'";
		ResultSet resultSet=dbManager.query(sql);
		
		try {
			while(resultSet.next()){
				kehu keHu=new kehu();
				String kh_qc=resultSet.getString("uqc");//ȡ�ͻ�ȫ��
				String kh_dz=resultSet.getString("uAdress");//ȡ�ͻ���ַ
				String kh_yzbm=resultSet.getString("uuzbm");//ȡ��������
				String kh_dh=resultSet.getString("udh");//ȡ�绰
				String kh_cz=resultSet.getString("ucz");//ȡ����
				String kh_lxr=resultSet.getString("ulxr");//ȡ��ϵ��
				String kh_EM=resultSet.getString("email");//ȡ����
				String kh_bank=resultSet.getString("ukhyh");//ȡ��������
				String kh_bankNum=resultSet.getString("uyhzh");//ȡ�����˺�
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
	 * ͨ���ͻ���ַ��ѯ�ͻ�
	 */
	public List<kehu> getInfoByAddress(String address){
		List<kehu> list=new ArrayList<kehu>();
		dbManager.getConn();
		String sql="select * from kehu where uAdress='"+address+"'";
		ResultSet resultSet=dbManager.query(sql);
		try {
			while(resultSet.next()){
				kehu keHu=new kehu();
				String kh_qc=resultSet.getString("uqc");//ȡ�ͻ�ȫ��
				String kh_dz=resultSet.getString("uAdress");//ȡ�ͻ���ַ
				String kh_yzbm=resultSet.getString("uuzbm");//ȡ��������
				String kh_dh=resultSet.getString("udh");//ȡ�绰
				String kh_cz=resultSet.getString("ucz");//ȡ����
				String kh_lxr=resultSet.getString("ulxr");//ȡ��ϵ��
				String kh_EM=resultSet.getString("email");//ȡ����
				String kh_bank=resultSet.getString("ukhyh");//ȡ��������
				String kh_bankNum=resultSet.getString("uyhzh");//ȡ�����˺�
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
