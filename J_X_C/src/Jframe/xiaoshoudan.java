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

import means.MyThread;
import User.Operator;
import DBmanager.DBmanager;
import java.awt.event.*;
public class xiaoshoudan extends JInternalFrame {
	private DefaultTableModel model; // ���ģ�Ͷ���
	private JTable table;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t7;
	private JTextField t8;
	private JTextField t9;
	private JTextField t10;
	private JTextField t11;
	private JTextField t6;
	private JComboBox comboBox;
	private JTable tb = new JTable();
	private static JTextField t12;

	
	
	public xiaoshoudan() {
		String[] title = { "����Ʊ��", "��Ʒ���", "��Ʒ����", "���", "����", "����",
				"���", "�ͻ�ȫ��", "��������", "����Ա","������"};// ��һ��
		model = new DefaultTableModel(title, 0);// �ڶ���
		tb.setModel(model);// ���Ĳ�
		tb.setRowSorter(new TableRowSorter(model));//--------------------------------------------����
		JPanel pl = new JPanel();
		pl.setBackground(Color.ORANGE);
		getContentPane().add(pl, BorderLayout.NORTH);
		JLabel l1=new JLabel("����Ʊ��");						pl.add(l1);
        
        t1 = new JTextField("");
        pl.add(t1);
        t1.setColumns(10);
        JLabel l2=new JLabel("�ͻ�ȫ��");						pl.add(l2);
        
        t3 = new JTextField("");
        pl.add(t3);
        t3.setColumns(10);
        JLabel l3=new JLabel("������");						pl.add(l3);
        t4 = new JTextField("", 10);					pl.add(t4);
        JLabel l4=new JLabel("���㷽ʽ");						pl.add(l4);
        
        JComboBox comboBox_2 = new JComboBox();
        comboBox_2.addItem("֧Ʊ");
        comboBox_2.addItem("�ֽ�");
        pl.add(comboBox_2);
        JLabel l5=new JLabel("��������");						pl.add(l5);
        
        t12 = new JTextField("",12);
        MyThread d=new MyThread();
		d.start();
        pl.add(t12);
        JLabel l6=new JLabel("����Ա");						pl.add(l6);
        Operator op=start.getop();
        t7 = new JTextField((op.getDlmc()), 10);					pl.add(t7);
        //-----------------------------------------------------------------
        JPanel p2 = new JPanel();
        p2.setBackground(Color.ORANGE);
		getContentPane().add(p2, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("���");
		p2.add(lblNewLabel);
		
		t5 = new JTextField("");
		p2.add(t5);
		t5.setColumns(10);
		JLabel l7=new JLabel("����");						p2.add(l7);
        t8 = new JTextField("", 10);					p2.add(t8);
        JLabel l8=new JLabel("����");						p2.add(l8);
        t9 = new JTextField("", 10);						p2.add(t9);
        JLabel l9=new JLabel("���");						p2.add(l9);
        t10 = new JTextField("", 10);					p2.add(t10);
        JLabel l10=new JLabel("��Ʒ���");					p2.add(l10);
        t11 = new JTextField("", 10);					p2.add(t11);
        JLabel l11=new JLabel("��Ʒ����");					p2.add(l11);
        t6 = new JTextField("", 10);						p2.add(t6);
						
						JButton btnNewButton = new JButton("��ѯ����");
						btnNewButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								shitu1();
							}
						});
						p2.add(btnNewButton);
						
						JButton btnNewButton_1 = new JButton("�������");
						btnNewButton_1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if("".equals(t1.getText())||"".equals(t12.getText())||"".equals(t3.getText())||"".equals(t4.getText())||"".equals(t5.getText())||"".equals(t6.getText())||"".equals(t7.getText())||"".equals(t8.getText())||"".equals(t9.getText())||"".equals(t10.getText())||"".equals(t11.getText())){
									JOptionPane.showMessageDialog(null, "�뽫������������");
								}else{
									String s1=t1.getText();
									String s2=t11.getText();
									String s3=t6.getText();
									String s4=t10.getText();
									String s5=t9.getText();
									String s6=t8.getText();
									String s7=t5.getText();
									String s8=t3.getText();
									String s9=t12.getText();
									String s10=t7.getText();
									String s11=t4.getText();
									DBmanager dbm=DBmanager.getInstance();
									dbm.getcon();
									String sql="insert into xiaoshou_info values('"+s1+"','"+s2+"','"+s3+"','"+s4+"',"+s5+","+s6+","+s7+",'"+s8+"','"+s9+"','"+s10+"','"+s11+"')";
									dbm.update(sql);
									dbm.close();
								}
							}
						});
						p2.add(btnNewButton_1);
						
						JButton btnNewButton_2 = new JButton("����");
						btnNewButton_2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								 qiumoney();
							}
						});
						p2.add(btnNewButton_2);
		this.setTitle("���۵�");
		this.setBounds(10,93,1300,450);
		JScrollPane sp = new JScrollPane(tb);// ���岽
		getContentPane().add(sp, BorderLayout.CENTER);
		t2 = new JTextField("", 10);
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
	public void qiumoney(){
		if("".equals(t8.getText())||"".equals(t9.getText())){
			JOptionPane.showMessageDialog(null, "�����뵥�ۺ�����");
		}else{
			int a=Integer.parseInt(t8.getText());
			int b=Integer.parseInt(t9.getText());
			t5.setText(a*b+"");	
		}
	}
	public void shitu1(){
		DBmanager dbm=DBmanager.getInstance();
		dbm.getcon();
		String sql="select * from xiaoshou_info";
		ResultSet rs=dbm.query(sql);
		try {
			while(rs.next()){
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
