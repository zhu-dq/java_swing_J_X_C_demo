package Jframe;

import javax.swing.*;

import User.Goods;

import DBmanager.DBmanager;
import JXC.jxc_good;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.awt.Color;

public class spxxgl extends JInternalFrame {
	// -----------------------------------------------------------------------------------------
	private JTextField t1;
	private JTextField tt1;
	private JTextField t2;
	private JTextField tt2;
	private JTextField t3;
	private JTextField tt3;
	private JTextField t4;
	private JTextField tt4;
	private JTextField t5;
	private JTextField tt5;
	private JTextField t6;
	private JTextField tt6;
	private JTextField t7;
	private JTextField tt7;
	private JTextField t9;
	private JTextField tt9;
	private JTextField t10;
	private JTextField tt10;
	private String value;
	private JComboBox comboBox;
	private JComboBox Box;
	private JComboBox comboBox_1;

	// ---------------------------------------------------------------------------------------
	public spxxgl() {
		this.getContentPane().setLayout(null);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 620, 405);
		getContentPane().add(tabbedPane);
		JPanel p1 = new JPanel();
		p1.setBackground(Color.ORANGE);
		p1.setLayout(null);
		// ------------------------------------------------------------------------------------------
		tabbedPane.addTab("商品信息添加", null, p1, null);
		JLabel l1 = new JLabel("商品全称");
		l1.setBounds(59, 13, 72, 18);
		p1.add(l1);
		JLabel l2 = new JLabel("商品简称");
		l2.setBounds(59, 53, 72, 18);
		p1.add(l2);
		JLabel l3 = new JLabel("单位");
		l3.setBounds(79, 142, 52, 18);
		p1.add(l3);
		JLabel l4 = new JLabel("规格");
		l4.setBounds(314, 142, 52, 18);
		p1.add(l4);
		JLabel l5 = new JLabel("包装");
		l5.setBounds(79, 194, 52, 18);
		p1.add(l5);
		JLabel l6 = new JLabel("批号");
		l6.setBounds(314, 194, 52, 18);
		p1.add(l6);
		JLabel l7 = new JLabel("批准文号");
		l7.setBounds(59, 241, 72, 18);
		p1.add(l7);
		JLabel l9 = new JLabel("商品产地");
		l9.setBounds(59, 98, 72, 18);
		p1.add(l9);
		JLabel l10 = new JLabel("备注");
		l10.setBounds(67, 292, 52, 18);
		p1.add(l10);
		JButton b2 = new JButton("添加");
		b2.setBounds(440, 333, 113, 27);
		p1.add(b2);
		t1 = new JTextField();
		t1.setBounds(145, 13, 408, 24);
		t1.setColumns(10);
		p1.add(t1);
		t2 = new JTextField();
		t2.setBounds(145, 50, 408, 24);
		t2.setColumns(10);
		p1.add(t2);
		t3 = new JTextField();
		t3.setBounds(145, 139, 135, 24);
		t3.setColumns(10);
		p1.add(t3);
		t4 = new JTextField();
		t4.setBounds(381, 139, 172, 24);
		t4.setColumns(10);
		p1.add(t4);
		t5 = new JTextField();
		t5.setBounds(145, 191, 135, 24);
		t5.setColumns(10);
		p1.add(t5);
		t6 = new JTextField();
		t6.setBounds(381, 191, 172, 24);
		t6.setColumns(10);
		p1.add(t6);
		t7 = new JTextField();
		t7.setBounds(145, 238, 408, 24);
		t7.setColumns(10);
		p1.add(t7);
		t9 = new JTextField();
		t9.setBounds(145, 95, 408, 24);
		t9.setColumns(10);
		p1.add(t9);
		t10 = new JTextField();
		t10.setBounds(145, 289, 408, 24);
		t10.setColumns(10);
		p1.add(t10);
		comboBox = new JComboBox();
		comboBox.setBounds(145, 334, 221, 24);
		p1.add(comboBox);

