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
	private DefaultTableModel model; // ���ģ�Ͷ���
	private JTable table;
	private JTextField t2;
	private JComboBox comboBox;
	private JTable tb = new JTable();
	public khxxcx() {
		String[] title = { "ID", "�ͻ�ȫ��", "���", "��ַ", "����", "��������", "�ͻ������˻�",
				"�ͻ���������", "�ͻ�����", "��ϵ��", "�ͻ��绰", "�ͻ���˾�绰" };// ��һ��
		model = new DefaultTableModel(title, 0);// �ڶ���
		tb.setModel(model);// ���Ĳ�
		tb.setRowSorter(new TableRowSorter(model));//--------------------------------------------����
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		getContentPane().add(panel, BorderLayout.NORTH);
		JLabel l1=new JLabel("ѡ���ѯ�˻�: ");			panel.add(l1);
		comboBox = new JComboBox();						panel.add(comboBox);
        t2 = new JTextField("B4", 10);					panel.add(t2);
		JButton b1 = new JButton("��ѯ"); 				panel.add(b1);
		JButton b2 = new JButton("��ʾ���пͻ���Ϣ"); 		panel.add(b2);
//-----------------------------------------------�¼�
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
				model.addRow(o);// ������
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
					model.addRow(o);// ������
				}
			}
		});	
		shitu1();
		this.setTitle("�ͻ���Ϣ��ѯ");
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