package SwingControl.Player;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;


public class Appmain extends JFrame {



		private JFrame frame;
		private JTextField from;
		private JTextField to;
		private JTable table;
		private String a;
		private String b,date1;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Appmain window = new Appmain();
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
		public Appmain() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.setBounds(272, -38, 372, 350);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JPanel panel = new JPanel();
			frame.getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel label = new JLabel("BOOK YOUR TRAIN TICKET");
			label.setForeground(SystemColor.inactiveCaptionBorder);
			label.setFont(new Font("Times New Roman", Font.BOLD, 17));
			label.setBounds(51, 24, 226, 14);
			panel.add(label);
			
			JLabel label_1 = new JLabel("FROM");
			label_1.setForeground(Color.BLACK);
			label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
			label_1.setBounds(28, 68, 59, 14);
			panel.add(label_1);
			
			from = new JTextField();
			from.setColumns(10);
			from.setBounds(181, 66, 112, 20);
			panel.add(from);
			
			JLabel label_2 = new JLabel("TO");
			label_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
			label_2.setBounds(28, 99, 46, 14);
			panel.add(label_2);
			
			to = new JTextField();
			to.setColumns(10);
			to.setBounds(181, 97, 112, 20);
			panel.add(to);
			
			JLabel label_3 = new JLabel("DATE");
			label_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
			label_3.setBounds(28, 134, 46, 14);
			panel.add(label_3);
			
			JDateChooser dateChooser = new JDateChooser();
			dateChooser.setBounds(181, 128, 112, 20);
			panel.add(dateChooser);
			
			JLabel label_4 = new JLabel("CLASS");
			label_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
			label_4.setBounds(28, 162, 59, 14);
			panel.add(label_4);
			
			JComboBox cla = new JComboBox();
			cla.addItem("Sleeper");
			cla.addItem("Seater");
			cla.addItem("Semi-Sleeper");
			cla.setSelectedItem(null);
			cla.setEditable(true);
			cla.setBounds(181, 159, 112, 22);
			panel.add(cla);
			
			JLabel label_5 = new JLabel("NO. OF PASSENGER");
			label_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
			label_5.setBounds(28, 195, 159, 14);
			panel.add(label_5);
			
			JComboBox nop = new JComboBox();
			nop.addItem("1");
			nop.addItem("2");
			nop.addItem("3");
			nop.addItem("4");
			nop.addItem("5");
			nop.setSelectedItem(null);
			nop.setEditable(true);
			nop.setBounds(181, 192, 112, 22);
			panel.add(nop);
			
			JButton n = new JButton("NEXT");
			n.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 a=from.getText();
					b=to.getText();
					String c;
					c=(String)cla.getSelectedItem();
					String n;
					n=(String)nop.getSelectedItem();
					DateFormat df=new SimpleDateFormat("yyyy-mm-dd");
				date1=df.format(dateChooser.getDate());
					ControlFrame ct=new ControlFrame();
					ct.controlfun(c,n,a,b,date1);
					ct.setVisible(true);
					frame.dispose();
				}
			});
			n.setFont(new Font("Times New Roman", Font.BOLD, 13));
			n.setBounds(145, 235, 89, 23);
			panel.add(n);
			
			table = new JTable();
			table.setBackground(Color.GRAY);
			table.setBounds(10, 11, 335, 294);
			panel.add(table);
		}
	}

