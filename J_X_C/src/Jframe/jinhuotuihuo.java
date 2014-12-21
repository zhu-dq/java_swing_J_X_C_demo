package Jframe;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import DAO.JHtuihuo_DAO;
import DAO.jinhuo_DAO;
import PO.jinhuoInfo;
import PO.rukuInfo;
import PO.tuihuoInfo;

/**
 *
 * @author  __USER__
 */
public class jinhuotuihuo extends javax.swing.JInternalFrame {
	DefaultTableModel model = null;

	/** Creates new form JinhuoManageFrame */
	public jinhuotuihuo() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
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
		jLabel8 = new javax.swing.JLabel();
		jTextField8 = new javax.swing.JTextField();
		jLabel9 = new javax.swing.JLabel();
		jTextField9 = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		jTextField10 = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jLabel12 = new javax.swing.JLabel();
		jTextField11 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u8fdb\u8d27\u9000\u8d27");

		jPanel1.setBackground(new java.awt.Color(204, 204, 0));

		jLabel1.setText("\u8fdb\u8d27\u7968\u53f7:");

		jTextField1.setBackground(new java.awt.Color(255, 255, 204));

		jLabel2.setText("\u5546\u54c1\u7f16\u53f7:");

		jTextField2.setBackground(new java.awt.Color(255, 255, 204));

		jLabel3.setText("\u5546\u54c1\u540d\u79f0:");

		jTextField3.setBackground(new java.awt.Color(255, 255, 204));

		jLabel4.setText("\u89c4     \u683c\uff1a");

		jTextField4.setBackground(new java.awt.Color(255, 255, 204));

		jLabel5.setText("\u5355     \u4ef7\uff1a");

		jTextField5.setBackground(new java.awt.Color(255, 255, 204));

		jLabel6.setText("\u4f9b\u5e94\u5546\uff1a");

		jTextField6.setBackground(new java.awt.Color(255, 255, 204));

		jLabel7.setText("\u64cd \u4f5c \u5458\uff1a");

		jTextField7.setBackground(new java.awt.Color(255, 255, 204));

		jLabel8.setText("\u8fdb\u8d27\u5730\u5740\uff1a");

		jTextField8.setBackground(new java.awt.Color(255, 255, 204));

		jLabel9.setText("\u8fdb\u8d27\u6570\u91cf:");

		jTextField9.setBackground(new java.awt.Color(255, 255, 204));

		jLabel10.setText("\u5408\u8ba1\u91d1\u989d\uff1a");

