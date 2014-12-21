package Jframe;
import java.awt.Color;
import javax.swing.*;

import DBmanager.DBmanager;
import User.Operator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ggmm extends JInternalFrame{
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private Operator op;   
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	
		public ggmm(){
			JButton b1=new JButton("确认");
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if("".equals(t3.getText())||"".equals(t4.getText())||"".equals(t5.getText())){
						JOptionPane.showMessageDialog(null, "请将信息补全");
					}else if(!(t3.getText().equals(op.getMm()))){
						JOptionPane.showMessageDialog(null, "旧密码不正确");
					}else if(!(t4.getText().equals(t5.getText()))){
						JOptionPane.showMessageDialog(null, "两次输入的新密码不一致");
					}else{
						DBmanager dbm=DBmanager.getInstance();
						dbm.getcon();
						String sql="update czy_info set mm='"+t4.getText()+"' where dlmc='"+op.getDlmc()+"'";
						dbm.update(sql);
						dbm.close();
					}
				}
			});
			JButton b2=new JButton("重写");
			b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					t3.setText("");
					t4.setText("");
					t5.setText("");
				}
			});
		    JPanel p=(JPanel) this.getContentPane(); 
		    setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
			setIconifiable(true);
			setClosable(true);
			this.setTitle("更改密码");
			this.setBounds(400,   150,   400, 423);
		    b1.setBounds(  144,   335,   80, 30);
		    b2.setBounds( 253,  335,   80, 30);
		    p.setLayout(null);p.add(b1);p.add(b2); 
		    p.setBackground(Color.ORANGE);
		    op=start.getop();
		    
		    t1 = new JTextField();
		    t1.setText(op.getYhxm());
		    t1.setBounds(180, 20, 150, 24);
		    getContentPane().add(t1);
		    t1.setColumns(10);
		    
		    t2 = new JTextField();
		    t2.setText(op.getDlmc());
		    t2.setBounds(180, 77, 150, 24);
		    getContentPane().add(t2);
		    t2.setColumns(10);
		    
		    JLabel lblNewLabel = new JLabel("用户姓名");
		    lblNewLabel.setBounds(70, 23, 72, 18);
		    getContentPane().add(lblNewLabel);
		    
		    JLabel lblNewLabel_1 = new JLabel("登录名");
		    lblNewLabel_1.setBounds(70, 80, 72, 18);
		    getContentPane().add(lblNewLabel_1);
		    
		    t3 = new JTextField();
		    t3.setText("");
		    t3.setBounds(180, 127, 150, 24);
		    getContentPane().add(t3);
		    t3.setColumns(10);
		    
		    t4 = new JTextField();
		    t4.setText("");
		    t4.setBounds(180, 178, 150, 24);
		    getContentPane().add(t4);
		    t4.setColumns(10);
		    
		    t5 = new JTextField();
		    t5.setText("");
		    t5.setBounds(180, 224, 150, 24);
		    getContentPane().add(t5);
		    t5.setColumns(10);
		    
		   
		    JLabel lblNewLabel_2 = new JLabel("旧密码");
		    lblNewLabel_2.setBounds(70, 130, 72, 18);
		    getContentPane().add(lblNewLabel_2);
		    
		    lblNewLabel_3 = new JLabel("新密码");
		    lblNewLabel_3.setBounds(70, 181, 72, 18);
		    getContentPane().add(lblNewLabel_3);
		    
		    lblNewLabel_4 = new JLabel("确认新密码");
		    lblNewLabel_4.setBounds(70, 227, 72, 18);
		    getContentPane().add(lblNewLabel_4);
		    
		    lblNewLabel_5 = new JLabel("注：每个操作员只能更改自己的密码");
		    lblNewLabel_5.setBounds(14, 302, 354, 18);
		    getContentPane().add(lblNewLabel_5);
			this.setVisible(true);	
	}  
}