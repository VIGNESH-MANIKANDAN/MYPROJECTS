package SwingControl.Player;

import java.text.DateFormat;
//import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
public class ControlFrame extends JFrame {
	private String sa,sb,sfrom,sto,mdate;
	private String date[];
	private String pname[];
	private String aadnum;
  private String gender[];                 
  private JTextArea ma;
  private JDateChooser dateChooser;
  private JRadioButton m ;
  private JRadioButton f; 
  private JButton p ;
  private int conve[], age[];
  private float sum=0;
  private float[] cost;
  private int num,i=0,age2;
  private String[] odate;
  private String[] adate;
  
	public void controlfun(String s1,String s2,String s3,String s4,String date1) throws HeadlessException {
		//super();
		this.sa=s1;      //seat class
		this.sb=s2;
		this.sfrom=s3;                                             
		this.sto=s4;
		this.mdate=date1;
		String[] adate=this.mdate.split("-");
		age2=Integer.parseInt(adate[0]);       
	}
  public void ControlFrame() {
  	
		num=Integer.parseInt(sb);
		
		
			 pname[i]=n.getText();
			 aadnum=an.getText();
			DateFormat df=new SimpleDateFormat("yyyy-mm-dd");
			date[i]=df.format(dateChooser.getDate());
			String sub=date[i];
			String[] odate=sub.split("-");
		
			
				conve[i]=Integer.parseInt(odate[0]);        
			
			if(m.isSelected())
			{
				gender[i]="M";
			}
			else
			{
				gender[i]="F";
			}
			
			
		}
 
private JPanel contentPane;
	private JTextField n;
	private JTextField an;
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControlFrame frame = new ControlFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ControlFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 867, 788);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("NAME");
		label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label.setBounds(156, 99, 53, 14);
		contentPane.add(label);
		
		n = new JTextField();
		n.setColumns(10);
		n.setBounds(302, 97, 112, 20);
		contentPane.add(n);
		
		JLabel label_1 = new JLabel("AADHAR NUM");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1.setBounds(151, 142, 118, 14);
		contentPane.add(label_1);
		
		an = new JTextField();
		an.setColumns(10);
		an.setBounds(302, 140, 112, 20);
		contentPane.add(an);
		
		JLabel label_2 = new JLabel("DOB");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_2.setBounds(156, 181, 46, 14);
		contentPane.add(label_2);
		
		 dateChooser = new JDateChooser();
		dateChooser.setBounds(304, 181, 110, 20);
		contentPane.add(dateChooser);
		
		JLabel label_3 = new JLabel("GENDER");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_3.setBounds(156, 211, 64, 14);
		contentPane.add(label_3);
		
		m = new JRadioButton("Male");
		m.setBackground(Color.GRAY);
		buttonGroup_1.add(m);
		m.setBounds(290, 208, 53, 23);
		contentPane.add(m);
		
		f = new JRadioButton("Female");
		f.setBackground(Color.GRAY);
		buttonGroup_1.add(f);
		f.setBounds(350, 208, 64, 23);
		contentPane.add(f);
		
		
		
		JButton ap = new JButton("ADD PASSENGER");
		ap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControlFrame();
				
				
				
					n.setText("");
					an.setText("");
					dateChooser.setCalendar(null);
					m.setSelected(false);
					f.setSelected(false);
					n.setFocusable(true);
					
				
				i++;
				
			     if(i>=num)
			     {
			    	 ap.setEnabled(false);
			    	 p.setEnabled(true);
			     }
			     
			     }
				
			
		});
		ap.setFont(new Font("Times New Roman", Font.BOLD, 13));
		ap.setBackground(SystemColor.textHighlight);
		ap.setBounds(148, 236, 142, 23);
		contentPane.add(ap);
		
	     p = new JButton("PRINT BILL");
		p.setEnabled(false);
		p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//cost=Float.parseFloat(ma.getText());
				ma.setText("===================================================================================\n"
						+ "\t\t  "+"BOOKING DETAILS"+"\t"+"\n\n"
				       +    
						"NAME"+"\t"+"AGE WITH GENDER"+"\t"+"CLASS"+"\t"+"SEAT NO"+"\t"+"COST OF TICKET INCLUDING TAX"+
				       "\n\n===================================================================================\n\n"
					);
				
			
				String price="200.00";
				
				for(int j=0;j<num;j++)
				{
					cost[j]=Float.parseFloat(price);
					age[j]=(conve[j]-age2);
					
					ma.setText(ma.getText()+"\n\n"+pname[j]+"\t     "+(-age[j])+" "+gender[j]+"\t\t"+sa+"\t");
					if(sa.equals("Sleeper"))
					ma.setText(ma.getText()+"   SL"+(j+1)+"\t        "+price);
					else if(sa.equals("Seater"))
					{
						ma.setText(ma.getText()+"   SE"+(j+1)+"\t        "+price);
					}
					else if(sa.equals("Semi-Sleeper"))
					{
						ma.setText(ma.getText()+"   SESL"+(j+1)+"\t        "+price);
					}
					
				}
				
				
				
				
				
			}
		});
		p.setFont(new Font("Times New Roman", Font.BOLD, 13));
		p.setBackground(SystemColor.textHighlight);
		p.setBounds(304, 238, 103, 23);
		contentPane.add(p);
		
		JLabel label_4 = new JLabel("PASSENGER DETAILS");
		label_4.setForeground(SystemColor.inactiveCaptionBorder);
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		label_4.setBounds(171, 72, 185, 14);
		contentPane.add(label_4);
		
		table = new JTable();
		table.setBackground(Color.GRAY);
		table.setBounds(104, 32, 329, 249);
		contentPane.add(table);
		
		 ma = new JTextArea();
		ma.setBounds(64, 292, 704, 280);
		contentPane.add(ma);
		
		JButton print = new JButton("PRINT RECEIPT");
		print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<num;i++)
				{
				sum=sum+cost[i];
				}
				ma.setText(ma.getText()+"\n===================================================================================\n");
				ma.setText(ma.getText()+"\n\n\t\t\t\t\t"+"TOTAL Cost   "+sum);
				ma.setText(ma.getText()+"\n===================================================================================\n");
			}
		});
		print.setFont(new Font("Tahoma", Font.BOLD, 11));
		print.setBounds(323, 583, 133, 23);
		contentPane.add(print);
		 pname=new String[100];
		 date=new String[100];
		 gender=new String[100];
		 conve=new int[100];
		 adate=new String[100];
		 odate=new String[100];
		 age=new int[100];
		 cost=new float[100];

		
	}
}
