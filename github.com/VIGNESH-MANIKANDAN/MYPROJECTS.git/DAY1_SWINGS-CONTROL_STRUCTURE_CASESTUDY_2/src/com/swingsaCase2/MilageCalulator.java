package com.swingsaCase2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MilageCalulator {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MilageCalulator window = new MilageCalulator();
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
	public MilageCalulator() {
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
		
		JLabel lblDistanceCoveredIn = new JLabel("Distance covered in Km");
		lblDistanceCoveredIn.setBounds(55, 72, 156, 14);
		frame.getContentPane().add(lblDistanceCoveredIn);
		
		JLabel lblPetrolConsumedInmltr = new JLabel("Petrol Consumed in ltr");
		lblPetrolConsumedInmltr.setBounds(55, 103, 156, 14);
		frame.getContentPane().add(lblPetrolConsumedInmltr);
		
		t1 = new JTextField();
		t1.setColumns(10);
		t1.setBounds(251, 69, 86, 20);
		frame.getContentPane().add(t1);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(251, 100, 86, 20);
		frame.getContentPane().add(t2);
		
		JButton buttonCalulate = new JButton("CALCULATE");
		buttonCalulate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int t11,t22,ans;
				if(t1.getText().equals("")||t2.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please fill all the details");
				}
				else
				{
				t11=Integer.parseInt(t1.getText());
				t22=Integer.parseInt(t2.getText());
				ans=t11/t22;
				t3.setText(String.valueOf(ans));
				}
			}
		});
		buttonCalulate.setBounds(238, 132, 106, 23);
		frame.getContentPane().add(buttonCalulate);
		
		JLabel lblMilagePerLtr = new JLabel("Milage per ltr");
		lblMilagePerLtr.setBounds(55, 176, 156, 14);
		frame.getContentPane().add(lblMilagePerLtr);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(251, 173, 86, 20);
		frame.getContentPane().add(t3);
	}

}
