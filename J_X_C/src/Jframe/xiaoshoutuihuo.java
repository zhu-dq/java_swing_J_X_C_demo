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

import means.MyThread1;
import User.Operator;
import DBmanager.DBmanager;

import java.awt.event.*;
public class xiaoshoutuihuo extends JInternalFrame {
	private DefaultTableModel model; // ���ģ�Ͷ���
	private JTable table;
	private JTextField t1;
	private JTextField t2;
	private JTextField t4;
	private JTextField t7;
	//private int r;
	private JComboBox comboBox;
	private JTable tb = new JTable();
	private static JTextField t12;

	
	
	public xiaoshoutuihuo() {
		String[] title = { "����Ʊ��", "��Ʒ���", "��Ʒ����", "���", "����", "����",
				"���", "�ͻ�ȫ��", "��������", "����Ա","������"};// ��һ��
		model = new DefaultTableModel(title, 0);// �ڶ���
		tb.setModel(model);// ���Ĳ�
		tb.setRowSorter(new TableRowSorter(model));//--------------------------------------------����
		JPanel pl = new JPanel();
		pl.setBackground(Color.ORANGE);
		getContentPane().add(pl, BorderLayout.NORTH);
		JLabel l1=new JLabel("������Ҫ�˻���Ʊ��");						pl.add(l1);
        
        t1 = new JTextField("");
        pl.add(t1);
        t1.setColumns(10);
        JLabel l3=new JLabel("������");						pl.add(l3);
        t4 = new JTextField("", 10);					pl.add(t4);
        JLabel l4=new JLabel("���㷽ʽ");						pl.add(l4);
        
        JComboBox comboBox_2 = new JComboBox();
        comboBox_2.addItem("֧Ʊ");
        comboBox_2.addItem("�ֽ�");
        pl.add(comboBox_2);
        JLabel l5=new JLabel("��������");						pl.add(l5);
        
        t12 = new JTextField("",12);
        MyThread1 d=new MyThread1();
		d.start();
        pl.add(t12);
        JLabel l6=new JLabel("����Ա");						pl.add(l6);
        Operator op=start.getop();
        t7 = new JTextField((op.getDlmc()), 10);					pl.add(t7);
        //-----------------------------------------------------------------
        JPanel p2 = new JPanel();
        p2.setBackground(Color.ORANGE);
		getContentPane().add(p2, BorderLayout.SOUTH);
						
						JButton btnNewButton = new JButton("����Ʊ�Ų�ѯ");
						btnNewButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								shitu1();
							}
						});
						p2.add(btnNewButton);
						
						JButton btnNewButton_1 = new JButton("ɾ��");
						btnNewButton_1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if("".equals(t1.getText())){
									JOptionPane.showMessageDialog(null,"������Ҫ�˻���Ʊ��");
								}else {
									DBmanager dbm=DBmanager.getInstance();
									dbm.getcon();
									String sql="delete from xiaoshou_info where xhbh = '"+t1.getText()+"'";
									dbm.update(sql);
									dbm.close();
								}
							}
						});
						p2.add(btnNewButton_1);
		this.setTitle("�˻���");
		this.setBounds(10,93,1300,450);
		JScrollPane sp = new JScrollPane(tb);// ���岽
		getContentPane().add(sp, BorderLayout.CENTER);
		t2 = new JTextField("2", 10);
		sp.setColumnHeaderView(t2);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		setIconifiable(true);
		setClosable(true);
		setMaximizable(true);
		this.setVisible(true);
	}
	

	public static void settxt(String format) {
		t12.setText(format);
		
	}
	public void shitu1(){
		DBmanager dbm=DBmanager.getInstance();
		dbm.getcon();
		String sql="select * from xiaoshou_info where xhbh = '"+t1.getText()+"'";
		ResultSet rs=dbm.query(sql);
		try {
			 int r = model.getRowCount();
			if("".equals(t1.getText())){
				JOptionPane.showMessageDialog(null,"������Ҫ�˻���Ʊ��");
			}else if(r>=1){
				model.removeRow(0);
			}else if(rs.next()){
				String s1=rs.getString("xhph");//����Ʊ��
				String s2=rs.getString("xhbh");//��Ʒ���
				String s3=rs.getString("spmc");//��Ʒ����
				String s4=rs.getString("gg");//���
				Float s5=rs.getFloat("piece");//����
				int s6=rs.getInt("num");//����
				Float s7=rs.getFloat("je");//���
				String s8=rs.getString("khqc");//�ͻ�ȫ��
				String s9=rs.getString("xsdate");//��������
				String s10=rs.getString("czy");//����Ա
				String s11=rs.getString("jsr");//������
				Object[] o = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11};
				model.addRow(o);// ������				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dbm.close();
	}
}
