package interface_1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Paint;
import java.awt.Panel;
import java.awt.Toolkit;

//Frame은 BorderLayout 이다.

public class ImageMove__ extends Frame implements WindowListener, ActionListener {
	/**
	 * <font style="color:red;">왼쪽, 오른쪽, 위, 아래로 이동시키는 버튼이다.</font>
	 * 
	 */
	public static final int FRAME_WIDTH=500, FRAME_HEIGHT=500;
	public Button resetB, leftB, rightB, upB, downB = null;
	/**
	 * 이미지의 시작 위치
	 */
	public int x=200, y=200;
	
	/**
	 * <font style="color:blue;">메인화면을 꾸며주는 메소드</font>
	 */
	
	public void init() {
		
		setTitle("이미지 이동");
		setBounds(700, 400,FRAME_WIDTH,FRAME_HEIGHT);
		setVisible(true);
		
		resetB = new Button("초기화");
		leftB = new Button("왼쪽");
		upB = new Button("위");
		downB = new Button("아래");
		rightB = new Button("오른쪽");
		
		Panel p = new Panel();
		//패널은 container가 아니다. component에 해당하므로 하나씩만 잡아줌.
		//FlowLayout(순서배치 - 중앙)
		p.setLayout(new GridLayout(1,5,3,0)); // 1행 5열을 나타냄.
		
		p.add(resetB);
		p.add(leftB);
		p.add(upB);
		p.add(downB);
		p.add(rightB);
		
		this.add("North", p);
		
		//이벤트
		this.addWindowListener(this);
		
		resetB.addActionListener(this);
		leftB.addActionListener(this);
		upB.addActionListener(this);
		downB.addActionListener(this);
		rightB.addActionListener(this);
	}
	
	
	public static void main(String[] args) {
		
		new ImageMove__().init();
		
	}
	
	@Override
	
	public void paint(Graphics g) {
//		Toolkit t = Toolkit.getDefaultToolkit();
//		Image img = t.getImage("son1.png");
		
		Image img = Toolkit.getDefaultToolkit().getImage("jjanggu.jpg");
		g.drawImage(img, x, y, this);	
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
		if(e.getSource()==resetB) {
			x=y=200;
		} else if(e.getSource()==leftB) {
			x -= 40;
			if(x<-160) x = 470;
		} else if(e.getSource()==upB) {
			y -= 40;
			if(y<-110) y = 470;
		} else if(e.getSource()==downB) {
			y += 40;
			if(y>470) y = -110;
		} else if(e.getSource()==rightB) {
			x += 40;
			if(x>470) x = -160;
		}
		
		System.out.println("X : " + x + "Y : " + y);
		
		repaint();
		
	}
}
