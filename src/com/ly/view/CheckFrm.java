/*
 * InputFrm.java
 *
 * Created on __DATE__, __TIME__
 */

package com.ly.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JOptionPane;

import com.ly.bean.FleetTableBean;
import com.ly.bean.User;
import com.ly.service.FleetTableSV;
import com.ly.util.DateChooser;

/**
 *
 * @author  __USER__
 */
public class CheckFrm extends javax.swing.JInternalFrame {

	private User loginUser;
	private FleetTableBean oldFleetTableBean;
	private String actionFlag;
	/** Creates new form InputFrm */
	public CheckFrm() {
		initComponents();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((dim.width - this.getWidth()) / 2,(dim.height - this.getHeight()) / 2);
	}
	/*±£´æÓÃ»§µÇÂ¼ÐÅÏ¢µÄ¹¹Ôì·½·¨*/
	public CheckFrm(User loginUser) {
		this.loginUser = loginUser;
		initComponents();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((dim.width - this.getWidth()) / 2,(dim.height - this.getHeight()) / 2);
	}
	
	public CheckFrm(FleetTableBean oldFleetTableBean){
		this.oldFleetTableBean = oldFleetTableBean;
		initComponents();
		FleetTableSV fleetTableSV = new FleetTableSV();
		if(oldFleetTableBean!=null){
			caridTextField.setText(fleetTableSV.show2User(oldFleetTableBean.getCarid()));
			carincomeTextField.setText(fleetTableSV.show2User(oldFleetTableBean.getCarincome()+""));
			driverTextField.setText(fleetTableSV.show2User(oldFleetTableBean.getDriver()));
			drivingcostTextField.setText(fleetTableSV.show2User(oldFleetTableBean.getDrivingcost()+""));
			enddateTextField.setText(fleetTableSV.show2User(oldFleetTableBean.getEnddate()));
			idealguaranteeTextField.setText(fleetTableSV.show2User(oldFleetTableBean.getIdealguarantee()+""));
			idealincomeTextField.setText(fleetTableSV.show2User(oldFleetTableBean.getIdealincome()+""));
			netpayTextField.setText(fleetTableSV.show2User(oldFleetTableBean.getNetpay()+""));
			netprofitTextField.setText(fleetTableSV.show2User(oldFleetTableBean.getNetprofit()+""));
			otherTextField.setText(fleetTableSV.show2User(oldFleetTableBean.getOther()));
			petrolcostTextField.setText(fleetTableSV.show2User(oldFleetTableBean.getPetrolcost()+""));
			realguaranteeTextField.setText(fleetTableSV.show2User(oldFleetTableBean.getRealguarantee()+""));
			realincomeTextField.setText(fleetTableSV.show2User(oldFleetTableBean.getRealincome()+""));
			rebateTextField.setText(fleetTableSV.show2User(oldFleetTableBean.getRebate()+""));
			startdateTextField.setText(fleetTableSV.show2User(oldFleetTableBean.getStartdate()));
			teamtypeTextField.setText(fleetTableSV.show2User(oldFleetTableBean.getTeamtype()));
			tripTextField.setText(fleetTableSV.show2User(oldFleetTableBean.getTrip()));
		}
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		caridLabel = new javax.swing.JLabel();
		caridTextField = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		driverTextField = new javax.swing.JTextField();
		startdateLabel = new javax.swing.JLabel();
		startdateTextField = new javax.swing.JTextField();
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		dateChooser1.register(startdateTextField);
		jLabel2 = new javax.swing.JLabel();
		enddateTextField = new javax.swing.JTextField();
		DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");
		dateChooser2.register(enddateTextField);
		teamtypeLabel = new javax.swing.JLabel();
		teamtypeTextField = new javax.swing.JTextField();
		tripLabel = new javax.swing.JLabel();
		tripTextField = new javax.swing.JTextField();
		jSeparator1 = new javax.swing.JSeparator();
		carincomeLabel = new javax.swing.JLabel();
		carincomeTextField = new javax.swing.JTextField();
		netpayLabel = new javax.swing.JLabel();
		netpayTextField = new javax.swing.JTextField();
		idealincomeLabel = new javax.swing.JLabel();
		idealincomeTextField = new javax.swing.JTextField();
		realincomeLabel = new javax.swing.JLabel();
		realincomeTextField = new javax.swing.JTextField();
		idealguaranteeLabel = new javax.swing.JLabel();
		idealguaranteeTextField = new javax.swing.JTextField();
		realguaranteeLabel = new javax.swing.JLabel();
		realguaranteeTextField = new javax.swing.JTextField();
		jSeparator2 = new javax.swing.JSeparator();
		petrolcostLabel = new javax.swing.JLabel();
		petrolcostTextField = new javax.swing.JTextField();
		drivingcostLabel = new javax.swing.JLabel();
		drivingcostTextField = new javax.swing.JTextField();
		otherLabel = new javax.swing.JLabel();
		otherTextField = new javax.swing.JTextField();
		jSeparator3 = new javax.swing.JSeparator();
		rebateLabel = new javax.swing.JLabel();
		rebateTextField = new javax.swing.JTextField();
		netprofitLabel = new javax.swing.JLabel();
		netprofitTextField = new javax.swing.JTextField();
//		/*È¨ÏÞÅÐ¶Ï£¬ºóÇÚ²»ÏÔÊ¾·µÀû¡¢¾»ÀûÈó±êÇ©ºÍÊäÈë¿ò*/
//		if(loginUser!=null && "ºóÇÚ".equals(loginUser.getLevel())){
//			rebateLabel.setVisible(false);
//			rebateTextField.setVisible(false);
//			netprofitLabel.setVisible(false);
//			netprofitTextField.setVisible(false);
//		}
		submitButton = new javax.swing.JButton();
		resetButton = new javax.swing.JButton();

		setClosable(true);
		setIconifiable(true);
		setMaximizable(true);
		setTitle("\u6570\u636e\u5f55\u5165");
		setAlignmentX(10);
		setAlignmentY(10);

		caridLabel.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 16));
		caridLabel.setText("\u8f66\u53f7");

		caridTextField.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				caridTextFieldActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 16));
		jLabel1.setText("\u53f8\u673a");

		startdateLabel.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 16));
		startdateLabel.setText("\u51fa\u56e2\u65e5\u671f");

		startdateTextField.setText("\u5355\u51fb\u9009\u62e9\u65e5\u671f");

		jLabel2.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 16));
		jLabel2.setText("\u81f3");

		enddateTextField.setText("\u5355\u51fb\u9009\u62e9\u65e5\u671f");

		teamtypeLabel.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 16));
		teamtypeLabel.setText("\u56e2\u961f\u6027\u8d28");

		tripLabel.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 16));
		tripLabel.setText("\u884c\u7a0b");

		carincomeLabel.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 16));
		carincomeLabel.setText("\u8f66\u8d39");

		netpayLabel.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 16));
		netpayLabel.setText("\u7f51\u4ed8");

		idealincomeLabel.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 16));
		idealincomeLabel.setText("\u73b0\u6536");

		realincomeLabel.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 16));
		realincomeLabel.setText("\u5b9e\u9645\u73b0\u6536");

		idealguaranteeLabel.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 16));
		idealguaranteeLabel.setText("\u4fdd\u5e95");

		realguaranteeLabel.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 16));
		realguaranteeLabel.setText("\u5b9e\u6536\u4fdd\u5e95");

		petrolcostLabel.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 16));
		petrolcostLabel.setText("\u516c\u53f8\u52a0\u6cb9");

		drivingcostLabel.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 16));
		drivingcostLabel.setText("\u884c\u8f66\u8d39\u7528");

		otherLabel.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 16));
		otherLabel.setText("\u5176\u4ed6");

		rebateLabel.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 16));
		rebateLabel.setText("\u8fd4\u5229");

		rebateTextField.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 16));

		netprofitLabel.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 16));
		netprofitLabel.setText("\u51c0\u5229\u6da6");

		submitButton.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 1, 16));
		submitButton.setText("ÉóºËÍ¨¹ý");
		submitButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				submitButtonActionPerformed(evt);
			}
		});

		resetButton.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 1, 16));
		resetButton.setText("\u91cd\u7f6e");
		resetButton.setVisible(false);
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jSeparator3,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				382,
																				Short.MAX_VALUE))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												false)
																										.addGroup(
																												layout
																														.createSequentialGroup()
																														.addGroup(
																																layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.TRAILING)
																																		.addComponent(
																																				startdateLabel)
																																		.addComponent(
																																				caridLabel))
																														.addGap(
																																18,
																																18,
																																18)
																														.addGroup(
																																layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING,
																																				false)
																																		.addComponent(
																																				caridTextField,
																																				javax.swing.GroupLayout.Alignment.TRAILING)
																																		.addComponent(
																																				startdateTextField,
																																				javax.swing.GroupLayout.Alignment.TRAILING,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				94,
																																				Short.MAX_VALUE))
																														.addGroup(
																																layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addGroup(
																																				layout
																																						.createSequentialGroup()
																																						.addGap(
																																								18,
																																								18,
																																								18)
																																						.addComponent(
																																								jLabel2))
																																		.addGroup(
																																				javax.swing.GroupLayout.Alignment.TRAILING,
																																				layout
																																						.createSequentialGroup()
																																						.addGap(
																																								18,
																																								18,
																																								18)
																																						.addComponent(
																																								jLabel1)))
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addGroup(
																																layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING,
																																				false)
																																		.addComponent(
																																				driverTextField)
																																		.addComponent(
																																				enddateTextField,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				103,
																																				Short.MAX_VALUE)))
																										.addGroup(
																												layout
																														.createSequentialGroup()
																														.addGroup(
																																layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.TRAILING)
																																		.addComponent(
																																				tripLabel)
																																		.addComponent(
																																				teamtypeLabel))
																														.addGap(
																																18,
																																18,
																																18)
																														.addGroup(
																																layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addComponent(
																																				tripTextField,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				252,
																																				Short.MAX_VALUE)
																																		.addComponent(
																																				teamtypeTextField))))
																						.addComponent(
																								jSeparator1,
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								382,
																								Short.MAX_VALUE)))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				30,
																				30,
																				30)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								idealincomeLabel)
																						.addComponent(
																								carincomeLabel)
																						.addComponent(
																								idealguaranteeLabel))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								idealguaranteeTextField)
																						.addComponent(
																								idealincomeTextField)
																						.addComponent(
																								carincomeTextField,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								94,
																								Short.MAX_VALUE))
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGap(
																												47,
																												47,
																												47)
																										.addComponent(
																												netpayLabel)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												netpayTextField,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												104,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGap(
																												18,
																												18,
																												18)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				realguaranteeLabel)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																		.addComponent(
																																				realguaranteeTextField,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				101,
																																				Short.MAX_VALUE))
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				realincomeLabel)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																		.addComponent(
																																				realincomeTextField)))))
																		.addGap(
																				10,
																				10,
																				10))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jSeparator2,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								382,
																								Short.MAX_VALUE)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																otherLabel)
																														.addComponent(
																																petrolcostLabel))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																false)
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				petrolcostTextField,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				79,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addGap(
																																				18,
																																				18,
																																				18)
																																		.addComponent(
																																				drivingcostLabel)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																		.addComponent(
																																				drivingcostTextField,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				102,
																																				javax.swing.GroupLayout.PREFERRED_SIZE))
																														.addComponent(
																																otherTextField)))))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				41,
																				41,
																				41)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								resetButton)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												rebateLabel)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												rebateTextField,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												56,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(
																												62,
																												62,
																												62)
																										.addComponent(
																												netprofitLabel)))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				netprofitTextField,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				53,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()).addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addContainerGap(
										297, Short.MAX_VALUE).addComponent(
										submitButton).addGap(44, 44, 44)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																caridLabel)
														.addComponent(
																driverTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																caridTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																startdateLabel)
														.addComponent(
																startdateTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2)
														.addComponent(
																enddateTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																teamtypeLabel)
														.addComponent(
																teamtypeTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(tripLabel)
														.addComponent(
																tripTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addComponent(
												jSeparator1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												10,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																carincomeLabel)
														.addComponent(
																carincomeTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																netpayTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																netpayLabel))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																idealincomeLabel)
														.addComponent(
																idealincomeTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																realincomeLabel)
														.addComponent(
																realincomeTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																idealguaranteeLabel)
														.addComponent(
																idealguaranteeTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																realguaranteeLabel)
														.addComponent(
																realguaranteeTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jSeparator2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												10,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																petrolcostLabel)
														.addComponent(
																petrolcostTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																drivingcostLabel)
														.addComponent(
																drivingcostTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																otherLabel)
														.addComponent(
																otherTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addComponent(
												jSeparator3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												10,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				rebateLabel)
																		.addComponent(
																				rebateTextField,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				22,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								netprofitTextField,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								netprofitLabel))
																		.addGap(
																				18,
																				18,
																				18)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								submitButton)
																						.addComponent(
																								resetButton))))
										.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {
		/*µ÷ÓÃservice²ã*/
		FleetTableSV fleetTableSV = new FleetTableSV();
		try{
			fleetTableSV.checkPass(oldFleetTableBean.getId());
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Ê§°Ü", "Ê§°Ü", 0);
		}
		JOptionPane.showMessageDialog(null, "³É¹¦", "¸üÐÂ³É¹¦", 0);	
	}

	private void caridTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel caridLabel;
	private javax.swing.JTextField caridTextField;
	private javax.swing.JLabel carincomeLabel;
	private javax.swing.JTextField carincomeTextField;
	private javax.swing.JTextField driverTextField;
	private javax.swing.JLabel drivingcostLabel;
	private javax.swing.JTextField drivingcostTextField;
	private javax.swing.JTextField enddateTextField;
	private javax.swing.JLabel idealguaranteeLabel;
	private javax.swing.JTextField idealguaranteeTextField;
	private javax.swing.JLabel idealincomeLabel;
	private javax.swing.JTextField idealincomeTextField;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JSeparator jSeparator3;
	private javax.swing.JLabel netpayLabel;
	private javax.swing.JTextField netpayTextField;
	private javax.swing.JLabel netprofitLabel;
	private javax.swing.JTextField netprofitTextField;
	private javax.swing.JLabel otherLabel;
	private javax.swing.JTextField otherTextField;
	private javax.swing.JLabel petrolcostLabel;
	private javax.swing.JTextField petrolcostTextField;
	private javax.swing.JLabel realguaranteeLabel;
	private javax.swing.JTextField realguaranteeTextField;
	private javax.swing.JLabel realincomeLabel;
	private javax.swing.JTextField realincomeTextField;
	private javax.swing.JLabel rebateLabel;
	private javax.swing.JTextField rebateTextField;
	private javax.swing.JButton resetButton;
	private javax.swing.JLabel startdateLabel;
	private javax.swing.JTextField startdateTextField;
	private javax.swing.JButton submitButton;
	private javax.swing.JLabel teamtypeLabel;
	private javax.swing.JTextField teamtypeTextField;
	private javax.swing.JLabel tripLabel;
	private javax.swing.JTextField tripTextField;
	// End of variables declaration//GEN-END:variables
}