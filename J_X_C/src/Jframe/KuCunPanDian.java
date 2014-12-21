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
	private DefaultTableModel model; // 表格模型对象
	private JTable table;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JComboBox comboBox;
	private JTable tb = new JTable();
	private int m=0;
	public KuCunPanDian() {
		String[] title = { "入库票号", "商品编号", "商品名称", "规格", "单价", "数量", "金额",
				"操作员", "经手人", "客户全称", "结算方式", "供应商全称" ,"入库日期"};// 第一步
		model = new DefaultTableModel(title, 0);// 第二步
		tb.setModel(model);// 第四步
		tb.setRowSorter(new TableRowSorter(model));//--------------------------------------------排序
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		getContentPane().add(panel, BorderLayout.NORTH);
		JLabel l1=new JLabel("盘点员");			panel.add(l1);
		Operator op=start.getop();
        t2 = new JTextField(op.getDlmc(), 10);					panel.add(t2);
        JLabel l2=new JLabel("盘点时间");			panel.add(l2);
        Date d=new Date();
        t3 = new JTextField(new SimpleDateFormat("yyyy-mm-dd").format(d), 10);					panel.add(t3);
        JLabel l3=new JLabel("品种数");			panel.add(l3);
        shitu1();
        t4 = new JTextField((m+""), 10);					panel.add(t4);		
		this.setTitle("库存盘点");
		this.setBounds(10,93,1300,450);
		JScrollPane sp = new JScrollPane(tb);// 第五步
		this.getContentPane().add(sp);// 第六步
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		setIconifiable(true);
		setClosable(true);
		setMaximizable(true);
		this.setVisible(true);

	}
	// -----------------------------------事件
	public void shitu1(){
		DBmanager dbm=DBmanager.getInstance();
		dbm.getcon();
		String sql="select * from ruku_table";
		ResultSet rs=dbm.query(sql);
		try {
			while(rs.next()){
				String s1=rs.getString("rkph");//入库票号
				String s2=rs.getString("xhbh");//商品编号
				String s3=rs.getString("spmc");//商品名称
				String s4=rs.getString("gg");//规格
				Float s5=rs.getFloat("piece");//单价
				int s6=rs.getInt("rkNum");//数量
				Float s7=rs.getFloat("rkMoney");//金额
				String s8=rs.getString("czy");//操作员
				String s9=rs.getString("jsr");//经手人
				String s10=rs.getString("khqc");//客户全称
				String s11=rs.getString("jsfs");//结算方式
				String s12=rs.getString("gys");//供应商全称
				String s13=rs.getString("rkdate");//入库日期
				Object[] o = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13};
				m++;
				model.addRow(o);// 第三步
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dbm.close();
	}
}