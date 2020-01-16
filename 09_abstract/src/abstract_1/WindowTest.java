package abstract_1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class WindowTest extends Frame {
	
	public WindowTest() {
		
		setForeground(Color.YELLOW);
		setBackground(new Color(100, 150, 82));
		setBounds(800, 250, 300, 400);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
//		g.drawString("이미지", 50, 80);
		
		Toolkit t = Toolkit.getDefaultToolkit();
		//Toolkit은 추상클래스이고 추상클래스는 직접적으로 new 생성을 할 수 없으므로
		//자식, sub class를 이용한 생성 혹은 메소드를 이용한 생성을 해야한다.
		//하지만 Toolkit 은 sub class 가 없으므로 위의 메소드로 생성.
		
		Image img = t.getImage("D:/java_se/workspace/09_abstract/jeongu.jpg");//이미지 불러오기
		g.drawImage(img, 20, 100, this); //이미지 그리기
	}

	public static void main(String[] args) {
		
		new WindowTest();
	}
}
