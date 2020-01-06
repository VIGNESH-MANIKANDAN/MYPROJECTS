package com.swingsaCase2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DiscountCalculator {

	private JFrame frame;
	private JTextField pmat;
	private JTextField dper;
	private JTextField net;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiscountCalculator window = new DiscountCalculator();
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
	public DiscountCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPrincipalAmount = new JLabel("PRINCIPAL AMOUNT");
		lblPrincipalAmount.setBounds(22, 56, 156, 14);
		frame.getContentPane().add(lblPrincipalAmount);
		
		pmat = new JTextField();
		pmat.setColumns(10);
		pmat.setBounds(218, 53, 86, 20);
		frame.getContentPane().add(pmat);
		
		dper = new JTextField();
		dper.setColumns(10);
		dper.setBounds(218, 84, 86, 20);
		frame.getContentPane().add(dper);
		
		JLabel lblDiscountPercentage = new JLabel("DISCOUNT PERCENTAGE");
		lblDiscountPercentage.setBounds(22, 87, 156, 14);
		frame.getContentPane().add(lblDiscountPercentage);
		
		JButton btnCalculate = new JButton("CALCULATE");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(pmat.getText().equals("")||dper.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please fill all the details");
				}
				else
				{
				int d,pamt1,dper1;
				pamt1=Integer.parseInt(pmat.getText());
				dper1=Integer.parseInt(dper.getText());
				d=pamt1-((pamt1/100)*dper1);
				
				net.setText(String.valueOf(d));
				
				}
				}
				
				
				
				
			
		});
		btnCalculate.setBounds(205, 116, 106, 23);
		frame.getContentPane().add(btnCalculate);
		
		JLabel lblNetPrice = new JLabel("NET PRICE");
		lblNetPrice.setBounds(22, 168, 121, 17);
		frame.getContentPane().add(lblNetPrice);
		
		net = new JTextField();
		net.setColumns(10);
		net.setBounds(218, 166, 86, 20);
		frame.getContentPane().add(net);
		
		JLabel lblNewLabel = new JLabel("DISCOUNT CALCULATOR");
		lblNewLabel.setBounds(151, 22, 128, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("RS");
		lblNewLabel_1.setBounds(319, 56, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("%");
		lblNewLabel_2.setBounds(319, 87, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("RS");
		lblNewLabel_3.setBounds(319, 169, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
	}

}
