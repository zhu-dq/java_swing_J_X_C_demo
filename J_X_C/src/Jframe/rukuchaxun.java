package Jframe;


import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import DAO.ruku_DAO;

import PO.rukuInfo;
import java.awt.Color;


/**
 *
 * @author  __USER__
 */
public class rukuchaxun extends javax.swing.JInternalFrame {
	DefaultTableModel model = null;

	/** Creates new form rukuFrame */
	public rukuchaxun() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel1.setBackground(Color.ORANGE);
		jButton1 = new javax.swing.JButton();
		jCheckBox1 = new javax.swing.JCheckBox();
		jTextField1 = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jComboBox2 = new javax.swing.JComboBox();
		jLabel4 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jButton2 = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jPanel2.setForeground(Color.GREEN);
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton1.setText("\u663e\u793a\u6240\u6709\u4fe1\u606f");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jCheckBox1.setText("\u6307\u5b9a\u67e5\u8be2\u65f6\u95f4");

		jTextField1.setText("2000-01-01");
		

		jLabel1.setText("\u4ece");

		jLabel2.setText("\u5230");

		jTextField2.setText("2012-08-06");

		jLabel3.setText("\u9009\u62e9\u67e5\u8be2\u65b9\u5f0f");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"��Ӧ��ȫ��", "��Ʒ����" }));

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"����", "����" }));

		jLabel4.setText("\u8f93\u5165\u67e5\u8be2\u5185\u5bb9");

		jButton2.setText("\u67e5\u8be2");
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
										.addGroup(
												gl_jPanel1
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																gl_jPanel1
																		.createSequentialGroup()
																		.addComponent(
																				jLabel3)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jComboBox1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jComboBox2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel4)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				jTextField3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				109,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_jPanel1
																		.createSequentialGroup()
																		.addComponent(
																				jButton1)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				jCheckBox1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(18, 18, 18)
										.addComponent(jButton2)
										.addContainerGap()));
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
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1)
														.addComponent(
																jCheckBox1)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel1)
														.addComponent(jLabel2)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												gl_jPanel1
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																jComboBox1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jComboBox2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel4)
														.addComponent(jButton2)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap()));

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {
						{ null, null, null, null, null, null, null, null, null,
								null, null, null, null },
						{ null, null, null, null, null, null, null, null, null,
								null, null, null, null },
						{ null, null, null, null, null, null, null, null, null,
								null, null, null, null },
						{ null, null, null, null, null, null, null, null, null,
								null, null, null, null } }, new String[] {
						"���Ʊ��", "��Ʒ���", "��Ʒ����", "���", "����", "����", "���", "����Ա",
						"������", "�ͻ�ȫ��", "���㷽ʽ", "��Ӧ��ȫ��", "�������" }));
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout gl_jPanel2 = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(gl_jPanel2);
		gl_jPanel2.setHorizontalGroup(gl_jPanel2.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600,
				Short.MAX_VALUE));
		gl_jPanel2.setVerticalGroup(gl_jPanel2.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291,
				Short.MAX_VALUE));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel2,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));

		pack();
		this.setTitle("����ѯ");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		this.setBounds(10,93,1300,450);
		setIconifiable(true);
		setClosable(true);
		setMaximizable(true);
		this.setVisible(true);
	}// </editor-fold>
	//GEN-END:initComponents

	

	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		String choise1 = jComboBox1.getSelectedItem().toString();//��һ������������ַ���
		String choise2 = jComboBox2.getSelectedItem().toString();//�ڶ�������������ַ���
		boolean flag = jCheckBox1.isSelected();//jCheckBox1�Ƿ�ѡ��
		String text1 = jTextField1.getText();//��һ���ı�����ͼ۸񣩵�����
		String text2 = jTextField2.getText();//�ڶ����ı�����߼۸񣩵�����
		String text3 = jTextField3.getText();//�������ı��������ѯ����
		String sql = "select * from ruku_table where ";
		ruku_DAO dao=new ruku_DAO();
		if(("".equals(text3)&&"".equals(text1)&&"".equals(text2)&&flag)||("".equals(text3)&&!flag)){
			JOptionPane.showMessageDialog(null, "�������ѯ����");
		}else{
			/**
			 * checkѡ�У�����ѯ�����Ϊ�յ�ʱ��
			 */
			//�����һ�������ı���Ϊ�ն��ڶ���Ϊ�գ���ѯ���������ҲΪ��
			if(!"".equals(text1)&&"".equals(text2)&&"".equals(text3)&&flag){
				List<rukuInfo> list=dao.getInfoBySQL(sql+"rkdate>'"+text1+"'");
				String[] title = { "���Ʊ��", "��Ʒ���", "��Ʒ����", "���", "����", "����", "���", "����Ա",
						"������", "�ͻ�ȫ��", "���㷽ʽ", "��Ӧ��ȫ��", "�������" };
				model = new DefaultTableModel(title, 0);
				for(rukuInfo info:list){
					Object[] o = { info.getRkph(), info.getXhbh(), info.getSpmc(),
							info.getGg(), info.getPiece(), info.getRkNum(),
							info.getRkMoney(), info.getCzy(), info.getJsr(),
							info.getKhqc(), info.getJsfs(), info.getGys(),
							info.getRkdate()};
					model.addRow(o);
					jTable1.setModel(model);
				}
			}
			//��һ���͵�����TEXTfieldΪ�ա��ڶ�����Ϊ��
			if(!"".equals(text2)&&"".equals(text1)&&"".equals(text3)&&flag){
				List<rukuInfo> list=dao.getInfoBySQL(sql+"rkdate<'"+text1+"'");
				String[] title = { "���Ʊ��", "��Ʒ���", "��Ʒ����", "���", "����", "����", "���", "����Ա",
						"������", "�ͻ�ȫ��", "���㷽ʽ", "��Ӧ��ȫ��", "�������"};
				model = new DefaultTableModel(title, 0);
				for(rukuInfo info:list){
					Object[] o = { info.getRkph(), info.getXhbh(), info.getSpmc(),
							info.getGg(), info.getPiece(), info.getRkNum(),
							info.getRkMoney(), info.getCzy(), info.getJsr(),
							info.getKhqc(), info.getJsfs(), info.getGys(),
							info.getRkdate()};
					model.addRow(o);
					jTable1.setModel(model);
				}	
			}
			//��һ�������ı�������ݲ�Ϊ�գ��ڶ�����Ϊ�գ���ѯ���������ҲΪ��
			if(!"".equals(text1)&&!"".equals(text2)&&"".equals(text3)&&flag){
				List<rukuInfo> list=dao.getInfoBySQL(sql+"rkdate>"+text1+"and rkdate<"+text2);
				String[] title = { "���Ʊ��", "��Ʒ���", "��Ʒ����", "���", "����", "����", "���", "����Ա",
						"������", "�ͻ�ȫ��", "���㷽ʽ", "��Ӧ��ȫ��", "�������"};
				model = new DefaultTableModel(title, 0);
				for(rukuInfo info:list){
					Object[] o = { info.getRkph(), info.getXhbh(), info.getSpmc(),
							info.getGg(), info.getPiece(), info.getRkNum(),
							info.getRkMoney(), info.getCzy(), info.getJsr(),
							info.getKhqc(), info.getJsfs(), info.getGys(),
							info.getRkdate()};
					model.addRow(o);
					jTable1.setModel(model);
				}
			}
			/**
			 * ���������ѡ��Ĳ�ͬ�Ĳ������
			 */
			if(choise1.equals("��Ӧ��ȫ��")){
				if(choise2.equals("����")){
					if(!flag||(flag&&"".equals(text2)&&"".equals(text1))){
						//JCheckbosδѡ��ʱ
						List<rukuInfo> list=dao.getInfoBySQL(sql+"gys='"+text3+"'");
						String[] title = { "���Ʊ��", "��Ʒ���", "��Ʒ����", "���", "����", "����", "���", "����Ա",
								"������", "�ͻ�ȫ��", "���㷽ʽ", "��Ӧ��ȫ��", "�������" };
						model = new DefaultTableModel(title, 0);
						for(rukuInfo info:list){
							Object[] o = {  info.getRkph(), info.getXhbh(), info.getSpmc(),
									info.getGg(), info.getPiece(), info.getRkNum(),
									info.getRkMoney(), info.getCzy(), info.getJsr(),
									info.getKhqc(), info.getJsfs(), info.getGys(),
									info.getRkdate()

							};
							model.addRow(o);
							jTable1.setModel(model);
						}
					}
					if(flag){
						
						//��һ���ı���Ϊ��,�ڶ���Ϊ�գ���������Ϊ��
						if(!"".equals(text1)&&"".equals(text2)&&!"".equals(text3)){
							List<rukuInfo> list=dao.getInfoBySQL(sql+"rkdate>"+text1+"and gys='"+text3+"'");
							String[] title = {"���Ʊ��", "��Ʒ���", "��Ʒ����", "���", "����", "����", "���", "����Ա",
									"������", "�ͻ�ȫ��", "���㷽ʽ", "��Ӧ��ȫ��", "�������" };
							model = new DefaultTableModel(title, 0);
							for(rukuInfo info:list){
								Object[] o = {   info.getRkph(), info.getXhbh(), info.getSpmc(),
										info.getGg(), info.getPiece(), info.getRkNum(),
										info.getRkMoney(), info.getCzy(), info.getJsr(),
										info.getKhqc(), info.getJsfs(), info.getGys(),
										info.getRkdate()};
								model.addRow(o);
								jTable1.setModel(model);
							}
						}
						//��һ���ı���Ϊ�գ��ڶ����͵�������Ϊ��
						if("".equals(text1)&&!"".equals(text2)&&!"".equals(text3)){
							List<rukuInfo> list=dao.getInfoBySQL(sql+"rkdate<"+text2+"and gys='"+text3+"'");
							String[] title = { "���Ʊ��", "��Ʒ���", "��Ʒ����", "���", "����", "����", "���", "����Ա",
									"������", "�ͻ�ȫ��", "���㷽ʽ", "��Ӧ��ȫ��", "�������"};
							model = new DefaultTableModel(title, 0);
							for(rukuInfo info:list){
								Object[] o = { info.getRkph(), info.getXhbh(), info.getSpmc(),
										info.getGg(), info.getPiece(), info.getRkNum(),
										info.getRkMoney(), info.getCzy(), info.getJsr(),
										info.getKhqc(), info.getJsfs(), info.getGys(),
										info.getRkdate()};
								model.addRow(o);
								jTable1.setModel(model);
							}
						}
						//�ı������Ϊ��
						if(!"".equals(text1)&&!"".equals(text2)&&!"".equals(text3)){
							List<rukuInfo> list=dao.getInfoBySQL(sql+"rkdate>"+text1+"and rkdate<"+text2+"and gys='"+text3+"'");
							String[] title = { "���Ʊ��", "��Ʒ���", "��Ʒ����", "���", "����", "����", "���", "����Ա",
									"������", "�ͻ�ȫ��", "���㷽ʽ", "��Ӧ��ȫ��", "�������" };
							model = new DefaultTableModel(title, 0);
							for(rukuInfo info:list){
								Object[] o = {info.getRkph(), info.getXhbh(), info.getSpmc(),
										info.getGg(), info.getPiece(), info.getRkNum(),
										info.getRkMoney(), info.getCzy(), info.getJsr(),
										info.getKhqc(), info.getJsfs(), info.getGys(),
										info.getRkdate()};
								model.addRow(o);
								jTable1.setModel(model);
							}
						}
					}
						
				}
			}
				if(choise2.equals("����")){
					
					if(flag&&(!"".equals(text1)||!"".equals(text2))){
						JOptionPane.showMessageDialog(null, "�ڲ�ѯ��ʽΪ����ʱ���Ե����޶���Ч");
					}
					List<rukuInfo> list=dao.getInfoBySQL(sql+"gys like '%"+text3+"%'");
						String[] title = {  "���Ʊ��", "��Ʒ���", "��Ʒ����", "���", "����", "����", "���", "����Ա",
								"������", "�ͻ�ȫ��", "���㷽ʽ", "��Ӧ��ȫ��", "�������"};
					model = new DefaultTableModel(title, 0);
					for(rukuInfo info:list){
						Object[] o = { info.getRkph(), info.getXhbh(), info.getSpmc(),
								info.getGg(), info.getPiece(), info.getRkNum(),
								info.getRkMoney(), info.getCzy(), info.getJsr(),
								info.getKhqc(), info.getJsfs(), info.getGys(),
								info.getRkdate()};
						model.addRow(o);
						jTable1.setModel(model);
					}
				
				
			}
			if(choise1.equals("��Ʒ����")){
				if(choise2.equals("����")){
					if(!flag||(flag&&"".equals(text2)&&"".equals(text1))){
						
						List<rukuInfo> list=dao.getInfoBySQL(sql+"spmc='"+text3+"'");
						String[] title = { "���Ʊ��", "��Ʒ���", "��Ʒ����", "���", "����", "����", "���", "����Ա",
								"������", "�ͻ�ȫ��", "���㷽ʽ", "��Ӧ��ȫ��", "�������"};
						model = new DefaultTableModel(title, 0);
						for(rukuInfo info:list){
							Object[] o = {info.getRkph(), info.getXhbh(), info.getSpmc(),
									info.getGg(), info.getPiece(), info.getRkNum(),
									info.getRkMoney(), info.getCzy(), info.getJsr(),
									info.getKhqc(), info.getJsfs(), info.getGys(),
									info.getRkdate()

							};
							model.addRow(o);
							jTable1.setModel(model);
						}
					}
					if(flag){
						//**********
						//��һ���ı���Ϊ��,�ڶ���Ϊ�գ���������Ϊ��
						if(!"".equals(text1)&&"".equals(text2)&&!"".equals(text3)){
							List<rukuInfo> list=dao.getInfoBySQL(sql+"rkdate>"+text1+"and spmc='"+text3+"'");
							String[] title = { "���Ʊ��", "��Ʒ���", "��Ʒ����", "���", "����", "����", "���", "����Ա",
									"������", "�ͻ�ȫ��", "���㷽ʽ", "��Ӧ��ȫ��", "�������" };
							model = new DefaultTableModel(title, 0);
							for(rukuInfo info:list){
								Object[] o = { info.getRkph(), info.getXhbh(), info.getSpmc(),
										info.getGg(), info.getPiece(), info.getRkNum(),
										info.getRkMoney(), info.getCzy(), info.getJsr(),
										info.getKhqc(), info.getJsfs(), info.getGys(),
										info.getRkdate()};
								model.addRow(o);
								jTable1.setModel(model);
							}
						}
						//��һ���ı���Ϊ�գ��ڶ����͵�������Ϊ��
						if("".equals(text1)&&!"".equals(text2)&&!"".equals(text3)){
							List<rukuInfo> list=dao.getInfoBySQL(sql+"rkdate<"+text2+"and spmc='"+text3+"'");
							String[] title = {"���Ʊ��", "��Ʒ���", "��Ʒ����", "���", "����", "����", "���", "����Ա",
									"������", "�ͻ�ȫ��", "���㷽ʽ", "��Ӧ��ȫ��", "�������" };
							model = new DefaultTableModel(title, 0);
							for(rukuInfo info:list){
								Object[] o = { info.getRkph(), info.getXhbh(), info.getSpmc(),
										info.getGg(), info.getPiece(), info.getRkNum(),
										info.getRkMoney(), info.getCzy(), info.getJsr(),
										info.getKhqc(), info.getJsfs(), info.getGys(),
										info.getRkdate()};
								model.addRow(o);
								jTable1.setModel(model);
							}
						}
						//�ı������Ϊ��
						if(!"".equals(text1)&&!"".equals(text2)&&!"".equals(text3)){
							List<rukuInfo> list=dao.getInfoBySQL(sql+"rkdate>"+text1+"and rkdate<"+text2+"and spmc='"+text3+"'");
							String[] title = { "���Ʊ��", "��Ʒ���", "��Ʒ����", "���", "����", "����", "���", "����Ա",
									"������", "�ͻ�ȫ��", "���㷽ʽ", "��Ӧ��ȫ��", "�������" };
							model = new DefaultTableModel(title, 0);
							for(rukuInfo info:list){
								Object[] o = { info.getRkph(), info.getXhbh(), info.getSpmc(),
										info.getGg(), info.getPiece(), info.getRkNum(),
										info.getRkMoney(), info.getCzy(), info.getJsr(),
										info.getKhqc(), info.getJsfs(), info.getGys(),
										info.getRkdate()};
								model.addRow(o);
								jTable1.setModel(model);
							}
						}
						//**********
					}
				}
				if(choise2.equals("����")){
					if(flag&&(!"".equals(text1)||!"".equals(text2))){
						JOptionPane.showMessageDialog(null, "�ڲ�ѯ��ʽΪ����ʱ���Ե����޶���Ч");
					}
					List<rukuInfo> list=dao.getInfoBySQL(sql+"spmc like '%"+text3+"%'");
						String[] title = {"���Ʊ��", "��Ʒ���", "��Ʒ����", "���", "����", "����", "���", "����Ա",
								"������", "�ͻ�ȫ��", "���㷽ʽ", "��Ӧ��ȫ��", "�������" };
					model = new DefaultTableModel(title, 0);
					for(rukuInfo info:list){
						Object[] o = {info.getRkph(), info.getXhbh(), info.getSpmc(),
								info.getGg(), info.getPiece(), info.getRkNum(),
								info.getRkMoney(), info.getCzy(), info.getJsr(),
								info.getKhqc(), info.getJsfs(), info.getGys(),
								info.getRkdate()};
						model.addRow(o);
						jTable1.setModel(model);
					}
				}
			}
		}
}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String[] title = { "���Ʊ��", "��Ʒ���", "��Ʒ����", "���", "����", "����", "���",
				"����Ա", "������", "�ͻ�ȫ��", "���㷽ʽ", "��Ӧ��ȫ��", "�������" };
		model = new DefaultTableModel(title, 0);
		ruku_DAO list = new ruku_DAO();

		try {
			List<rukuInfo> uList = list.getAllInfo();
			for (rukuInfo info : uList) {
				Object[] o = { info.getRkph(), info.getXhbh(), info.getSpmc(),
						info.getGg(), info.getPiece(), info.getRkNum(),
						info.getRkMoney(), info.getCzy(), info.getJsr(),
						info.getKhqc(), info.getJsfs(), info.getGys(),
						info.getRkdate() };
				model.addRow(o);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		jTable1.setModel(model);
	}

	/**
	 * @param args the command line arguments
	 */
//	public static void main(String args[]) {
//		java.awt.EventQueue.invokeLater(new Runnable() {
//			public void run() {
////				new rukuchaxun().setVisible(true);
//				new rukuchaxun();
//			}
//		});
//	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JComboBox jComboBox2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	// End of variables declaration//GEN-END:variables

}