package inheritance;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class WindowTest extends Frame {

	public WindowTest() {
		super("내가 만든 윈도우"); //부모생성자 호출
		
		
		setForeground(Color.YELLOW);
		//setBackground(Color.cyan);
		setBackground(new Color(100, 150, 82));
		
		//this.setSize(300, 400);
		setBounds(800,250,300,400);
		setVisible(true); 
	}
	
	
	@Override
	public void paint(Graphics g) { //Call Back, 콜백메소드 (일정 시점이 되면 JVM에 의해서 호출된다,frame 창을 띄우라고 할때), repaint()
		g.drawLine(120, 270, 280, 350);
		g.drawLine(280, 270, 120, 350);
		g.drawRect(80, 150, 150, 150);
		//g.drawOval(80, 150, 150, 150);
	}


	public static void main(String[] args) {
		
		new WindowTest();
		
	}
}
