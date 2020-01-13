package com.checkboxes;

import java.awt.EventQueue;
import java.util.Calendar;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyCheckbox {

	private JFrame frame;
	private JTextField sname;
	private JTextField sname2;
	private int sn1,sn2,dob11,dob22;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCheckbox window = new MyCheckbox();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyCheckbox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOOKING DETAILS");
		lblNewLabel.setBounds(323, 64, 191, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("BOOKING DETAILS");
		label.setBounds(36, 64, 191, 14);
		frame.getContentPane().add(label);
		
		JLabel lblBookingTickets = new JLabel("BOOKING TICKETS");
		lblBookingTickets.setBounds(323, 25, 105, 14);
		frame.getContentPane().add(lblBookingTickets);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 89, 83, 145);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JCheckBox ch1 = new JCheckBox("");
		ch1.setBounds(18, 5, 21, 21);
		panel.add(ch1);
		
		JCheckBox ch2 = new JCheckBox("");
		ch2.setBounds(44, 5, 21, 21);
		panel.add(ch2);
		
		JCheckBox ch4 = new JCheckBox("");
		ch4.setBounds(44, 29, 21, 21);
		panel.add(ch4);
		
		JCheckBox ch3 = new JCheckBox("");
		ch3.setBounds(18, 29, 21, 21);
		panel.add(ch3);
		
		JCheckBox ch6 = new JCheckBox("");
		ch6.setBounds(44, 53, 21, 21);
		panel.add(ch6);
		
		JCheckBox ch5 = new JCheckBox("");
		ch5.setBounds(18, 53, 21, 21);
		panel.add(ch5);
		
		JCheckBox ch8 = new JCheckBox("");
		ch8.setBounds(44, 77, 21, 21);
		panel.add(ch8);
		
		JCheckBox ch7 = new JCheckBox("");
		ch7.setBounds(18, 77, 21, 21);
		panel.add(ch7);
		
		JCheckBox ch10 = new JCheckBox("");
		ch10.setBounds(44, 102, 21, 21);
		panel.add(ch10);
		
		JCheckBox ch9 = new JCheckBox("");
		ch9.setBounds(18, 102, 21, 21);
		panel.add(ch9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(23, 245, 177, 24);
		frame.getContentPane().add(panel_1);
		
		JCheckBox a1 = new JCheckBox("");
		panel_1.add(a1);
		
		JCheckBox a2 = new JCheckBox("");
		panel_1.add(a2);
		
		JCheckBox a3 = new JCheckBox("");
		panel_1.add(a3);
		
		JCheckBox a4 = new JCheckBox("");
		panel_1.add(a4);
		
		JCheckBox a5 = new JCheckBox("");
		panel_1.add(a5);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		panel_1.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("New check box");
		panel_1.add(chckbxNewCheckBox_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(116, 89, 84, 145);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JCheckBox ch11 = new JCheckBox("");
		ch11.setBounds(17, 7, 21, 21);
		panel_2.add(ch11);
		
		JCheckBox ch12 = new JCheckBox("");
		ch12.setBounds(43, 7, 21, 21);
		panel_2.add(ch12);
		
		JCheckBox ch13 = new JCheckBox("");
		ch13.setBounds(17, 31, 21, 21);
		panel_2.add(ch13);
		
		JCheckBox ch14 = new JCheckBox("");
		ch14.setBounds(43, 31, 21, 21);
		panel_2.add(ch14);
		
		JCheckBox ch15 = new JCheckBox("");
		ch15.setBounds(17, 55, 21, 21);
		panel_2.add(ch15);
		
		JCheckBox ch16 = new JCheckBox("");
		ch16.setBounds(43, 55, 21, 21);
		panel_2.add(ch16);
		
		JCheckBox ch17 = new JCheckBox("");
		ch17.setBounds(17, 79, 21, 21);
		panel_2.add(ch17);
		
		JCheckBox ch18 = new JCheckBox("");
		ch18.setBounds(43, 79, 21, 21);
		panel_2.add(ch18);
		
		JCheckBox ch20 = new JCheckBox("");
		ch20.setBounds(43, 104, 21, 21);
		panel_2.add(ch20);
		
		JCheckBox ch19 = new JCheckBox("");
		ch19.setBounds(17, 104, 21, 21);
		panel_2.add(ch19);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(256, 89, 172, 127);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setBounds(10, 11, 46, 14);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setBounds(10, 36, 46, 14);
		panel_3.add(lblDob);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("PHYSICALLY DISABLED");
		chckbxNewCheckBox_9.setBounds(6, 57, 160, 23);
		panel_3.add(chckbxNewCheckBox_9);
		
		JLabel seat1 = new JLabel("SEAT NO 1");
		seat1.setBounds(16, 89, 77, 14);
		panel_3.add(seat1);
		
		sname = new JTextField();
		sname.setBounds(76, 8, 86, 20);
		panel_3.add(sname);
		sname.setColumns(10);
		
		JDateChooser dob = new JDateChooser();
		dob.setBounds(75, 36, 91, 20);
		panel_3.add(dob);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(491, 88, 217, 251);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblCost = new JLabel("COST");
		lblCost.setBounds(10, 11, 46, 14);
		panel_5.add(lblCost);
		
		JLabel tcost = new JLabel("750.00");
		tcost.setBounds(84, 11, 46, 14);
		panel_5.add(tcost);
		
		JLabel lblRs = new JLabel("RS");
		lblRs.setBounds(140, 11, 46, 14);
		panel_5.add(lblRs);
		
		JLabel lblNos = new JLabel("NOS");
		lblNos.setBounds(10, 50, 46, 14);
		panel_5.add(lblNos);
		
		JLabel tno = new JLabel("2");
		tno.setBounds(84, 50, 46, 14);
		panel_5.add(tno);
		
		JLabel lblTotal = new JLabel("TOTAL");
		lblTotal.setBounds(10, 98, 46, 14);
		panel_5.add(lblTotal);
		
		JLabel total = new JLabel("1500.00");
		total.setBounds(84, 98, 46, 14);
		panel_5.add(total);
		
		JLabel lblRs_1 = new JLabel("RS");
		lblRs_1.setBounds(140, 98, 46, 14);
		panel_5.add(lblRs_1);
		
		JLabel lblDiscount = new JLabel("DISCOUNT");
		lblDiscount.setBounds(10, 123, 54, 14);
		panel_5.add(lblDiscount);
		
		JLabel damt = new JLabel("-400.00");
		damt.setBounds(84, 123, 46, 14);
		panel_5.add(damt);
		
		JLabel lblRs_2 = new JLabel("RS");
		lblRs_2.setBounds(140, 123, 46, 14);
		panel_5.add(lblRs_2);
		
		JLabel lblGst = new JLabel("GST");
		lblGst.setBackground(Color.YELLOW);
		lblGst.setBounds(10, 148, 46, 14);
		panel_5.add(lblGst);
		
		JLabel gstamt = new JLabel("+150.00");
		gstamt.setBounds(84, 148, 46, 14);
		panel_5.add(gstamt);
		
		JLabel lblRs_3 = new JLabel("RS");
		lblRs_3.setBounds(140, 148, 46, 14);
		panel_5.add(lblRs_3);
		
		JButton btnNewButton = new JButton("PRINT");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) 
			{
				if(ch1.isSelected() || ch2.isSelected())
				{
					ch1.setSelected(true);
					ch2.setSelected(true);
					sn1=1;
					sn2=2;
				}
				else if(ch3.isSelected() || ch4.isSelected())
				{
					ch3.setSelected(true);
					ch4.setSelected(true);
					sn1=3;
					sn2=4;
				} 
				else if(ch5.isSelected() || ch6.isSelected())
				{
					ch5.setSelected(true);
					ch6.setSelected(true);
					sn1=5;
					sn2=6;
				} 
				else if(ch7.isSelected() || ch8.isSelected())
				{
					ch7.setSelected(true);
					ch8.setSelected(true);
					sn1=7;
					sn2=8;
				} 
				else if(ch9.isSelected() || ch10.isSelected())
				{
					ch9.setSelected(true);
					ch10.setSelected(true);
					sn1=9;
					sn2=10;
				} 
				else if(ch11.isSelected() || ch12.isSelected())
				{
					ch11.setSelected(true);
					ch12.setSelected(true);
					sn1=11;
					sn2=12;
				} 
				else if(ch13.isSelected() || ch14.isSelected())
				{
					ch13.setSelected(true);
					ch14.setSelected(true);
					sn1=13;
					sn2=14;
				} 
				else if(ch15.isSelected() || ch16.isSelected())
				{
					ch15.setSelected(true);
					ch16.setSelected(true);
					sn1=15;
					sn2=16;
				} 
				else if(ch17.isSelected() || ch18.isSelected())
				{
					ch17.setSelected(true);
					ch18.setSelected(true);
					sn1=17;
					sn2=18;
				} 
				else if(ch19.isSelected() || ch20.isSelected())
				{
					ch3.setSelected(true);
					ch4.setSelected(true);
					sn1=19;
					sn2=20;
				} 
               dob11=2020 - dob.getDate().getYear();
               dob22=2020-dob.getDate().getYear();
               int total=0;
               if(dob11>3 && dob11<=70)
            	   total=total+200;
               if(dob22>3 && dob22<=70)
            	   total=total+200;
               
               seat1.setText("SEAT NO "+sn1);
              
               //lblNewLabel_2.setText("Hai hellow") 
               
               
			}
		});
		btnNewButton.setBounds(74, 217, 89, 23);
		panel_5.add(btnNewButton);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(256, 227, 172, 112);
		frame.getContentPane().add(panel_4);
		
		JLabel label_1 = new JLabel("NAME");
		label_1.setBounds(10, 11, 46, 14);
		panel_4.add(label_1);
		
		JLabel label_2 = new JLabel("DOB");
		label_2.setBounds(10, 36, 46, 14);
		panel_4.add(label_2);
		
		JCheckBox checkBox_18 = new JCheckBox("PHYSICALLY DISABLED");
		checkBox_18.setBounds(6, 57, 160, 23);
		panel_4.add(checkBox_18);
		
		sname2 = new JTextField();
		sname2.setColumns(10);
		sname2.setBounds(76, 8, 86, 20);
		panel_4.add(sname2);
		
		JDateChooser dob2 = new JDateChooser();
		dob2.setBounds(75, 36, 91, 20);
		panel_4.add(dob2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(31, 87, 46, 14);
		panel_4.add(lblNewLabel_2);
		frame.setBounds(100, 100, 839, 388);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
