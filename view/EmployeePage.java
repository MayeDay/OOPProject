package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import controller.Maincontroller;

public class EmployeePage extends JFrame {

	private JPanel contentPane;
	private Maincontroller maincontroller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeePage frame = new EmployeePage();
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
	public EmployeePage() {
		maincontroller = Maincontroller.getMaincontroller();
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(EmployeePage.class.getResource("/Images/download (2).jpg")));
		setTitle("CEU");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 424, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(EmployeePage.class.getResource("/Images/download (3).png")));
		lblNewLabel.setBounds(0, -12, 431, 137);
		contentPane.add(lblNewLabel);
		
		JButton btnSignOut = new JButton("Sign out");
		btnSignOut.setBackground(new Color(240,240,240));
		btnSignOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnSignOut.setBackground(Color.PINK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnSignOut.setBackground(new Color(240,240,240));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				LScreen lsc = new LScreen();
				lsc.setVisible(true);
				dispose();
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(new Color(255, 228, 225));
		panel.setBounds(10, 131, 397, 360);
		contentPane.add(panel);
		btnSignOut.setBounds(310, 504, 97, 25);
		contentPane.add(btnSignOut);
		
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(new Color(255, 228, 225));
		
		panel.setBackground(new Color(119, 136, 153));
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE, 0.0, 0.0, 0.0, 0.0};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE, 0.0, 0.0, 0.0, 0.0};
		panel.setLayout(gbl_panel_3);
		
		JLabel label_31 = new JLabel("AAA");
		label_31.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_31 = new GridBagConstraints();
		gbc_label_31.insets = new Insets(0, 0, 5, 5);
		gbc_label_31.gridx = 2;
		gbc_label_31.gridy = 0;
		panel.add(label_31, gbc_label_31);
		
		JLabel label_32 = new JLabel("AAA");
		label_32.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_32.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_32 = new GridBagConstraints();
		gbc_label_32.insets = new Insets(0, 0, 5, 5);
		gbc_label_32.gridx = 3;
		gbc_label_32.gridy = 0;
		panel.add(label_32, gbc_label_32);
		
		JLabel label_30 = new JLabel("AAA");
		label_30.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_30 = new GridBagConstraints();
		gbc_label_30.insets = new Insets(0, 0, 5, 5);
		gbc_label_30.gridx = 2;
		gbc_label_30.gridy = 1;
		panel.add(label_30, gbc_label_30);
		
		JLabel lblPersonalInformation_1 = new JLabel("Personal Information");
		lblPersonalInformation_1.setForeground(new Color(240, 255, 255));
		lblPersonalInformation_1.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_lblPersonalInformation_1 = new GridBagConstraints();
		gbc_lblPersonalInformation_1.gridwidth = 5;
		gbc_lblPersonalInformation_1.anchor = GridBagConstraints.WEST;
		gbc_lblPersonalInformation_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblPersonalInformation_1.gridx = 2;
		gbc_lblPersonalInformation_1.gridy = 2;
		panel.add(lblPersonalInformation_1, gbc_lblPersonalInformation_1);
		
		JLabel label_28 = new JLabel("AAA");
		label_28.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_28 = new GridBagConstraints();
		gbc_label_28.gridwidth = 7;
		gbc_label_28.insets = new Insets(0, 0, 5, 5);
		gbc_label_28.gridx = 0;
		gbc_label_28.gridy = 3;
		panel.add(label_28, gbc_label_28);
		
		JLabel lblI = new JLabel("AAA");
		lblI.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_lblI = new GridBagConstraints();
		gbc_lblI.insets = new Insets(0, 0, 5, 5);
		gbc_lblI.gridx = 0;
		gbc_lblI.gridy = 4;
		panel.add(lblI, gbc_lblI);
		
		JLabel label_11 = new JLabel("AAA");
		label_11.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 1;
		gbc_label_11.gridy = 4;
		panel.add(label_11, gbc_label_11);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setForeground(new Color(240, 255, 255));
		lblFirstName.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_lblFirstName = new GridBagConstraints();
		gbc_lblFirstName.anchor = GridBagConstraints.WEST;
		gbc_lblFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstName.gridx = 2;
		gbc_lblFirstName.gridy = 4;
		panel.add(lblFirstName, gbc_lblFirstName);
		
		JLabel label_2 = new JLabel(maincontroller.getLoggedInEmployee().getFirstname());
		label_2.setForeground(new Color(240, 255, 255));
		label_2.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.gridwidth = 2;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 4;
		gbc_label_2.gridy = 4;
		panel.add(label_2, gbc_label_2);
		
		JLabel label_13 = new JLabel("AAA");
		label_13.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.insets = new Insets(0, 0, 5, 5);
		gbc_label_13.gridx = 0;
		gbc_label_13.gridy = 5;
		panel.add(label_13, gbc_label_13);
		
		JLabel label_12 = new JLabel("AAA");
		label_12.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.insets = new Insets(0, 0, 5, 5);
		gbc_label_12.gridx = 1;
		gbc_label_12.gridy = 5;
		panel.add(label_12, gbc_label_12);
		
		JLabel lblMiddleName = new JLabel("Middle Name:");
		lblMiddleName.setForeground(new Color(240, 255, 255));
		lblMiddleName.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_lblMiddleName = new GridBagConstraints();
		gbc_lblMiddleName.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblMiddleName.insets = new Insets(0, 0, 5, 5);
		gbc_lblMiddleName.gridx = 2;
		gbc_lblMiddleName.gridy = 5;
		panel.add(lblMiddleName, gbc_lblMiddleName);
		
		JLabel label_14 = new JLabel("AAA");
		label_14.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_14 = new GridBagConstraints();
		gbc_label_14.insets = new Insets(0, 0, 5, 5);
		gbc_label_14.gridx = 0;
		gbc_label_14.gridy = 6;
		panel.add(label_14, gbc_label_14);
		
		JLabel label_15 = new JLabel("AAA");
		label_15.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_15 = new GridBagConstraints();
		gbc_label_15.insets = new Insets(0, 0, 5, 5);
		gbc_label_15.gridx = 1;
		gbc_label_15.gridy = 6;
		panel.add(label_15, gbc_label_15);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setForeground(new Color(240, 255, 255));
		lblLastName.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_lblLastName = new GridBagConstraints();
		gbc_lblLastName.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblLastName.insets = new Insets(0, 0, 5, 5);
		gbc_lblLastName.gridx = 2;
		gbc_lblLastName.gridy = 6;
		panel.add(lblLastName, gbc_lblLastName);
		
		JLabel label_4 = new JLabel(maincontroller.getLoggedInEmployee().getLastname());
		label_4.setForeground(new Color(240, 255, 255));
		label_4.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.gridwidth = 2;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 4;
		gbc_label_4.gridy = 6;
		panel.add(label_4, gbc_label_4);
		
		JLabel label_17 = new JLabel("AAA");
		label_17.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_17 = new GridBagConstraints();
		gbc_label_17.insets = new Insets(0, 0, 5, 5);
		gbc_label_17.gridx = 0;
		gbc_label_17.gridy = 7;
		panel.add(label_17, gbc_label_17);
		
		JLabel label_16 = new JLabel("AAA");
		label_16.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_16 = new GridBagConstraints();
		gbc_label_16.insets = new Insets(0, 0, 5, 5);
		gbc_label_16.gridx = 1;
		gbc_label_16.gridy = 7;
		panel.add(label_16, gbc_label_16);
	
		
		JLabel label_26 = new JLabel("AAA");
		label_26.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_26 = new GridBagConstraints();
		gbc_label_26.gridwidth = 7;
		gbc_label_26.insets = new Insets(0, 0, 5, 5);
		gbc_label_26.gridx = 0;
		gbc_label_26.gridy = 8;
		panel.add(label_26, gbc_label_26);
		
		JLabel label_18 = new JLabel("AAA");
		label_18.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_18 = new GridBagConstraints();
		gbc_label_18.insets = new Insets(0, 0, 5, 5);
		gbc_label_18.gridx = 0;
		gbc_label_18.gridy = 9;
		panel.add(label_18, gbc_label_18);
		
		JLabel label_19 = new JLabel("AAA");
		label_19.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_19 = new GridBagConstraints();
		gbc_label_19.insets = new Insets(0, 0, 5, 5);
		gbc_label_19.gridx = 1;
		gbc_label_19.gridy = 9;
		panel.add(label_19, gbc_label_19);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth:");
		lblDateOfBirth.setForeground(new Color(240, 255, 255));
		lblDateOfBirth.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_lblDateOfBirth = new GridBagConstraints();
		gbc_lblDateOfBirth.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblDateOfBirth.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateOfBirth.gridx = 2;
		gbc_lblDateOfBirth.gridy = 9;
		panel.add(lblDateOfBirth, gbc_lblDateOfBirth);
		
		JLabel label_6 = new JLabel(maincontroller.getLoggedInEmployee().getDate_of_birth().toString());
		label_6.setForeground(new Color(240, 255, 255));
		label_6.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.gridwidth = 2;
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 4;
		gbc_label_6.gridy = 9;
		panel.add(label_6, gbc_label_6);
		
		JLabel label_21 = new JLabel("AAA");
		label_21.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_21 = new GridBagConstraints();
		gbc_label_21.insets = new Insets(0, 0, 5, 5);
		gbc_label_21.gridx = 0;
		gbc_label_21.gridy = 10;
		panel.add(label_21, gbc_label_21);
		
		JLabel label_20 = new JLabel("AAA");
		label_20.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_20 = new GridBagConstraints();
		gbc_label_20.insets = new Insets(0, 0, 5, 5);
		gbc_label_20.gridx = 1;
		gbc_label_20.gridy = 10;
		panel.add(label_20, gbc_label_20);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setForeground(new Color(240, 255, 255));
		lblAge.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_lblAge = new GridBagConstraints();
		gbc_lblAge.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblAge.insets = new Insets(0, 0, 5, 5);
		gbc_lblAge.gridx = 2;
		gbc_lblAge.gridy = 10;
		panel.add(lblAge, gbc_lblAge);
		
		JLabel label_7 = new JLabel(String.valueOf(maincontroller.getLoggedInEmployee().getAge()));
		label_7.setForeground(new Color(240, 255, 255));
		label_7.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.gridwidth = 2;
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 4;
		gbc_label_7.gridy = 10;
		panel.add(label_7, gbc_label_7);
		
		
		JLabel label_24 = new JLabel("AAA");
		label_24.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_24 = new GridBagConstraints();
		gbc_label_24.insets = new Insets(0, 0, 5, 5);
		gbc_label_24.gridx = 1;
		gbc_label_24.gridy = 13;
		panel.add(label_24, gbc_label_24);
		
		JLabel label_1 = new JLabel("Address:");
		label_1.setForeground(new Color(240, 255, 255));
		label_1.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 13;
		panel.add(label_1, gbc_label_1);
		
		JLabel label_9 = new JLabel(maincontroller.getLoggedInEmployee().getAddress());
		label_9.setForeground(new Color(240, 255, 255));
		label_9.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.anchor = GridBagConstraints.WEST;
		gbc_label_9.gridwidth = 5;
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 2;
		gbc_label_9.gridy = 14;
		panel.add(label_9, gbc_label_9);
		
		JLabel label_33 = new JLabel("AAA");
		label_33.setForeground(new Color(119, 136, 153));
		GridBagConstraints gbc_label_33 = new GridBagConstraints();
		gbc_label_33.gridwidth = 7;
		gbc_label_33.insets = new Insets(0, 0, 5, 5);
		gbc_label_33.gridx = 0;
		gbc_label_33.gridy = 15;
		panel.add(label_33, gbc_label_33);
		
		JLabel email_label = new JLabel("Email:");
		email_label.setForeground(new Color(240, 255, 255));
		email_label.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_email_label = new GridBagConstraints();
		gbc_email_label.anchor = GridBagConstraints.SOUTHWEST;
		gbc_email_label.insets = new Insets(0, 0, 5, 5);
		gbc_email_label.gridx = 2;
		gbc_email_label.gridy = 16;
		panel.add(email_label, gbc_email_label);
		
		JLabel label_10 = new JLabel(maincontroller.getLoggedInEmployee().getEmail());
		label_10.setForeground(new Color(240, 255, 255));
		label_10.setFont(new Font("Constantia", Font.BOLD, 15));
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.gridwidth = 5;
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 2;
		gbc_label_10.gridy = 17;
		panel.add(label_10, gbc_label_10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(EmployeePage.class.getResource("/Images/12.jpg")));
		lblNewLabel_1.setBounds(0, 116, 431, 437);
		contentPane.add(lblNewLabel_1);
	}
}
