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

//Frame�� BorderLayout �̴�.

public class ImageMove__ extends Frame implements WindowListener, ActionListener {
	/**
	 * <font style="color:red;">����, ������, ��, �Ʒ��� �̵���Ű�� ��ư�̴�.</font>
	 * 
	 */
	public static final int FRAME_WIDTH=500, FRAME_HEIGHT=500;
	public Button resetB, leftB, rightB, upB, downB = null;
	/**
	 * �̹����� ���� ��ġ
	 */
	public int x=200, y=200;
	
	/**
	 * <font style="color:blue;">����ȭ���� �ٸ��ִ� �޼ҵ�</font>
	 */
	
	public void init() {
		
		setTitle("�̹��� �̵�");
		setBounds(700, 400,FRAME_WIDTH,FRAME_HEIGHT);
		setVisible(true);
		
		resetB = new Button("�ʱ�ȭ");
		leftB = new Button("����");
		upB = new Button("��");
		downB = new Button("�Ʒ�");
		rightB = new Button("������");
		
		Panel p = new Panel();
		//�г��� container�� �ƴϴ�. component�� �ش��ϹǷ� �ϳ����� �����.
		//FlowLayout(������ġ - �߾�)
		p.setLayout(new GridLayout(1,5,3,0)); // 1�� 5���� ��Ÿ��.
		
		p.add(resetB);
		p.add(leftB);
		p.add(upB);
		p.add(downB);
		p.add(rightB);
		
		this.add("North", p);
		
		//�̺�Ʈ
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
