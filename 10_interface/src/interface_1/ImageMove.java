package interface_1;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import java.awt.Button;
import java.awt.Color;

public class ImageMove extends Frame implements WindowListener, ActionListener{

	private Button resetB, leftB, rightB, upB, downB = null;
	private int x = 160;
	private int y = 210;
	public ImageMove() {
		
		setTitle("내가 만든 윈도우");
		setBounds(800,250,500,500);
		setBackground(new Color(100, 150, 82));
		setVisible(true);
		
		resetB = new Button("초기화");
		leftB = new Button("왼쪽");
		upB = new Button("위");
		downB = new Button("아래");
		rightB = new Button("오른쪽");
		
		Panel p = new Panel();
		p.setBackground(new Color(145,168,208));
		p.add(resetB);
		p.add(leftB);
		p.add(upB);
		p.add(downB);
		p.add(rightB);
		
		this.add("North", p);
		
		this.addWindowListener(this);
		resetB.addActionListener(this);
		leftB.addActionListener(this);
		upB.addActionListener(this);
		downB.addActionListener(this);
		rightB.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		
		new ImageMove();
	}
	
	public void paint(Graphics g) {
		
		Toolkit t = Toolkit.getDefaultToolkit();
		Image img = t.getImage("son1.png");
		g.drawImage(img, x, y, this);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==resetB) {
			x = 160;
			y = 210;
			//paint(getGraphics());
			repaint();
			
		} else if(e.getSource()==leftB) {
			x -= 80;
			if(x<-200) {
				x =500;
			}
			//paint(getGraphics());
			repaint();
		} else if(e.getSource()==upB) {
			y -= 80;
			if(y<-100) {
				y =490;
			}
			//paint(getGraphics());
			repaint();
		} else if(e.getSource()==downB) {
			y += 80;
			if(y>500) {
				y = -100;
			}
			//paint(getGraphics());
			repaint();
		} else if(e.getSource()==rightB) {
			x += 80;
			if(x>500) {
				x = -200;
			}
			//paint(getGraphics());
			repaint();
		}
		
	}
	
//	public void repaint() {
//		System.out.println("repaint 호출");
//		super.repaint();
//	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
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

}
