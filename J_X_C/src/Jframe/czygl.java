package Jframe;
import javax.swing.*;
import DBmanager.DBmanager;
import JXC.jxc_czy;
import User.Operator;
import User.Suppliers;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Color;
public class czygl extends JInternalFrame{
	//-----------------------------------------------------------------------------------------
		private JTextField t1;   								
		private JTextField t2;									
		private JTextField t4;									
		private JTextField t3;									
		private JTextField t5;
		private JTextField t6;
		private JTextField t7;
		private JTextField t8;
		private JComboBox comboBox;
		//---------------------------------------------------------------------------------------
	public czygl() {	
		this.getContentPane().setLayout(null);	
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 620, 368);
		getContentPane().add(tabbedPane);		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.ORANGE);
		p1.setLayout(null);
		//------------------------------------------------------------------------------------------
		tabbedPane.addTab("��Ӳ���Ա", null, p1, null);		
		JLabel l1 = new JLabel("��¼����");  		l1.setBounds(96, 35, 72, 18);      		p1.add(l1);
		JLabel l2 = new JLabel("����Ա����");   	l2.setBounds(96, 98, 83, 18);      		p1.add(l2);
		JLabel l3 = new JLabel("ȷ������");   	l3.setBounds(96, 219, 72, 18);			p1.add(l3);
		JLabel l9 = new JLabel("��������");      	l9.setBounds(96, 157, 72, 18);			p1.add(l9);
		JButton b1 = new JButton("���");		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if("".equals(t1.getText())||"".equals(t2.getText())||"".equals(t3.getText())||"".equals(t4.getText())){
					JOptionPane.showMessageDialog(null, "�뽫������������");
				}else if(!t3.getText().equals(t4.getText())){
					JOptionPane.showMessageDialog(null, "������������벻һ��");
					t3.setText("");
					t4.setText("");					
				}else{
					DBmanager dbm=DBmanager.getInstance();
					dbm.getcon();
					String sql="insert into czy_info values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"',default)";
					dbm.update(sql);
					dbm.close();
				}
			}
		});b1.setBounds(114, 279, 113, 27);		p1.add(b1);
		JButton b2 = new JButton("��д");		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");	
				t3.setText("");
				t4.setText("");	
			}
		});b2.setBounds(352, 279, 113, 27);		p1.add(b2);
		t1 = new JTextField();t1.setBounds(222, 32, 266, 24);		t1.setColumns(10);	p1.add(t1);
		t2 = new JTextField();t2.setBounds(222, 95, 266, 24);		t2.setColumns(10);	p1.add(t2);
		t4 = new JTextField();t4.setBounds(222, 216, 266, 24);		t4.setColumns(10);	p1.add(t4);
		t3 = new JTextField();t3.setBounds(222, 154, 269, 24);		t3.setColumns(10);	p1.add(t3);
	//----------------------------------------------------------------
	JPanel panel = new JPanel();
	panel.setBackground(Color.GREEN);
	panel.setLayout(null);
	tabbedPane.addTab("ɾ������Ա", null, panel, null);
	
	JLabel lblNewLabel = new JLabel("��ѡ���û���");
	lblNewLabel.setBounds(98, 13, 111, 18);
	panel.add(lblNewLabel);
	
	comboBox = new JComboBox();
	comboBox.setBounds(298, 10, 147, 24);
	panel.add(comboBox);
	
	JLabel lblNewLabel_1 = new JLabel("�û�����");
	lblNewLabel_1.setBounds(108, 60, 72, 18);
	panel.add(lblNewLabel_1);
	
	t5 = new JTextField();
	t5.setBounds(243, 57, 243, 24);
	panel.add(t5);
	t5.setColumns(10);
	
	JLabel lblNewLabel_2 = new JLabel("��¼��");
	lblNewLabel_2.setBounds(108, 111, 72, 18);
	panel.add(lblNewLabel_2);
	
	t6 = new JTextField();
	t6.setBounds(244, 108, 242, 24);
	panel.add(t6);
	t6.setColumns(10);
	
	JLabel lblNewLabel_3 = new JLabel("����");
	lblNewLabel_3.setBounds(108, 166, 72, 18);
	panel.add(lblNewLabel_3);
	
	t7 = new JTextField();
	t7.setBounds(243, 163, 243, 24);
	panel.add(t7);
	t7.setColumns(10);
	
	JLabel lblNewLabel_4 = new JLabel("Ȩ��");
	lblNewLabel_4.setBounds(108, 219, 72, 18);
	panel.add(lblNewLabel_4);
	
	t8 = new JTextField();
	t8.setBounds(243, 216, 243, 24);
	panel.add(t8);
	t8.setColumns(10);
	
	JButton btnNewButton = new JButton("ɾ��");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Operator op=start.getop();
			if(op.getQx()==1){
				JOptionPane.showMessageDialog(null, "��û��Ȩ��");
			}else{
				DBmanager dbm=DBmanager.getInstance();
				dbm.getcon();
				String sql="delete from czy_info where dlmc = '"+t6.getText()+"'";
				dbm.update(sql);
				dbm.close();
			}
		}
	});
	btnNewButton.setBounds(129, 277, 113, 27);
	panel.add(btnNewButton);
	
	JButton btnNewButton_1 = new JButton("�ر�");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "������Ͻǲ��");
		}
	});
	btnNewButton_1.setBounds(358, 277, 113, 27);
	panel.add(btnNewButton_1);
		//--------------------�¼�
		comboBox.addItemListener(new ItemListener() {
			jxc_czy j = new jxc_czy();
			Operator u = new Operator();
			public void itemStateChanged(ItemEvent e) {
				String value = (String) e.getItem();
				u = j.getOperatorbydlmc(value);
				t6.setText(u.getDlmc());
				t5.setText(u.getYhxm());
				t7.setText(u.getMm());
				if(u.getQx()==1){
					t8.setText("����Ա");
				}else{
					t8.setText("����Ա");
				}
				
			}
		});
		
		//------------------------------�¼�
		//------------------------------------------------------------------------------------------------
		shitu1();
		this.setTitle("����Ա����");
		this.setBounds(290,93,631,415);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		setIconifiable(true);
		setClosable(true);
		this.setVisible(true);
	}
	public void shitu1(){
		jxc_czy czy=new jxc_czy();
		 ArrayList<Operator> userList=czy.getAllUser();
		 for(Operator op:userList){			
			 comboBox.addItem(op.getDlmc());
		 }
	}
}
