package Jframe;
import javax.swing.*;
import DBmanager.DBmanager;
import JXC.jxc_gys;
import User.Suppliers;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.awt.Color;
public class gysxxgl extends JInternalFrame{
	//-----------------------------------------------------------------------------------------
		private JTextField t1;   								private JTextField tt1;
		private JTextField t2;									private JTextField tt2;
		private JTextField t3;									private JTextField tt3;
		private JTextField t4;									private JTextField tt4;
		private JTextField t5;									private JTextField tt5;
		private JTextField t6;									private JTextField tt6;
		private JTextField t7;									private JTextField tt7;
		private JTextField t8;									private JTextField tt8;
		private JTextField t9;									private JTextField tt9;
		private JTextField t10;									private JTextField tt10;
		private JComboBox Box;
		//---------------------------------------------------------------------------------------
	public gysxxgl() {	
		this.getContentPane().setLayout(null);	
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 620, 368);
		getContentPane().add(tabbedPane);		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.ORANGE);
		p1.setLayout(null);
		//------------------------------------------------------------------------------------------
		tabbedPane.addTab("供应商信息添加", null, p1, null);		
		JLabel l1 = new JLabel("供应商全称");  		l1.setBounds(59, 13, 72, 18);      		p1.add(l1);
		JLabel l2 = new JLabel("地址");   	l2.setBounds(59, 53, 72, 18);      		p1.add(l2);
		JLabel l3 = new JLabel("简称");   	l3.setBounds(59, 142, 72, 18);			p1.add(l3);
		JLabel l4 = new JLabel("邮政编码");   	l4.setBounds(294, 142, 72, 18);			p1.add(l4);
		JLabel l5 = new JLabel("电话");       	l5.setBounds(59, 194, 72, 18);			p1.add(l5);
		JLabel l6 = new JLabel("传真");      	l6.setBounds(315, 194, 51, 18);			p1.add(l6);
		JLabel l7 = new JLabel("联系人");     	l7.setBounds(59, 241, 72, 18);			p1.add(l7);
		JLabel l8 = new JLabel("联系电话");    	l8.setBounds(294, 241, 72, 18);			p1.add(l8);
		JLabel l9 = new JLabel("Email");      	l9.setBounds(59, 98, 72, 18);			p1.add(l9);
		JLabel l10 = new JLabel("开户银行");   	l10.setBounds(294, 98, 72, 18);			p1.add(l10);
		JButton b1 = new JButton("保存");		b1.setBounds(167, 275, 113, 27);		p1.add(b1);
		JButton b2 = new JButton("重置");		b2.setBounds(406, 275, 113, 27);		p1.add(b2);
		t1 = new JTextField();	t1.setBounds(145, 13, 408, 24);		t1.setColumns(10);	p1.add(t1);
		t2 = new JTextField();	t2.setBounds(145, 50, 408, 24);		t2.setColumns(10);	p1.add(t2);
		t3 = new JTextField();	t3.setBounds(145, 139, 135, 24);	t3.setColumns(10);	p1.add(t3);
		t4 = new JTextField();	t4.setBounds(381, 139, 172, 24);	t4.setColumns(10);	p1.add(t4);
		t5 = new JTextField();	t5.setBounds(145, 191, 135, 24);	t5.setColumns(10);	p1.add(t5);
		t6 = new JTextField();	t6.setBounds(381, 191, 172, 24);	t6.setColumns(10);	p1.add(t6);
		t7 = new JTextField();	t7.setBounds(145, 238, 135, 24);	t7.setColumns(10);	p1.add(t7);
		t8 = new JTextField();	t8.setBounds(381, 238, 172, 24);	t8.setColumns(10);	p1.add(t8);
		t9 = new JTextField();	t9.setBounds(145, 95, 135, 24);		t9.setColumns(10);	p1.add(t9);
		t10 = new JTextField();	t10.setBounds(384, 95, 169, 24);	t10.setColumns(10);	p1.add(t10);
		//--------------------事件
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=t1.getText();
				String s2=t2.getText();
				String s3=t3.getText();
				String s4=t4.getText();
				String s5=t5.getText();
				String s6=t6.getText();
				String s7=t7.getText();
				String s8=t8.getText();
				String s9=t9.getText();
				String s10=t10.getText();
				DBmanager dbm=DBmanager.getInstance();//1
				dbm.getcon();//2
				String sql="insert into gys_info values('"+s1+"','"+s3+"','"+s4+"','"+s2+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s10+"','"+s9+"')";
				JOptionPane.showMessageDialog(null, sql);
				dbm.update(sql);//4
				dbm.close();//5
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				t7.setText("");
				t8.setText("");
				t9.setText("");
				t10.setText("");
			}
		});
		//------------------------------------------------------------------------------------------
		JPanel p2 = new JPanel();
		p2.setBackground(Color.GREEN);
		p2.setLayout(null);
		//------------------------------------------------------------------------------------------
		tabbedPane.addTab("供应商信息修改和删除", null, p2, null);		
		JLabel ll1 = new JLabel("供应商全称");   	ll1.setBounds(59, 13, 72, 18);   		p2.add(ll1);
		JLabel ll2 = new JLabel("地址");   	ll2.setBounds(59, 53, 72, 18);			p2.add(ll2);
		JLabel ll3 = new JLabel("简称");   	ll3.setBounds(59, 142, 72, 18);			p2.add(ll3);
		JLabel ll4 = new JLabel("邮政编码");   	ll4.setBounds(294, 142, 72, 18);		p2.add(ll4);
		JLabel ll5 = new JLabel("电话");      	ll5.setBounds(59, 194, 72, 18);			p2.add(ll5);
		JLabel ll6 = new JLabel("传真");       	ll6.setBounds(315, 194, 51, 18);		p2.add(ll6);
		JLabel ll7 = new JLabel("联系人");     	ll7.setBounds(59, 241, 72, 18);			p2.add(ll7);
		JLabel ll8 = new JLabel("联系电话");    	ll8.setBounds(294, 241, 72, 18);		p2.add(ll8);
		JLabel ll9 = new JLabel("Email");     	ll9.setBounds(59, 98, 72, 18);			p2.add(ll9);
		JLabel ll10 = new JLabel("开户银行");   	ll10.setBounds(294, 98, 72, 18);		p2.add(ll10);
		JButton bb1 = new JButton("修改");		bb1.setBounds(381, 282, 83, 27);		p2.add(bb1);
		JButton bb2 = new JButton("删除");		bb2.setBounds(467, 282, 77, 27);		p2.add(bb2);
		tt1 = new JTextField();	tt1.setBounds(145, 13, 408, 24);	tt1.setColumns(10);		p2.add(tt1);
		tt2 = new JTextField();	tt2.setBounds(145, 50, 408, 24);	tt2.setColumns(10);		p2.add(tt2);
		tt3 = new JTextField();	tt3.setBounds(145, 139, 135, 24);	tt3.setColumns(10);		p2.add(tt3);
		tt4 = new JTextField();	tt4.setBounds(381, 139, 172, 24);	tt4.setColumns(10);		p2.add(tt4);
		tt5 = new JTextField();	tt5.setBounds(145, 191, 135, 24);	tt5.setColumns(10);		p2.add(tt5);
		tt6 = new JTextField();	tt6.setBounds(381, 191, 172, 24);	tt6.setColumns(10);		p2.add(tt6);
		tt7 = new JTextField();	tt7.setBounds(145, 238, 135, 24);	tt7.setColumns(10);		p2.add(tt7);
		tt8 = new JTextField();	tt8.setBounds(381, 238, 172, 24);	tt8.setColumns(10);		p2.add(tt8);
		tt9 = new JTextField();	tt9.setBounds(145, 95, 135, 24);	tt9.setColumns(10);		p2.add(tt9);
		tt10 = new JTextField();tt10.setBounds(380, 95, 175, 24);	tt10.setColumns(10);	p2.add(tt10);
		Box = new JComboBox();			Box.setBounds(145, 283, 135, 24);					p2.add(Box);
		
		JLabel lblNewLabel = new JLabel("请选择供应商");
		lblNewLabel.setBounds(14, 286, 114, 18);
		p2.add(lblNewLabel);
		//------------------------------事件
		yemian2();
		Box.addItemListener(new ItemListener() {
			jxc_gys j=new jxc_gys();
			  Suppliers u=new Suppliers();
            public void itemStateChanged(ItemEvent e) {
                String value = (String) e.getItem();
                u=j.getgyqbyqc(value);
				tt1.setText(u.getGysqc());
				tt2.setText(u.getDz());
				tt3.setText(u.getJc());
				tt4.setText(u.getYzbm());
				tt5.setText(u.getDh());
				tt6.setText(u.getCz());
				tt7.setText(u.getLxr());
				tt8.setText(u.getLxdh());
				tt9.setText(u.getDzxx());
				tt10.setText(u.getKhyh());       
            }
        });
		bb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=tt1.getText();
				String s2=tt2.getText();
				String s3=tt3.getText();
				String s4=tt4.getText();
				String s5=tt5.getText();
				String s6=tt6.getText();
				String s7=tt7.getText();
				String s8=tt8.getText();
				String s9=tt9.getText();
				String s10=tt10.getText();
				DBmanager dbm=DBmanager.getInstance();//1
				dbm.getcon();//2
				String sql="update gys_info set dz='"+s2+"', jc='"+s3+"', yzbm='"+s4+"', dh='"+s5+"',cz='"+s6+"', lxr='"+s7+"',lxdh='"+s8+"',dzxx='"+s9+"', khyh='"+s10+"' where	gysqc='"+s1+"'";//3
				dbm.update(sql);//4
				dbm.close();//5
			
			}
		});
		bb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=tt1.getText();
				DBmanager dbm=DBmanager.getInstance();//1
				dbm.getcon();//2
				String sql="delete from gys_info where gysqc='"+s1+"'";//3
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
				tt8.setText("");
				tt9.setText("");
				tt10.setText("");
			}
		});
		//------------------------------------------------------------------------------------------------
		this.setTitle("供应商信息管理");
		this.setBounds(290,93,631,415);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		setIconifiable(true);
		setClosable(true);
		this.setVisible(true);
	}
	public void yemian2(){
		jxc_gys j=new jxc_gys();
		DBmanager dbm=DBmanager.getInstance();//1
		dbm.getcon();//2
		String sql="select * from gys_info";//3
		ResultSet rs=dbm.query(sql);//4
		try {
			while(rs.next()){			
				Box.addItem(rs.getString("gysqc"));
				Suppliers u=new Suppliers();
				u.setId(rs.getInt("id"));
				u.setGysqc(rs.getString("gysqc"));
				u.setJc(rs.getString("jc"));
				u.setDz(rs.getString("dz"));
				u.setDzxx(rs.getString("dzxx"));
				u.setKhyh(rs.getString("khyh"));
				u.setYzbm(rs.getString("yzbm"));
				u.setCz(rs.getString("cz"));
				u.setLxr(rs.getString("lxr"));
				u.setDh(rs.getString("dh"));
				u.setLxdh(rs.getString("lxdh"));
				j.add(u);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		dbm.close();//5
	
	}
}
