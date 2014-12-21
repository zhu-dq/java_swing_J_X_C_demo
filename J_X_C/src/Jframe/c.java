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
	private DefaultTableModel model; // ���ģ�Ͷ���
	private JTable table;
	private JTextField t2;
	private JComboBox comboBox;
	private JTable tb = new JTable();
	public c() {
		String[] title = { "ID", "������ȫ�Q", "��Ӧ�̼��", "��������", "��ַ", "�绰", "����",
				"��ϵ��", "��ϵ�绰", "��������", "��������" };// ��һ��
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
				model.addRow(o);// ������
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
					model.addRow(o);// ������
				}
			}
		});	
		shitu1();
		
		JScrollPane sp = new JScrollPane(tb);// ���岽
		this.getContentPane().add(sp);// ������
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		this.setTitle("��Ӧ�̲�ѯ");
		this.setBounds(10,93,1300,450);
		setIconifiable(true);
		setClosable(true);
		setMaximizable(true);
		this.setVisible(true);
	}
	// -----------------------------------�¼�
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