		JLabel lblNewLabel_2 = new JLabel("供应商全称");
		lblNewLabel_2.setBounds(59, 337, 72, 18);
		p1.add(lblNewLabel_2);
		// -------------------------------------------事件
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
				String s4 = t4.getText();
				String s5 = t5.getText();
				String s6 = t6.getText();
				String s7 = t7.getText();
				String s9 = t9.getText();
				String s10 = t10.getText();
				DBmanager dbm = DBmanager.getInstance();// 1
				dbm.getcon();// 2
				String sql = "insert into goods_info values('" + s1 + "','"
						+ s2 + "','" + s9 + "','" + s3 + "','" + s4 + "','"
						+ s5 + "','" + s6 + "','" + s7 + "','" + value + "','"
						+ s10 + "')";
				System.out.println(sql);
				dbm.update(sql);// 4
				dbm.close();// 5

			}
		});
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				value = (String) e.getItem();
			}
		});
		// ------------------------------------------------------------------------------------------
		JPanel p2 = new JPanel();
		p2.setBackground(Color.GREEN);
		p2.setLayout(null);
		// ------------------------------------------------------------------------------------------
		tabbedPane.addTab("商品信息修改和删除", null, p2, null);
		JLabel ll1 = new JLabel("商品全称");		ll1.setBounds(59, 13, 72, 18);		p2.add(ll1);
		JLabel ll2 = new JLabel("商品简称");		ll2.setBounds(59, 53, 72, 18);		p2.add(ll2);
		JLabel ll3 = new JLabel("单位");			ll3.setBounds(76, 142, 55, 18);		p2.add(ll3);
		JLabel ll4 = new JLabel("规格");			ll4.setBounds(318, 142, 48, 18);	p2.add(ll4);
		JLabel ll5 = new JLabel("包装");			ll5.setBounds(76, 194, 55, 18);		p2.add(ll5);
		JLabel ll6 = new JLabel("批号");			ll6.setBounds(318, 194, 48, 18);	p2.add(ll6);
		JLabel ll7 = new JLabel("批准文号");		ll7.setBounds(59, 241, 72, 18);		p2.add(ll7);
		JLabel ll9 = new JLabel("商品产地");		ll9.setBounds(59, 98, 72, 18);		p2.add(ll9);
		JLabel ll10 = new JLabel("备注");		ll10.setBounds(71, 292, 48, 18);	p2.add(ll10);
		JButton bb1 = new JButton("修改");
		bb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=tt1.getText();
				String s2=tt2.getText();
				String s3=tt3.getText();
				String s4=tt4.getText();
				String s5=tt5.getText();
				String s6=tt6.getText();
				String s7=tt7.getText();
				String s9=tt9.getText();
				String s10=tt10.getText();
				DBmanager dbm=DBmanager.getInstance();//1
				dbm.getcon();//2
				String sql="update goods_info set spmc='"+s1+"',spjc='"+s2+"',spcd='"+s9+"',dw='"+s3+"',gg='"+s4+"',baoz='"+s5+"',ph='"+s6+"',bz='"+s10+"',pzwh='"+s7+"' where spmc='"+s1+"'";//3
				System.out.println(sql);
				dbm.update(sql);//4
				dbm.close();//5
			
			
			}
		});
		bb1.setBounds(381, 333, 83, 27);
		p2.add(bb1);
		JButton bb2 = new JButton("删除");
		bb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=tt1.getText();
				DBmanager dbm=DBmanager.getInstance();//1
				dbm.getcon();//2
				String sql="delete from goods_info where spmc='"+s1+"'";//3
				JOptionPane.showMessageDialog(null, sql);
				dbm.update(sql);//4
				dbm.close();//5
				tt1.setText("");
				tt2.setText("");
				tt3.setText("");
				tt4.setText("");
				tt5.setText("");
				tt6.setText("");
				tt7.setText("");
				tt9.setText("");
				tt10.setText("");
			
			}
		});
		bb2.setBounds(478, 333, 77, 27);
		p2.add(bb2);
		tt1 = new JTextField();
		tt1.setBounds(145, 13, 408, 24);
		tt1.setColumns(10);
		p2.add(tt1);
		tt2 = new JTextField();
		tt2.setBounds(145, 50, 408, 24);
		tt2.setColumns(10);
		p2.add(tt2);
		tt3 = new JTextField();
		tt3.setBounds(145, 139, 135, 24);
		tt3.setColumns(10);
		p2.add(tt3);
		tt4 = new JTextField();
		tt4.setBounds(381, 139, 172, 24);
		tt4.setColumns(10);
		p2.add(tt4);
		tt5 = new JTextField();
		tt5.setBounds(145, 191, 135, 24);
		tt5.setColumns(10);
		p2.add(tt5);
		tt6 = new JTextField();
		tt6.setBounds(381, 191, 172, 24);
		tt6.setColumns(10);
		p2.add(tt6);
		tt7 = new JTextField();
		tt7.setBounds(145, 238, 135, 24);
		tt7.setColumns(10);
		p2.add(tt7);
		tt9 = new JTextField();
		tt9.setBounds(145, 95, 408, 24);
		tt9.setColumns(10);
		p2.add(tt9);
		tt10 = new JTextField();
		tt10.setBounds(145, 289, 408, 24);
		tt10.setColumns(10);
		p2.add(tt10);
		Box = new JComboBox();
		Box.setBounds(145, 334, 221, 24);
		p2.add(Box);

		JLabel lblNewLabel = new JLabel("供应商全称");
		lblNewLabel.setBounds(47, 337, 84, 18);
		p2.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("选择商品");
		lblNewLabel_1.setBounds(294, 241, 72, 18);
		p2.add(lblNewLabel_1);

		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(381, 238, 174, 24);
		p2.add(comboBox_1);
		
		// -------------------------------------------------------------------------
		yemian1();
		this.setTitle("商品信息管理");
		this.setBounds(155, 93, 631, 450);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		setIconifiable(true);
		setClosable(true);
		this.setVisible(true);
		//-----------------------------------------------------------------------------------
		comboBox_1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
            	jxc_good j=new jxc_good();
    			Goods u=new Goods();
                String value = (String) e.getItem();
                u=j.getgoodbyspmc(value);
				tt1.setText(u.getSpmc());
				tt2.setText(u.getSpjc());
				tt3.setText(u.getDw());
				tt4.setText(u.getGg());
				tt5.setText(u.getBaoz());
				tt6.setText(u.getPh());
				tt7.setText(u.getPzwh());
				tt9.setText(u.getSpcd());
				tt10.setText(u.getBz());       
            }
        });
	}

	public void yemian1() {
		jxc_good j = new jxc_good();
		DBmanager dbm = DBmanager.getInstance();// 1
		dbm.getcon();// 2
		String sql = "select * from goods_info";// 3
		ResultSet rs = dbm.query(sql);// 4
		try {
			while (rs.next()) {
				comboBox.addItem(rs.getString("gysqc"));
				comboBox_1.addItem(rs.getString("spmc"));
				Box.addItem(rs.getString("gysqc"));
				Goods u = new Goods();
				u.setId(rs.getInt("id"));
				u.setSpmc(rs.getString("spmc"));
				u.setSpjc(rs.getString("spjc"));
				u.setSpcd(rs.getString("spcd"));
				u.setDw(rs.getString("dw"));
				u.setGg(rs.getString("gg"));
				u.setBaoz(rs.getString("baoz"));
				u.setPh(rs.getString("ph"));
				u.setPzwh(rs.getString("pzwh"));
				u.setGysqc(rs.getString("gysqc"));
				u.setBz(rs.getString("bz"));
				j.add(u);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		dbm.close();// 5
	}
}
