package Jframe;
/*
 * priceChangeFrame.java
 *
 * Created on __DATE__, __TIME__
 */


import java.util.List;

import javax.swing.JOptionPane;

import DAO.goods_DAO;
import DAO.ruku_DAO;
import PO.rukuInfo;
import java.awt.Color;

/**
 *
 * @author  __USER__
 */
public class jiagetiaozheng extends javax.swing.JInternalFrame {

	/** Creates new form priceChangeFrame */
	public jiagetiaozheng() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel1.setBackground(Color.ORANGE);
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jTextField6 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jTextField8 = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel9 = new javax.swing.JLabel();
		jTextField9 = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		jTextField10 = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		jTextField11 = new javax.swing.JTextField();
		jLabel12 = new javax.swing.JLabel();
		jTextField12 = new javax.swing.JTextField();
		jLabel13 = new javax.swing.JLabel();
		jTextField13 = new javax.swing.JTextField();
		jButton3 = new javax.swing.JButton();
		jComboBox1 = new javax.swing.JComboBox();
		jLabel14 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u5546\u54c1\u4ef7\u683c\u8c03\u6574");

		jLabel1.setText("\u5546  \u54c1  \u5355  \u4ef7");

		

		jLabel2.setText("\u5546\u54c1\u6570\u91cf");

		jLabel3.setText("\u5546   \u54c1    \u7f16 \u53f7");

		jLabel4.setText("\u89c4      \u683c");

		jLabel5.setText("\u64cd   \u4f5c   \u5458");

		jLabel6.setText("\u7ecf  \u624b  \u4eba");

		jLabel7.setText("\u5ba2\u6237\u5168\u79f0");

		jLabel8.setText("\u7ed3 \u7b97 \u65b9 \u5f0f");

		jButton1.setText("\u4fee\u6539");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u5173\u95ed");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel9.setText("\u5165  \u5e93  \u7968  \u53f7");

		

		jLabel10.setText("\u5546 \u54c1 \u540d \u79f0");

		

		jLabel11.setText("\u4f9b\u5e94\u5546\u5168\u79f0");

		jLabel12.setText("\u5165\u5e93\u65e5\u671f");

		jLabel13.setText("\u91d1      \u989d");

