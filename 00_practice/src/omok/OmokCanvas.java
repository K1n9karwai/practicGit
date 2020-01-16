package omok;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class OmokCanvas extends Canvas {
	private Omok omok;
	private Image white = Toolkit.getDefaultToolkit().getImage("white.png");
	private Image black = Toolkit.getDefaultToolkit().getImage("black.png");
	private Image bufferImg;
	private Graphics bufferG;

	public OmokCanvas(Omok omok) {
		this.omok = omok;
		setBackground(new Color(207, 146, 69));
	}

	@Override
	public void paint(Graphics g) {

		int xNum = 97;
		int yNum = 107;

		g.drawRect(50, 60, 800, 800);
		for (int i = 0; i < 17; i++) {
			g.drawLine(xNum, 60, xNum, 860);
			xNum += 44;
		}
		for (int i = 0; i < 17; i++) {
			g.drawLine(50, yNum, 850, yNum);
			yNum += 44;
		}

		int x = 180;
		int y = 200;
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i++) {
				g.drawString("¡Ü", x, y);
				y += 264;
			}
			y = 200;
			x += 264;
		}

		for (OmokDTO dto : omok.getList()) {
			int xPoint = dto.getxPoint();
			int yPoint = dto.getyPoint();
			int panX = 50;
			int panY = 60;
			if (dto.getSw() % 2 == 0) {
				if(((panX+15)>=xPoint||(panX-15)<=xPoint) &&((panY+15)>=yPoint||(panY-15)<=yPoint)) {
				System.out.println("¹é¹è°³¹é¹é¹éµ¹");
				System.out.println("x = " + xPoint + "\t" + "y = " + yPoint);
//				g.drawImage(white, xPoint-20, yPoint-20, 40, 40, this);
				g.drawImage(white, panX, panY, 40, 40, this);
				}
			} else {
				if(((panX+15)>=xPoint||(panX-15)<=xPoint) &&((panY+15)>=yPoint||(panY-15)<=yPoint)) {
				System.out.println("ÈæÈæÈå±× Èæµ¹");
				System.out.println("x = " + xPoint + "\t" + "y = " + yPoint);
				g.drawImage(black, panX, panY, 40, 40, this);
				}
			}
			panX += 44;
			panY += 44;
		}
		
	}

}
