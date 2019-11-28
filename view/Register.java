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
		setBounds(100, 100, 422, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(119, 136, 153));
		panel.setBounds(24, 141, 363, 460);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel User_Details = new JLabel("Employee Registration");
		User_Details.setBounds(30, 0, 303, 38);
		User_Details.setFont(new Font("Verdana", Font.BOLD, 24));
		panel.add(User_Details);
		
		JPanel RegistrationPanel = new JPanel();
		RegistrationPanel.setBounds(0, 42, 363, 330);
		panel.add(RegistrationPanel);
		RegistrationPanel.setBackground(new Color(255, 228, 225));
		RegistrationPanel.setForeground(Color.LIGHT_GRAY);
		RegistrationPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		RegistrationPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("l");
		lblNewLabel.setBounds(1, 11, 3, 16);
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		RegistrationPanel.add(lblNewLabel);
		
		JLabel lblFirstname = new JLabel("Firstname");
		lblFirstname.setBounds(38, 11, 57, 16);
		RegistrationPanel.add(lblFirstname);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(253, 11, 31, 16);
		RegistrationPanel.add(lblEmail);
		
		
		txtFirstname = new JTextField();
		txtFirstname.setBounds(9, 42, 116, 22);
		RegistrationPanel.add(txtFirstname);
		txtFirstname.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(211, 42, 116, 22);
		txtEmail.setColumns(10);
		RegistrationPanel.add(txtEmail);
		
		JLabel lblLastname = new JLabel("Lastname");
		lblLastname.setBounds(39, 76, 55, 16);
		RegistrationPanel.add(lblLastname);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(241, 76, 55, 16);
		RegistrationPanel.add(lblPassword);
		
		txtLastname = new JTextField();
		txtLastname.setBounds(9, 104, 116, 22);
		txtLastname.setColumns(10);
		RegistrationPanel.add(txtLastname);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(211, 104, 116, 22);
		RegistrationPanel.add(txtPassword);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(56, 138, 22, 16);
		RegistrationPanel.add(lblAge);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setBounds(217, 138, 104, 16);
		RegistrationPanel.add(lblConfirmPassword);
		
		txtAge = new JTextField();
		txtAge.setBounds(9, 167, 116, 22);
		txtAge.setColumns(10);
		RegistrationPanel.add(txtAge);
		
		txtDateofBirth = new JPasswordField();
		txtDateofBirth.setBounds(211, 167, 116, 22);
		RegistrationPanel.add(txtDateofBirth);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(44, 198, 46, 16);
		RegistrationPanel.add(lblAddress);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setBounds(247, 198, 44, 16);
		RegistrationPanel.add(lblPosition);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(9, 224, 116, 22);
		txtAddress.setColumns(10);
		RegistrationPanel.add(txtAddress);
		
		cmbboxPosition = new JComboBox<String>();
		cmbboxPosition.setBounds(211, 224, 116, 22);
		cmbboxPosition.addItem("Academic Head");
		cmbboxPosition.addItem("Professor");
		cmbboxPosition.addItem("Security Guard");
		cmbboxPosition.addItem("Maintainence");
		cmbboxPosition.addItem("Staff");
				RegistrationPanel.add(cmbboxPosition);
				
				JLabel lblEmployeeId = new JLabel("Contact Number");
				lblEmployeeId.setBounds(21, 258, 92, 16);
				RegistrationPanel.add(lblEmployeeId);
				
				JLabel lblDateofBirth = new JLabel("Date of Birth");
				lblDateofBirth.setBounds(233, 258, 71, 16);
				RegistrationPanel.add(lblDateofBirth);
				
				
				txtContactnum = new JTextField();
				txtContactnum.setBounds(9, 287, 116, 22);
				txtContactnum.setColumns(10);
				RegistrationPanel.add(txtContactnum);
				
				JLabel label = new JLabel("/");
				label.setBounds(243, 290, 13, 16);
				RegistrationPanel.add(label);
				
				JComboBox comboBox = new JComboBox();
				comboBox.setBounds(196, 287, 44, 22);
				RegistrationPanel.add(comboBox);
				
				JComboBox comboBox_1 = new JComboBox();
				comboBox_1.setBounds(253, 287, 38, 22);
				RegistrationPanel.add(comboBox_1);
				
				JComboBox comboBox_2 = new JComboBox();
				comboBox_2.setBounds(309, 287, 44, 22);
				RegistrationPanel.add(comboBox_2);
				
				JLabel label_1 = new JLabel("/");
				label_1.setBounds(297, 290, 31, 16);
				RegistrationPanel.add(label_1);
		
		
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
		btnRegister.setBounds(12, 409, 145, 25);
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
		button.setBounds(206, 409, 145, 25);
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
		lblBackground.setBounds(0, 116, 807, 532);
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
