import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Image;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.imageio.ImageIO;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

import com.sun.jdi.connect.spi.Connection;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Rectangle;

public class Quiz extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_5;
	//private String passwordField;
	private JTextField textField_3;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_2;
	private JTextField textField_4;
	private JPasswordField passwordField_3;
	private Object d;
	private JTable table;
	private JTextField textField_6;
	private JTable table_1;
	private JTable table_1_1;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	DefaultTableModel model,model1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		 
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz frame = new Quiz();
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
	public Quiz() {
		String a;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java quiz","root","Pavishkaa@123");
			Statement sta=con.createStatement();
		//sta.executeUpdate("create table questions(S_no int(4), question varchar(250) ,option_1 varchar(150),option_2 varchar(150),option_3 varchar(150),option_4 varchar(150),ans varchar(10),PRIMARY KEY(question));");
			//sta.executeUpdate("drop table questions;");
		//sta.executeUpdate("create table register(name varchar(14), email varchar(25) , phone_no int(10),username varchar(150),pass varchar(150),gender varchar(10),user_stu int (2),PRIMARY KEY(username));");
			//sta.executeUpdate("drop table register;");
	//sta.executeUpdate("create table student( question varchar(250) ,option_1 varchar(150),option_2 varchar(150),option_3 varchar(150),option_4 varchar(150),answered varchar(10),mark int(2),PRIMARY KEY(question));");
		//sta.executeUpdate("drop table student;");
		String b;
		String a1,a2="enter q",a3="enter d",a4="enter t",a5="enter re";
		String b1;
		String c1;
		// Quiz sd =new  Quiz();
int d=0,aa=0,i1=0,iii=0;





		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1021, 756);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 1005, 709);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		panel.setBackground(Color.WHITE);
		tabbedPane.addTab("Quiz", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.YELLOW);
		tabbedPane.addTab("REGISTRATION", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("LOGIN", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.PINK);
		panel_3.setBounds(10, 36, 1005, 673);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.CYAN);
		panel_4.setBounds(97, 141, 664, 336);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(20, 23, 873, 581);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(356, 219, 114, 21);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("REGISTRATION");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(320, 162, 178, 31);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBounds(0, 0, 45, 13);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setBounds(731, 138, 119, 75);
		panel.add(lblNewLabel_17);
		
		JButton btnNewButton_16 = new JButton("take qui");
		
		btnNewButton_16.setBounds(656, 514, 139, 21);
		panel_6.add(btnNewButton_16);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("D:\\lg.jpg"));
		label_1.setBounds(10, 23, 861, 473);
		panel.add(label_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.MAGENTA);
		menuBar.setBounds(20, 0, 970, 22);
		panel_3.add(menuBar);
		menuBar.setVisible(false);
		JMenu mnNewMenu = new JMenu("file");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Help");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("View");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem new_pro=new JMenuItem("New Project");
		JMenuItem save=new JMenuItem("Save");
		JMenuItem Reset=new JMenuItem("Reset");
		
		JMenuItem exit=new JMenuItem("Exit");
		mnNewMenu.add(new_pro);
		mnNewMenu.add(save);
		mnNewMenu.add(Reset);
	
		
		
		JMenuItem add=new JMenuItem("ADD");
		JMenuItem update=new JMenuItem("UPDATE");
		JMenuItem delete=new JMenuItem("DELETE");
		JMenuItem submit=new JMenuItem("SUBMIT");
		
		mnNewMenu_1.add(add);
		mnNewMenu_1.add(update);
		mnNewMenu_1.add(delete);
		mnNewMenu_1.add(submit);
		mnNewMenu_1.add(exit);
		
		JMenu mnNewMenu_4 = new JMenu("Font");
		 mnNewMenu_3.add(mnNewMenu_4);
		 JMenuItem f1=new JMenuItem("Ebrima");
			JMenuItem f2=new JMenuItem("Forte");
			JMenuItem f3=new JMenuItem("Goudy Old Style");
			JMenuItem f4=new JMenuItem("Script MT Bold");
			JMenuItem f5=new JMenuItem("Times New Roman");

			 mnNewMenu_4.add(f1);
			 mnNewMenu_4.add(f2);
				
			 mnNewMenu_4.add(f3);
				
			 mnNewMenu_4.add(f4);
				
			 mnNewMenu_4.add(f5);
			 JMenu mnNewMenu_5 = new JMenu("Style");
			 mnNewMenu_3.add(mnNewMenu_5);
			 JMenuItem s1=new JMenuItem("Plain");
				JMenuItem s2=new JMenuItem("Bold");
				JMenuItem s3=new JMenuItem("Italic");
				JMenuItem s4=new JMenuItem("Bold Italic");

				mnNewMenu_5.add(s1);
				mnNewMenu_5.add(s2);
				mnNewMenu_5.add(s3);
				mnNewMenu_5.add(s4);
				 JMenu mnNewMenu_6 = new JMenu("Size");
				 mnNewMenu_3.add(mnNewMenu_6);
				 JMenuItem z1=new JMenuItem("8");
					JMenuItem z2=new JMenuItem("10");
					JMenuItem z3=new JMenuItem("12");
					JMenuItem z4=new JMenuItem("14");
					 JMenuItem z5=new JMenuItem("16");
						JMenuItem z6=new JMenuItem("18");
						JMenuItem z7=new JMenuItem("20");
						JMenuItem z8=new JMenuItem("22");
						
						mnNewMenu_6.add(z1);
						mnNewMenu_6.add(z2);
						mnNewMenu_6.add(z3);
						mnNewMenu_6.add(z4);mnNewMenu_6.add(z5);
						mnNewMenu_6.add(z6);
						mnNewMenu_6.add(z7);
						mnNewMenu_6.add(z8);
						
						JMenu mnNewMenu_7 = new JMenu("BACKGROUND COLOR");
						 mnNewMenu_3.add(mnNewMenu_7);		
						 JMenuItem z11=new JMenuItem("PINK");
							JMenuItem z21=new JMenuItem("WHite");
							JMenuItem z31=new JMenuItem("GREEN");
							JMenuItem z41=new JMenuItem("BLUE");
							
							mnNewMenu_7.add(z11);
							mnNewMenu_7.add(z21);
							mnNewMenu_7.add(z31);
							mnNewMenu_7.add(z41);
						
							
							JMenu mnNewMenu_8 = new JMenu("Table color");
							 mnNewMenu_3.add(mnNewMenu_8);
							 ButtonGroup group2 = new ButtonGroup();
								JRadioButtonMenuItem rdbtnmntmNewRadioItem_1 = new JRadioButtonMenuItem("CYAN");
								mnNewMenu_8.add(rdbtnmntmNewRadioItem_1);
								
								JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("YELLOW");
								mnNewMenu_8.add(rdbtnmntmNewRadioItem);
								group2.add(rdbtnmntmNewRadioItem_1);
								group2.add(rdbtnmntmNewRadioItem);
								
								
								
								 
								
								 
			
								 class exitt implements ActionListener{
									

									@Override
									public void actionPerformed(ActionEvent e) {
										System.exit(0);
										
									}
								 }
								 
								 exit.addActionListener(new exitt());
								
								 
							
								 class c1 implements ActionListener{
										

										@Override
										public void actionPerformed(ActionEvent e) {
											panel_3.setBackground(Color.PINK);
											
										}
									 }
								 class c2 implements ActionListener{
										

										@Override
										public void actionPerformed(ActionEvent e) {
											panel_3.setBackground(Color.white);
											
										}
									 }
								 class c3 implements ActionListener{
										

										@Override
										public void actionPerformed(ActionEvent e) {
											panel_3.setBackground(Color.green);
											
										}
									 }
								 class c4 implements ActionListener{
										

										@Override
										public void actionPerformed(ActionEvent e) {
											panel_3.setBackground(Color.blue);
											
										}
									 }
								 
								 z11.addActionListener(new c1());
								 z21.addActionListener(new c2());
								 z31.addActionListener(new c3());
								 z41.addActionListener(new c4());
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(51, 59, 759, 314);
		panel_6.add(scrollPane_3);
		
		JTextArea txtreachQuestionTakes = new JTextArea();
		txtreachQuestionTakes.setFont(new Font("Lucida Bright", Font.BOLD, 16));
		scrollPane_3.setViewportView(txtreachQuestionTakes);
		txtreachQuestionTakes.setText("\r\n                                          INSTRUCTIONS:-\r\n\r\n1.Each question takes duration 30seconds,\r\n2.After finishing each question 05second to see the before question right/wrong\r\n(if the text color is  red means wrong or in green means correct),\r\n3.At last it shows the result.\r\n\r\nTIME IDENTIFICATION:-\r\n30seconds:-right side top corner.\r\n05seconds:-at center of the bottom.\r\nTotal time:-left side top corner.");
		txtreachQuestionTakes.setBackground(Color.PINK);
		
		
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.GREEN);
		
		tabbedPane.addTab("sudent", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_30 = new JLabel("");
		lblNewLabel_30.setFont(new Font("Tahoma", Font.PLAIN, 47));
		lblNewLabel_30.setBounds(738, 57, 107, 95);
		panel_5.add(lblNewLabel_30);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.WHITE);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(52, 209, 793, 175);
		panel_5.add(label);
		
		JLabel lblNewLabel_27 = new JLabel("");
		lblNewLabel_27.setIcon(null);
		lblNewLabel_27.setBackground(Color.PINK);
		lblNewLabel_27.setBounds(101, 463, 260, 64);
		panel_5.add(lblNewLabel_27);
		
		JLabel lblNewLabel_29 = new JLabel("");
		lblNewLabel_29.setBackground(Color.PINK);
		lblNewLabel_29.setBounds(623, 463, 260, 64);
		panel_5.add(lblNewLabel_29);
		
		JLabel lblNewLabel_31 = new JLabel("");
		lblNewLabel_31.setIcon(null);
		lblNewLabel_31.setBackground(Color.CYAN);
		lblNewLabel_31.setBounds(101, 566, 260, 64);
		panel_5.add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel("");
		lblNewLabel_32.setBackground(Color.BLUE);
		lblNewLabel_32.setBounds(623, 566, 260, 64);
		panel_5.add(lblNewLabel_32);
		
		ButtonGroup group1 = new ButtonGroup();
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("");
		rdbtnNewRadioButton_2.setBounds(23, 485, 21, 12);
		panel_5.add(rdbtnNewRadioButton_2);
		group1.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("");
		rdbtnNewRadioButton_3.setBounds(555, 485, 21, 21);
		panel_5.add(rdbtnNewRadioButton_3);
		group1.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("");
		rdbtnNewRadioButton_4.setBounds(23, 588, 21, 21);
		panel_5.add(rdbtnNewRadioButton_4);
		group1.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("");
		rdbtnNewRadioButton_5.setBounds(555, 588, 21, 21);
		panel_5.add(rdbtnNewRadioButton_5);
		group1.add(rdbtnNewRadioButton_5);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(111, 119, 582, 164);
		panel_5.add(scrollPane_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBackground(Color.BLUE);
		textArea_3.setForeground(Color.RED);
		scrollPane_2.setViewportView(textArea_3);
		
		JLabel lblNewLabel_33 = new JLabel("");
		lblNewLabel_33.setFont(new Font("Tahoma", Font.PLAIN, 47));
		lblNewLabel_33.setBounds(338, 484, 146, 72);
		panel_5.add(lblNewLabel_33);
		
		JLabel lblNewLabel_34 = new JLabel("");
		lblNewLabel_34.setBounds(32, 31, 146, 64);
		panel_5.add(lblNewLabel_34);
		
		JButton btnGetResult = new JButton("get result");
		
		btnGetResult.setBounds(391, 475, 107, 31);
		panel_5.add(btnGetResult);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(98, 409, 823, 238);
		panel_3.add(scrollPane_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setForeground(Color.RED);
		textArea_2.setFont(new Font("Monospaced", Font.ITALIC, 14));
		textArea_2.setBackground(Color.WHITE);
		scrollPane_1.setViewportView(textArea_2);
		
		JLabel lblNewLabel_26 = new JLabel("");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_26.setBounds(541, 467, 367, 67);
		panel_3.add(lblNewLabel_26);
		//ButtonGroup group1 = new ButtonGroup();
		
		
		model1=new DefaultTableModel();
		Object[] col1= {"TYPES","VALUES"};
		 final Object[] row1= new Object[2];
		 final Object[] row2= new Object[2];
		 final Object[] row3= new Object[2];
		 final Object[] row4= new Object[2];
		
		 
		table_1 = new JTable();
		model1.setColumnIdentifiers(col1);
		
		
	    row1[0]="TEXTSIZE";
	    row1[1]="";
	    row2[0]="BACKGROUND COLOR";
	    row2[1]="";
	    row3[0]="TIME/QUES";
	    row3[1]="";
	    row4[0]="TEXT COLOR";
	    row4[1]="";
		
		
		
		model1.addRow(row1);
		model1.addRow(row2);
		model1.addRow(row3);
		model1.addRow(row4);
		
		JLabel lblNewLabel_20 = new JLabel("Question:");
		lblNewLabel_20.setBounds(44, 330, 58, 15);
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_3.add(lblNewLabel_20);
		model=new DefaultTableModel();
		Object[] col= {"question","option-1","option-2","option-3","option-4","ans"};
		final Object[] row=new Object[6];
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(54, 33, 869, 258);
		panel_3.add(scrollPane);
		
		table_1_1 = new JTable();
		//table_1_1.setBackground(Color.YELLOW);
		//table_1_1.setBackground(new Color(0, 255, 255));
		table_1_1.setBounds(new Rectangle(1, 1, 1, 1));
		table_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		//table_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		scrollPane.setViewportView(table_1_1);
		model.setColumnIdentifiers(col);
	    table_1_1.setModel(model); 
		
		JLabel lblNewLabel_21 = new JLabel("option 1:");
		lblNewLabel_21.setBounds(44, 387, 53, 15);
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_3.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("option 2:");
		lblNewLabel_22.setBounds(44, 416, 53, 15);
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_3.add(lblNewLabel_22);
		
		JButton btnNewButton_14 = new JButton("DELETE");
		btnNewButton_14.setBounds(844, 383, 108, 23);
		
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_3.add(btnNewButton_14);
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i=table_1_1.getSelectedRow();
				if(i>=0)
				{
					String qu=table_1_1.getValueAt(i,0).toString();
			
				  try {
					  PreparedStatement pp= con.prepareStatement("delete from questions where question=?;");
				  //sta.executeUpdate("delete from questions where S_no=;");
					  pp.setString(1,qu);
					  pp.execute();
						model.removeRow(i);
				}
				catch(Exception ii)
				{
					
				}
				
				}
				else
				{
					JOptionPane.showMessageDialog(panel,"can't able to delete");
				}
			}
			
		});
		
		JLabel lblNewLabel_23 = new JLabel("option 3:");
		lblNewLabel_23.setBounds(44, 442, 53, 15);
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_3.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("option 4:");
		lblNewLabel_24.setBounds(44, 467, 53, 15);
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_3.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("ANS");
		lblNewLabel_25.setBounds(69, 527, 27, 16);
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_3.add(lblNewLabel_25);
		
		JButton btnNewButton_12 = new JButton("ADD");
		btnNewButton_12.setBounds(668, 387, 103, 23);
		
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_3.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("UPDATE");
		btnNewButton_13.setBounds(749, 438, 103, 23);
		
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_3.add(btnNewButton_13);
		
		
		JButton btnNewButton_15 = new JButton("SUBMIT");
		btnNewButton_15.setBounds(413, 539, 108, 23);
		
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_3.add(btnNewButton_15);
		
		
		textField_8 = new JTextField();
		textField_8.setToolTipText("enter question");
		textField_8.setBounds(131, 329, 232, 19);
		panel_3.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setToolTipText("enter option");
		textField_9.setBounds(131, 386, 96, 19);
		panel_3.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setToolTipText("enter option");
		textField_10.setBounds(131, 415, 96, 19);
		panel_3.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setToolTipText("enter option");
		textField_11.setBounds(131, 441, 96, 19);
		panel_3.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setToolTipText("enter option");
		textField_12.setBounds(131, 466, 96, 19);
		panel_3.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setToolTipText("enter correct answer");
		textField_13.setBounds(131, 527, 96, 19);
		panel_3.add(textField_13);
		textField_13.setColumns(10);
		
		
		//main
		
		
		
		
		JLabel lblNewLabel_12 = new JLabel("Question :");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_12.setBounds(173, 69, 97, 31);
		panel_3.add(lblNewLabel_12);
		
		JButton btnNewButton_11 = new JButton("NEXT");
		btnNewButton_11.setBounds(764, 571, 114, 21);
		panel_3.add(btnNewButton_11);
		
		
		
		JLabel lblNewLabel_18 = new JLabel("NO OF QUESTION:");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_18.setBounds(185, 105, 149, 13);
		panel_4.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("NO OF OPTIONS: 4");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_19.setBounds(185, 149, 128, 15);
		panel_4.add(lblNewLabel_19);
		
		textField_6 = new JTextField();
		textField_6.setToolTipText("enter the no of question");
		textField_6.setBounds(320, 103, 96, 19);
		panel_4.add(textField_6);
		textField_6.setColumns(10);
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textArea_1.setBounds(241, 136, 403, 142);
		panel_3.add(textArea_1);
		
		
		JTree tree = new JTree();
		tree.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent e) {
				DefaultMutableTreeNode selected_node = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
			      String selected_node_name = selected_node.toString();
			      lblNewLabel_26.setVisible(true);
			      lblNewLabel_26.setText("you selected : "+selected_node_name);
			if(selected_node_name.equals(a2))      
			{
				panel_3.setVisible(false);
				panel_4.setVisible(true);
				 lblNewLabel_26.setVisible(false);
				 scrollPane_1.setVisible(false);
				 try {
				 ResultSet rs = sta.executeQuery(" SELECT question,option_1,option_2,option_3,option_4,ans from questions;");
				
				 while(rs.next()){
					/*System.out.println(rs.getString("question"));
					 System.out.println(rs.getString("option_1"));
					 System.out.println(rs.getString("option_2"));
					 System.out.println(rs.getString("option_3"));
					 System.out.println(rs.getString("option_4"));
					 System.out.println(rs.getString("ans"));*/
					
					String a=rs.getString("question");
					String a1=rs.getString("option_1");
					String a2=rs.getString("option_2");
					String a3=rs.getString("option_3");
					String a4=rs.getString("option_4");
					String a5=rs.getString("ans");
					String a6[]= {a,a1,a2,a3,a4,a5};
					model.addRow(a6);
					
			           
			         }
				 }
				 catch(Exception e0) {
					 System.out.println(e0);
				 }
			}
			
			else if(selected_node_name.equals(a4))
			{
				scrollPane_1.setVisible(true);
				textArea_2.setText("");
				for(int i=0;i<table_1_1.getRowCount();i++)
				{
					String qu=table_1_1.getValueAt(i,0).toString();
					String o1=table_1_1.getValueAt(i,1).toString();
					String o2=table_1_1.getValueAt(i,2).toString();
					String o3=table_1_1.getValueAt(i,3).toString();
					String o4=table_1_1.getValueAt(i,4).toString();
					String an=table_1_1.getValueAt(i,5).toString();
					
					
					
				textArea_2.setText(textArea_2.getText()+(i+1)+"."+qu+"\n"+"\ta."+o1+"\n\tb."+o2+"\n\tc."+o3+"\n\td."+o4+"\n\t\tANS:-"+an+"\n\n");
				}
				
			}
			else if(selected_node_name.equals(a5))
			{try {
				 ResultSet rs = sta.executeQuery(" SELECT * from student;");int i=0;scrollPane_1.setVisible(true);textArea_2.setText("");
				 while(rs.next()) {
					 String a=rs.getString("question");
						String a1=rs.getString("option_1");
						String a2=rs.getString("option_2");
						String a3=rs.getString("option_3");
						String a4=rs.getString("option_4");
						String a5=rs.getString("answered");
						String a6=rs.getString("mark");
					 textArea_2.setText(textArea_2.getText()+(i+1)+"."+a+"\n"+"\ta."+a1+"\n\tb."+a2+"\n\tc."+a3+"\n\td."+a4+"\n\t\tANSWERED:-"+a5+"\tMARK:"+a6+"\n\n");
					 i++;
				 }
			}catch (Exception hh) {}
			}
			}});
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("details:") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("question:-");
						node_1.add(new DefaultMutableTreeNode("enter q"));
