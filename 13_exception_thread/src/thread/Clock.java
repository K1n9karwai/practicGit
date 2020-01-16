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
//Clock은 Frame 이지만 thread는 아님
	public Clock() {
		
		setFont(new Font("돋움체", Font.BOLD, 30));
		setForeground(Color.RED);
		setTitle("시간");
		setBounds(900,200,300,100);
		setBackground(new Color(23,150,125));
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//스레드 생성
		Thread t = new Thread(this);
		//스레드 시작
		t.start();
	}
	
	@Override
	public void paint(Graphics g) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH시 mm분 ss초");
		Date d = new Date();
		g.drawString(sdf.format(d), 35, 70);
	}
	
	@Override 
	public void run() { //throws //override된 메소드에느 throws 사용해서는 안된다.
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
