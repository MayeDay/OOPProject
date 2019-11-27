package view;

import java.awt.BorderLayout;
import controller.Maincontroller;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.util.*;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.ScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.BevelBorder;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.ScrollPaneConstants;
import javax.swing.JMenuBar;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Register extends JFrame {

	private JPanel contentPane;
	private JLabel lblLogo;
	private JButton btnRegister;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField txtFirstname;
	private JTextField txtLastname;
	private JTextField txtAge;
	private JTextField txtAddress;
	private JTextField txtContactnum;
	private JTextField txtEmail;
	private JPasswordField txtPassword;
	private JPasswordField txtDateofBirth;
	private JScrollPane scrollPane;
	private JComboBox<String> cmbboxPosition;
	private Maincontroller maincontroller;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		maincontroller = Maincontroller.getMaincontroller();
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Register.class.getResource("/Images/download (2).jpg")));
		setTitle("CEU");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 421, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(119, 136, 153));
		panel.setBounds(24, 141, 363, 385);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel User_Details = new JLabel("Employee Registration");
		User_Details.setBounds(30, 0, 303, 38);
		User_Details.setFont(new Font("Verdana", Font.BOLD, 24));
		panel.add(User_Details);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(0, 43, 363, 260);
		panel.add(scrollPane);
		
		JPanel RegistrationPanel = new JPanel();
		RegistrationPanel.setBackground(new Color(240, 255, 255));
		RegistrationPanel.setForeground(Color.LIGHT_GRAY);
		scrollPane.setViewportView(RegistrationPanel);
		RegistrationPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GridBagLayout gbl_RegistrationPanel = new GridBagLayout();
		gbl_RegistrationPanel.columnWidths = new int[]{0, 116, 81, 116, 0, 0};
		gbl_RegistrationPanel.rowHeights = new int[]{41, 22, 35, 22, 36, 22, 30, 22, 0};
		gbl_RegistrationPanel.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_RegistrationPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		RegistrationPanel.setLayout(gbl_RegistrationPanel);
		
		JLabel lblNewLabel = new JLabel("l");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		RegistrationPanel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblFirstname = new JLabel("Firstname");
		GridBagConstraints gbc_lblFirstname = new GridBagConstraints();
		gbc_lblFirstname.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstname.gridx = 1;
		gbc_lblFirstname.gridy = 0;
		RegistrationPanel.add(lblFirstname, gbc_lblFirstname);
		
		JLabel lblEmail = new JLabel("Email");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 3;
		gbc_lblEmail.gridy = 0;
		RegistrationPanel.add(lblEmail, gbc_lblEmail);
		
		
		txtFirstname = new JTextField();
		GridBagConstraints gbc_txtFirstname = new GridBagConstraints();
		gbc_txtFirstname.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtFirstname.insets = new Insets(0, 0, 5, 5);
		gbc_txtFirstname.gridx = 1;
		gbc_txtFirstname.gridy = 1;
		RegistrationPanel.add(txtFirstname, gbc_txtFirstname);
		txtFirstname.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
		gbc_txtEmail.gridx = 3;
		gbc_txtEmail.gridy = 1;
		RegistrationPanel.add(txtEmail, gbc_txtEmail);
		
		JLabel lblLastname = new JLabel("Lastname");
		GridBagConstraints gbc_lblLastname = new GridBagConstraints();
		gbc_lblLastname.insets = new Insets(0, 0, 5, 5);
		gbc_lblLastname.gridx = 1;
		gbc_lblLastname.gridy = 2;
		RegistrationPanel.add(lblLastname, gbc_lblLastname);
		
		JLabel lblPassword = new JLabel("Password");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 3;
		gbc_lblPassword.gridy = 2;
		RegistrationPanel.add(lblPassword, gbc_lblPassword);
		
		txtLastname = new JTextField();
		txtLastname.setColumns(10);
		GridBagConstraints gbc_txtLastname = new GridBagConstraints();
		gbc_txtLastname.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtLastname.insets = new Insets(0, 0, 5, 5);
		gbc_txtLastname.gridx = 1;
		gbc_txtLastname.gridy = 3;
		RegistrationPanel.add(txtLastname, gbc_txtLastname);
		
		txtPassword = new JPasswordField();
		GridBagConstraints gbc_txtPassword = new GridBagConstraints();
		gbc_txtPassword.anchor = GridBagConstraints.NORTH;
		gbc_txtPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPassword.insets = new Insets(0, 0, 5, 5);
		gbc_txtPassword.gridx = 3;
		gbc_txtPassword.gridy = 3;
		RegistrationPanel.add(txtPassword, gbc_txtPassword);
		
		JLabel lblAge = new JLabel("Age");
		GridBagConstraints gbc_lblAge = new GridBagConstraints();
		gbc_lblAge.insets = new Insets(0, 0, 5, 5);
		gbc_lblAge.gridx = 1;
		gbc_lblAge.gridy = 4;
		RegistrationPanel.add(lblAge, gbc_lblAge);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		GridBagConstraints gbc_lblConfirmPassword = new GridBagConstraints();
		gbc_lblConfirmPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfirmPassword.gridx = 3;
		gbc_lblConfirmPassword.gridy = 4;
		RegistrationPanel.add(lblConfirmPassword, gbc_lblConfirmPassword);
		
		txtAge = new JTextField();
		txtAge.setColumns(10);
		GridBagConstraints gbc_txtAge = new GridBagConstraints();
		gbc_txtAge.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtAge.insets = new Insets(0, 0, 5, 5);
		gbc_txtAge.gridx = 1;
		gbc_txtAge.gridy = 5;
		RegistrationPanel.add(txtAge, gbc_txtAge);
		
		txtDateofBirth = new JPasswordField();
		GridBagConstraints gbc_txtConfirmPassword = new GridBagConstraints();
		gbc_txtConfirmPassword.anchor = GridBagConstraints.NORTH;
		gbc_txtConfirmPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtConfirmPassword.insets = new Insets(0, 0, 5, 5);
		gbc_txtConfirmPassword.gridx = 3;
		gbc_txtConfirmPassword.gridy = 5;
		RegistrationPanel.add(txtDateofBirth, gbc_txtConfirmPassword);
		
		JLabel lblAddress = new JLabel("Address");
		GridBagConstraints gbc_lblAddress = new GridBagConstraints();
		gbc_lblAddress.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddress.gridx = 1;
		gbc_lblAddress.gridy = 6;
		RegistrationPanel.add(lblAddress, gbc_lblAddress);
		
		JLabel lblPosition = new JLabel("Position");
		GridBagConstraints gbc_lblPosition = new GridBagConstraints();
		gbc_lblPosition.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosition.gridx = 3;
		gbc_lblPosition.gridy = 6;
		RegistrationPanel.add(lblPosition, gbc_lblPosition);
		
		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		GridBagConstraints gbc_txtAddress = new GridBagConstraints();
		gbc_txtAddress.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtAddress.insets = new Insets(0, 0, 5, 5);
		gbc_txtAddress.gridx = 1;
		gbc_txtAddress.gridy = 7;
		RegistrationPanel.add(txtAddress, gbc_txtAddress);
		
		cmbboxPosition = new JComboBox<String>();
		cmbboxPosition.addItem("Academic Head");
		cmbboxPosition.addItem("Professor");
		cmbboxPosition.addItem("Security Guard");
		cmbboxPosition.addItem("Maintainence");
		cmbboxPosition.addItem("Staff");

		GridBagConstraints gbc_cmbboxPosition = new GridBagConstraints();
		gbc_cmbboxPosition.insets = new Insets(0, 0, 5, 5);
		gbc_cmbboxPosition.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbboxPosition.gridx = 3;
		gbc_cmbboxPosition.gridy = 7;
		RegistrationPanel.add(cmbboxPosition, gbc_cmbboxPosition);
		
		JLabel lblEmployeeId = new JLabel("Contact Number");
		GridBagConstraints gbc_lblEmployeeId = new GridBagConstraints();
		gbc_lblEmployeeId.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmployeeId.gridx = 1;
		gbc_lblEmployeeId.gridy = 8;
		RegistrationPanel.add(lblEmployeeId, gbc_lblEmployeeId);
		
		JLabel lblDateofBirth = new JLabel("Date of Birth");
		GridBagConstraints gbc_lblDateofBirth = new GridBagConstraints();
		gbc_lblDateofBirth.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateofBirth.gridx = 3;
		gbc_lblDateofBirth.gridy = 8;
		RegistrationPanel.add(lblDateofBirth, gbc_lblDateofBirth);
		
		
		txtContactnum = new JTextField();
		txtContactnum.setColumns(10);
		GridBagConstraints gbc_txtContactnum = new GridBagConstraints();
		gbc_txtContactnum.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtContactnum.insets = new Insets(0, 0, 0, 5);
		gbc_txtContactnum.gridx = 1;
		gbc_txtContactnum.gridy = 9;
		RegistrationPanel.add(txtContactnum, gbc_txtContactnum);
		
		txtDateofBirth = new JPasswordField();
		GridBagConstraints gbc_txtDateofBirth = new GridBagConstraints();
		gbc_txtDateofBirth.insets = new Insets(0, 0, 0, 5);
		gbc_txtDateofBirth.anchor = GridBagConstraints.NORTH;
		gbc_txtDateofBirth.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDateofBirth.gridx = 3;
		gbc_txtDateofBirth.gridy = 9;
		RegistrationPanel.add(txtDateofBirth, gbc_txtDateofBirth);
		
		
		btnRegister = new JButton("Register");
		btnRegister.setBackground(new Color(240,240,240));
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnRegister.setBackground(Color.PINK);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnRegister.setBackground(new Color(240,240,240));
			}
		});
		
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				compileData();
			}
		});
		btnRegister.setBounds(31, 336, 145, 25);
		panel.add(btnRegister);
		
		JButton button = new JButton("Cancel");
		button.setBackground(new Color(240,240,240));
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button.setBackground(Color.PINK);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				button.setBackground(new Color(240,240,240));
			}
		});
		button.setBounds(188, 336, 145, 25);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LScreen Ls = new LScreen();
				Ls.setVisible(true);
				dispose();
			}
		});
		panel.add(button);

		
		JLabel lblBackground = new JLabel("New label");
		lblBackground.setIcon(new ImageIcon(Register.class.getResource("/Images/12.jpg")));
		lblBackground.setBounds(0, 116, 807, 519);
		contentPane.add(lblBackground);
		
		lblLogo = new JLabel("New label");
		lblLogo.setBounds(0, -31, 453, 181);
		contentPane.add(lblLogo);
		lblLogo.setIcon(new ImageIcon(Register.class.getResource("/Images/download (3).png")));
	}
	
	private void compileData() {
		
		String firstname = txtFirstname.getText();
		String lastname = txtLastname.getText();
		int age = Integer.valueOf(txtAge.getText());
		long phonenumber = Integer.valueOf(txtContactnum.getText());
		String email = txtEmail.getText();
		String password = txtPassword.getText();
		String address = txtAddress.getText();
		String position = cmbboxPosition.getItemAt(cmbboxPosition.getSelectedIndex());
		//Date dob = Date.txtDateofBirth.getText());
		
		if(maincontroller.addEmployee(firstname, lastname, dob, age, address, email, phonenumber, password, position, "OUT"));
		
		
	}
}
