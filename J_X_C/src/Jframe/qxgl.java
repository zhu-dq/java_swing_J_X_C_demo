package Jframe;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.*;

import means.dushuju_czy;

import DBmanager.DBmanager;
import JXC.jxc_czy;
import User.Operator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class qxgl extends JInternalFrame{
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private Operator op;
	private String sss;
	
		public qxgl(){
			op=start.getop();
			JButton b1=new JButton("�޸�");
			
			JButton b2=new JButton("�ر�");
		
		    JPanel p=(JPanel) this.getContentPane(); 
			this.setTitle("Ȩ�޹���");
			this.setBounds(400,   150,   400, 371);
		    b1.setBounds(  90,   288,   80, 30);
		    b2.setBounds( 231,  288,   80, 30);
		    p.setLayout(null);p.add(b1);p.add(b2); 
		    p.setBackground(Color.ORANGE);
		    
		    t1 = new JTextField();
		    t1.setBounds(180, 20, 150, 24);
		    getContentPane().add(t1);
		    t1.setColumns(10);
		    
		    t2 = new JTextField();
		    t2.setBounds(180, 77, 150, 24);
		    getContentPane().add(t2);
		    t2.setColumns(10);
		    
		    JLabel lblNewLabel = new JLabel("�û�����");
		    lblNewLabel.setBounds(70, 23, 72, 18);
		    getContentPane().add(lblNewLabel);
		    
		    JLabel lblNewLabel_1 = new JLabel("��¼��");
		    lblNewLabel_1.setBounds(70, 80, 72, 18);
		    getContentPane().add(lblNewLabel_1);
		    
		    t3 = new JTextField();
		    t3.setBounds(180, 127, 150, 24);
		    getContentPane().add(t3);
		    t3.setColumns(10);
		    
		    JLabel lblNewLabel_2 = new JLabel("����");
		    lblNewLabel_2.setBounds(70, 130, 72, 18);
		    getContentPane().add(lblNewLabel_2);
		    
		    lblNewLabel_3 = new JLabel("Ȩ��");
		    lblNewLabel_3.setBounds(70, 181, 72, 18);
		    getContentPane().add(lblNewLabel_3);
		    
		    lblNewLabel_4 = new JLabel("ѡ���û�");
		    lblNewLabel_4.setBounds(70, 227, 72, 18);
		    getContentPane().add(lblNewLabel_4);
		    
		    comboBox = new JComboBox();//ѡ���û�
		    comboBox.setBounds(180, 224, 150, 24);
		    getContentPane().add(comboBox);
		    
		    comboBox_1 = new JComboBox();//Ȩ��
		    comboBox_1.addItem("����Ա");
		    comboBox_1.addItem("����Ա");
		    comboBox_1.setBounds(180, 178, 149, 24);
		    shitu1();
		    getContentPane().add(comboBox_1);
		    setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
			setIconifiable(true);
			setClosable(true);
			this.setVisible(true);
			//--------------------------------------------------�¼�
			comboBox_1.addItemListener(new ItemListener() {
	            public void itemStateChanged(ItemEvent e) {
	                sss = (String) e.getItem();
	            }
	        });
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int i = 1;
					if(sss.equals("����Ա")){
						i=1;
					}
					if(sss.equals("����Ա")){
						i=0;
					}
					if(op.getQx()==1){
						JOptionPane.showMessageDialog(null, "��û��Ȩ���޸�");
					}else {
						DBmanager dbm=DBmanager.getInstance();
						dbm.getcon();
						String sql="update czy_info set qx='"+String.valueOf(i)+"' where dlmc='"+op.getDlmc()+"'";
						dbm.update(sql);
						dbm.close();
					}
				}
			});
			b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "�������Ͻǲ��");
				}
			});
			comboBox.addItemListener(new ItemListener() {
				jxc_czy j=new jxc_czy();
				Operator u=new Operator();
	            public void itemStateChanged(ItemEvent e) {
	                String value = (String) e.getItem();
	                u=j.getOperatorbydlmc(value);
	                t1.setText(u.getYhxm()); 
	                t2.setText(u.getDlmc());
	                t3.setText(u.getMm());
	            }
	        });
	}  
		//------------------------------------------------------�¼�
		public void shitu1(){
			jxc_czy iu = new jxc_czy();
			ArrayList<Operator> uList = iu.getAllUser();
			for (Operator u : uList) {
				comboBox.addItem(u.getDlmc());		
			}
		}
}