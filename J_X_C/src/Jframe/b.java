package Jframe;
import javax.swing.*;

import means.dushiju_kh;
import means.dushuju_good;
import means.dushuju_gys;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class b extends JFrame{
	private JLabel lblNewLabe2;
	private JDesktopPane desktopPane;
	public b() {	
		this.getContentPane().setLayout(null);	
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1366, 55);
		getContentPane().add(tabbedPane);
		//-----------------------------------------------------------------------------------
		JPanel p1 = new JPanel();
		p1.setBackground(Color.ORANGE);
		p1.setLayout(null);
		tabbedPane.addTab("基础信息管理", null, p1, null);
		JButton b1 = new JButton("客户信息管理");		b1.setBounds(0, 0, 136, 27);		p1.add(b1);
		JButton b2 = new JButton("商品信息管理");		b2.setBounds(135, 0, 136, 27);		p1.add(b2);
		JButton b3 = new JButton("供应商信息管理"); 	
		b3.setBounds(271, 0, 154, 27);		p1.add(b3);
		//------------------------------------------------------------------------------------------
		JPanel p2 = new JPanel();
		p2.setBackground(Color.ORANGE);
		p2.setLayout(null);
		tabbedPane.addTab("进货管理", null, p2, null);
		JButton bb1 = new JButton("进货单");		    
		bb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jinhuodan jhd=new jinhuodan();
				desktopPane.add(jhd);
			}
		});bb1.setBounds(0, 0, 159, 27);		p2.add(bb1);
		JButton bb2 = new JButton("进货退货");		
		bb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jinhuotuihuo jt=new jinhuotuihuo();
				desktopPane.add(jt);
			}
		});bb2.setBounds(159, 0, 149, 27);		p2.add(bb2);
	//---------------------------------------------------------------------------------------------	
		JPanel p3 = new JPanel();
		p3.setBackground(Color.ORANGE);
		p3.setLayout(null);
		tabbedPane.addTab("销售管理", null, p3, null);	
		JButton bt1 = new JButton("销售单");			
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xiaoshoudan abc=new xiaoshoudan();
				desktopPane.add(abc);
			}
		});bt1.setBounds(0, 0, 113, 27);		p3.add(bt1);
		JButton bt2 = new JButton("销售退货");		bt2.setBounds(113, 0, 113, 27);		p3.add(bt2);
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xiaoshoutuihuo m=new xiaoshoutuihuo();
				desktopPane.add(m);
			}
		});
	//-------------------------------------------------------------------------------------------------	
		JPanel p4 = new JPanel();
		p4.setBackground(Color.ORANGE);
		p4.setLayout(null);
		tabbedPane.addTab("查询统计", null, p4, null);
		JButton bj1 = new JButton("客户查询");		
		bj1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dushiju_kh d = new dushiju_kh();
				d.dushuju();
				khxxcx khcx=new khxxcx();
				desktopPane.add(khcx);
			}
		});bj1.setBounds(0, 0, 113, 27);		p4.add(bj1);
		JButton bj2 = new JButton("商品查询");		
		bj2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dushuju_good d = new dushuju_good();
				d.dushuju();
				spxxcx sxb = new spxxcx();
				desktopPane.add(sxb);
			}
		});bj2.setBounds(113, 0, 113, 27);		p4.add(bj2);
		JButton bj3 = new JButton("供应商查询");		
		bj3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dushuju_gys d = new dushuju_gys();
				d.dushuju();
				gysxxcx xb = new gysxxcx();
				desktopPane.add(xb);
			}
		});bj3.setBounds(226, 0, 113, 27);		p4.add(bj3);
		JButton bj4 = new JButton("销售查询");		
		bj4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xiaoshouchaxun xscx=new xiaoshouchaxun();
				desktopPane.add(xscx);
			}
		});bj4.setBounds(339, 0, 113, 27);		p4.add(bj4);
		JButton bj5 = new JButton("销售退货查询");	
		bj5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xsthcx he=new xsthcx();
				desktopPane.add(he);
			}
		});bj5.setBounds(452, 0, 113, 27);		p4.add(bj5);
		JButton bj6 = new JButton("入库查询");		
		bj6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rukuchaxun rkcx=new rukuchaxun();
				desktopPane.add(rkcx);
			}
		});bj6.setBounds(565, 0, 113, 27);		p4.add(bj6);
		JButton bj8 = new JButton("销售排行");		
		bj8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spjgph h=new spjgph();
				desktopPane.add(h);
			}
		});bj8.setBounds(677, 0, 113, 27);		p4.add(bj8);
	//-------------------------------------------------------------------------------------------------	
		JPanel p5 = new JPanel();
		p5.setBackground(Color.ORANGE);
		p5.setLayout(null);
		tabbedPane.addTab("库存管理", null, p5, null);
		JButton bo1 = new JButton("库存盘点");		bo1.setBounds(0, 0, 113, 27);		p5.add(bo1);
		JButton bo2 = new JButton("价格调整");		
		bo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jiagetiaozheng hh=new jiagetiaozheng();
				desktopPane.add(hh);
			}
		});bo2.setBounds(113, 0, 113, 27);		p5.add(bo2);
		bo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KuCunPanDian kcpd=new KuCunPanDian();
				desktopPane.add(kcpd);
			}
		});
	//---------------------------------------------------------------------------------------------------	
		JPanel p6 = new JPanel();
		p6.setBackground(Color.ORANGE);
		p6.setLayout(null);
		tabbedPane.addTab("系统管理", null, p6, null);
		JButton bn1 = new JButton("操作员管理");		
		bn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				czygl czy=new czygl();
				desktopPane.add(czy);
			}
		});bn1.setBounds(0, 0, 113, 27);		p6.add(bn1);
		JButton bn2 = new JButton("更改密码");		
		bn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ggmm gm=new ggmm();
				desktopPane.add(gm);
			}
		});bn2.setBounds(113, 0, 113, 27);		p6.add(bn2);
		JButton bn3 = new JButton("权限管理");		
		bn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				qxgl qgl=new qxgl();
				desktopPane.add(qgl);
			}
		});bn3.setBounds(226, 0, 113, 27);		p6.add(bn3);
		lblNewLabe2 = new JLabel();
//		lblNewLabe2.setIcon(new ImageIcon("image/1.jpg"));  //画图
//		lblNewLabe2.setBounds(1024, 56, 1366-1024, 720-56);
		getContentPane().add(lblNewLabe2);
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.GREEN);
		desktopPane.setBounds(2, 56, 1360, 618);
		getContentPane().add(desktopPane);
		//-------------------添加组件事件监听--------------------------------------------------------------
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khxxgl s1=new khxxgl();
				desktopPane.add(s1);
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spxxgl s2=new spxxgl();
				desktopPane.add(s2);
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gysxxgl s3=new gysxxgl();
				desktopPane.add(s3);
			}
		});
		 this.setTitle("进销存信息查询系统");
			this.setBounds(0,0,1366,720);
			this.setVisible(true);
	}
}