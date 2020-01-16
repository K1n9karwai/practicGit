package interface_1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class WindowTest extends Frame implements MouseListener, MouseMotionListener {
	int xNum, yNum;
	String xy=null;
	
	public WindowTest() {
		setTitle("내가 만든 윈도우");
		setBounds(800, 250, 300, 400);
		setForeground(Color.YELLOW);
		setBackground(new Color(100, 150, 82));
		setVisible(true);
		
		//이벤트 처리
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowExit()); //new 해줘야 실제 생성
		//예시 : 배고플때 메뉴판만 주며 먹으라면 짜증나듯이 실제 생성을 해줘야하낟.
		
	}
	
	public static void main(String[] args) {
		new WindowTest();
		
	}
	
	//Mouse Listener Override - Event Handler

	@Override
	public void mouseClicked(MouseEvent e) {
		xNum = e.getX();
		yNum = e.getY();
		//xy = ("X : " + xNum + ", Y : " + yNum);

		repaint(); //기존의 창을 버리고 새로운 창을 다시 만들어라. 잔상X
				   //update() -> paint() 순으로 호출.
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//System.out.println("마우스 IN");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//System.out.println("마우스 out");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	//MouseMotionListener Override - Event Handler

	@Override
	public void mouseDragged(MouseEvent e) {
		//System.out.println("마우스 드래그");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void paint(Graphics g) {
		//g.drawString(xy , xNum, yNum);
		g.drawString("X : " + xNum + ", Y : " + yNum, xNum, yNum);
	}
	

}
