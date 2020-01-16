package thread;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;

public class Clock extends Frame implements Runnable {
//Clock�� Frame ������ thread�� �ƴ�
	public Clock() {
		
		setFont(new Font("����ü", Font.BOLD, 30));
		setForeground(Color.RED);
		setTitle("�ð�");
		setBounds(900,200,300,100);
		setBackground(new Color(23,150,125));
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//������ ����
		Thread t = new Thread(this);
		//������ ����
		t.start();
	}
	
	@Override
	public void paint(Graphics g) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH�� mm�� ss��");
		Date d = new Date();
		g.drawString(sdf.format(d), 35, 70);
	}
	
	@Override 
	public void run() { //throws //override�� �޼ҵ忡�� throws ����ؼ��� �ȵȴ�.
		while(true) {
			repaint();
			try {
			Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		new Clock();

	}
}