		jButton3.setText("\u67e5\u8be2");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		ruku_DAO dao=new ruku_DAO();
		List<rukuInfo> list=dao.getAllInfo();
		String[] s=new String[list.size()];
		for(int i=0;i<list.size();i++){
			rukuInfo info=list.get(i);
			s[i]=info.getSpmc();
		}
		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(s));

		jLabel14.setText("\u8bf7\u9009\u62e9");

		javax.swing.GroupLayout gl_jPanel1 = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(gl_jPanel1);
		gl_jPanel1
				.setHorizontalGroup(gl_jPanel1
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								gl_jPanel1
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gl_jPanel1
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																gl_jPanel1
																		.createSequentialGroup()
																		.addGroup(
																				gl_jPanel1
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								gl_jPanel1
																										.createSequentialGroup()
																										.addGroup(
																												gl_jPanel1
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addGroup(
																																gl_jPanel1
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.TRAILING)
																																		.addGroup(
																																				gl_jPanel1
																																						.createSequentialGroup()
																																						.addGroup(
																																								gl_jPanel1
																																										.createParallelGroup(
																																												javax.swing.GroupLayout.Alignment.LEADING)
																																										.addGroup(
																																												gl_jPanel1
																																														.createSequentialGroup()
																																														.addComponent(
																																																jLabel9)
																																														.addPreferredGap(
																																																javax.swing.LayoutStyle.ComponentPlacement.RELATED))
																																										.addGroup(
																																												javax.swing.GroupLayout.Alignment.TRAILING,
																																												gl_jPanel1
																																														.createSequentialGroup()
																																														.addComponent(
																																																jLabel5)
																																														.addPreferredGap(
																																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
																																						.addGap(6,
																																								6,
																																								6))
																																		.addGroup(
																																				gl_jPanel1
																																						.createSequentialGroup()
																																						.addComponent(
																																								jLabel3)
																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
																														.addComponent(
																																jLabel1))
																										.addGap(6,
																												6,
																												6))
																						.addGroup(
																								gl_jPanel1
																										.createSequentialGroup()
																										.addGroup(
																												gl_jPanel1
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jLabel11)
																														.addComponent(
																																jLabel7)
																														.addComponent(
																																jLabel13))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
																		.addGroup(
																				gl_jPanel1
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addGroup(
																								gl_jPanel1
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												false)
																										.addComponent(
																												jTextField9,
																												javax.swing.GroupLayout.Alignment.TRAILING)
																										.addComponent(
																												jTextField3,
																												javax.swing.GroupLayout.Alignment.TRAILING)
																										.addComponent(
																												jTextField1,
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												155,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGroup(
																												gl_jPanel1
																														.createSequentialGroup()
																														.addComponent(
																																jLabel14)
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
																						.addGroup(
																								gl_jPanel1
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addGroup(
																												gl_jPanel1
																														.createSequentialGroup()
																														.addGap(10,
																																10,
																																10)
																														.addGroup(
																																gl_jPanel1
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addComponent(
																																				jTextField13,
																																				javax.swing.GroupLayout.Alignment.TRAILING,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				155,
																																				Short.MAX_VALUE)
																																		.addComponent(
																																				jTextField11,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				155,
																																				Short.MAX_VALUE)))
																										.addGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												gl_jPanel1
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																false)
																														.addComponent(
																																jTextField8,
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jTextField5,
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																156,
																																javax.swing.GroupLayout.PREFERRED_SIZE))))
																		.addGroup(
																				gl_jPanel1
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								gl_jPanel1
																										.createSequentialGroup()
																										.addGap(6,
																												6,
																												6)
																										.addGroup(
																												gl_jPanel1
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addGroup(
																																gl_jPanel1
																																		.createSequentialGroup()
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addGroup(
																																				gl_jPanel1
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.TRAILING)
																																						.addGroup(
																																								gl_jPanel1
																																										.createParallelGroup(
																																												javax.swing.GroupLayout.Alignment.LEADING,
																																												false)
																																										.addComponent(
																																												jLabel2,
																																												javax.swing.GroupLayout.DEFAULT_SIZE,
																																												javax.swing.GroupLayout.DEFAULT_SIZE,
																																												Short.MAX_VALUE)
																																										.addGroup(
																																												gl_jPanel1
																																														.createSequentialGroup()
																																														.addGap(10,
																																																10,
																																																10)
																																														.addComponent(
																																																jLabel4))
																																										.addComponent(
																																												jLabel10))
																																						.addComponent(
																																								jLabel6)))
																														.addGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																gl_jPanel1
																																		.createSequentialGroup()
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addGroup(
																																				gl_jPanel1
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																						.addComponent(
																																								jLabel12)
																																						.addComponent(
																																								jLabel8)))))
																						.addGroup(
																								gl_jPanel1
																										.createSequentialGroup()
																										.addGap(37,
																												37,
																												37)
																										.addComponent(
																												jButton3)))
																		.addGroup(
																				gl_jPanel1
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								gl_jPanel1
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												gl_jPanel1
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jTextField7,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																158,
																																Short.MAX_VALUE)
																														.addComponent(
																																jTextField4,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																158,
																																Short.MAX_VALUE)
																														.addComponent(
																																jTextField2,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																158,
																																Short.MAX_VALUE)
																														.addComponent(
																																jTextField6,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																158,
																																Short.MAX_VALUE)
																														.addComponent(
																																jTextField10,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																158,
																																Short.MAX_VALUE)
																														.addComponent(
																																jTextField12,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																158,
																																Short.MAX_VALUE)))
																						.addGroup(
																								gl_jPanel1
																										.createSequentialGroup()
																										.addGap(21,
																												21,
																												21)
																										.addComponent(
																												jButton1)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												20,
																												Short.MAX_VALUE)
																										.addComponent(
																												jButton2)))
																		.addContainerGap())
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																gl_jPanel1
																		.createSequentialGroup()
																		.addComponent(
																				jComboBox1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				125,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(239,
																				239,
																				239)))));
		gl_jPanel1
				.setVerticalGroup(gl_jPanel1
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								gl_jPanel1
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gl_jPanel1
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel14)
														.addComponent(
																jComboBox1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												29, Short.MAX_VALUE)
										.addGroup(
												gl_jPanel1
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																gl_jPanel1
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jLabel9)
																		.addComponent(
																				jTextField9,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jLabel10))
														.addGroup(
																gl_jPanel1
																		.createSequentialGroup()
																		.addGap(6,
																				6,
																				6)
																		.addComponent(
																				jTextField10,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												gl_jPanel1
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel1))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												gl_jPanel1
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																gl_jPanel1
																		.createSequentialGroup()
																		.addGroup(
																				gl_jPanel1
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jTextField3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel3))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				gl_jPanel1
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jTextField5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel5)))
														.addGroup(
																gl_jPanel1
																		.createSequentialGroup()
																		.addGroup(
																				gl_jPanel1
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel4)
																						.addComponent(
																								jTextField4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				gl_jPanel1
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel6)
																						.addComponent(
																								jTextField6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												gl_jPanel1
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																gl_jPanel1
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jLabel7)
																		.addComponent(
																				jLabel8)
																		.addComponent(
																				jTextField8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																jTextField7,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												gl_jPanel1
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																gl_jPanel1
																		.createSequentialGroup()
																		.addGroup(
																				gl_jPanel1
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel11)
																						.addComponent(
																								jTextField11,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				gl_jPanel1
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel13)
																						.addComponent(
																								jTextField13,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																gl_jPanel1
																		.createSequentialGroup()
																		.addGroup(
																				gl_jPanel1
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel12)
																						.addComponent(
																								jTextField12,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				gl_jPanel1
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jButton2)
																						.addComponent(
																								jButton3)
																						.addComponent(
																								jButton1))))
										.addGap(42, 42, 42)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
		this.setTitle("价格调整");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		this.setBounds(10,93,1300,450);
		setIconifiable(true);
		setClosable(true);
		setMaximizable(true);
		this.setVisible(true);
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		ruku_DAO list = new ruku_DAO();
		String text1 = jComboBox1.getSelectedItem().toString();
		String sql1 = "select * from ruku_table where spmc='" + text1 + "'";
		rukuInfo info = list.getBySQL(sql1);
		jTextField10.setText(info.getSpmc());
		jTextField10.setFocusable(false);
		jTextField9.setText(info.getRkph());
		jTextField9.setFocusable(false);
		jTextField1.setText(info.getPiece());
		jTextField2.setText(info.getRkNum());
		jTextField2.setFocusable(false);
		jTextField3.setText(info.getXhbh());
		jTextField3.setFocusable(false);
		jTextField4.setText(info.getGg());
		jTextField5.setFocusable(false);
		jTextField5.setText(info.getCzy());
		jTextField6.setText(info.getJsr());
		jTextField6.setFocusable(false);
		jTextField7.setText(info.getKhqc());
		jTextField7.setFocusable(false);
		jTextField8.setText(info.getJsfs());
		jTextField8.setFocusable(false);
		jTextField11.setText(info.getKhqc());
		jTextField11.setFocusable(false);
		jTextField12.setText(info.getRkdate());
		jTextField12.setFocusable(false);
		jTextField13.setText(info.getRkMoney());
		jTextField13.setFocusable(false);

	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

		this.setVisible(false);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		ruku_DAO list = new ruku_DAO();
		goods_DAO list1=new goods_DAO();
		String text1 = jComboBox1.getSelectedItem().toString();
		String text3 = jTextField2.getText();
		//String sql1 = "select * from ruku_table where spmc='" + text1 + "'";
		if ("".equals(text1)) {
			JOptionPane.showMessageDialog(null, "请输入查询内容");
		}
		if (!"".equals(text1)) {
			//JOptionPane.showConfirmDialog(null, "修改成功");
			String text2 = jTextField1.getText();
			//float text3=Float.parseFloat(text2);
			String sql2 = "update ruku_table set piece=" + text2
					+ " where spmc='" + text1 + "'";
			String sql3 = "update ruku_table set rkMoney=" + text2 + "*"
					+ text3 + " where spmc='" + text1 + "'";
			String sql4="update goods_info set bz='价格已更改为"+text2+"'  where spmc='"+text1+"'";
			boolean flag1 = list.updateInfo(sql2);
			boolean flag2 = list.updateInfo(sql3);
			boolean flag3=list1.updateInfo(sql4);
			if (flag1 && flag2&&flag3) {
				JOptionPane.showMessageDialog(null, "修改成功");
			}
		}
	}

	//GEN-END:initComponents

	/**
	 * @param args the command line arguments
	 */
//	public static void main(String args[]) {
//		java.awt.EventQueue.invokeLater(new Runnable() {
//			public void run() {
////				new jiagetiaozheng().setVisible(true);
//				new jiagetiaozheng();
//			}
//		});
//	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField10;
	private javax.swing.JTextField jTextField11;
	private javax.swing.JTextField jTextField12;
	private javax.swing.JTextField jTextField13;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	private javax.swing.JTextField jTextField9;
	// End of variables declaration//GEN-END:variables

}