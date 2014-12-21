package Jframe;

import java.awt.Component;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import DAO.xiaoshou_DAO;
import PO.xiaoShou;
import java.awt.Color;

/**
 *
 * @author  __USER__
 */
public class spjgph extends javax.swing.JInternalFrame {
	DefaultTableModel model = null;

	/** Creates new form RangkFrame */
	public spjgph() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel1.setBackground(Color.ORANGE);
		jPanel1.setForeground(Color.ORANGE);
		jLabel1 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jComboBox2 = new javax.swing.JComboBox();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jComboBox3 = new javax.swing.JComboBox();
		jComboBox4 = new javax.swing.JComboBox();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jPanel2.setBackground(Color.GREEN);
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u5546\u54c1\u4fe1\u606f\u6392\u884c");

		jLabel1.setText("\u5e74");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "1990", "1991", "1993", "1992", "1993", "1994",
						"1995", "1996", "1997", "1998", "1999", "2000", "2001",
						"2002", "2003", "2004", "2005", "2006", "2007", "2008",
						"2009", "2010", "2011", "2012" }));

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
				"11", "12" }));

		jLabel2.setText("\u6708");

		jLabel3.setText("\u6309");

		jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"销售量", "总金额" }));

		jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"升序排列", "降序排列" }));
		
		jButton1.setText("\u786e\u5b9a");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u5c55\u793a\u6240\u6709\u4fe1\u606f");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

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
										.addComponent(
												jComboBox1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jComboBox2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jLabel3)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jComboBox3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(27, 27, 27)
										.addComponent(
												jComboBox4,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jButton1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												82,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jButton2)
										.addContainerGap(48, Short.MAX_VALUE)));
		gl_jPanel1
				.setVerticalGroup(gl_jPanel1
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
																gl_jPanel1
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jLabel1)
																		.addComponent(
																				jComboBox2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jLabel2)
																		.addComponent(
																				jLabel3)
																		.addComponent(
																				jComboBox3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jComboBox4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButton1)
																		.addComponent(
																				jButton2))
														.addComponent(
																jComboBox1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(38, 38, 38)));

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {
						{ null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null,
								null, null },
						{ null, null, null, null, null, null, null, null, null,
								null, null } }, new String[] { "销售票号", "商品编号",
						"商品名称", "规格", "单价", "数量", "金额", "客户全称", "销售日期", "操作员",
						"经手人" }));
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout gl_jPanel2 = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(gl_jPanel2);
		gl_jPanel2.setHorizontalGroup(gl_jPanel2.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671,
				Short.MAX_VALUE));
		gl_jPanel2.setVerticalGroup(gl_jPanel2.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275,
				Short.MAX_VALUE));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										67,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jPanel2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)));

		pack();
		this.setTitle("商品价格排行");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		this.setBounds(10,93,1300,450);
		setIconifiable(true);
		setClosable(true);
		setMaximizable(true);
		this.setVisible(true);
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		String[] title = { "销售票号", "商品编号", "商品名称", "规格", "单价", "数量", "金额",
				"客户全称", "销售日期", "操作员", "经手人" };
		model = new DefaultTableModel(title, 0);
		xiaoshou_DAO list = new xiaoshou_DAO();

		try {
			List<xiaoShou> uList = list.getAllGYSInfo();
			for (xiaoShou info : uList) {
				Object[] o = { info.getXhph(), info.getXhbh(), info.getSpmc(),
						info.getGg(), info.getPiece(), info.getNum(),
						info.getJe(), info.getKhqc(), info.getXsdate(),
						info.getCzy(), info.getJsr() };
				model.addRow(o);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		jTable1.setModel(model);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String choise1=jComboBox1.getSelectedItem().toString();
		String choise2=jComboBox2.getSelectedItem().toString();
		String choise3=jComboBox3.getSelectedItem().toString();
		String choise4=jComboBox4.getSelectedItem().toString();
		String sql="select * from xiaoshou_info ";
		xiaoshou_DAO dao=new xiaoshou_DAO();
		//获取当前日期的年
		//**********
		java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
		Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			
			int year=cal.get(Calendar.YEAR);
		//***********
		
		if(choise3.equals("销售量")){
			if(choise4.equals("升序排列")){
				List<xiaoShou> list=dao.getInfoBySQL(sql+"where xsdate like '%"+choise1+"%' order by num desc");
				String[] title = { "销售票号", "商品编号","商品名称", "规格", "单价", 
						"数量", "金额", "客户全称", "销售日期", "操作员","经手人" };
				model = new DefaultTableModel(title, 0);
				for(xiaoShou info:list){
					Object[] o = { info.getXhph(), info.getXhbh(), info.getSpmc(),
							info.getGg(), info.getPiece(), info.getNum(),
							info.getJe(), info.getKhqc(), info.getXsdate(),
							info.getCzy(), info.getJsr()};
					model.addRow(o);
					jTable1.setModel(model);
				}
			}
			if(choise4.equals("降序排列")){
				List<xiaoShou> list=dao.getInfoBySQL(sql+"where xsdate like '%"+choise1+"%' order by num asc");
				String[] title = { "销售票号", "商品编号","商品名称", "规格", "单价", 
						"数量", "金额", "客户全称", "销售日期", "操作员","经手人" };
				model = new DefaultTableModel(title, 0);
				for(xiaoShou info:list){
					Object[] o = { info.getXhph(), info.getXhbh(), info.getSpmc(),
							info.getGg(), info.getPiece(), info.getNum(),
							info.getJe(), info.getKhqc(), info.getXsdate(),
							info.getCzy(), info.getJsr()};
					model.addRow(o);
					jTable1.setModel(model);
				}
			}
		}
		if(choise3.equals("总金额")){
			if(choise4.equals("升序排列")){
				List<xiaoShou> list=dao.getInfoBySQL(sql+"where xsdate like '%"+choise1+"%' order by je desc");
				String[] title = { "销售票号", "商品编号","商品名称", "规格", "单价", 
						"数量", "金额", "客户全称", "销售日期", "操作员","经手人" };
				model = new DefaultTableModel(title, 0);
				for(xiaoShou info:list){
					Object[] o = { info.getXhph(), info.getXhbh(), info.getSpmc(),
							info.getGg(), info.getPiece(), info.getNum(),
							info.getJe(), info.getKhqc(), info.getXsdate(),
							info.getCzy(), info.getJsr()};
					model.addRow(o);
					jTable1.setModel(model);
				}
			}
			if(choise4.equals("降序排列")){
				List<xiaoShou> list=dao.getInfoBySQL(sql+"where xsdate like '%"+choise1+"%' order by je asc");
				String[] title = { "销售票号", "商品编号","商品名称", "规格", "单价", 
						"数量", "金额", "客户全称", "销售日期", "操作员","经手人" };
				model = new DefaultTableModel(title, 0);
				for(xiaoShou info:list){
					Object[] o = { info.getXhph(), info.getXhbh(), info.getSpmc(),
							info.getGg(), info.getPiece(), info.getNum(),
							info.getJe(), info.getKhqc(), info.getXsdate(),
							info.getCzy(), info.getJsr()};
					model.addRow(o);
					jTable1.setModel(model);
				}
			}
		}
	}

	/**
	 * @param args the command line arguments
	 */
//	public static void main(String args[]) {
//		java.awt.EventQueue.invokeLater(new Runnable() {
//			public void run() {
////				new spjgph().setVisible(true);
//				new spjgph();
//			}
//		});
//	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JComboBox jComboBox2;
	private javax.swing.JComboBox jComboBox3;
	private javax.swing.JComboBox jComboBox4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	// End of variables declaration//GEN-END:variables

}
