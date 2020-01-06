package com.swingsaCase2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DistanceCalculator {

	private JFrame frame;
	private JTextField src;
	private JTextField des;
	private JTextField op;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DistanceCalculator window = new DistanceCalculator();
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
	public DistanceCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 516, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Distance Calculator");
		lblNewLabel.setBounds(209, 25, 131, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Source Location");
		lblNewLabel_1.setBounds(23, 74, 121, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Distance Location");
		lblNewLabel_2.setBounds(23, 115, 121, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Distance covered");
		lblNewLabel_3.setBounds(23, 211, 121, 17);
		frame.getContentPane().add(lblNewLabel_3);
		
		src = new JTextField();
		src.setBounds(184, 71, 86, 20);
		frame.getContentPane().add(src);
		src.setColumns(10);
		
		des = new JTextField();
		des.setBounds(184, 112, 86, 20);
		frame.getContentPane().add(des);
		des.setColumns(10);
		
		op = new JTextField();
		op.setBounds(184, 208, 86, 20);
		frame.getContentPane().add(op);
		op.setColumns(10);
		
		JButton btn_calculate = new JButton("Calculate Distance");
		btn_calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(src.getText().equals("")||src.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please fill all the details");
				}
				else
				{
				double d=57*2.3;
				op.setText(d+" kms");
				}
				}
			
		});
		btn_calculate.setBounds(140, 158, 175, 23);
		frame.getContentPane().add(btn_calculate);
	}
}