add(node_1);
		
					node_1 = new DefaultMutableTreeNode("types:-");
						node_1.add(new DefaultMutableTreeNode("mulitple choice"));
						node_1.add(new DefaultMutableTreeNode("fill in the balnks"));
						node_1.add(new DefaultMutableTreeNode("true or false"));
						node_1.add(new DefaultMutableTreeNode("numerical answer"));
						node_1.add(new DefaultMutableTreeNode("odd one out"));
						node_1.add(new DefaultMutableTreeNode("matches"));
add(node_1);
					node_1 = new DefaultMutableTreeNode("display table values:-");
						node_1.add(new DefaultMutableTreeNode("enter t"));
add(node_1);
                   node_1 = new DefaultMutableTreeNode("rounds:-");
                      node_1.add(new DefaultMutableTreeNode("round 1"));
                      node_1.add(new DefaultMutableTreeNode("round 2"));
                      node_1.add(new DefaultMutableTreeNode("round 3"));
                      node_1.add(new DefaultMutableTreeNode("semifinal"));
                      node_1.add(new DefaultMutableTreeNode("final"));
add(node_1);
node_1 = new DefaultMutableTreeNode("display result:-");
node_1.add(new DefaultMutableTreeNode("enter re"));
add(node_1);
				}
			}
		));
		tree.setBounds(308, 44, 232, 325);
		panel_3.add(tree);
		
		
		
		
		JButton btnNewButton_10 = new JButton("NEXT");
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setVisible(true);
				panel_4.setVisible(false);
				panel_3.setVisible(true);
				btnNewButton_11.setVisible(true);
				String m1=textField_6.getText();
				//String m2=textField_7.getText();
				textArea_1.setText("entered:\n\t no of question:"+m1+"\n\tno of options:4");
				lblNewLabel_12.setVisible(false);
				tree.setVisible(false);
				
			}
		});
		btnNewButton_10.setBounds(275, 244, 85, 21);
		panel_4.add(btnNewButton_10);
		
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea_1.setVisible(false);
              
				btnNewButton_11.setVisible(false);
				scrollPane.setVisible(true);
				lblNewLabel_20.setVisible(true);
				lblNewLabel_21.setVisible(true);
				lblNewLabel_22.setVisible(true);
				lblNewLabel_23.setVisible(true);
				lblNewLabel_24.setVisible(true);
				lblNewLabel_25.setVisible(true);
				menuBar.setVisible(true);
				btnNewButton_13.setVisible(true);
				btnNewButton_14.setVisible(true);
				btnNewButton_12.setVisible(true);
				btnNewButton_15.setVisible(true);
				textField_8.setVisible(true);
				textField_9.setVisible(true);
				textField_10.setVisible(true);
				textField_11.setVisible(true);
				textField_12.setVisible(true);
				textField_13.setVisible(true);
				
			}
		});
		
		
		
		JButton btnNewButton_2 = new JButton("ADMIN");
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnNewButton_2.setBounds(196, 40, 85, 21);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("STUDENT");
		btnNewButton_3.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnNewButton_3.setBounds(345, 40, 121, 21);
		panel_1.add(btnNewButton_3);
		
		
		//image
		
		//register
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel.setBounds(195, 40, 63, 33);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("email id:");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel_1.setBounds(195, 87, 45, 13);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setToolTipText("please enter email");
		textField.setBounds(262, 84, 96, 21);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Phone no:");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel_2.setBounds(195, 127, 63, 13);
		panel_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("please enter phone no");
		textField_1.setBounds(262, 125, 96, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Username:");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel_3.setBounds(195, 160, 71, 13);
		panel_1.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("please enter username");
		textField_2.setBounds(262, 158, 96, 19);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Password:");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel_4.setBounds(195, 197, 63, 13);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("re-enter password:");
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel_5.setBounds(140, 231, 113, 20);
		panel_1.add(lblNewLabel_5);
		
		JButton btnNewButton_4 = new JButton("SUBMIT");
		btnNewButton_4.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnNewButton_4.setBounds(196, 526, 85, 21);
		panel_1.add(btnNewButton_4);
		
		textField_5 = new JTextField();
		textField_5.setToolTipText("enter name");
		textField_5.setBounds(268, 41, 96, 19);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Register  Successfully....");
		lblNewLabel_6.setFont(new Font("MS PGothic", Font.BOLD, 19));
		lblNewLabel_6.setBounds(161, 115, 298, 65);
		panel_1.add(lblNewLabel_6);
		
		JButton btnNewButton_5 = new JButton("Back");
		
		btnNewButton_5.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnNewButton_5.setBounds(262, 83, 102, 21);
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Back");
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_6.setBounds(326, 527, 85, 21);
		panel_1.add(btnNewButton_6);
		
		ButtonGroup group = new ButtonGroup();
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male",false);
		rdbtnNewRadioButton.setToolTipText("select gender");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnNewRadioButton.setBounds(261, 272, 103, 21);
		panel_1.add(rdbtnNewRadioButton);
		
		group.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female",false);
		rdbtnNewRadioButton_1.setToolTipText("select gender");
		rdbtnNewRadioButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		rdbtnNewRadioButton_1.setBounds(261, 309, 103, 21);
		panel_1.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("Gender");
		lblNewLabel_7.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel_7.setBounds(186, 296, 45, 13);
		panel_1.add(lblNewLabel_7);
		
		
		
		JButton btnNewButton_9 = new JButton("Next");
		btnNewButton_9.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnNewButton_9.setBounds(404, 322, 85, 21);
		panel_1.add(btnNewButton_9);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("C");
		chckbxNewCheckBox.setToolTipText("select language");
		chckbxNewCheckBox.setBackground(Color.CYAN);
		chckbxNewCheckBox.setForeground(Color.BLACK);
		chckbxNewCheckBox.setBounds(265, 349, 93, 21);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("JAVA");
		chckbxNewCheckBox_1.setToolTipText("select language");
		chckbxNewCheckBox_1.setBackground(Color.RED);
		chckbxNewCheckBox_1.setBounds(265, 381, 93, 21);
		panel_1.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("PYTHON");
		chckbxNewCheckBox_2.setToolTipText("select language\r\n");
		chckbxNewCheckBox_2.setForeground(Color.WHITE);
		chckbxNewCheckBox_2.setBackground(Color.BLACK);
		chckbxNewCheckBox_2.setBounds(265, 416, 93, 21);
		panel_1.add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_13 = new JLabel("Languages:");
		lblNewLabel_13.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		lblNewLabel_13.setBounds(161, 362, 140, 21);
		panel_1.add(lblNewLabel_13);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setToolTipText("please enter re_password");
		passwordField_2.setBounds(263, 233, 95, 19);
		panel_1.add(passwordField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("select course");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choose...", "1.Aerospace Engineering.", "2.Chemical Engineering.", "3.Electrical and Electronics Engineering.", "4.Petroleum Engineering.", "5.Telecommunication Engineering.", "6.Machine Learning and Artificial Intelligence.", "7.Robotics Engineering.", "8.Biochemical Engineering.", "9.ALL"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(262, 384, 285, 26);
		panel_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setToolTipText("select course");
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Choose...", "1.Aerospace Engineering.", "2.Chemical Engineering.", "3.Electrical and Electronics Engineering.", "4.Petroleum Engineering.", "5.Telecommunication Engineering.", "6.Machine Learning and Artificial Intelligence.", "7.Robotics Engineering.", "8.Biochemical Engineering."}));
		comboBox_1.setBounds(263, 463, 284, 21);
		panel_1.add(comboBox_1);
		
		JLabel lblNewLabel_14 = new JLabel("Course");
		lblNewLabel_14.setFont(new Font("Trebuchet MS", Font.BOLD, 10));
		lblNewLabel_14.setBounds(186, 397, 45, 13);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Course");
		lblNewLabel_15.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		lblNewLabel_15.setBounds(186, 467, 45, 13);
		panel_1.add(lblNewLabel_15);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("please enter username");
		textField_4.setBounds(262, 158, 96, 19);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("please enter password");
		passwordField.setBounds(262, 204, 96, 19);
		panel_1.add(passwordField);
		
		
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textArea.setBounds(404, 108, 150, 212);
		panel_1.add(textArea);
		
		JLabel lblNewLabel_28 = new JLabel("");
		lblNewLabel_28.setIcon(new ImageIcon("D:\\qw.jpg"));
		lblNewLabel_28.setBounds(0, 10, 990, 635);
		panel_1.add(lblNewLabel_28);
		
		JButton btnNewButton_17 = new JButton("submit");
		btnNewButton_17.setBackground(new Color(240, 240, 240));
		btnNewButton_17.setBounds(172, 527, 85, 21);
		panel_1.add(btnNewButton_17);
		
		 lblNewLabel_26.setVisible(false);
		 btnNewButton_17.setVisible(false);
		
		//login
		
		
		
		JLabel lblNewLabel_8 = new JLabel("Username");
		lblNewLabel_8.setForeground(new Color(240, 255, 255));
		lblNewLabel_8.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_8.setBounds(239, 94, 91, 16);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("password");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_9.setBounds(239, 144, 75, 17);
		panel_2.add(lblNewLabel_9);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("please enter username");
		textField_3.setBounds(329, 94, 106, 19);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_7 = new JButton("Submit");
		btnNewButton_7.setBackground(Color.WHITE);
		btnNewButton_7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnNewButton_7.setBounds(276, 217, 85, 21);
		panel_2.add(btnNewButton_7);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setToolTipText("please enter password");
		passwordField_1.setBounds(329, 142, 106, 19);
		panel_2.add(passwordField_1);
		
		JButton btnNewButton_8 = new JButton("Back");
		btnNewButton_8.setBackground(Color.WHITE);
		btnNewButton_8.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnNewButton_8.setBounds(383, 217, 85, 21);
		panel_2.add(btnNewButton_8);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("D:\\lg.jpg"));
		lblNewLabel_10.setBounds(10, 10, 915, 502);
		panel_2.add(lblNewLabel_10);
		textArea.setVisible(false);
		scrollPane_1.setVisible(false);
		scrollPane_2.setVisible(false);
		textField_8.setVisible(false);
		textField_9.setVisible(false);
		textField_10.setVisible(false);
		textField_11.setVisible(false);
		textField_12.setVisible(false);
		textField_13.setVisible(false);
		scrollPane.setVisible(false);
		lblNewLabel_20.setVisible(false);
		lblNewLabel_21.setVisible(false);
		lblNewLabel_22.setVisible(false);
		lblNewLabel_23.setVisible(false);
		lblNewLabel_24.setVisible(false);
		lblNewLabel_25.setVisible(false);
		
		btnNewButton_13.setVisible(false);
		btnNewButton_14.setVisible(false);
		btnNewButton_12.setVisible(false);
		btnNewButton_15.setVisible(false);
		panel_6.setVisible(false);
		lblNewLabel_12.setVisible(false);
		btnNewButton_11.setVisible(false);
		panel_4.setVisible(false);
		textField_4.setVisible(false);
		comboBox_1.setVisible(false);
		lblNewLabel_15.setVisible(false);
		comboBox.setVisible(false);
		lblNewLabel_14.setVisible(false);
		chckbxNewCheckBox.setVisible(false);
		chckbxNewCheckBox_1.setVisible(false);
		chckbxNewCheckBox_2.setVisible(false);
		lblNewLabel_13.setVisible(false);
		btnNewButton_2.setVisible(false);
		btnNewButton_3.setVisible(false);
		btnNewButton_5.setVisible(false);
		btnNewButton_6.setVisible(false);
		lblNewLabel.setVisible(false);
		lblNewLabel_1.setVisible(false);
		lblNewLabel_2.setVisible(false);
		lblNewLabel_3.setVisible(false);
		lblNewLabel_4.setVisible(false);
		lblNewLabel_5.setVisible(false);
		lblNewLabel_6.setVisible(false);
		lblNewLabel_7.setVisible(false);
		rdbtnNewRadioButton.setVisible(false);
		rdbtnNewRadioButton_1.setVisible(false);
		textField.setVisible(false);
		textField_1.setVisible(false);
		textField_2.setVisible(false);
		textField_5.setVisible(false);
		passwordField.setVisible(false);
		 btnNewButton_4.setVisible(false);
		 btnNewButton_9.setVisible(false);
	//	 lblNewLabel_10.setVisible(false);
		textArea.setVisible(false);
		textArea_1.setVisible(false);
		textArea_3.setVisible(false);
		 btnNewButton_7.setVisible(false);
			btnNewButton_8.setVisible(false);
			lblNewLabel_8.setVisible(false);
			lblNewLabel_9.setVisible(false);
			textField_3.setVisible(false);
			passwordField_1.setVisible(false);
			passwordField_2.setVisible(false);
		      a=textField_3.getText();
		     b=textField_2.getText();
			/* a1=new String(passwordField.getPassword());
			 b1=new String(passwordField_2.getPassword());
			 c1=new String(passwordField_1.getPassword());*/
		     rdbtnNewRadioButton_2.setVisible(false);
			 rdbtnNewRadioButton_3.setVisible(false);
			 rdbtnNewRadioButton_4.setVisible(false);
			 rdbtnNewRadioButton_5.setVisible(false);
			 panel_3.setVisible(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2.setVisible(false);
				btnNewButton_3.setVisible(false);
				btnNewButton_5.setVisible(false);
				btnNewButton_6.setVisible(true);
				lblNewLabel.setVisible(true);
				lblNewLabel_1.setVisible(true);
				lblNewLabel_2.setVisible(true);
				lblNewLabel_3.setVisible(true);
				textField_4.setVisible(true);
				lblNewLabel_4.setVisible(true);
				lblNewLabel_5.setVisible(true);
				textField.setVisible(true);
				textField_1.setVisible(true);
				textField_2.setVisible(true);
				passwordField.setVisible(true);
				passwordField_2.setVisible(true);
				textField_5.setVisible(true);
				 btnNewButton_4.setVisible(false);
				 lblNewLabel_6.setVisible(false);
				 lblNewLabel_7.setVisible(true);
					rdbtnNewRadioButton.setVisible(true);
					rdbtnNewRadioButton_1.setVisible(true);
					chckbxNewCheckBox.setVisible(true);
					chckbxNewCheckBox_1.setVisible(true);
					chckbxNewCheckBox_2.setVisible(true);
					lblNewLabel_13.setVisible(true);
					comboBox_1.setVisible(true);
					lblNewLabel_15.setVisible(true);
					btnNewButton_17.setVisible(true);
					textField_2.setText("");
					textField_4.setText("");
			}
			
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
				btnNewButton_2.setVisible(true);
				btnNewButton_3.setVisible(true);
				btnNewButton_5.setVisible(true);
				
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
				 btnNewButton_7.setVisible(true);
					btnNewButton_8.setVisible(true);
					lblNewLabel_8.setVisible(true);
					lblNewLabel_9.setVisible(true);
					textField_3.setVisible(true);
					passwordField_1.setVisible(true);
			}
		});
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String bb=textField_6.getText();
				int cc=Integer.parseInt(bb);  
				int i=table_1_1.getSelectedRow();
				
				i++;
				if(i<23)
		{
				if(textField_8.getText().equals("")||textField_9.getText().equals("")||textField_10.getText().equals("")||textField_11.getText().equals("")||textField_12.getText().equals("")||textField_13.getText().equals(""))
				
					{
					JOptionPane.showMessageDialog(panel_3,"please fill all the details....");
					}
				else
				{
					row[0]=textField_8.getText();
					
				row[1]=textField_9.getText();
				row[2]=textField_10.getText();
				row[3]=textField_11.getText();
				row[4]=textField_12.getText();
				row[5]=textField_13.getText();
				model.addRow(row);
				JOptionPane.showMessageDialog(panel,"added successfully.");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				
				
				}
		
			}
				else
					{
					JOptionPane.showMessageDialog(panel_3,"reached the question "+bb);
					}
					}
		});
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int i=table_1_1.getSelectedRow();
				if(i>=0)
				{ 
					 
					 
					if(!textField_8.getText().equals("")) {
						
				model.setValueAt(textField_8.getText(),i,0);
				PreparedStatement bh= con.prepareStatement("update questions set question=? where option_1=?;");
				String qu=table_1_1.getValueAt(i,0).toString();
				String o1=table_1_1.getValueAt(i,1).toString();
				
				
				bh.setString(1,qu );
				
				bh.setString(2, o1);
				bh.execute();
				
					}
					else if(!textField_9.getText().equals(""))
					{
				model.setValueAt(textField_9.getText(),i,1);
				PreparedStatement bh1= con.prepareStatement("update questions set option_1=? where question=?;");
				String o1=table_1_1.getValueAt(i,1).toString();
				String qu=table_1_1.getValueAt(i,0).toString();
				
				
				bh1.setString(1,o1);
				
				bh1.setString(2,qu );
				bh1.execute();
					}
					else if(!textField_10.getText().equals(""))
					{
				model.setValueAt(textField_10.getText(),i,2);
				PreparedStatement bh2= con.prepareStatement("update questions set option_2=? where question=?;");
				String o2=table_1_1.getValueAt(i,2).toString();
				String qu=table_1_1.getValueAt(i,0).toString();
				
				
				bh2.setString(1,o2);
			
				bh2.setString(2,qu );
				bh2.execute();
					}
					else if(!textField_11.getText().equals(""))
					{
				model.setValueAt(textField_11.getText(),i,3);
				PreparedStatement bh3= con.prepareStatement("update questions set option_3=? where question=?;");
				String o3=table_1_1.getValueAt(i,3).toString();
				String qu=table_1_1.getValueAt(i,0).toString();
				
			
				bh3.setString(1,o3);
				
				bh3.setString(2,qu);
				bh3.execute();
					}
					else if(!textField_12.getText().equals(""))
					{
				model.setValueAt(textField_12.getText(),i,4);
				PreparedStatement bh4= con.prepareStatement("update questions set option_4=? where question=?;");
				String o4=table_1_1.getValueAt(i,4).toString();
				String qu=table_1_1.getValueAt(i,0).toString();
				
				
				bh4.setString(1,o4);
				
				bh4.setString(2,qu);
				bh4.execute();
					}
					else if(!textField_13.getText().equals(""))
					{
				model.setValueAt(textField_13.getText(),i,5);
				PreparedStatement bh5= con.prepareStatement("update questions set ans=? where question=?;");
				String an=table_1_1.getValueAt(i,5).toString();
				String qu=table_1_1.getValueAt(i,0).toString();
				
				
				bh5.setString(1,an);
				
				bh5.setString(2,qu);
				bh5.execute();
					}
				JOptionPane.showMessageDialog(panel_3,"updated successfully.");
				
				}
				else
				{
					JOptionPane.showMessageDialog(panel_3,"can't able to update");
				}
				}catch(Exception ww) {}
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2.setVisible(false);
				btnNewButton_3.setVisible(false);
				btnNewButton_5.setVisible(false);
				btnNewButton_6.setVisible(true);
				lblNewLabel.setVisible(true);
				lblNewLabel_1.setVisible(true);
				lblNewLabel_2.setVisible(true);
				textField_4.setVisible(false);
				comboBox.setVisible(true);
				lblNewLabel_14.setVisible(true);
				lblNewLabel_3.setVisible(true);
				lblNewLabel_4.setVisible(true);
				lblNewLabel_5.setVisible(true);
				textField.setVisible(true);
				textField_1.setVisible(true);
				textField_2.setVisible(true);
				passwordField.setVisible(true);
				passwordField_2.setVisible(true);
				textField_5.setVisible(true);
				 btnNewButton_4.setVisible(true);
				 lblNewLabel_6.setVisible(false);
				 lblNewLabel_7.setVisible(true);
					rdbtnNewRadioButton.setVisible(true);
					rdbtnNewRadioButton_1.setVisible(true);
				 
				
			}
		});
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i=0;
				if(textField_5.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(panel_1," name field is empty");i=1;
				}
				else if(textField.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(panel_1," email field is empty");i=1;
				}
				else if(textField_1.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(panel_1," phon no field is empty");i=1;
				}
				else if(textField_2.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(panel_1," username field is empty");i=1;
				}
				else if(new String(passwordField.getPassword()).isEmpty() ) 
				{
					
					JOptionPane.showMessageDialog(panel_1," password field is empty");i=1;
				}
				else if(new String(passwordField_2.getPassword()).isEmpty())
				{
					JOptionPane.showMessageDialog(panel_1," re password field is empty");i=1;
				
				}
				else if(!(new String(passwordField.getPassword()).equals((new String(passwordField_2.getPassword())))))
				{
					JOptionPane.showMessageDialog(panel_1," password mismatch in re password.");i=1;
				}
				if(i==0) {
				lblNewLabel.setVisible(false);
				lblNewLabel_1.setVisible(false);
				lblNewLabel_2.setVisible(false);
				lblNewLabel_3.setVisible(false);
				lblNewLabel_4.setVisible(false);
				lblNewLabel_5.setVisible(false);
				textField.setVisible(false);
				textField_1.setVisible(false);
				textField_2.setVisible(false);
				passwordField.setVisible(false);
				passwordField_2.setVisible(false);
				textField_5.setVisible(false);
				
				 btnNewButton_4.setVisible(false);
				 btnNewButton_2.setVisible(false);
				 btnNewButton_3.setVisible(false);
				 textField_4.setVisible(false);
				// lblNewLabel_6.setVisible(true);
				
								 
				 lblNewLabel_7.setVisible(false);
					rdbtnNewRadioButton.setVisible(false);
					rdbtnNewRadioButton_1.setVisible(false);
					btnNewButton_6.setVisible(false);
					chckbxNewCheckBox.setVisible(false);
					chckbxNewCheckBox_1.setVisible(false);
					chckbxNewCheckBox_2.setVisible(false);
					lblNewLabel_13.setVisible(false);
					comboBox.setVisible(false);
					lblNewLabel_14.setVisible(false);
					comboBox_1.setVisible(false);
					lblNewLabel_15.setVisible(false);
					
					
					JOptionPane.showMessageDialog(panel_2," Registered Successfully.");
					 textArea.setVisible(true); 
					 
					 
					
					 String a11=textField_5.getText();
					 String  a12=textField.getText();
					 String a13=textField_1.getText();
					 String a14=textField_2.getText();
					 String a15 = null;
					 String asd=passwordField.getText();
				   int m=Integer.parseInt(a13);
					 if(rdbtnNewRadioButton.isSelected())
					 {
						 a15="Male";
					 }
					 else if(rdbtnNewRadioButton_1.isSelected())
					 {
						 a15="Female";
					 }
					textArea.setText("\nName   :"+a11+"\n\nEmail    :"+a12+"\n\nMobile no    : "+a13+"\n\n Username    : "+a14+"\n\n Gender    : "+a15);
					
					btnNewButton_9.setVisible(true);
					 textField.setText("");
					 textField_1.setText("");
					 textField_4.setText("");
					 textField_5.setText("");
					 passwordField.setText("");
					 passwordField_2.setText("");
					 //textField_2.setText("");
				
				try {
					 PreparedStatement ppp= con.prepareStatement("INSERT INTO register VALUES(?,?,?,?,?,?,?)");
					 
					 ppp.setString(1,a11);
					 ppp.setString(2, a12);
					 ppp.setInt(3,m);
					 ppp.setString(4, a14);
					 ppp.setString(5,asd);
					 ppp.setString(6, a15);
					 ppp.setInt(7, 1);
					
					 ppp.execute();
					}catch(Exception rr) {}	
				}
			}
		});
		
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
				btnNewButton_2.setVisible(false);
				btnNewButton_3.setVisible(false);
				btnNewButton_5.setVisible(false);
			}
		});
		

		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_5.setVisible(true);
				btnNewButton_2.setVisible(true);
				btnNewButton_3.setVisible(true);
				btnNewButton_6.setVisible(false);
				lblNewLabel_6.setVisible(false);
				lblNewLabel.setVisible(false);
				lblNewLabel_1.setVisible(false);
				lblNewLabel_2.setVisible(false);
				lblNewLabel_3.setVisible(false);
				lblNewLabel_4.setVisible(false);
				lblNewLabel_5.setVisible(false);
				textField.setVisible(false);
				textField_1.setVisible(false);
				textField_2.setVisible(false);
				passwordField_2.setVisible(false);
				passwordField.setVisible(false);
				textField_5.setVisible(false);
				lblNewLabel_7.setVisible(false);
				textField_2.setVisible(false);
				rdbtnNewRadioButton.setVisible(false);
				rdbtnNewRadioButton_1.setVisible(false);
				comboBox_1.setVisible(false);
				lblNewLabel_15.setVisible(false);
				chckbxNewCheckBox.setVisible(false);
				chckbxNewCheckBox_1.setVisible(false);
				chckbxNewCheckBox_2.setVisible(false);
				lblNewLabel_13.setVisible(false);
				 btnNewButton_4.setVisible(false);
				 comboBox.setVisible(false);
					lblNewLabel_14.setVisible(false);
					 textField.setText("");
					 textField_1.setText("");
					 //textField_4.setText("");
					 textField_5.setText("");
					// passwordField.setText("");
					// passwordField_2.setText("");
			}
		});
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
				btnNewButton_9.setVisible(false);
				lblNewLabel_6.setVisible(false);
				 btnNewButton_7.setVisible(true);
					btnNewButton_8.setVisible(true);
					lblNewLabel_8.setVisible(true);
					lblNewLabel_9.setVisible(true);
					textField_3.setVisible(true);
					passwordField_1.setVisible(true);
					textArea.setVisible(false);
			}
		});
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
				 btnNewButton_7.setVisible(false);
					btnNewButton_8.setVisible(false);
					lblNewLabel_8.setVisible(false);
					lblNewLabel_9.setVisible(false);
					textField_3.setVisible(false);
					passwordField_1.setVisible(false);
			}
		});
		
		//tabbedPane.setVisible(false);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int qw=0;
				
				ResultSet rs = sta.executeQuery(" SELECT  username,pass,user_stu from register;");
				while(rs.next())
				{
				if(rs.getString("username").equals(textField_3.getText()) && rs.getString("pass").equals(passwordField_1.getText()) )  
				{
					
					JOptionPane.showMessageDialog(panel_2,a+" logined Successfully.");qw=1;
					
					if(rs.getInt("user_stu")==1)
					{
					 panel_3.setVisible(true);
					tabbedPane.setVisible(false);
					}
					else if(rs.getInt("user_stu")==0)
					{
						tabbedPane.setVisible(false);
						panel_6.setVisible(true);
						
					}
					break;
				}
				
				}
				if(qw==1) {
				btnNewButton_7.setVisible(false);
				btnNewButton_8.setVisible(false);
				lblNewLabel_8.setVisible(false);
				lblNewLabel_9.setVisible(false);
				textField_3.setVisible(false);
				passwordField_1.setVisible(false);
				
				
				}
				else
				{
					JOptionPane.showMessageDialog(panel_2,"enter valid username or password.");qw=0;textField_3.setText("");passwordField_1.setText("");
				}
				}catch(Exception eqw) {System.out.println(eqw);}
			}
		});
		
		
		//ADMIN MAIN
		/*public void valueChanged(TreeSelectionEvent se){
		      // determines the selected node
		      selected_node = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
		      String selected_node_name = selected_node.toString();
		          
		      if(selected_node.isLeaf()){
		       txt_display.setText(selected_node_name);
		      }
		   }*/
		
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_8.setVisible(false);
				textField_9.setVisible(false);
				textField_10.setVisible(false);
				textField_11.setVisible(false);
				textField_12.setVisible(false);
				textField_13.setVisible(false);
				scrollPane.setVisible(false);
				lblNewLabel_20.setVisible(false);
				lblNewLabel_21.setVisible(false);
				lblNewLabel_22.setVisible(false);
				lblNewLabel_23.setVisible(false);
				lblNewLabel_24.setVisible(false);
				lblNewLabel_25.setVisible(false);
				menuBar.setVisible(false);
				btnNewButton_13.setVisible(false);
				btnNewButton_14.setVisible(false);
				btnNewButton_12.setVisible(false);
				btnNewButton_15.setVisible(false);
				
				lblNewLabel_12.setVisible(true);
				tree.setVisible(true);
				for(int i=0;i<table_1_1.getRowCount();i++) {
				String qu=table_1_1.getValueAt(i,0).toString();
				String o1=table_1_1.getValueAt(i,1).toString();
				String o2=table_1_1.getValueAt(i,2).toString();
				String o3=table_1_1.getValueAt(i,3).toString();
				String o4=table_1_1.getValueAt(i,4).toString();
				String an=table_1_1.getValueAt(i,5).toString();
				
 try {
					 
					 PreparedStatement p= con.prepareStatement("INSERT INTO questions VALUES(?,?,?,?,?,?,?)");
					 p.setInt(1,i);
					 p.setString(2, qu);
					 p.setString(3, o1);
					 p.setString(4, o2);
					 p.setString(5, o3);
					 p.setString(6, o4);
					 p.setString(7, an);
					 p.execute();
					//sta.executeUpdate("INSERT INTO questions VALUES('"+i+"','"+qu+"','"+o1+"','"+o2+"','"+o3+"','"+o4+"','"+an+"')");
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				}
				
			}
					});
	
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setVisible(true);
				tabbedPane.setSelectedIndex(3);	
				
				panel_6.setVisible(false);
				 try { 
					 ResultSet co = sta.executeQuery(" SELECT COUNT(*) from questions;");
					 co.next();
					 int count=co.getInt(1);
					 ResultSet rs = sta.executeQuery(" SELECT question,option_1,option_2,option_3,option_4,ans from questions;");
					int dd=0;
					rs.next();
					
					Timer t=new Timer();
					TimerTask task=new TimerTask() {
						public int h=30,d=6,yy=0,to=count*35,nn=1;
						@Override
						public void run() {
							if(h>=0&& h<=30 && d==6) {
							String s1=Integer.toString(h);h--;
							lblNewLabel_30.setText(s1);
						}
							else if( d>=0||d<=5)
								{
								
									String s1=Integer.toString(nn);d--; nn++;
									lblNewLabel_33.setText(s1);	
								}
							String s12=Integer.toString(to);to--; 
							lblNewLabel_34.setText(s12);
							if(to>=1 && to<=5)
							{
								 label.setText("Result processing.....");
							}
							if(to==0)
							{  
								btnGetResult.setVisible(true);	 
								t.cancel();
							}
							  if(d==0) {
									textArea_3.setVisible(false);
									scrollPane_2.setVisible(false);
									lblNewLabel_33.setText("");	
								h=30;d=6;nn=1;
								
								try{	
							rs.next();
							}
								catch(Exception mm) {}					
								}	 
							
							 
								 try {
									 if(h>=0&& h<=30 && d==6 ) {
								 label.setText(rs.getString("question"));
								 lblNewLabel_27.setText(rs.getString("option_1"));
								 lblNewLabel_29.setText(rs.getString("option_2"));
								 lblNewLabel_31.setText(rs.getString("option_3"));
								 lblNewLabel_32.setText(rs.getString("option_4"));
										
								 rdbtnNewRadioButton_2.setVisible(true);
								 rdbtnNewRadioButton_3.setVisible(true);
								 rdbtnNewRadioButton_4.setVisible(true);
								 rdbtnNewRadioButton_5.setVisible(true);
									 }
								 }catch(Exception bb) {}
								 
						         if(h>=9 && h<=19)
						         {
						        	 panel_5.setBackground(Color.YELLOW);
						         }
						         if (h>0&& h<=9) {
						        	 panel_5.setBackground(Color.RED);
						         }
						        
							 if(h==0) {
								 
								 if(h==0)
								 {
									 d=5;h--;
								 }
								 
								try {
									lblNewLabel_30.setText("");
									
									
									 if(rdbtnNewRadioButton_2.isSelected())
									 {
										 
										 if(rs.getString("option_1").equals(rs.getString("ans")) ) 
										 {
											 PreparedStatement op1= con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
											 op1.setString(1,rs.getString("question") );
											 op1.setString(2, rs.getString("option_1"));
											 op1.setString(3,rs.getString("option_2") );
											 op1.setString(4, rs.getString("option_3"));
											 op1.setString(5, rs.getString("option_4"));
											 op1.setString(6, rs.getString("option_1"));
											 op1.setInt(7, 1);
											 op1.execute();
											 textArea_3.setBackground(Color.BLUE);
											 textArea_3.setForeground(Color.GREEN);
											 textArea_3.setText(rs.getString("question")+"\n\t\tanswered:-"+rs.getString("option_1"));
										 }
										 else
										 {
											 PreparedStatement op1= con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
											 op1.setString(1,rs.getString("question") );
											 op1.setString(2, rs.getString("option_1"));
											 op1.setString(3,rs.getString("option_2") );
											 op1.setString(4, rs.getString("option_3"));
											 op1.setString(5, rs.getString("option_4"));
											 op1.setString(6, rs.getString("option_1"));
											 op1.setInt(7, 0);
											 op1.execute();
											 panel_5.setBackground(Color.BLACK);
											 textArea_3.setBackground(Color.BLACK);
											 textArea_3.setForeground(Color.RED);
											 textArea_3.setText(rs.getString("question")+"\n\t\tanswered:-"+rs.getString("option_1"));
										 } group1.clearSelection();
										 
									 }
									 else if(rdbtnNewRadioButton_3.isSelected())
									 {
										 if(rs.getString("option_2").equals(rs.getString("ans")) ) 
										 {
											 PreparedStatement op1= con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
											 op1.setString(1,rs.getString("question") );
											 op1.setString(2, rs.getString("option_1"));
											 op1.setString(3,rs.getString("option_2") );
											 op1.setString(4, rs.getString("option_3"));
											 op1.setString(5, rs.getString("option_4"));
											 op1.setString(6, rs.getString("option_2"));
											 op1.setInt(7, 1);
											 op1.execute();
											 textArea_3.setBackground(Color.BLUE);
											 textArea_3.setForeground(Color.GREEN);
											 textArea_3.setText(rs.getString("question")+"\n\t\tanswered:-"+rs.getString("option_2"));
											 
										 }
										 else
										 {
											 PreparedStatement op1= con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
											 op1.setString(1,rs.getString("question") );
											 op1.setString(2, rs.getString("option_1"));
											 op1.setString(3,rs.getString("option_2") );
											 op1.setString(4, rs.getString("option_3"));
											 op1.setString(5, rs.getString("option_4"));
											 op1.setString(6, rs.getString("option_2"));
											 op1.setInt(7, 0);
											 op1.execute();
											 panel_5.setBackground(Color.BLACK);
											 textArea_3.setBackground(Color.BLACK);
											 textArea_3.setForeground(Color.RED);
											 textArea_3.setText(rs.getString("question")+"\n\t\tanswered:-"+rs.getString("option_2"));
										 } group1.clearSelection();
										 
									 }
									 else if(rdbtnNewRadioButton_4.isSelected())
									 {
										 if(rs.getString("option_3").equals(rs.getString("ans")) ) 
										 {
											 PreparedStatement op1= con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
											 op1.setString(1,rs.getString("question") );
											 op1.setString(2, rs.getString("option_1"));
											 op1.setString(3,rs.getString("option_2") );
											 op1.setString(4, rs.getString("option_3"));
											 op1.setString(5, rs.getString("option_4"));
											 op1.setString(6, rs.getString("option_3"));
											 op1.setInt(7, 1);
											 op1.execute();
											 textArea_3.setBackground(Color.BLUE);
											 textArea_3.setForeground(Color.GREEN);
											 textArea_3.setText(rs.getString("question")+"\n\t\tanswered:-"+rs.getString("option_3"));
										 } 
										 else
										 {
											 PreparedStatement op1= con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
											 op1.setString(1,rs.getString("question") );
											 op1.setString(2, rs.getString("option_1"));
											 op1.setString(3,rs.getString("option_2") );
											 op1.setString(4, rs.getString("option_3"));
											 op1.setString(5, rs.getString("option_4"));
											 op1.setString(6, rs.getString("option_3"));
											 op1.setInt(7, 0);
											 op1.execute();
											 panel_5.setBackground(Color.BLACK);
											 textArea_3.setBackground(Color.BLACK);
											 textArea_3.setForeground(Color.RED);
											 textArea_3.setText(rs.getString("question")+"\n\t\tanswered:-"+rs.getString("option_3"));
										 } group1.clearSelection();
									 }
									 else if(rdbtnNewRadioButton_5.isSelected())
									 {
										 if(rs.getString("option_4").equals(rs.getString("ans")) ) 
										 {
											 PreparedStatement op1= con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
											 op1.setString(1,rs.getString("question") );
											 op1.setString(2, rs.getString("option_1"));
											 op1.setString(3,rs.getString("option_2") );
											 op1.setString(4, rs.getString("option_3"));
											 op1.setString(5, rs.getString("option_4"));
											 op1.setString(6, rs.getString("option_4"));
											 op1.setInt(7, 1);
											 op1.execute();
											 textArea_3.setBackground(Color.BLUE);
											 textArea_3.setForeground(Color.GREEN);
											 textArea_3.setText(rs.getString("question")+"\n\t\tanswered:-"+rs.getString("option_4"));
										 }
										 else
										 {
											 PreparedStatement op1= con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
											 op1.setString(1,rs.getString("question") );
											 op1.setString(2, rs.getString("option_1"));
											 op1.setString(3,rs.getString("option_2") );
											 op1.setString(4, rs.getString("option_3"));
											 op1.setString(5, rs.getString("option_4"));
											 op1.setString(6, rs.getString("option_4"));
											 op1.setInt(7, 0);
											 op1.execute();
											 panel_5.setBackground(Color.BLACK);
											 textArea_3.setBackground(Color.BLACK);
											 textArea_3.setForeground(Color.RED);
											 textArea_3.setText(rs.getString("question")+"\n\t\tanswered:-"+rs.getString("option_4"));
											 
										 }
										 group1.clearSelection();
									 }
									 else
									 {
										 PreparedStatement op1= con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
										 op1.setString(1,rs.getString("question") );
										 op1.setString(2, rs.getString("option_1"));
										 op1.setString(3,rs.getString("option_2") );
										 op1.setString(4, rs.getString("option_3"));
										 op1.setString(5, rs.getString("option_4"));
										 op1.setString(6, "skipped");
										 op1.setInt(7, 0);
										 
										 op1.execute();  textArea_3.setForeground(Color.orange);
										 textArea_3.setText("NOT ANSWERED:-");
										 group1.clearSelection();
									 }
									
									 label.setText("");
									 lblNewLabel_27.setText("");
									 lblNewLabel_29.setText("");
									 lblNewLabel_31.setText("");
									 lblNewLabel_32.setText("");
									 rdbtnNewRadioButton_2.setVisible(false);
									 rdbtnNewRadioButton_3.setVisible(false);
									 rdbtnNewRadioButton_4.setVisible(false);
									 rdbtnNewRadioButton_5.setVisible(false);
									panel_5.setBackground(Color.GREEN);
									 textArea_3.setVisible(true);
									 scrollPane_2.setVisible(true);
									
									
									 
									}catch(Exception tt) {}
								
							}
						
					}};
					 t.scheduleAtFixedRate(task,1000,1000);
					 
						
				
					 }
					 catch(Exception e0) {
						 System.out.println(e0);
					 }
			}
		});
		
		
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i=0;
				if(textField_5.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(panel_1," name field is empty");i=1;
				}
				else if(textField.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(panel_1," email field is empty");i=1;
				}
				else if(textField_1.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(panel_1," phon no field is empty");i=1;
				}
				else if(textField_2.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(panel_1," username field is empty");i=1;
				}
				else if(new String(passwordField.getPassword()).isEmpty() ) 
				{
					
					JOptionPane.showMessageDialog(panel_1," password field is empty");i=1;
				}
				else if(new String(passwordField_2.getPassword()).isEmpty())
				{
					JOptionPane.showMessageDialog(panel_1," re password field is empty");i=1;
				
				}
				else if(!(new String(passwordField.getPassword()).equals((new String(passwordField_2.getPassword())))))
				{
					JOptionPane.showMessageDialog(panel_1," password mismatch in re password.");i=1;
				}
				if(i==0) {
				lblNewLabel.setVisible(false);
				lblNewLabel_1.setVisible(false);
				lblNewLabel_2.setVisible(false);
				lblNewLabel_3.setVisible(false);
				lblNewLabel_4.setVisible(false);
				lblNewLabel_5.setVisible(false);
				textField.setVisible(false);
				textField_1.setVisible(false);
				textField_2.setVisible(false);
				passwordField.setVisible(false);
				passwordField_2.setVisible(false);
				textField_5.setVisible(false);
				btnNewButton_17.setVisible(false);
				 btnNewButton_4.setVisible(false);
				 btnNewButton_2.setVisible(false);
				 btnNewButton_3.setVisible(false);
				 textField_4.setVisible(false);
				// lblNewLabel_6.setVisible(true);
				
								 
				 lblNewLabel_7.setVisible(false);
					rdbtnNewRadioButton.setVisible(false);
					rdbtnNewRadioButton_1.setVisible(false);
					btnNewButton_6.setVisible(false);
					chckbxNewCheckBox.setVisible(false);
					chckbxNewCheckBox_1.setVisible(false);
					chckbxNewCheckBox_2.setVisible(false);
					lblNewLabel_13.setVisible(false);
					comboBox.setVisible(false);
					lblNewLabel_14.setVisible(false);
					comboBox_1.setVisible(false);
					lblNewLabel_15.setVisible(false);
					
					
					JOptionPane.showMessageDialog(panel_2," Registered Successfully.");
					 textArea.setVisible(true); 
					 
					 
					
					 String a11=textField_5.getText();
					 String  a12=textField.getText();
					 String a13=textField_1.getText();
					 String a14=textField_2.getText();
					 String a15 = null;
					 String asd=passwordField.getText();
				   int m=Integer.parseInt(a13);
					 if(rdbtnNewRadioButton.isSelected())
					 {
						 a15="Male";
					 }
					 else if(rdbtnNewRadioButton_1.isSelected())
					 {
						 a15="Female";
					 }
					textArea.setText("\nName   :"+a11+"\n\nEmail    :"+a12+"\n\nMobile no    : "+a13+"\n\n Username    : "+a14+"\n\n Gender    : "+a15);
					
					btnNewButton_9.setVisible(true);
					 textField.setText("");
					 textField_1.setText("");
					 textField_4.setText("");
					 textField_5.setText("");
					// textField_2.setText("");
					 passwordField.setText("");
					 passwordField_2.setText("");

				
				try {
					 PreparedStatement ppp= con.prepareStatement("INSERT INTO register VALUES(?,?,?,?,?,?,?)");
					 
					 ppp.setString(1,a11);
					 ppp.setString(2, a12);
					 ppp.setInt(3,m);
					 ppp.setString(4, a14);
					 ppp.setString(5,asd);
					 ppp.setString(6, a15);
					 ppp.setInt(7, 0);
					 ppp.execute();
					}catch(Exception rr) {}	
				
			}}
		});
		btnGetResult.setVisible(false);
		btnGetResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnGetResult.setVisible(false);
				label.setText("");
				scrollPane_2.setVisible(true); textArea_3.setBackground(Color.white);
				textArea_3.setForeground(Color.black);
					textArea_3.setVisible(true);
					try {
					 ResultSet co = sta.executeQuery(" SELECT COUNT(*) from questions;");
					 co.next();
					 int count=co.getInt(1);
				
					 ResultSet co1 = sta.executeQuery("SELECT COUNT(*) FROM student WHERE mark =1;");
							 co1.next();
							//ResultSet co2; /*= sta.executeQuery("SELECT COUNT(*) FROM student WHERE answered =skipped;");
							// co2.next();*/
							 PreparedStatement ppp= con.prepareStatement("SELECT COUNT(*) FROM student WHERE answered =?;");
							 ppp.setString(1,"skipped");
							 ResultSet co2=ppp.executeQuery();co2.next();
							 textArea_3.setText("Score :- "+co1.getInt(1)+"\ncorrect :- "+co1.getInt(1)+"\nskipped :- "+co2.getInt(1)+"\nwrong :- "+(count-co1.getInt(1)-co2.getInt(1))+"\nTotal questions :- "+count);
				//	System.out.println("Score:-"+co1.getInt(1)+"\ncorrect :-"+co1.getInt(1)+"\nwrong :-"+(count-co1.getInt(1))));
					}catch(Exception mm0) {}
			}
		});
		//tabbedPane.setVisible(false);
		//panel_3.setVisible(false);
		
		
		
		class addd implements ActionListener{
			

			@Override
			public void actionPerformed(ActionEvent e) {
				String bb=textField_6.getText();
				int cc=Integer.parseInt(bb);  
				int i=table_1_1.getSelectedRow();
				
				i++;
				if(i<23)
		{
				if(textField_8.getText().equals("")||textField_9.getText().equals("")||textField_10.getText().equals("")||textField_11.getText().equals("")||textField_12.getText().equals("")||textField_13.getText().equals(""))
				
					{
					JOptionPane.showMessageDialog(panel_3,"please fill all the details....");
					}
				else
				{
					row[0]=textField_8.getText();
					
				row[1]=textField_9.getText();
				row[2]=textField_10.getText();
				row[3]=textField_11.getText();
				row[4]=textField_12.getText();
				row[5]=textField_13.getText();
				model.addRow(row);
				JOptionPane.showMessageDialog(panel,"added successfully.");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				
				
				}
		
			}
				else
					{
					JOptionPane.showMessageDialog(panel_3,"reached the question "+bb);
					}
				
			}
		 }
		class updatee implements ActionListener{
			

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int i=table_1_1.getSelectedRow();
					if(i>=0)
					{ 
						 
						 
						if(!textField_8.getText().equals("")) {
							
					model.setValueAt(textField_8.getText(),i,0);
					PreparedStatement bh= con.prepareStatement("update questions set question=? where option_1=?;");
					String qu=table_1_1.getValueAt(i,0).toString();
					String o1=table_1_1.getValueAt(i,1).toString();
					
					
					bh.setString(1,qu );
					
					bh.setString(2, o1);
					bh.execute();
					
						}
						else if(!textField_9.getText().equals(""))
						{
					model.setValueAt(textField_9.getText(),i,1);
					PreparedStatement bh1= con.prepareStatement("update questions set option_1=? where question=?;");
					String o1=table_1_1.getValueAt(i,1).toString();
					String qu=table_1_1.getValueAt(i,0).toString();
					
					
					bh1.setString(1,o1);
					
					bh1.setString(2,qu );
					bh1.execute();
						}
						else if(!textField_10.getText().equals(""))
						{
					model.setValueAt(textField_10.getText(),i,2);
					PreparedStatement bh2= con.prepareStatement("update questions set option_2=? where question=?;");
					String o2=table_1_1.getValueAt(i,2).toString();
					String qu=table_1_1.getValueAt(i,0).toString();
					
					
					bh2.setString(1,o2);
				
					bh2.setString(2,qu );
					bh2.execute();
						}
						else if(!textField_11.getText().equals(""))
						{
					model.setValueAt(textField_11.getText(),i,3);
					PreparedStatement bh3= con.prepareStatement("update questions set option_3=? where question=?;");
					String o3=table_1_1.getValueAt(i,3).toString();
					String qu=table_1_1.getValueAt(i,0).toString();
					
				
					bh3.setString(1,o3);
					
					bh3.setString(2,qu);
					bh3.execute();
						}
						else if(!textField_12.getText().equals(""))
						{
					model.setValueAt(textField_12.getText(),i,4);
					PreparedStatement bh4= con.prepareStatement("update questions set option_4=? where question=?;");
					String o4=table_1_1.getValueAt(i,4).toString();
					String qu=table_1_1.getValueAt(i,0).toString();
					
					
					bh4.setString(1,o4);
					
					bh4.setString(2,qu);
					bh4.execute();
						}
						else if(!textField_13.getText().equals(""))
						{
					model.setValueAt(textField_13.getText(),i,5);
					PreparedStatement bh5= con.prepareStatement("update questions set ans=? where question=?;");
					String an=table_1_1.getValueAt(i,5).toString();
					String qu=table_1_1.getValueAt(i,0).toString();
					
					
					bh5.setString(1,an);
					
					bh5.setString(2,qu);
					bh5.execute();
						}
					JOptionPane.showMessageDialog(panel_3,"updated successfully.");
					
					}
					else
					{
						JOptionPane.showMessageDialog(panel_3,"can't able to update");
					}
					}catch(Exception ww) {}
				
			}
		 }
		class deletee implements ActionListener{
			

			@Override
			public void actionPerformed(ActionEvent e) {
				int i=table_1_1.getSelectedRow();
				if(i>=0)
				{
					String qu=table_1_1.getValueAt(i,0).toString();
			
				  try {
					  PreparedStatement pp= con.prepareStatement("delete from questions where question=?;");
				  //sta.executeUpdate("delete from questions where S_no=;");
					  pp.setString(1,qu);
					  pp.execute();
						model.removeRow(i);
				}
				catch(Exception ii)
				{
					
				}
				
				}
				else
				{
					JOptionPane.showMessageDialog(panel,"can't able to delete");
				}
				
			}
		 }
		class submitt implements ActionListener{
			

			@Override
			public void actionPerformed(ActionEvent e) {
				textField_8.setVisible(false);
				textField_9.setVisible(false);
				textField_10.setVisible(false);
				textField_11.setVisible(false);
				textField_12.setVisible(false);
				textField_13.setVisible(false);
				scrollPane.setVisible(false);
				lblNewLabel_20.setVisible(false);
				lblNewLabel_21.setVisible(false);
				lblNewLabel_22.setVisible(false);
				lblNewLabel_23.setVisible(false);
				lblNewLabel_24.setVisible(false);
				lblNewLabel_25.setVisible(false);
				menuBar.setVisible(false);
				btnNewButton_13.setVisible(false);
				btnNewButton_14.setVisible(false);
				btnNewButton_12.setVisible(false);
				btnNewButton_15.setVisible(false);
				
				lblNewLabel_12.setVisible(true);
				tree.setVisible(true);
				for(int i=0;i<table_1_1.getRowCount();i++) {
				String qu=table_1_1.getValueAt(i,0).toString();
				String o1=table_1_1.getValueAt(i,1).toString();
				String o2=table_1_1.getValueAt(i,2).toString();
				String o3=table_1_1.getValueAt(i,3).toString();
				String o4=table_1_1.getValueAt(i,4).toString();
				String an=table_1_1.getValueAt(i,5).toString();
				
 try {
					 
					 PreparedStatement p= con.prepareStatement("INSERT INTO questions VALUES(?,?,?,?,?,?,?)");
					 p.setInt(1,i);
					 p.setString(2, qu);
					 p.setString(3, o1);
					 p.setString(4, o2);
					 p.setString(5, o3);
					 p.setString(6, o4);
					 p.setString(7, an);
					 p.execute();
					//sta.executeUpdate("INSERT INTO questions VALUES('"+i+"','"+qu+"','"+o1+"','"+o2+"','"+o3+"','"+o4+"','"+an+"')");
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				}
				
			}
		 }
		
		add.addActionListener(new addd());
	    update.addActionListener(new updatee());
		delete.addActionListener(new deletee());
		submit.addActionListener(new submitt());
		save.addActionListener(new submitt());
		
		
		
		 class resett implements ActionListener{
				

				@Override
				public void actionPerformed(ActionEvent e) {
					//int qwe=table_1.getRowCount();
					for(int i=table_1_1.getRowCount()-1;i>=0;i--) {
						
					model.removeRow(i);
						
					}
					
					
					 
					 try {
					 ResultSet rs = sta.executeQuery(" SELECT question,option_1,option_2,option_3,option_4,ans from questions;");
					
					 while(rs.next()){
						/*System.out.println(rs.getString("question"));
						 System.out.println(rs.getString("option_1"));
						 System.out.println(rs.getString("option_2"));
						 System.out.println(rs.getString("option_3"));
						 System.out.println(rs.getString("option_4"));
						 System.out.println(rs.getString("ans"));*/
						
						String a=rs.getString("question");
						String a1=rs.getString("option_1");
						String a2=rs.getString("option_2");
						String a3=rs.getString("option_3");
						String a4=rs.getString("option_4");
						String a5=rs.getString("ans");
						String a6[]= {a,a1,a2,a3,a4,a5};
						model.addRow(a6);
						
				           
				         }
					 }
					 catch(Exception e0) {
						 System.out.println(e0);
					 }
					
				}
			 }
		
		 Reset.addActionListener(new resett());
		 class project implements ActionListener{
				

				@Override
				public void actionPerformed(ActionEvent e) {
					int qwe=table_1_1.getRowCount();
					for(int i=qwe-1;i>=0;i--) {
						
					model.removeRow(i);
						
					}
					
				}
			 }
		new_pro.addActionListener(new project());
		
		
		class  fo1 implements ActionListener{
			

			@Override
			public void actionPerformed(ActionEvent e) {
				table_1_1.setFont(new Font( "Ebrima",Font.PLAIN, 11));
				}
				
			}
          class  fo2 implements ActionListener{
			

			@Override
			public void actionPerformed(ActionEvent e) {
				table_1_1.setFont(new Font( "Forte",Font.PLAIN, 11));
				}
				
			}
          class  fo3 implements ActionListener{
	

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	table_1_1.setFont(new Font( "Goudy Old Style",Font.PLAIN, 11));
			}
		
          }
        class  fo4 implements ActionListener{
	

        	@Override
        	public void actionPerformed(ActionEvent e) {
        		table_1_1.setFont(new Font( "Script MT Bold", Font.PLAIN , 11));
        	}
		
        	}
          class  fo5 implements ActionListener{
	

        	  @Override
        	  public void actionPerformed(ActionEvent e) {
        		  table_1_1.setFont(new Font("Times New Roman", Font.PLAIN , 11)); 
        	  }
		
          		}
          f1.addActionListener(new fo1());
          f2.addActionListener(new fo2());
          f3.addActionListener(new fo3());
          f4.addActionListener(new fo4());
          f5.addActionListener(new fo5());
          class  st1 implements ActionListener{
        		

        	  @Override
        	  public void actionPerformed(ActionEvent e) {
        		  table_1_1.setFont(new Font("", Font.PLAIN , 11)); 
        	  }
		
          		}
          class  st2 implements ActionListener{
        		

        	  @Override
        	  public void actionPerformed(ActionEvent e) {
        		  table_1_1.setFont(new Font("", Font.BOLD , 11)); 
        	  }
		
          		}
          class  st3 implements ActionListener{
        		

        	  @Override
        	  public void actionPerformed(ActionEvent e) {
        		  table_1_1.setFont(new Font("", Font.ITALIC , 11)); 
        	  }
		
          		}
          
          class  st4 implements ActionListener{
        		

        	  @Override
        	  public void actionPerformed(ActionEvent e) {
        		  table_1_1.setFont(new Font("", Font.BOLD | Font.ITALIC , 11)); 
        	  }
		
          		}
        s1.addActionListener(new st1());
        s2.addActionListener(new st2());
        s3.addActionListener(new st3());
        s4.addActionListener(new st4());
      
		
        		
        class si1 implements ActionListener{
    		

      	  @Override
      	  public void actionPerformed(ActionEvent e) {
      		  table_1_1.setFont(new Font("", Font.PLAIN , 8)); 
      	  }
		
        		}
        class  si2 implements ActionListener{
    		

      	  @Override
      	  public void actionPerformed(ActionEvent e) {
      		  table_1_1.setFont(new Font("", Font.PLAIN , 10)); 
      	  }
		
        		}
        class  si3 implements ActionListener{
    		

      	  @Override
      	  public void actionPerformed(ActionEvent e) {
      		  table_1_1.setFont(new Font("", Font.PLAIN , 12)); 
      	  }
		
        		}
        class  si4 implements ActionListener{
    		

      	  @Override
      	  public void actionPerformed(ActionEvent e) {
      		  table_1_1.setFont(new Font("",Font.PLAIN, 14)); 
      	  }
		
        		}
        class  si5 implements ActionListener{
    		

      	  @Override
      	  public void actionPerformed(ActionEvent e) {
      		  table_1_1.setFont(new Font("", Font.PLAIN , 16)); 
      	  }
		
        		}
        class  si6 implements ActionListener{
    		

      	  @Override
      	  public void actionPerformed(ActionEvent e) {
      		  table_1_1.setFont(new Font("",Font.PLAIN , 18)); 
      	  }
		
        		}
        class  si7 implements ActionListener{
    		

      	  @Override
      	  public void actionPerformed(ActionEvent e) {
      		  table_1_1.setFont(new Font("", Font.PLAIN, 20)); 
      	  }
		
        		}
        class  si8 implements ActionListener{
    		

      	  @Override
      	  public void actionPerformed(ActionEvent e) {
      		  table_1_1.setFont(new Font("",Font.PLAIN, 22)); 
      	  }
		
        		}
        z1.addActionListener(new si1());
        z2.addActionListener(new si2());
        z3.addActionListener(new si3());
        z4.addActionListener(new si4());
        z5.addActionListener(new si5());
        z6.addActionListener(new si6());
        z7.addActionListener(new si7());
        z8.addActionListener(new si8());
        class  sn1 implements ActionListener{
    		

        	  @Override
        	  public void actionPerformed(ActionEvent e) {
        		  table_1_1.setBackground(new Color(0, 255, 255));
        	  }
  		
          		}
        class  sn2 implements ActionListener{
    		

        	  @Override
        	  public void actionPerformed(ActionEvent e) {
        		  table_1_1.setBackground(Color.YELLOW);
        	  }
  		
          		}
        rdbtnmntmNewRadioItem_1 .addActionListener(new sn1());
        rdbtnmntmNewRadioItem .addActionListener(new sn2());
        
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	
	}
	public Color getTable_1_1SelectionForeground() {
		return table_1_1.getSelectionForeground();
	}
	public void setTable_1_1SelectionForeground(Color selectionForeground) {
		table_1_1.setSelectionForeground(selectionForeground);
	}
	public boolean getTable_1_1AutoCreateRowSorter() {
		return table_1_1.getAutoCreateRowSorter();
	}
	public void setTable_1_1AutoCreateRowSorter(boolean autoCreateRowSorter) {
		table_1_1.setAutoCreateRowSorter(autoCreateRowSorter);
	}
}