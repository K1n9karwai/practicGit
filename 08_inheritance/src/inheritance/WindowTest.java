package inheritance;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class WindowTest extends Frame {

	public WindowTest() {
		super("���� ���� ������"); //�θ������ ȣ��
		
		
		setForeground(Color.YELLOW);
		//setBackground(Color.cyan);
		setBackground(new Color(100, 150, 82));
		
		//this.setSize(300, 400);
		setBounds(800,250,300,400);
		setVisible(true); 
	}
	
	
	@Override
	public void paint(Graphics g) { //Call Back, �ݹ�޼ҵ� (���� ������ �Ǹ� JVM�� ���ؼ� ȣ��ȴ�,frame â�� ����� �Ҷ�), repaint()
		g.drawLine(120, 270, 280, 350);
		g.drawLine(280, 270, 120, 350);
		g.drawRect(80, 150, 150, 150);
		//g.drawOval(80, 150, 150, 150);
	}


	public static void main(String[] args) {
		
		new WindowTest();
		
	}
}