		jTextField10.setBackground(new java.awt.Color(255, 255, 204));
		jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTextField10MouseClicked(evt);
			}
		});

		jLabel11.setText("\u7ed3\u7b97\u65b9\u5f0f:");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"现    金", "赊    欠", "刷    卡", "支    票" }));

		jLabel12.setText("\u8fdb\u8d27\u65e5\u671f");

		jTextField11.setBackground(new java.awt.Color(255, 255, 204));

		jButton1.setText("\u6dfb\u52a0");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u9000\u8d27");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jTable1.setBackground(new java.awt.Color(204, 204, 0));
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "进货票号", "商品编号", "商品名称", "规格", "单价", "退货数量", "合计金额",
						"操作员", "客户全称", "结算方式", "进货时间"}));
		jScrollPane1.setViewportView(jTable1);
		
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addGap(40, 40, 40)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel7)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jTextField7))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel11)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				jComboBox1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				108,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel4)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				jTextField4))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel1)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				131,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel10)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField10,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				133,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel8)
																						.addComponent(
																								jLabel5)
																						.addComponent(
																								jLabel2))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jTextField5,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								133,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField8,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								133,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField2,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								133,
																								Short.MAX_VALUE))))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel3)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				129,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																										.addComponent(
																												jLabel12)
																										.addComponent(
																												jLabel9))
																						.addComponent(
																								jLabel6))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								jTextField11)
																						.addComponent(
																								jTextField9,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								128,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField6))))
										.addContainerGap(32, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout.createSequentialGroup()
										.addContainerGap(526, Short.MAX_VALUE)
										.addComponent(jButton1)
										.addGap(44, 44, 44)
										.addComponent(jButton2)
										.addGap(26, 26, 26))
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, 722,
								Short.MAX_VALUE));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2)
														.addComponent(jLabel3)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jLabel4)
																		.addComponent(
																				jTextField4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jLabel5)
																		.addComponent(
																				jTextField5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jLabel6)
																		.addComponent(
																				jTextField6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel7)
																						.addGroup(
																								jPanel1Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																										.addComponent(
																												jTextField7,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												jTextField8,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))
																		.addGap(8,
																				8,
																				8))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel8)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel9)
																						.addComponent(
																								jTextField9,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(18,
																				18,
																				18)))
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jLabel11)
																		.addComponent(
																				jComboBox1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel10)
																						.addComponent(
																								jLabel12)
																						.addComponent(
																								jTextField10,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jTextField11,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												136, Short.MAX_VALUE)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton2)
														.addComponent(jButton1))
										.addContainerGap()));

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
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		setIconifiable(true);
		setClosable(true);
		setMaximizable(true);
		this.setVisible(true);
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel1.setText("退货票号：");
		jLabel9.setText("退货数量");
		jLabel11.setText("退货日期：");
		String jtext1 = jTextField1.getText();
		String jtext2 = jTextField2.getText();
		String jtext3 = jTextField3.getText();
		String jtext4 = jTextField4.getText();
		String jtext5 = jTextField5.getText();
		String jtext6 = jTextField6.getText();
		String jtext7 = jTextField7.getText();
		String jtext8 = jTextField8.getText();
		String jtext9 = (jTextField9.getText());
		String jtext10 = (jTextField10.getText());
		String jtext11 = jTextField11.getText();
		String choise = jComboBox1.getSelectedItem().toString();
		String sql = "insert into jinhuoTH_table values('" + jtext1 + "','"
				+ jtext2 + "','" + jtext3 + "','" + jtext4 + "','" + jtext5
				+ "','" + jtext6 + "','" + jtext7 + "','" + jtext8 + "','"
				+ jtext9 + "','" + choise + "','" + jtext10 + "','" + jtext11
				+ "')";
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "退货票号", "商品编号", "商品名称", "规格", "单价", "供应商全称", "操作员",
						"进货地址", "进货数量", "结算方式", "合计金额", "退货日期"  }));
		String[] title = { "退货票号", "商品编号", "商品名称", "规格", "单价", "供应商全称", "操作员",
				"进货地址", "进货数量", "结算方式", "合计金额", "退货日期"  };
		model = new DefaultTableModel(title, 0);
		
		JHtuihuo_DAO list = new JHtuihuo_DAO();
		if ("".equals(jtext1) || "".equals(jtext2) || "".equals(jtext3)
				|| "".equals(jtext4) || "".equals(jtext5) || "".equals(jtext6)
				|| "".equals(jtext7) || "".equals(jtext8) || "".equals(jtext9)
				|| "".equals(jtext10) || "".equals(jtext11)) {
			JOptionPane.showMessageDialog(null, "请填写信息");
		} else {
			boolean flag = list.getBySQL(sql);
			if (flag) {

				try {
					List<tuihuoInfo> uList = list.getAll();
					for (tuihuoInfo info : uList) {

						Object[] o = { info.getThph(), info.getXhbh(),
								info.getSpmc(), info.getGg(), info.getPiece(),
								info.getGys(), info.getCzy(), info.getJhdz(),
								info.getThNum(), info.getJsfs(),
								info.getThMoney(), info.getJhdate() };
						model.addRow(o);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				jTable1.setModel(model);
			} else {
				JOptionPane.showMessageDialog(null, "添加失败");
			}

		}

	}

	private void jTextField10MouseClicked(java.awt.event.MouseEvent evt) {
		if (!"".equals(jTextField5.getText())
				&& !"".equals(jTextField9.getText())) {
			float jtext5 = Float.parseFloat(jTextField5.getText());
			int jtext9 = Integer.parseInt(jTextField9.getText());
			float jtextNum = jtext5 * jtext9;
			String jtextSt = String.valueOf(jtextNum);
			jTextField10.setText(jtextSt);
		} else {
			jTextField10.setText("0.0");
		}
	}

	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel1.setText("进货票号：");
		jLabel9.setText("进货数量");
		jLabel11.setText("进货日期：");
		String jtext1 = jTextField1.getText();
		String jtext2 = jTextField2.getText();
		String jtext3 = jTextField3.getText();
		String jtext4 = jTextField4.getText();
		String jtext5 = jTextField5.getText();
		String jtext6 = jTextField6.getText();
		String jtext7 = jTextField7.getText();
		String jtext8 = jTextField8.getText();
		String jtext9 = (jTextField9.getText());
		String jtext10 = (jTextField10.getText());
		String jtext11 = jTextField11.getText();
		String choise = jComboBox1.getSelectedItem().toString();
		String sql = "insert into jinhuo_table values('" + jtext1 + "','"
				+ jtext2 + "','" + jtext3 + "','" + jtext4 + "','" + jtext5
				+ "','" + jtext6 + "','" + jtext7 + "','" + jtext8 + "','"
				+ jtext9 + "','" + choise + "','" + jtext10 + "','" + jtext11
				+ "')";
		//JOptionPane.showConfirmDialog(null, sql);
		//
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "进货票号", "商品编号", "商品名称", "规格", "单价", "供应商全称", "操作员",
						"客户全称", "进货数量", "结算方式", "合计金额", "进货日期"  }));
		//
		String[] title = { "进货票号", "商品编号", "商品名称", "规格", "单价", "供应商全称", "操作员",
				"进货地址", "进货数量", "结算方式", "合计金额", "进货日期" };
		model = new DefaultTableModel(title, 0);
		jinhuo_DAO list = new jinhuo_DAO();
		if ("".equals(jtext1) || "".equals(jtext2) || "".equals(jtext3)
				|| "".equals(jtext4) || "".equals(jtext5) || "".equals(jtext6)
				|| "".equals(jtext7) || "".equals(jtext8) || "".equals(jtext9)
				|| "".equals(jtext10) || "".equals(jtext11)) {
			JOptionPane.showMessageDialog(null, "请填写添加信息");
		} else {
			boolean flag = list.getBySQL(sql);
			if (flag) {
				try {
					List<jinhuoInfo> uList = list.getAll();
					for (jinhuoInfo info : uList) {
						Object[] o = { info.getJhph(), info.getXhbh(),
								info.getSpmc(), info.getGg(), info.getPiece(),
								info.getRkNum(), info.getRkMoney(),
								info.getCzy(), info.getKhqc(), info.getJsfs(),
								info.getJhdate() };
						model.addRow(o);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				jTable1.setModel(model);
			} else {
				JOptionPane.showMessageDialog(null, "添加失败");
			}

		}
	}

	public static class MyThread extends Thread {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		public void run() {
			while (true) {
				try {
					Thread.sleep(1000);
					Date d = new Date();
					jTextField11.setText(sd.format(d));
				} catch (Exception e) {
					System.out.println("时间异常");
				}

			}

		}
	}

	/**
	 * @param args the command line arguments
	 */
//	public static void main(String args[]) {
//		MyThread thread = new MyThread();
//		thread.start();
//		java.awt.EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				new jinhuotuihuo().setVisible(true);
//			}
//		});
//	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField10;
	private static javax.swing.JTextField jTextField11;
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