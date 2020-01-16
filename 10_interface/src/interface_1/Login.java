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

//1. 취소 버튼을 누르면 JTextField(idT,pwdT)의 내용이 초기화
//2. 로그인 버튼을 누르면 LoginResult 뜨도록
//LoginResult는 로그인 성공 / 로그인 실패 둘 중 하나가 떠야함
//추가적으로 LoginResult 팝업 창의 X(종료)를 누르면 기존 로그인 창으로 다시 이동
//LoginResult에서 비교(id가 "angel", pwd가 "1004"이면 성공, 아니면 실패

public class Login extends JFrame implements ActionListener, WindowListener {
	private JLabel idL, pwdL;
	private JTextField idT;
	private JPasswordField pwdT;
	private JButton loginB, cancelB;
	
	
	public Login() {
		this.setLayout(null);
		
		idL = new JLabel("아이디");
		pwdL = new JLabel("비밀번호");
		
		idT = new JTextField();
		pwdT = new JPasswordField();
		
		loginB = new JButton("로그인");
		cancelB = new JButton("취소");
		
//		idL.setLocation(50, 80);
//		idL.setSize(50, 30);
		idL.setBounds(50, 80, 50, 30); //위의 두개를 합친 것이 setBounds
		pwdL.setBounds(50, 120, 60, 30);
		
		idT.setBounds(110, 80, 100, 30);
		pwdT.setBounds(110, 120, 100, 30);
		
		loginB.setBounds(40, 175, 100, 30);
		cancelB.setBounds(150, 175, 100, 30);
		
		//프레임 위에 프레임은 올라가지 못함, 프레임은 최종
		//포장이사가 각 사물을 박스에 담아서 이삿짐 트럭에 최종적으로 쌓듯이
		//container들에 모아서 frame에 최종적으로 쌓는다.
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
		
		//이벤트
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
		
		if(e.getActionCommand()=="로그인") {
			//e.getSource()==loginB와 동일
			String id = idT.getText();
			String pw = pwdT.getText();
			
			new LoginResult(id, pw);
			
		} else if(e.getSource()==cancelB) {
			idT.setText("");
			pwdT.setText("");
			
		}
		
	}
}
