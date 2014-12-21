package Jframe;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import User.Operator;

import DBmanager.DBmanager;

import java.awt.event.*;
public class KuCunPanDian extends JInternalFrame {
	private DefaultTableModel model; // ���ģ�Ͷ���
	private JTable table;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JComboBox comboBox;
	private JTable tb = new JTable();
	private int m=0;
	public KuCunPanDian() {
		String[] title = { "���Ʊ��", "��Ʒ���", "��Ʒ����", "���", "����", "����", "���",
				"����Ա", "������", "�ͻ�ȫ��", "���㷽ʽ", "��Ӧ��ȫ��" ,"�������"};// ��һ��
		model = new DefaultTableModel(title, 0);// �ڶ���
		tb.setModel(model);// ���Ĳ�
		tb.setRowSorter(new TableRowSorter(model));//--------------------------------------------����
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		getContentPane().add(panel, BorderLayout.NORTH);
		JLabel l1=new JLabel("�̵�Ա");			panel.add(l1);
		Operator op=start.getop();
        t2 = new JTextField(op.getDlmc(), 10);					panel.add(t2);
        JLabel l2=new JLabel("�̵�ʱ��");			panel.add(l2);
        Date d=new Date();
        t3 = new JTextField(new SimpleDateFormat("yyyy-mm-dd").format(d), 10);					panel.add(t3);
        JLabel l3=new JLabel("Ʒ����");			panel.add(l3);
        shitu1();
        t4 = new JTextField((m+""), 10);					panel.add(t4);		
		this.setTitle("����̵�");
		this.setBounds(10,93,1300,450);
		JScrollPane sp = new JScrollPane(tb);// ���岽
		this.getContentPane().add(sp);// ������
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		setIconifiable(true);
		setClosable(true);
		setMaximizable(true);
		this.setVisible(true);

	}
	// -----------------------------------�¼�
	public void shitu1(){
		DBmanager dbm=DBmanager.getInstance();
		dbm.getcon();
		String sql="select * from ruku_table";
		ResultSet rs=dbm.query(sql);
		try {
			while(rs.next()){
				String s1=rs.getString("rkph");//���Ʊ��
				String s2=rs.getString("xhbh");//��Ʒ���
				String s3=rs.getString("spmc");//��Ʒ����
				String s4=rs.getString("gg");//���
				Float s5=rs.getFloat("piece");//����
				int s6=rs.getInt("rkNum");//����
				Float s7=rs.getFloat("rkMoney");//���
				String s8=rs.getString("czy");//����Ա
				String s9=rs.getString("jsr");//������
				String s10=rs.getString("khqc");//�ͻ�ȫ��
				String s11=rs.getString("jsfs");//���㷽ʽ
				String s12=rs.getString("gys");//��Ӧ��ȫ��
				String s13=rs.getString("rkdate");//�������
				Object[] o = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13};
				m++;
				model.addRow(o);// ������
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dbm.close();
	}
}