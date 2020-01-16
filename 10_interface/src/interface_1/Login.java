package interface_1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//1. ��� ��ư�� ������ JTextField(idT,pwdT)�� ������ �ʱ�ȭ
//2. �α��� ��ư�� ������ LoginResult �ߵ���
//LoginResult�� �α��� ���� / �α��� ���� �� �� �ϳ��� ������
//�߰������� LoginResult �˾� â�� X(����)�� ������ ���� �α��� â���� �ٽ� �̵�
//LoginResult���� ��(id�� "angel", pwd�� "1004"�̸� ����, �ƴϸ� ����

public class Login extends JFrame implements ActionListener, WindowListener {
	private JLabel idL, pwdL;
	private JTextField idT;
	private JPasswordField pwdT;
	private JButton loginB, cancelB;
	
	
	public Login() {
		this.setLayout(null);
		
		idL = new JLabel("���̵�");
		pwdL = new JLabel("��й�ȣ");
		
		idT = new JTextField();
		pwdT = new JPasswordField();
		
		loginB = new JButton("�α���");
		cancelB = new JButton("���");
		
//		idL.setLocation(50, 80);
//		idL.setSize(50, 30);
		idL.setBounds(50, 80, 50, 30); //���� �ΰ��� ��ģ ���� setBounds
		pwdL.setBounds(50, 120, 60, 30);
		
		idT.setBounds(110, 80, 100, 30);
		pwdT.setBounds(110, 120, 100, 30);
		
		loginB.setBounds(40, 175, 100, 30);
		cancelB.setBounds(150, 175, 100, 30);
		
		//������ ���� �������� �ö��� ����, �������� ����
		//�����̻簡 �� �繰�� �ڽ��� ��Ƽ� �̻��� Ʈ���� ���������� �׵���
		//container�鿡 ��Ƽ� frame�� ���������� �״´�.
		Container c = this.getContentPane();
		c.add(idL);
		c.add(idT);
		
		c.add(pwdL);
		c.add(pwdT);
		
		c.add(loginB);
		c.add(cancelB);
		
		
		setBounds(900, 100, 300, 300);
		setVisible(true);
		
		loginB.addActionListener(this);
		cancelB.addActionListener(this);
		this.addWindowListener(this);
		
		//�̺�Ʈ
//		addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		});
		
//		loginB.addActionListener(new ActionListener(){
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				new LoginResult(idT.getText(), pwdT.getText());
//			}
//		});
//		
//		cancelB.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				idT.setText("");
//				pwdT.setText("");
//			}
//		});
	}
	public static void main(String[] args) {
		new Login();
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand()=="�α���") {
			//e.getSource()==loginB�� ����
			String id = idT.getText();
			String pw = pwdT.getText();
			
			new LoginResult(id, pw);
			
		} else if(e.getSource()==cancelB) {
			idT.setText("");
			pwdT.setText("");
			
		}
		
	}
}
