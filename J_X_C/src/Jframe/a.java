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
		l1 = new JLabel(" �ʺ�");
		l1.setForeground(Color.MAGENTA);
		l1.setFont(new Font("΢���ź�", Font.BOLD, 18));
		l2 = new JLabel("����");
		l2.setForeground(Color.MAGENTA);
		l2.setFont(new Font("΢���ź�", Font.BOLD, 18));
		t1 = new JTextField();
		b1 = new JButton("��½");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b2 = new JButton("�ر�");
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
		
		lblNewLabel = new JLabel("���ﱦ��Ϣ�Ƽ�ϵͳ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("�����п�", Font.BOLD, 68));
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setBounds(14, 13, 1366,170);
		p.add(lblNewLabel);
		
		t2 = new JPasswordField();
		t2.setBounds(515, 558, 182, 30);
		p.add(t2);
		
		JLabel lblNewLabel_1 = new JLabel("----------->��ɫ��");
		lblNewLabel_1.setFont(new Font("΢���ź�", Font.BOLD, 20));
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(868, 196, 199, 40);
		p.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("�������쿪��С��");
		lblNewLabel_2.setFont(new Font("΢���ź�", Font.BOLD, 20));
		lblNewLabel_2.setForeground(Color.MAGENTA);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(431, 270, 354, 30);
		p.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("�鳤��   �齿��");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("����", Font.PLAIN, 18));
		lblNewLabel_3.setForeground(Color.MAGENTA);
		lblNewLabel_3.setBounds(431, 313, 354, 18);
		p.add(lblNewLabel_3);
		
		lblNewLabel_8 = new JLabel("ָ����ʦ��ţ��ʦ");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("����", Font.PLAIN, 18));
		lblNewLabel_8.setForeground(Color.MAGENTA);
		lblNewLabel_8.setBounds(431, 484, 354, 18);
		p.add(lblNewLabel_8);
		
		lblNewLabel_4 = new JLabel("��Ա��   �޳�");
		lblNewLabel_4.setFont(new Font("����", Font.PLAIN, 18));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.MAGENTA);
		lblNewLabel_4.setBounds(431, 344, 354, 18);
		p.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("          �쵩��");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("����", Font.PLAIN, 18));
		lblNewLabel_5.setForeground(Color.MAGENTA);
		lblNewLabel_5.setBounds(431, 379, 354, 18);
		p.add(lblNewLabel_5);
		lblNewLabel_6 = new JLabel("          ����");
		lblNewLabel_6.setFont(new Font("����", Font.PLAIN, 18));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(Color.MAGENTA);
		lblNewLabel_6.setBounds(431, 414, 354, 18);
		p.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("          ������");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("����", Font.PLAIN, 18));
		lblNewLabel_7.setForeground(Color.MAGENTA);
		lblNewLabel_7.setBounds(431, 449, 354, 18);
		p.add(lblNewLabel_7);
		
		lblNewLabel_9 = new JLabel("@��ע��");
		lblNewLabel_9.setBounds(959, 582, 72, 18);
		p.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("��Ȩ���У�copy��ע��������лл����O(��_��)O~");
		lblNewLabel_10.setBounds(959, 613, 375, 18);
		p.add(lblNewLabel_10);
		b1.addActionListener(new sjb1());
	    b2.addActionListener(new sjb2());
		this.setIconImage(image);
		this.setTitle("���ﱦ��Ϣ�Ƽ�ϵͳ");
		setBounds(0,0,1366,768);
		setVisible(true);
	}
	private class sjb1 implements ActionListener{
		public void actionPerformed(ActionEvent e) {   ceshi1();  }   
								        public void    ceshi1(){JOptionPane.showMessageDialog(null, "��½�ɹ�");
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