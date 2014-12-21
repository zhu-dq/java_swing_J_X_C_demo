package Jframe;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import DBmanager.DBmanager;
import JXC.jxc_kh;
import User.User;
import java.awt.event.*;

public class khxxcx extends JInternalFrame {
	private DefaultTableModel model; // 表格模型对象
	private JTable table;
	private JTextField t2;
	private JComboBox comboBox;
	private JTable tb = new JTable();
	public khxxcx() {
		String[] title = { "ID", "客户全称", "简称", "地址", "邮箱", "开户银行", "客户银行账户",
				"客户邮政编码", "客户传真", "联系人", "客户电话", "客户公司电话" };// 第一步
		model = new DefaultTableModel(title, 0);// 第二步
		tb.setModel(model);// 第四步
		tb.setRowSorter(new TableRowSorter(model));//--------------------------------------------排序
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		getContentPane().add(panel, BorderLayout.NORTH);
		JLabel l1=new JLabel("选择查询账户: ");			panel.add(l1);
		comboBox = new JComboBox();						panel.add(comboBox);
        t2 = new JTextField("B4", 10);					panel.add(t2);
		JButton b1 = new JButton("查询"); 				panel.add(b1);
		JButton b2 = new JButton("显示所有客户信息"); 		panel.add(b2);
//-----------------------------------------------事件
		comboBox.addItemListener(new ItemListener() {
			jxc_kh j=new jxc_kh();
			User u=new User();
            public void itemStateChanged(ItemEvent e) {
                String value = (String) e.getItem();
                u=j.getUserbyupc(value);
                t2.setText(value);      
            }
        });
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
				jxc_kh iu = new jxc_kh();
				User u=iu.getUserbyupc(t2.getText());
				Object[] o = { u.getuId(), u.getUqc(), u.getUjc(),
							u.getuAdress(), u.getEmail(), u.getUkhyh(),
							u.getUyhzh(), u.getUuzbm(), u.getUcz(),
							u.getUlxr(), u.getUdh(), u.getUgsdh() };
				model.addRow(o);// 第三步
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
				jxc_kh iu = new jxc_kh();
				ArrayList<User> uList = iu.getAllUser();
				for (User u : uList) {
					Object[] o = { u.getuId(), u.getUqc(), u.getUjc(),
							u.getuAdress(), u.getEmail(), u.getUkhyh(),
							u.getUyhzh(), u.getUuzbm(), u.getUcz(),
							u.getUlxr(), u.getUdh(), u.getUgsdh() };
					model.addRow(o);// 第三步
				}
			}
		});	
		shitu1();
		this.setTitle("客户信息查询");
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
		jxc_kh iu = new jxc_kh();
		ArrayList<User> uList = iu.getAllUser();
		for (User u : uList) {
			comboBox.addItem(u.getUqc());		
		}
	}
	public void clear(){
		for (int i =model.getRowCount()-1; i >=0; i--) {
			model.removeRow(i);			
		}
	}
}