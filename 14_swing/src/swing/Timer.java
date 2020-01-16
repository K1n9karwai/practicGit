package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Timer extends JFrame implements ActionListener, Runnable {
	
	private JButton startBtn = new JButton("시작");
	private JButton stopBtn = new JButton("정지");
	private JLabel jl = new JLabel();
	
	public Timer() {
		setLayout(null);
		
		jl.setFont(new Font("고딕체", Font.BOLD, 70));
		jl.setBounds(100, 50, 100, 100);
		startBtn.setBounds(210, 50, 60, 30);
		stopBtn.setBounds(210, 90, 60, 30);
		
		add(jl);
		add(startBtn);
		add(stopBtn);
		
		setTitle("타이머");
		setBounds(900,200,300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		super("Timer");
		
//		Container con = getContentPane();
//		con.setLayout(new BorderLayout());
//		con.add("North", new JLabel("20초 타이머"));
//		//숫자 들어가기
//		con.add("Center", jl);
//		//jl.setText();
//		jl.setHorizontalAlignment(JLabel.CENTER);
//		jl.setFont(new Font("Serif", Font.BOLD, 50));
//		jl.setForeground(Color.BLUE);
//		
//		JPanel jp = new JPanel(new FlowLayout(FlowLayout.RIGHT));
//		jp.add(startBtn);
//		jp.add(stopBtn);
//		
		startBtn.addActionListener(this);
		stopBtn.addActionListener(this);
		
//		
//		con.add("South", jp);
//		setSize(300,300);
//		setVisible(true);
		
	}
	
	private boolean bb =true;
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Thread t;
		
		if(e.getSource()==startBtn) {
			t = new Thread(this);
			t.start();
			
			bb = true;
			startBtn.setEnabled(false);
			stopBtn.setEnabled(true);
		} else if (e.getSource()==stopBtn) {
			t = null;
			
			bb = false;
			startBtn.setEnabled(true);
			stopBtn.setEnabled(false);
		}
		
	}

	@Override
	public void run() {
		
		for(int i=1; i<=20; i++) {
			jl.setText(i+"");
			if(!bb) break;
			try {
				Thread.sleep(200);
			} catch (InterruptedException ee) {
				ee.printStackTrace();
			}
		}
		
		startBtn.setEnabled(true);
		stopBtn.setEnabled(false);
		
	}
	
	public static void main(String[] args) {
		new Timer();
	}
	
}
