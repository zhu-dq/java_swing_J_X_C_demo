package Jframe;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import DBmanager.DBmanager;
import JXC.jxc_gys;
import User.Suppliers;
import java.awt.event.*;
public class c extends JInternalFrame {
	private DefaultTableModel model; // 表格模型对象
	private JTable table;
	private JTextField t2;
	private JComboBox comboBox;
	private JTable tb = new JTable();
	public c() {
		String[] title = { "ID", "供應商全稱", "供应商简称", "邮政编码", "地址", "电话", "传真",
				"联系人", "联系电话", "开户银行", "电子信箱" };// 第一步
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
			jxc_gys j=new jxc_gys();
			Suppliers u=new Suppliers();
            public void itemStateChanged(ItemEvent e) {
                String value = (String) e.getItem();
                u=j.getgyqbyqc(value);
                t2.setText(value);      
            }
        });
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
				jxc_gys iu = new jxc_gys();
				Suppliers u=iu.getgyqbyqc(t2.getText());
				Object[] o = { u.getId(), u.getGysqc(), u.getJc(),
						u.getYzbm(), u.getDz(), u.getDh(),
						u.getCz(), u.getLxr(), u.getLxdh(),
						u.getKhyh(), u.getDzxx()};
				model.addRow(o);// 第三步
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
				jxc_gys iu = new jxc_gys();
				ArrayList<Suppliers> uList = iu.getAllUser();
				for (Suppliers u : uList) {
					Object[] o = { u.getId(), u.getGysqc(), u.getJc(),
							u.getYzbm(), u.getDz(), u.getDh(),
							u.getCz(), u.getLxr(), u.getLxdh(),
							u.getKhyh(), u.getDzxx()};
					model.addRow(o);// 第三步
				}
			}
		});	
		shitu1();
		
		JScrollPane sp = new JScrollPane(tb);// 第五步
		this.getContentPane().add(sp);// 第六步
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		this.setTitle("供应商查询");
		this.setBounds(10,93,1300,450);
		setIconifiable(true);
		setClosable(true);
		setMaximizable(true);
		this.setVisible(true);
	}
	// -----------------------------------事件
	public void shitu1(){
		jxc_gys iu = new jxc_gys();
		ArrayList<Suppliers> uList = iu.getAllUser();
		for (Suppliers u : uList) {
			comboBox.addItem(u.getGysqc());		
		}
	}
	public void clear(){
		for (int i =model.getRowCount()-1; i >=0; i--) {
			model.removeRow(i);			
		}
	}
}