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
import javax.swing.JSeparator;

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
import javax.swing.border.CompoundBorder;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import controller.Maincontroller;
import models.Employee;

import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.JPopupMenu;
import java.awt.Component;

public class AdminPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField_4;
	private JTextField textField;
	private Maincontroller maincontroller;
	private JTable table_1;
	private JTextField AddAssetss;

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
		
		maincontroller = Maincontroller.getMaincontroller();
		
		setTitle("CEU");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdminPage.class.getResource("/Images/download (2).jpg")));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
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
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 228, 225));
		panel_2.setBounds(120, 34, 243, 151);
		frontPage.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setBounds(12, 25, 108, 37);
		panel_2.add(lblWelcome);
		lblWelcome.setForeground(Color.BLACK);
		lblWelcome.setFont(new Font("Serif", Font.BOLD, 28));
		
		JLabel lblBack = new JLabel(maincontroller.getLoggedInEmployee().getFirstname() + " " +maincontroller.getLoggedInEmployee().getLastname() );
		lblBack.setForeground(Color.BLACK);
		lblBack.setFont(new Font("Serif", Font.BOLD, 21));
		lblBack.setBounds(22, 79, 209, 37);
		panel_2.add(lblBack);
		
		JPanel ListofEmployees = new JPanel();
		ListofEmployees.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		layeredPane.setLayer(ListofEmployees, 0);
		ListofEmployees.setBackground(new Color(112, 128, 144));
		layeredPane.add(ListofEmployees, "name_196395057713500");
			
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
	
		JPanel AddAssets = new JPanel();
		AddAssets.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
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

		JPanel LVAssets = new JPanel();
		LVAssets.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		LVAssets.setBackground(new Color(112, 128, 144));
		layeredPane.add(LVAssets, "name_196395112089900");
		
		JPanel ViewAllAssets = new JPanel();
		ViewAllAssets.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		ViewAllAssets.setBackground(new Color(112, 128, 144));
		layeredPane.add(ViewAllAssets, "name_196395122498100");
		GridBagLayout gbl_ViewAllAssets = new GridBagLayout();
		
		ViewAllAssets.setLayout(gbl_ViewAllAssets);
				
		
		JPanel Borrowed = new JPanel();
		Borrowed.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Borrowed.setBackground(new Color(112, 128, 144));
		layeredPane.add(Borrowed, "name_196395132227700");
		
		
		
		JPanel Returned = new JPanel();
		Returned.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Returned.setBackground(new Color(112, 128, 144));
		layeredPane.add(Returned, "name_196395141658700");
		
		
		
		JPanel Available = new JPanel();
		Available.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Available.setBackground(new Color(112, 128, 144));
		layeredPane.add(Available, "name_196395151350100");
		
		JPanel AccountInfos = new JPanel();
		AccountInfos.setForeground(new Color(0, 0, 0));
		AccountInfos.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		AccountInfos.setBackground(new Color(255, 228, 225));
		layeredPane.add(AccountInfos, "name_196395160735600");
		
		AccountInfos.setBorder(new CompoundBorder(new MatteBorder(60, 60, 60, 100, (Color) new Color(112, 128, 144)), new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0))));
		AccountInfos.setBackground(new Color(119, 136, 153));
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE, 0.0, 0.0, 0.0, 0.0};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE, 0.0, 0.0, 0.0, 0.0};
		AccountInfos.setLayout(gbl_panel_3);
		
		JLabel label_31 = new JLabel("AAA");
		label_31.setBackground(new Color(255, 228, 225));
		label_31.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_31 = new GridBagConstraints();
		gbc_label_31.insets = new Insets(0, 0, 5, 5);
		gbc_label_31.gridx = 2;
		gbc_label_31.gridy = 0;
		AccountInfos.add(label_31, gbc_label_31);
		
		JLabel label_32 = new JLabel("AAA");
		label_32.setBackground(new Color(255, 228, 225));
		label_32.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_32.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_32 = new GridBagConstraints();
		gbc_label_32.insets = new Insets(0, 0, 5, 5);
		gbc_label_32.gridx = 3;
		gbc_label_32.gridy = 0;
		AccountInfos.add(label_32, gbc_label_32);
		
		JLabel label_30 = new JLabel("AAA");
		label_30.setBackground(new Color(255, 228, 225));
		label_30.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_30 = new GridBagConstraints();
		gbc_label_30.insets = new Insets(0, 0, 5, 5);
		gbc_label_30.gridx = 2;
		gbc_label_30.gridy = 1;
		AccountInfos.add(label_30, gbc_label_30);
		
		JLabel lblPersonalInformation_1 = new JLabel("Personal Information");
		lblPersonalInformation_1.setBackground(new Color(0, 0, 0));
		lblPersonalInformation_1.setForeground(new Color(240, 255, 255));
		lblPersonalInformation_1.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_lblPersonalInformation_1 = new GridBagConstraints();
		gbc_lblPersonalInformation_1.gridwidth = 5;
		gbc_lblPersonalInformation_1.anchor = GridBagConstraints.WEST;
		gbc_lblPersonalInformation_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblPersonalInformation_1.gridx = 2;
		gbc_lblPersonalInformation_1.gridy = 2;
		AccountInfos.add(lblPersonalInformation_1, gbc_lblPersonalInformation_1);
		
		JLabel label_28 = new JLabel("AAA");
		label_28.setBackground(new Color(255, 228, 225));
		label_28.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_28 = new GridBagConstraints();
		gbc_label_28.gridwidth = 7;
		gbc_label_28.insets = new Insets(0, 0, 5, 5);
		gbc_label_28.gridx = 0;
		gbc_label_28.gridy = 3;
		AccountInfos.add(label_28, gbc_label_28);
		
		JLabel lblI = new JLabel("AAA");
		lblI.setBackground(new Color(255, 228, 225));
		lblI.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_lblI = new GridBagConstraints();
		gbc_lblI.insets = new Insets(0, 0, 5, 5);
		gbc_lblI.gridx = 0;
		gbc_lblI.gridy = 4;
		AccountInfos.add(lblI, gbc_lblI);
		
		JLabel label_11 = new JLabel("AAA");
		label_11.setBackground(new Color(255, 228, 225));
		label_11.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 1;
		gbc_label_11.gridy = 4;
		AccountInfos.add(label_11, gbc_label_11);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBackground(new Color(0, 0, 0));
		lblFirstName.setForeground(new Color(240, 255, 255));
		lblFirstName.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_lblFirstName = new GridBagConstraints();
		gbc_lblFirstName.anchor = GridBagConstraints.WEST;
		gbc_lblFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstName.gridx = 2;
		gbc_lblFirstName.gridy = 4;
		AccountInfos.add(lblFirstName, gbc_lblFirstName);
		
		JLabel label_2 = new JLabel(maincontroller.getLoggedInEmployee().getFirstname());
		label_2.setForeground(new Color(240, 255, 255));
		label_2.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.gridwidth = 2;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 4;
		gbc_label_2.gridy = 4;
		AccountInfos.add(label_2, gbc_label_2);
		
		JLabel label_13 = new JLabel("AAA");
		label_13.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.insets = new Insets(0, 0, 5, 5);
		gbc_label_13.gridx = 0;
		gbc_label_13.gridy = 5;
		AccountInfos.add(label_13, gbc_label_13);
		
		JLabel label_12 = new JLabel("AAA");
		label_12.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.insets = new Insets(0, 0, 5, 5);
		gbc_label_12.gridx = 1;
		gbc_label_12.gridy = 5;
		AccountInfos.add(label_12, gbc_label_12);
		
		JLabel lblMiddleName = new JLabel("Middle Name:");
		lblMiddleName.setForeground(new Color(240, 255, 255));
		lblMiddleName.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_lblMiddleName = new GridBagConstraints();
		gbc_lblMiddleName.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblMiddleName.insets = new Insets(0, 0, 5, 5);
		gbc_lblMiddleName.gridx = 2;
		gbc_lblMiddleName.gridy = 5;
		AccountInfos.add(lblMiddleName, gbc_lblMiddleName);
		
		JLabel label_14 = new JLabel("AAA");
		label_14.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_14 = new GridBagConstraints();
		gbc_label_14.insets = new Insets(0, 0, 5, 5);
		gbc_label_14.gridx = 0;
		gbc_label_14.gridy = 6;
		AccountInfos.add(label_14, gbc_label_14);
		
		JLabel label_15 = new JLabel("AAA");
		label_15.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_15 = new GridBagConstraints();
		gbc_label_15.insets = new Insets(0, 0, 5, 5);
		gbc_label_15.gridx = 1;
		gbc_label_15.gridy = 6;
		AccountInfos.add(label_15, gbc_label_15);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setForeground(new Color(240, 255, 255));
		lblLastName.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_lblLastName = new GridBagConstraints();
		gbc_lblLastName.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblLastName.insets = new Insets(0, 0, 5, 5);
		gbc_lblLastName.gridx = 2;
		gbc_lblLastName.gridy = 6;
		AccountInfos.add(lblLastName, gbc_lblLastName);
		
		JLabel label_4 = new JLabel(maincontroller.getLoggedInEmployee().getLastname());
		label_4.setForeground(new Color(240, 255, 255));
		label_4.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.gridwidth = 2;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 4;
		gbc_label_4.gridy = 6;
		AccountInfos.add(label_4, gbc_label_4);
		
		JLabel label_17 = new JLabel("AAA");
		label_17.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_17 = new GridBagConstraints();
		gbc_label_17.insets = new Insets(0, 0, 5, 5);
		gbc_label_17.gridx = 0;
		gbc_label_17.gridy = 7;
		AccountInfos.add(label_17, gbc_label_17);
		
		JLabel label_16 = new JLabel("AAA");
		label_16.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_16 = new GridBagConstraints();
		gbc_label_16.insets = new Insets(0, 0, 5, 5);
		gbc_label_16.gridx = 1;
		gbc_label_16.gridy = 7;
		AccountInfos.add(label_16, gbc_label_16);
	
		
		JLabel label_26 = new JLabel("AAA");
		label_26.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_26 = new GridBagConstraints();
		gbc_label_26.gridwidth = 7;
		gbc_label_26.insets = new Insets(0, 0, 5, 5);
		gbc_label_26.gridx = 0;
		gbc_label_26.gridy = 8;
		AccountInfos.add(label_26, gbc_label_26);
		
		JLabel label_18 = new JLabel("AAA");
		label_18.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_18 = new GridBagConstraints();
		gbc_label_18.insets = new Insets(0, 0, 5, 5);
		gbc_label_18.gridx = 0;
		gbc_label_18.gridy = 9;
		AccountInfos.add(label_18, gbc_label_18);
		
		JLabel label_19 = new JLabel("AAA");
		label_19.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_19 = new GridBagConstraints();
		gbc_label_19.insets = new Insets(0, 0, 5, 5);
		gbc_label_19.gridx = 1;
		gbc_label_19.gridy = 9;
		AccountInfos.add(label_19, gbc_label_19);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth:");
		lblDateOfBirth.setForeground(new Color(240, 255, 255));
		lblDateOfBirth.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_lblDateOfBirth = new GridBagConstraints();
		gbc_lblDateOfBirth.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblDateOfBirth.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateOfBirth.gridx = 2;
		gbc_lblDateOfBirth.gridy = 9;
		AccountInfos.add(lblDateOfBirth, gbc_lblDateOfBirth);
		
		JLabel label_6 = new JLabel(maincontroller.getLoggedInEmployee().getDate_of_birth().toString());
		label_6.setForeground(new Color(240, 255, 255));
		label_6.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.gridwidth = 2;
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 4;
		gbc_label_6.gridy = 9;
		AccountInfos.add(label_6, gbc_label_6);
		
		JLabel label_21 = new JLabel("AAA");
		label_21.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_21 = new GridBagConstraints();
		gbc_label_21.insets = new Insets(0, 0, 5, 5);
		gbc_label_21.gridx = 0;
		gbc_label_21.gridy = 10;
		AccountInfos.add(label_21, gbc_label_21);
		
		JLabel label_20 = new JLabel("AAA");
		label_20.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_20 = new GridBagConstraints();
		gbc_label_20.insets = new Insets(0, 0, 5, 5);
		gbc_label_20.gridx = 1;
		gbc_label_20.gridy = 10;
		AccountInfos.add(label_20, gbc_label_20);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setForeground(new Color(240, 255, 255));
		lblAge.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_lblAge = new GridBagConstraints();
		gbc_lblAge.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblAge.insets = new Insets(0, 0, 5, 5);
		gbc_lblAge.gridx = 2;
		gbc_lblAge.gridy = 10;
		AccountInfos.add(lblAge, gbc_lblAge);
		
		JLabel label_7 = new JLabel(String.valueOf(maincontroller.getLoggedInEmployee().getAge()));
		label_7.setForeground(new Color(240, 255, 255));
		label_7.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.gridwidth = 2;
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 4;
		gbc_label_7.gridy = 10;
		AccountInfos.add(label_7, gbc_label_7);
		
		
		JLabel label_24 = new JLabel("AAA");
		label_24.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_24 = new GridBagConstraints();
		gbc_label_24.insets = new Insets(0, 0, 5, 5);
		gbc_label_24.gridx = 1;
		gbc_label_24.gridy = 13;
		AccountInfos.add(label_24, gbc_label_24);
		
		JLabel label_1 = new JLabel("Address:");
		label_1.setForeground(new Color(240, 255, 255));
		label_1.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 13;
		AccountInfos.add(label_1, gbc_label_1);
		
		JLabel label_9 = new JLabel(maincontroller.getLoggedInEmployee().getAddress());
		label_9.setForeground(new Color(240, 255, 255));
		label_9.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.anchor = GridBagConstraints.WEST;
		gbc_label_9.gridwidth = 5;
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 2;
		gbc_label_9.gridy = 14;
		AccountInfos.add(label_9, gbc_label_9);
		
		JLabel label_33 = new JLabel("AAA");
		label_33.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_33 = new GridBagConstraints();
		gbc_label_33.gridwidth = 7;
		gbc_label_33.insets = new Insets(0, 0, 5, 5);
		gbc_label_33.gridx = 0;
		gbc_label_33.gridy = 15;
		AccountInfos.add(label_33, gbc_label_33);
		
		JLabel email_label = new JLabel("Email:");
		email_label.setForeground(new Color(240, 255, 255));
		email_label.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_email_label = new GridBagConstraints();
		gbc_email_label.anchor = GridBagConstraints.SOUTHWEST;
		gbc_email_label.insets = new Insets(0, 0, 5, 5);
		gbc_email_label.gridx = 2;
		gbc_email_label.gridy = 16;
		AccountInfos.add(email_label, gbc_email_label);
		
		JLabel label_10 = new JLabel(maincontroller.getLoggedInEmployee().getEmail());
		label_10.setForeground(new Color(240, 255, 255));
		label_10.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.gridwidth = 5;
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 2;
		gbc_label_10.gridy = 17;
		AccountInfos.add(label_10, gbc_label_10);
		
	
		
		
		
		
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
				ListofEmployees.removeAll();
				
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
				

				table.setForeground(new Color(138, 43, 226));
				table.setBackground(new Color(255, 228, 225));
				table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				GridBagConstraints gbc_list = new GridBagConstraints();
				gbc_list.gridheight = 2;
				gbc_list.fill = GridBagConstraints.BOTH;
				gbc_list.gridx = 1;
				gbc_list.gridy = 1;
				ListofEmployees.add(new JScrollPane(table), gbc_list);
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
				InOut.removeAll();
				
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
				table07.setBackground(new Color(255, 228, 225));
				table07.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				GridBagConstraints gbc_list07 = new GridBagConstraints();
				gbc_list07.gridheight = 2;
				gbc_list07.fill = GridBagConstraints.BOTH;
				gbc_list07.gridx = 1;
				gbc_list07.gridy = 1;
				InOut.add(new JScrollPane(table07), gbc_list07);
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
				
				AddAssets.setBackground(new Color(255, 228, 225));
				AddAssets.setBounds(46, 13, 387, 191);
				AddAssets.setLayout(null);
				
				AddAssetss = new JTextField();
				AddAssetss.setBounds(99, 51, 182, 22);
				AddAssets.add(AddAssetss);
				AddAssetss.setColumns(10);
				
				JComboBox<String> comboBox = new JComboBox<String>();
				comboBox.setBounds(99, 107, 182, 22);
				AddAssets.add(comboBox);
				comboBox.addItem("CEU MAKATI GP");
				comboBox.addItem("CEU MAKATI LV");
				
				JButton btnNewButton = new JButton("Add ");
				btnNewButton.setBackground(new Color(240,240,240));
				btnNewButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						btnNewButton.setBackground(Color.PINK);
					}
					@Override
					public void mouseExited(MouseEvent e) {
						btnNewButton.setBackground(new Color(240,240,240));
					}
				});
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(maincontroller.addAsset(AddAssetss.getText(), comboBox.getItemAt(comboBox.getSelectedIndex())) && !AddAssetss.getText().equalsIgnoreCase("")) {
							JOptionPane.showMessageDialog(null, "ASSET SUCCESSFULLY ADDED");
							AddAssetss.setText("");
						}else {
							JOptionPane.showMessageDialog(null, "ERROR \n Problem adding new asset \n error-2903");
						}
					}
				});
				
				btnNewButton.setBounds(163, 142, 97, 25);
				AddAssets.add(btnNewButton);
					
				JLabel lblWhatAssetsDo = new JLabel("What Assets do you want to add:");
				lblWhatAssetsDo.setBounds(120, 22, 190, 16);
				AddAssets.add(lblWhatAssetsDo);
				
				JLabel lblWhichBranchHas = new JLabel("Which branch has it:");
				lblWhichBranchHas.setBounds(120, 86, 164, 16);
				AddAssets.add(lblWhichBranchHas);
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
				UpdateAssets.removeAll();
				
				String data09[][] = new String [maincontroller.getAssets().size()][5];
				
				for(int i = 0; i < maincontroller.getAssets().size(); i++) {
					for(int j = 0; j < 5; j++) {
						
					if(j == 0) {
						data09[i][j]= maincontroller.getAssets().get(i).getName();
					}else if(j == 1) {
						data09[i][j]= maincontroller.getAssets().get(i).getStats();
					}else if(j == 2) {
						data09[i][j]= maincontroller.getAssets().get(i).getLocation();
					}else if(j == 3) {
						data09[i][j]= maincontroller.getAssets().get(i).getFirstname() +" "+ maincontroller.getAssets().get(i).getLastname();
					}else if(j == 4) {
						data09[i][j]= maincontroller.getAssets().get(i).getLastname();
					}
					}	
				}
				
				String coloumns01 [] = {"Item", "Availablity", "Location", "Checked Out By"};
				JTable table_9 = new JTable(data09, coloumns01);
				
				table_9.setForeground(new Color(138, 43, 226));
				table_9.setBackground(new Color(255, 228, 225));
				table_9.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				GridBagConstraints gbc_list09 = new GridBagConstraints();
				gbc_list09.anchor = GridBagConstraints.NORTHWEST;
				gbc_list09.gridx = 1;
				gbc_list09.gridy = 1;
						
				GridBagConstraints gbc_table_9 = new GridBagConstraints();
				gbc_table_9.insets = new Insets(0, 0, 5, 0);
				gbc_table_9.fill = GridBagConstraints.BOTH;
				gbc_table_9.gridx = 0;
				gbc_table_9.gridy = 1;
				UpdateAssets.add(new JScrollPane(table_9), gbc_list09);
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
				GPAssets.removeAll();
				
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
				table02.setBackground(new Color(255, 228, 225));
				table02.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				GridBagConstraints gbc_list02 = new GridBagConstraints();
				gbc_list02.gridheight = 2;
				gbc_list02.fill = GridBagConstraints.BOTH;
				gbc_list02.gridx = 1;
				gbc_list02.gridy = 1;
				GPAssets.add(new JScrollPane(table02), gbc_list02);	
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
				LVAssets.removeAll();
				
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
						data03[i][j]= maincontroller.getLvAssets().get(i).getFirstname() +" "+ maincontroller.getLvAssets().get(i).getLastname();
					}else if(j == 4) {
						data03[i][j]= maincontroller.getLvAssets().get(i).getLastname();
					}
					}	
				}
				
				
				String coloumns03 [] = {"Item", "Availablity", "Location", "Checked Out By"};
				JTable table03 = new JTable(data03, coloumns03);

				table03.setForeground(new Color(138, 43, 226));
				table03.setBackground(new Color(255, 228, 225));
				table03.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				GridBagConstraints gbc_list03 = new GridBagConstraints();
				gbc_list03.gridheight = 2;
				gbc_list03.fill = GridBagConstraints.BOTH;
				gbc_list03.gridx = 1;
				gbc_list03.gridy = 1;
				LVAssets.add(new JScrollPane(table03), gbc_list03);
				
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
				ViewAllAssets.removeAll();
				
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
				table_1.setBackground(new Color(255, 228, 225));
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
				Borrowed.removeAll();
				
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
				String coloumns01 [] = {"Item", "Availablity", "Location", "Checked Out By"};

				JTable table_4 = new JTable(data04, coloumns01);

				table_4.setForeground(new Color(138, 43, 226));
				table_4.setBackground(new Color(255, 228, 225));
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
				Returned.removeAll();
				
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
				String coloumns01 [] = {"Item", "Availablity", "Location", "Checked Out By"};

				JTable table_5 = new JTable(data05, coloumns01);

				table_5.setForeground(new Color(138, 43, 226));
				table_5.setBackground(new Color(255, 228, 225));
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
				Available.removeAll();
				
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
				
				String coloumns01 [] = {"Item", "Availablity", "Location", "Checked Out By"};

				
				JTable table_6 = new JTable(data06, coloumns01);
				table_6.setForeground(new Color(138, 43, 226));
				table_6.setBackground(new Color(255, 228, 225));
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
				AccountInfos.setForeground(Color.BLACK);
				AccountInfos.setBackground(new Color(255, 228, 225));
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
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
