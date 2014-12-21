package Jframe;
import java.awt.*;

import javax.swing.*;

import means.dushuju_czy;

import JXC.jxc_czy;
import User.Operator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class a extends JFrame {
	JLabel jlabel;
	Image image = new ImageIcon("image/1.jpg").getImage();
	ImageIcon labIma = new ImageIcon("image/1.jpg");
	private JLabel l1;
	private JLabel l2;
	private JTextField t1;
	private JButton b1;
	private JButton b2;
	private Panel p;
	private JLabel lblNewLabel;
	private static Operator op;
	private JPasswordField t2;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	public static Operator getop(){
		return op;
	}
	a() {
		l1 = new JLabel(" 帐号");
		l1.setForeground(Color.MAGENTA);
		l1.setFont(new Font("微软雅黑", Font.BOLD, 18));
		l2 = new JLabel("密码");
		l2.setForeground(Color.MAGENTA);
		l2.setFont(new Font("微软雅黑", Font.BOLD, 18));
		t1 = new JTextField();
		b1 = new JButton("登陆");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b2 = new JButton("关闭");
		l1.setBounds(375, 515, 64, 40);
		l2.setBounds(375, 556, 64, 30);
		t1.setBounds(515, 515, 182, 30);
		b1.setBounds(734, 510, 100, 30);
		b2.setBounds(734, 558, 100, 30);
		p = new Panel();
		p.setBackground(Color.GREEN);
		getContentPane().add(p);
		p.setLayout(null);
		p.add(t1);
		p.add(l1);
		p.add(b1);
		p.add(l2);
		p.add(b2);
		
		lblNewLabel = new JLabel("购物宝信息推荐系统");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("华文行楷", Font.BOLD, 68));
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setBounds(14, 13, 1366,170);
		p.add(lblNewLabel);
		
		t2 = new JPasswordField();
		t2.setBounds(515, 558, 182, 30);
		p.add(t2);
		
		JLabel lblNewLabel_1 = new JLabel("----------->绿色版");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(868, 196, 199, 40);
		p.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("ぃ异想天开ぃ小组");
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_2.setForeground(Color.MAGENTA);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(431, 270, 354, 30);
		p.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("组长：   洪娇娇");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_3.setForeground(Color.MAGENTA);
		lblNewLabel_3.setBounds(431, 313, 354, 18);
		p.add(lblNewLabel_3);
		
		lblNewLabel_8 = new JLabel("指导老师：牛老师");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_8.setForeground(Color.MAGENTA);
		lblNewLabel_8.setBounds(431, 484, 354, 18);
		p.add(lblNewLabel_8);
		
		lblNewLabel_4 = new JLabel("组员：   罗成");
		lblNewLabel_4.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.MAGENTA);
		lblNewLabel_4.setBounds(431, 344, 354, 18);
		p.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("          朱旦奇");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_5.setForeground(Color.MAGENTA);
		lblNewLabel_5.setBounds(431, 379, 354, 18);
		p.add(lblNewLabel_5);
		lblNewLabel_6 = new JLabel("          佳丽");
		lblNewLabel_6.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(Color.MAGENTA);
		lblNewLabel_6.setBounds(431, 414, 354, 18);
		p.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("          陈智宇");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_7.setForeground(Color.MAGENTA);
		lblNewLabel_7.setBounds(431, 449, 354, 18);
		p.add(lblNewLabel_7);
		
		lblNewLabel_9 = new JLabel("@备注：");
		lblNewLabel_9.setBounds(959, 582, 72, 18);
		p.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("版权所有，copy请注明出处，谢谢合作O(∩_∩)O~");
		lblNewLabel_10.setBounds(959, 613, 375, 18);
		p.add(lblNewLabel_10);
		b1.addActionListener(new sjb1());
	    b2.addActionListener(new sjb2());
		this.setIconImage(image);
		this.setTitle("购物宝信息推荐系统");
		setBounds(0,0,1366,768);
		setVisible(true);
	}
	private class sjb1 implements ActionListener{
		public void actionPerformed(ActionEvent e) {   ceshi1();  }   
								        public void    ceshi1(){JOptionPane.showMessageDialog(null, "登陆成功");
							        	setVisible(false);
							        	mainframe j = new mainframe();}
      }
    private class sjb2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {     ceshi2();    }   
								        public void      ceshi2(){      System.exit(0);    }
      }
	public static void main(String args[]) {
		a t = new a();

	}
}