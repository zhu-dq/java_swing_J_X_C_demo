package Jframe;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import DAO.jinhuo_DAO;
import DAO.ruku_DAO;

import PO.jinhuoInfo;
import PO.rukuInfo;


/**
 *
 * @author  __USER__
 */
public class jinhuodan extends javax.swing.JInternalFrame {
	

	/** Creates new form jinhuodan_view */
	public jinhuodan() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */

private void initComponents() {

jPanel1 = new javax.swing.JPanel();
jLabel1 = new javax.swing.JLabel();
jTextField1 = new javax.swing.JTextField();
jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jComboBox2 = new javax.swing.JComboBox();
		jTextField3 = new javax.swing.JTextField();
		button1 = new java.awt.Button();
		button2 = new java.awt.Button();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jTextField5 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jTextField6 = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jLabel9 = new javax.swing.JLabel();
		jTextField8 = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		jTextField9 = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		jTextField10 = new javax.swing.JTextField();
		jLabel12 = new javax.swing.JLabel();
		jTextField11 = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jLabel13 = new javax.swing.JLabel();
		jTextField12 = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u8fdb\u8d27\u5355");

		jPanel1.setBackground(new java.awt.Color(255, 255, 204));

		jLabel1.setText("\u8fdb\u8d27\u7968\u53f7\uff1a");

		jTextField1.setBackground(new java.awt.Color(204, 255, 51));
		

		jLabel2.setText("\u5546\u54c1\u7f16\u53f7\uff1a");

		jLabel3.setText("\u5546\u54c1\u540d\u79f0\uff1a");

		jTextField2.setBackground(new java.awt.Color(204, 255, 51));

		jLabel4.setText("\u7ed3\u7b97\u65b9\u5f0f\uff1a");

		jLabel5.setText("\u603b\u8ba1\u91d1\u989d\uff1a");

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"现金", "支票" }));

		jTextField3.setBackground(new java.awt.Color(204, 255, 51));
		jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTextField3MouseClicked(evt);
			}
		});
		jTextField3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField3ActionPerformed(evt);
			}
		});

		button1.setFont(new java.awt.Font("Dialog", 1, 12));
		button1.setLabel("\u6dfb\u52a0");
		button1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button1ActionPerformed(evt);
			}
		});

		button2.setFont(new java.awt.Font("Dialog", 1, 12));
		button2.setLabel("\u5165\u5e93");
		button2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button2ActionPerformed(evt);
			}
		});

		jTable1.setBackground(new java.awt.Color(204, 255, 51));
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "进货票号", "商品编号", "商品名称", "规格", "单价", "退货数量", "合计金额",
						"操作员", "客户全称", "结算方式", "进货时间"}));
		jScrollPane1.setViewportView(jTable1);

		jTextField5.setBackground(new java.awt.Color(204, 255, 51));
		

		jLabel7.setText("\u89c4    \u683c\uff1a");

		jTextField6.setBackground(new java.awt.Color(204, 255, 51));

		jLabel8.setText("\u5355      \u4ef7\uff1a");

		jTextField7.setBackground(new java.awt.Color(204, 255, 51));
		

		jLabel9.setText("\u4f9b\u5e94\u5546\u5168\u79f0\uff1a");

		jTextField8.setBackground(new java.awt.Color(204, 255, 51));
		jTextField8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField8ActionPerformed(evt);
			}
		});

		jLabel10.setText("\u64cd \u4f5c \u5458\uff1a");

		jTextField9.setBackground(new java.awt.Color(204, 255, 51));

		jLabel11.setText("\u5ba2\u6237\u5168\u79f0\uff1a");

		jTextField10.setBackground(new java.awt.Color(204, 255, 51));

		jLabel12.setText("\u6570    \u91cf\uff1a");

		jTextField11.setBackground(new java.awt.Color(204, 255, 51));
		

		jLabel6.setText("\u8fdb\u8d27\u65f6\u95f4\uff1a");

		jTextField4.setBackground(new java.awt.Color(204, 255, 51));
		

		jLabel13.setText("\u7ecf\u624b\u4eba");

		jTextField12.setBackground(new java.awt.Color(204, 255, 51));
		jTextField12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField12ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 761,
								Short.MAX_VALUE)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap(579, Short.MAX_VALUE)
										.addComponent(
												button1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												78,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												button2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												84,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel10)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												jTextField9,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												95,
																												Short.MAX_VALUE))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel1)
																														.addComponent(
																																jLabel7))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jTextField6,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																97,
																																Short.MAX_VALUE)
																														.addComponent(
																																jTextField1,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																97,
																																Short.MAX_VALUE))))
																		.addGap(43,
																				43,
																				43)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel2)
																						.addComponent(
																								jLabel8)
																						.addComponent(
																								jLabel11))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jTextField10,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								151,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField7,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								151,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField5,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								151,
																								Short.MAX_VALUE)))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel4)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jTextField12,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								102,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jComboBox2,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												117,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												jLabel5)
																										.addGap(18,
																												18,
																												18)
																										.addComponent(
																												jTextField3,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												147,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel12)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel9)
																						.addComponent(
																								jLabel3))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								jTextField2)
																						.addComponent(
																								jTextField11)
																						.addComponent(
																								jTextField8,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								134,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField4)))
														.addComponent(jLabel6))
										.addContainerGap(57, Short.MAX_VALUE))
						.addGroup(
								jPanel1Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel13)
										.addContainerGap(701, Short.MAX_VALUE)));
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
														.addComponent(jLabel3)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2)
														.addComponent(
																jTextField5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel7)
														.addComponent(
																jTextField6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel9)
														.addComponent(
																jTextField8,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel8)
														.addComponent(
																jTextField7,
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
																				jLabel10)
																		.addComponent(
																				jTextField9,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jLabel12)
																		.addComponent(
																				jTextField11,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jLabel11)
																		.addComponent(
																				jTextField10,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
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
																				jComboBox2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jLabel5)
																		.addComponent(
																				jTextField3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jLabel6)
																		.addComponent(
																				jTextField4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(12,
																				12,
																				12)
																		.addComponent(
																				jLabel13))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField12,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(12, 12, 12)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												105,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(19, 19, 19)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																button2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																button1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(39, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
		this.setTitle("进货单");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		this.setBounds(10,93,1300,450);
		setIconifiable(true);
		setClosable(true);
		setMaximizable(true);
		this.setVisible(true);
	}// </editor-fold>
	//GEN-END:initComponents

	private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {

		if (!"".equals(jTextField7.getText())
				&& !"".equals(jTextField11.getText())) {
			float jtext7 = Float.parseFloat(jTextField7.getText());
			int jtext11 = Integer.parseInt(jTextField11.getText());
			float jtextNum = jtext7 * jtext11;
			String jtextSt = String.valueOf(jtextNum);
			jTextField3.setText(jtextSt);
		} else {
			jTextField3.setText("0.0");
		}

	}

	private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
		float jtext7 = Float.parseFloat(jTextField7.getText());
		int jtext11 = Integer.parseInt(jTextField11.getText());
		float jtextNum = jtext7 * jtext11;
		JOptionPane.showMessageDialog(null, jtextNum);
	}

	private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {

		float jtext7 = Float.parseFloat(jTextField7.getText());
		int jtext11 = Integer.parseInt(jTextField11.getText());
		float jtextNum = jtext7 * jtext11;
		JOptionPane.showMessageDialog(null, jtextNum);

	}

	private void button2ActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel model = null;
		jLabel13.setVisible(true);
		jTextField12.setVisible(true);
		jLabel1.setText("入库票号：");
		jLabel6.setText("入库时间：");
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
		String jtext12 = jTextField12.getText();
		String choise = jComboBox2.getSelectedItem().toString();
		String sql = "insert into ruku_table values('" + jtext1 + "','"
				+ jtext5 + "','" + jtext2 + "','" + jtext6 + "','" + jtext7
				+ "','" + jtext11 + "','" + jtext3 + "','" + jtext9 + "','"
				+ jtext12 + "','" + jtext10 + "','" + choise + "','" + jtext8
				+ "','" + jtext4 + "')";
		//
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "入库票号", "商品编号", "商品名称", "规格", "单价", "入库数量", "合计金额",
						"操作员", "经手人", "客户全称", "结算方式", "供应商全称", "进货时间"  }));
		//
		String[] title = { "入库票号", "商品编号", "商品名称", "规格", "单价", "入库数量", "合计金额",
				"操作员", "经手人", "客户全称", "结算方式", "供应商全称", "进货时间" };
		model = new DefaultTableModel(title, 0);
		ruku_DAO list = new ruku_DAO();
		if ("".equals(jtext1) || "".equals(jtext2) || "".equals(jtext3)
				|| "".equals(jtext4) || "".equals(jtext5) || "".equals(jtext6)
				|| "".equals(jtext7) || "".equals(jtext8) || "".equals(jtext9)
				|| "".equals(jtext10) || "".equals(jtext11)) {
			JOptionPane.showMessageDialog(null, "请填写添加信息");
		} else {
			boolean flag = list.updateInfo(sql);
			if (flag) {
				try {
					List<rukuInfo> uList = list.getAllInfo();
					for (rukuInfo info : uList) {
						Object[] o = { info.getRkph(), info.getXhbh(),
								info.getSpmc(), info.getGg(), info.getPiece(),
								info.getRkNum(), info.getRkMoney(),
								info.getCzy(), info.getJsr(), info.getKhqc(),
								info.getJsfs(), info.getGys(), info.getRkdate() };
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

	private void button1ActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel model = null;
		jLabel13.setVisible(false);
		jTextField12.setVisible(false);
		jLabel1.setText("进货票号：");
		jLabel6.setText("进货时间：");
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
		String choise = jComboBox2.getSelectedItem().toString();
		String sql = "insert into jinhuo_table values('" + jtext1 + "','"
				+ jtext5 + "','" + jtext2 + "','" + jtext6 + "','" + jtext7
				+ "','" + jtext8 + "','" + jtext9 + "','" + jtext10 + "','"
				+ jtext11 + "','" + choise + "','" + jtext3 + "','" + jtext4
				+ "')";
		//**
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "进货票号", "商品编号", "商品名称", "规格", "单价", "退货数量", "合计金额",
						"操作员", "客户全称", "结算方式", "进货时间"}));
		//**
		
		String[] title = { "进货票号", "商品编号", "商品名称", "规格", "单价", "退货数量", "合计金额",
			"操作员", "客户全称", "结算方式", "进货时间" };
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
					jTextField4.setText(sd.format(d));
				} catch (Exception e) {
					System.out.println("shi我吗");
				}

			}

		}
	}

	/**
	 * @param args the command line arguments
	 */
//	public static void main(String args[]) {
//		MyThread myThread = new MyThread();
//		myThread.start();
//		java.awt.EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				new jinhuodan().setVisible(true);
//			}
//		});
//	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private java.awt.Button button1;
	private java.awt.Button button2;
	private javax.swing.JComboBox jComboBox2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
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
	private javax.swing.JTextField jTextField11;
	private javax.swing.JTextField jTextField12;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private static javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	private javax.swing.JTextField jTextField9;
	// End of variables declaration//GEN-END:variables

}