package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Window.Type;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.border.BevelBorder;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import controller.Maincontroller;
import models.Employee;

import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class AdminPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField_4;
	private JTextField textField;
	private Maincontroller maincontroller;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage();
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
	public AdminPage() {
		
		maincontroller = Maincontroller.getMaincontroller()
				;
		setTitle("CEU");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdminPage.class.getResource("/Images/download (2).jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 5, 706, 371);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(105, 142, 488, 216);
		panel.add(scrollPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		scrollPane.setViewportView(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));

		
		JPanel frontPage = new JPanel();
		frontPage.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		frontPage.setBackground(new Color(112, 128, 144));
		layeredPane.add(frontPage, "name_196395047824700");
		frontPage.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Serif", Font.BOLD, 28));
		lblWelcome.setBounds(130, 68, 180, 79);
		frontPage.add(lblWelcome);
		
		JPanel ListofEmployees = new JPanel();
		ListofEmployees.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		layeredPane.setLayer(ListofEmployees, 0);
		ListofEmployees.setBackground(new Color(112, 128, 144));
		layeredPane.add(ListofEmployees, "name_196395057713500");
		
		
		String data[][] = new String [maincontroller.getEmployeeList().size()][6];
		
		for(int i = 0; i < maincontroller.getEmployeeList().size(); i++) {
			for(int j = 0; j < 6; j++) {
				
			if(j == 0) {
				data[i][j]= String.valueOf(maincontroller.getEmployeeList().get(i).getEmployee_id());
			}else if(j == 1) {
				data[i][j]= maincontroller.getEmployeeList().get(i).getPosition_title();
			}else if(j == 2) {
				data[i][j]= maincontroller.getEmployeeList().get(i).getFirstname();
			}else if(j == 3) {
				data[i][j]= maincontroller.getEmployeeList().get(i).getLastname();
			}else if(j == 4) {
				data[i][j]= String.valueOf(maincontroller.getEmployeeList().get(i).getAge());
			}else if(j == 5) {
				data[i][j]= String.valueOf(maincontroller.getEmployeeList().get(i).getPhone_number());
			}
			}	
		}
		
		String coloumns [] = {"ID#", "Position", "First Name", "Last Name", "Age", "Contact Information"};
		JTable table = new JTable(data, coloumns);
		table.setFillsViewportHeight(true);
		

		table.setForeground(new Color(138, 43, 226));
		table.setBackground(new Color(230, 230, 250));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridheight = 2;
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 1;
		JScrollPane pane = new JScrollPane(table);
		ListofEmployees.add(pane, gbc_list);
			
		JLabel lblXxxx = new JLabel("XXXX");
		lblXxxx.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblXxxx.setForeground(new Color(112, 128, 144));
		GridBagConstraints gbc_lblXxxx = new GridBagConstraints();
		gbc_lblXxxx.insets = new Insets(0, 0, 5, 0);
		gbc_lblXxxx.gridx = 1;
		gbc_lblXxxx.gridy = 0;
		ListofEmployees.add(lblXxxx, gbc_lblXxxx);
		
		JLabel lblXxx = new JLabel("X");
		lblXxx.setForeground(new Color(112, 128, 144));
		lblXxx.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblXxx = new GridBagConstraints();
		gbc_lblXxx.insets = new Insets(0, 0, 5, 5);
		gbc_lblXxx.gridx = 0;
		gbc_lblXxx.gridy = 1;
		ListofEmployees.add(lblXxx, gbc_lblXxx);
		
		JPanel InOut = new JPanel();
		InOut.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		InOut.setBackground(new Color(112, 128, 144));
		layeredPane.add(InOut, "name_196395069402300");
		
		String data07[][] = new String [maincontroller.getEmployeeList().size()][5];
		
		for(int i = 0; i < maincontroller.getEmployeeList().size(); i++) {
			for(int j = 0; j < 5; j++) {
				
			if(j == 0) {
				data07[i][j]= String.valueOf(maincontroller.getEmployeeList().get(i).getEmployeeId());
			}else if(j == 1) {
				data07[i][j]= maincontroller.getEmployeeList().get(i).getPosition_title();
			}else if(j == 2) {
				data07[i][j]= maincontroller.getEmployeeList().get(i).getFirstname();
			}else if(j == 3) {
				data07[i][j]= maincontroller.getEmployeeList().get(i).getLastname();
			}else if(j == 4) {
				data07[i][j]= maincontroller.getEmployeeList().get(i).getStatus_name();
			}
			}	
		}
		
		
		String coloumns07 [] = {"ID#", "Position", "First Name", "Last Name", "Checked"};
		JTable table07 = new JTable(data07, coloumns07);

		table07.setForeground(new Color(138, 43, 226));
		table07.setBackground(new Color(230, 230, 250));
		table07.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		GridBagConstraints gbc_list07 = new GridBagConstraints();
		gbc_list07.gridheight = 2;
		gbc_list07.fill = GridBagConstraints.BOTH;
		gbc_list07.gridx = 1;
		gbc_list07.gridy = 1;
		InOut.add(new JScrollPane(table07), gbc_list07);
		
		
		
		JPanel AddAssets = new JPanel();
		AddAssets.setBackground(new Color(112, 128, 144));
		layeredPane.add(AddAssets, "name_196395080912800");
		
		JPanel UpdateAssets = new JPanel();
		UpdateAssets.setBackground(new Color(112, 128, 144));
		UpdateAssets.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		layeredPane.add(UpdateAssets, "name_196395090475400");
		
		JPanel GPAssets = new JPanel();
		GPAssets.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		GPAssets.setBackground(new Color(112, 128, 144));
		layeredPane.add(GPAssets, "name_196395099922000");
		
		String data02[][] = new String [maincontroller.getGPAssets().size()][5];
		
		for(int i = 0; i < maincontroller.getGPAssets().size(); i++) {
			for(int j = 0; j < 5; j++) {
				
			if(j == 0) {
				data02[i][j]= maincontroller.getGPAssets().get(i).getName();
			}else if(j == 1) {
				data02[i][j]= maincontroller.getGPAssets().get(i).getStats();
			}else if(j == 2) {
				data02[i][j]= maincontroller.getGPAssets().get(i).getLocation();
			}else if(j == 3) {
				data02[i][j]= maincontroller.getGPAssets().get(i).getFirstname() +" "+ maincontroller.getAssets().get(i).getLastname();
			}else if(j == 4) {
				data02[i][j]= maincontroller.getGPAssets().get(i).getLastname();
			}
			}	
		}
		
		
		String coloumns02 [] = {"Item", "Availablity", "Location", "Checked Out By"};
		JTable table02 = new JTable(data02, coloumns02);

		table02.setForeground(new Color(138, 43, 226));
		table02.setBackground(new Color(230, 230, 250));
		table02.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		GridBagConstraints gbc_list02 = new GridBagConstraints();
		gbc_list02.gridheight = 2;
		gbc_list02.fill = GridBagConstraints.BOTH;
		gbc_list02.gridx = 1;
		gbc_list02.gridy = 1;
		GPAssets.add(new JScrollPane(table02), gbc_list02);
		
		
		
		JPanel LVAssets = new JPanel();
		LVAssets.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		LVAssets.setBackground(new Color(112, 128, 144));
		layeredPane.add(LVAssets, "name_196395112089900");
		
		String data03[][] = new String [maincontroller.getLvAssets().size()][5];
		
		for(int i = 0; i < maincontroller.getLvAssets().size(); i++) {
			for(int j = 0; j < 5; j++) {
				
			if(j == 0) {
				data03[i][j]= maincontroller.getLvAssets().get(i).getName();
			}else if(j == 1) {
				data03[i][j]= maincontroller.getLvAssets().get(i).getStats();
			}else if(j == 2) {
				data03[i][j]= maincontroller.getLvAssets().get(i).getLocation();
			}else if(j == 3) {
				data03[i][j]= maincontroller.getLvAssets().get(i).getFirstname() +" "+ maincontroller.getAssets().get(i).getLastname();
			}else if(j == 4) {
				data03[i][j]= maincontroller.getLvAssets().get(i).getLastname();
			}
			}	
		}
		
		
		String coloumns03 [] = {"Item", "Availablity", "Location", "Checked Out By"};
		JTable table03 = new JTable(data03, coloumns03);

		table03.setForeground(new Color(138, 43, 226));
		table03.setBackground(new Color(230, 230, 250));
		table03.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		GridBagConstraints gbc_list03 = new GridBagConstraints();
		gbc_list03.gridheight = 2;
		gbc_list03.fill = GridBagConstraints.BOTH;
		gbc_list03.gridx = 1;
		gbc_list03.gridy = 1;
		LVAssets.add(new JScrollPane(table03), gbc_list03);
		
		
		JPanel ViewAllAssets = new JPanel();
		ViewAllAssets.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		ViewAllAssets.setBackground(new Color(112, 128, 144));
		layeredPane.add(ViewAllAssets, "name_196395122498100");
		GridBagLayout gbl_ViewAllAssets = new GridBagLayout();
		
		ViewAllAssets.setLayout(gbl_ViewAllAssets);
				
		String data01[][] = new String [maincontroller.getAssets().size()][5];
		
		for(int i = 0; i < maincontroller.getAssets().size(); i++) {
			for(int j = 0; j < 5; j++) {
				
			if(j == 0) {
				data01[i][j]= maincontroller.getAssets().get(i).getName();
			}else if(j == 1) {
				data01[i][j]= maincontroller.getAssets().get(i).getStats();
			}else if(j == 2) {
				data01[i][j]= maincontroller.getAssets().get(i).getLocation();
			}else if(j == 3) {
				data01[i][j]= maincontroller.getAssets().get(i).getFirstname() +" "+ maincontroller.getAssets().get(i).getLastname();
			}else if(j == 4) {
				data01[i][j]= maincontroller.getAssets().get(i).getLastname();
			}
			}	
		}
		
		String coloumns01 [] = {"Item", "Availablity", "Location", "Checked Out By"};
		JTable table_1 = new JTable(data01, coloumns01);
		table_1.setFillsViewportHeight(true);

		table_1.setForeground(new Color(138, 43, 226));
		table_1.setBackground(new Color(230, 230, 250));
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		GridBagConstraints gbc_list01 = new GridBagConstraints();
		gbc_list01.anchor = GridBagConstraints.NORTHWEST;
		gbc_list01.gridx = 1;
		gbc_list01.gridy = 1;
				
		GridBagConstraints gbc_table_1 = new GridBagConstraints();
		gbc_table_1.insets = new Insets(0, 0, 5, 0);
		gbc_table_1.fill = GridBagConstraints.BOTH;
		gbc_table_1.gridx = 0;
		gbc_table_1.gridy = 1;
		ViewAllAssets.add(new JScrollPane(table_1), gbc_list01);
		
		JPanel Borrowed = new JPanel();
		Borrowed.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Borrowed.setBackground(new Color(112, 128, 144));
		layeredPane.add(Borrowed, "name_196395132227700");
		
		String data04[][] = new String [maincontroller.getBorrowed().size()][5];
		
		for(int i = 0; i < maincontroller.getBorrowed().size(); i++) {
			for(int j = 0; j < 5; j++) {
				
			if(j == 0) {
				data04[i][j]= maincontroller.getBorrowed().get(i).getName();
			}else if(j == 1) {
				data04[i][j]= maincontroller.getBorrowed().get(i).getStats();
			}else if(j == 2) {
				data04[i][j]= maincontroller.getBorrowed().get(i).getLocation();
			}else if(j == 3) {
				data04[i][j]= maincontroller.getBorrowed().get(i).getFirstname() +" "+ maincontroller.getBorrowed().get(i).getLastname();
			}else if(j == 4) {
				data04[i][j]= maincontroller.getBorrowed().get(i).getLastname();
			}
			}	
		}
		
		JTable table_4 = new JTable(data04, coloumns01);

		table_4.setForeground(new Color(138, 43, 226));
		table_4.setBackground(new Color(230, 230, 250));
		table_4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		GridBagConstraints gbc_list04 = new GridBagConstraints();
		gbc_list04.anchor = GridBagConstraints.NORTHWEST;
		gbc_list04.gridx = 1;
		gbc_list04.gridy = 1;
				
		GridBagConstraints gbc_table_4 = new GridBagConstraints();
		gbc_table_4.insets = new Insets(0, 0, 5, 0);
		gbc_table_4.fill = GridBagConstraints.BOTH;
		gbc_table_4.gridx = 0;
		gbc_table_4.gridy = 1;
		Borrowed.add(new JScrollPane(table_4), gbc_list04);
		
		JPanel Returned = new JPanel();
		Returned.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Returned.setBackground(new Color(112, 128, 144));
		layeredPane.add(Returned, "name_196395141658700");
		
		String data05[][] = new String [maincontroller.getReturned().size()][5];
		
		for(int i = 0; i < maincontroller.getReturned().size(); i++) {
			for(int j = 0; j < 5; j++) {
				
			if(j == 0) {
				data05[i][j]= maincontroller.getReturned().get(i).getName();
			}else if(j == 1) {
				data05[i][j]= maincontroller.getReturned().get(i).getStats();
			}else if(j == 2) {
				data05[i][j]= maincontroller.getReturned().get(i).getLocation();
			}else if(j == 3) {
				data05[i][j]= maincontroller.getReturned().get(i).getFirstname() +" "+ maincontroller.getReturned().get(i).getLastname();
			}else if(j == 4) {
				data05[i][j]= maincontroller.getReturned().get(i).getLastname();
			}
			}	
		}
		
		JTable table_5 = new JTable(data05, coloumns01);

		table_5.setForeground(new Color(138, 43, 226));
		table_5.setBackground(new Color(230, 230, 250));
		table_5.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		GridBagConstraints gbc_list05 = new GridBagConstraints();
		gbc_list05.anchor = GridBagConstraints.NORTHWEST;
		gbc_list05.gridx = 1;
		gbc_list05.gridy = 1;
				
		GridBagConstraints gbc_table_5 = new GridBagConstraints();
		gbc_table_5.insets = new Insets(0, 0, 5, 0);
		gbc_table_5.fill = GridBagConstraints.BOTH;
		gbc_table_5.gridx = 0;
		gbc_table_5.gridy = 1;
		Returned.add(new JScrollPane(table_5), gbc_list05);
		
		JPanel Available = new JPanel();
		Available.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Available.setBackground(new Color(112, 128, 144));
		layeredPane.add(Available, "name_196395151350100");
		
		String data06[][] = new String [maincontroller.getAvailable().size()][5];
		
		for(int i = 0; i < maincontroller.getAvailable().size(); i++) {
			for(int j = 0; j < 5; j++) {
				
			if(j == 0) {
				data06[i][j]= maincontroller.getAvailable().get(i).getName();
			}else if(j == 1) {
				data06[i][j]= maincontroller.getAvailable().get(i).getStats();
			}else if(j == 2) {
				data06[i][j]= maincontroller.getAvailable().get(i).getLocation();
			}else if(j == 3) {
				data06[i][j]= maincontroller.getAvailable().get(i).getFirstname() +" "+ maincontroller.getAvailable().get(i).getLastname();
			}else if(j == 4) {
				data06[i][j]= maincontroller.getAvailable().get(i).getLastname();
			}
			}	
		}
		
		JTable table_6 = new JTable(data06, coloumns01);

		table_6.setForeground(new Color(138, 43, 226));
		table_6.setBackground(new Color(230, 230, 250));
		table_6.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		GridBagConstraints gbc_list06 = new GridBagConstraints();
		gbc_list06.anchor = GridBagConstraints.NORTHWEST;
		gbc_list06.gridx = 1;
		gbc_list06.gridy = 1;
				
		GridBagConstraints gbc_table_6 = new GridBagConstraints();
		gbc_table_6.insets = new Insets(0, 0, 5, 0);
		gbc_table_6.fill = GridBagConstraints.BOTH;
		gbc_table_6.gridx = 0;
		gbc_table_6.gridy = 1;
		Available.add(new JScrollPane(table_6), gbc_list06);
		
		JPanel AccountInfos = new JPanel();
		AccountInfos.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		AccountInfos.setBackground(new Color(112, 128, 144));
		layeredPane.add(AccountInfos, "name_196395160735600");
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 706, 26);
		panel.add(menuBar);
		
		JMenu jm = new JMenu("Daily Reports");
		menuBar.add(jm);
		
		JMenuItem mntmListOfEmployees = new JMenuItem("LIST OF EMPLOYEES");
		mntmListOfEmployees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.removeAll();
				layeredPane.add(ListofEmployees);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		jm.add(mntmListOfEmployees);
		
		JMenuItem jmi = new JMenuItem("IN - OUT");
		jmi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(InOut);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
	
		jm.add(jmi);
		
		JMenu mnAssets = new JMenu("Assets");
		menuBar.add(mnAssets);
		
		JMenuItem mntmAddAssets = new JMenuItem("ADD ASSETS");
		mntmAddAssets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.removeAll();
				layeredPane.add(AddAssets);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		mnAssets.add(mntmAddAssets);
		
		JMenuItem mntmUpdateAssets = new JMenuItem("UPDATE ASSETS");
		mntmUpdateAssets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(UpdateAssets);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		mnAssets.add(mntmUpdateAssets);
		
		JMenu mnInventories = new JMenu("Inventories");
		menuBar.add(mnInventories);
		
		JMenuItem mntmCeuMakatiGp = new JMenuItem("CEU MAKATI GP ASSETS");
		mntmCeuMakatiGp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.removeAll();
				layeredPane.add(GPAssets);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		mnInventories.add(mntmCeuMakatiGp);
		
		JMenuItem mntmCeuMakatiLv = new JMenuItem("CEU MAKATI LV ASSETS");
		mntmCeuMakatiLv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(LVAssets);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		mnInventories.add(mntmCeuMakatiLv);
		
		JMenuItem mntmViewAllCeu = new JMenuItem("VIEW ALL CEU MAKATI ASSETS");
		mntmViewAllCeu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(ViewAllAssets);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		mnInventories.add(mntmViewAllCeu);
		
		JMenu mnStatusOfAssets = new JMenu("Status of Assets");
		menuBar.add(mnStatusOfAssets);
		
		JMenuItem mntmBorrowed = new JMenuItem("BORROWED");
		mntmBorrowed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Borrowed);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		mnStatusOfAssets.add(mntmBorrowed);
		
		JMenuItem mntmReturn = new JMenuItem("RETURN");
		mntmReturn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Returned);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		mnStatusOfAssets.add(mntmReturn);

		JMenuItem mntmAvailable = new JMenuItem("AVAILABLE");
		mntmAvailable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Available);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		mnStatusOfAssets.add(mntmAvailable);
		
		JMenu mnSettings = new JMenu("Settings");
		menuBar.add(mnSettings);
		
		JMenuItem mntmAccountInformation = new JMenuItem("Account Information");
		mntmAccountInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.removeAll();
				layeredPane.add(AccountInfos);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		mnSettings.add(mntmAccountInformation);
		
		JMenuItem mntmSignOut = new JMenuItem("Sign Out");
		mntmSignOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LScreen Ls = new LScreen();
				int response = JOptionPane.showConfirmDialog(null, "Do you wish to signout?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				
				if(response == JOptionPane.YES_OPTION) {
					Ls.setVisible(true);
					dispose();
				}else if (response == JOptionPane.NO_OPTION) {
					return;
				}else if(response == JOptionPane.CLOSED_OPTION) {
					return;
				}
			}
		});
		mnSettings.add(mntmSignOut);
		
				JLabel lblLogo = new JLabel("");
				lblLogo.setIcon(new ImageIcon(AdminPage.class.getResource("/Images/download12.png")));
				lblLogo.setBounds(-13, 28, 719, 112);
				panel.add(lblLogo);
				
				JLabel lblBackground = new JLabel("");
				lblBackground.setIcon(new ImageIcon(AdminPage.class.getResource("/Images/12.jpg")));
				lblBackground.setBounds(-3, 142, 696, 241);
				panel.add(lblBackground);
	}
}
