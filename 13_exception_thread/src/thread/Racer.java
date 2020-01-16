package thread;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.DecimalFormat;

public class Racer extends Canvas implements Runnable {//말 1마리

	private Image img;
	private int pos=0;
	private static int rank=0;
  	private String name;
	
	public Racer(String name) {
		img = Toolkit.getDefaultToolkit().getImage("horse.gif");
		setBackground(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
		this.name = name;
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawLine(0, getHeight()-1, getWidth(), getHeight()-1);
		g.drawImage(img,pos,0,25,this.getHeight(),this);//x,y,width,height
		
	}

	@Override
	public void run() {
		
		for(int i=0; i<600; i+=(int)(Math.random()*10+1)) {
			pos = i;
			repaint();
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		rank++;
		System.out.println(rank + "등 : " + name);

	}
	
//	@Override
//	public String toString() {
//		rank++;
//		return rank + "등 : " + name;
//	}
}
