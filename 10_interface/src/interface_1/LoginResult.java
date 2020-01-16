package interface_1;

import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class LoginResult extends JFrame implements WindowListener {
	private String id, pwd;

//	private JLabel result;

	public LoginResult(String id, String pwd) {

		this.id = id;
		this.pwd = pwd;
		
		setBounds(1200,200,150,150);
		setVisible(true);
		
		//이벤트
		this.addWindowListener(this);

//		this.setLayout(null);
//
//		if (id.equals("angel") && pwd.equals("1004")) {
//			result = new JLabel("로그인 성공");
//			setBounds(1000, 150, 250, 150);
//			setVisible(true);
//
//			result.setBounds(85, 35, 100, 30);
//			this.add(result);
//
//		} else {
//			result = new JLabel("로그인 실패");
//			setBounds(1000, 150, 250, 150);
//			setVisible(true);
//
//			result.setBounds(85, 35, 100, 30);
//			this.add(result);
//
//		}

	}
	
	@Override
	public void paint(Graphics g) {
		if(id.equals("angel") && pwd.equals("1004")) {
			//g.drawString("로그인 성공", 50, 80); //프레임 위에 그리는것
			JOptionPane.showMessageDialog(this, "로그인 성공"); // 다이얼로그 띄워주는 것, 스윙에만 있음ㄴ
		} else {
			//g.drawString("로그인 실패", 50, 80);
			JOptionPane.showMessageDialog(this, "로그인 실패");
		}
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
		//System.exit(0); //프로그램 전체 강제 종료
		setVisible(false);
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

}
