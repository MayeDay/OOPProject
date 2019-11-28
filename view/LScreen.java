package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.SystemColor;
import controller.Maincontroller;

public class LScreen extends JFrame {

	private JPanel contentPane;
	private JTextField txtUname;
	private JPasswordField txtpassword;
	private Maincontroller maincontroller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LScreen frame = new LScreen();
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
	public LScreen() {
		
		maincontroller = Maincontroller.getMaincontroller();
				
		setType(Type.POPUP);
		setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 22));
		setForeground(new Color(255, 182, 193));
		setTitle("CEU");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(LScreen.class.getResource("/Images/download (2).jpg")));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 423, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(-1, 0, 421, 447);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(LScreen.class.getResource("/Images/download (3).png")));
		lblNewLabel.setBounds(1, -7, 447, 152);
		panel.add(lblNewLabel);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(149, 154, 143, 59);
		panel.add(lblLogin);
		lblLogin.setFont(new Font("Serif", Font.PLAIN, 32));
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(112, 210, 82, 28);
		panel.add(lblEmail);
		lblEmail.setFont(new Font("Serif", Font.BOLD, 15));
		
		txtUname = new JTextField();
		txtUname.setBounds(113, 239, 192, 33);
		panel.add(txtUname);
		txtUname.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(112, 276, 82, 28);
		panel.add(lblPassword);
		lblPassword.setFont(new Font("Serif", Font.BOLD, 15));
		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(112, 307, 192, 33);
		panel.add(txtpassword);
		
		JCheckBox chckbxPass = new JCheckBox("Show Password");
		chckbxPass.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxPass.setBackground(new Color(230, 230, 250));
		chckbxPass.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
		        if (e.getStateChange() == ItemEvent.SELECTED) {
		            txtpassword.setEchoChar((char) 0);
		        }else {
		        	txtpassword.setEchoChar('•');
		        }
		    }
		});
		chckbxPass.setBounds(312, 308, 101, 32);
		panel.add(chckbxPass);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBackground(new Color(240,240,240));
		btnEnter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnEnter.setBackground(Color.PINK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnEnter.setBackground(new Color(240,240,240));
			}
		});
		btnEnter.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			String email = txtUname.getText();
			String pass = txtpassword.getText();
		
			if(maincontroller.verifyLogin(email, pass)) {
				if(maincontroller.getLoggedInEmployee().getClearance_lvl().equals("Admin")) {
					AdminPage Ap = new AdminPage();
					Ap.setVisible(true);
					dispose();
				}else if(maincontroller.getLoggedInEmployee().getClearance_lvl().equals("Regular")) {
					EmployeePage page = new EmployeePage();
					page.setVisible(true);
					dispose();
				}
			}else {
				JOptionPane.showMessageDialog(null, "        " + "Invalid Account! \n" + "        " + "Please try again");
			}
		}
		});
		btnEnter.setBounds(84, 353, 114, 39);
		panel.add(btnEnter);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCancel.setBackground(Color.PINK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnCancel.setBackground(new Color(240,240,240));
			}
		});
		btnCancel.setBackground(new Color(240,240,240));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
		btnCancel.setBounds(210, 353, 114, 39);
		panel.add(btnCancel);
		
		JLabel lblCreateAccount = new JLabel("Employee Registration? Click here!");
		lblCreateAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblCreateAccount.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblCreateAccount.setForeground(Color.BLACK);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Register r = new Register();
				r.setVisible(true);
				dispose();
			}
		});
		lblCreateAccount.setFont(new Font("Serif", Font.PLAIN, 16));
		lblCreateAccount.setBounds(94, 392, 229, 42);
		panel.add(lblCreateAccount);
		
		JLabel lblBackground = new JLabel("New label");
		lblBackground.setIcon(new ImageIcon(LScreen.class.getResource("/Images/12.jpg")));
		lblBackground.setBounds(1, 135, 420, 312);
		panel.add(lblBackground);

	}
}
