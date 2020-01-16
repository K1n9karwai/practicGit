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
		setTitle("���� ���� ������");
		setBounds(800, 250, 300, 400);
		setForeground(Color.YELLOW);
		setBackground(new Color(100, 150, 82));
		setVisible(true);
		
		//�̺�Ʈ ó��
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowExit()); //new ����� ���� ����
		//���� : ����ö� �޴��Ǹ� �ָ� ������� ¥�������� ���� ������ ������ϳ�.
		
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

		repaint(); //������ â�� ������ ���ο� â�� �ٽ� ������. �ܻ�X
				   //update() -> paint() ������ ȣ��.
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//System.out.println("���콺 IN");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//System.out.println("���콺 out");
		
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
		//System.out.println("���콺 �巡��");
		
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
