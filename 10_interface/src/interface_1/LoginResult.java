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
		
		//�̺�Ʈ
		this.addWindowListener(this);

//		this.setLayout(null);
//
//		if (id.equals("angel") && pwd.equals("1004")) {
//			result = new JLabel("�α��� ����");
//			setBounds(1000, 150, 250, 150);
//			setVisible(true);
//
//			result.setBounds(85, 35, 100, 30);
//			this.add(result);
//
//		} else {
//			result = new JLabel("�α��� ����");
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
			//g.drawString("�α��� ����", 50, 80); //������ ���� �׸��°�
			JOptionPane.showMessageDialog(this, "�α��� ����"); // ���̾�α� ����ִ� ��, �������� ������
		} else {
			//g.drawString("�α��� ����", 50, 80);
			JOptionPane.showMessageDialog(this, "�α��� ����");
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
		//System.exit(0); //���α׷� ��ü ���� ����
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
