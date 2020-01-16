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
//		g.drawString("�̹���", 50, 80);
		
		Toolkit t = Toolkit.getDefaultToolkit();
		//Toolkit�� �߻�Ŭ�����̰� �߻�Ŭ������ ���������� new ������ �� �� �����Ƿ�
		//�ڽ�, sub class�� �̿��� ���� Ȥ�� �޼ҵ带 �̿��� ������ �ؾ��Ѵ�.
		//������ Toolkit �� sub class �� �����Ƿ� ���� �޼ҵ�� ����.
		
		Image img = t.getImage("D:/java_se/workspace/09_abstract/jeongu.jpg");//�̹��� �ҷ�����
		g.drawImage(img, 20, 100, this); //�̹��� �׸���
	}

	public static void main(String[] args) {
		
		new WindowTest();
	}
}
