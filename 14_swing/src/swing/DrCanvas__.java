package swing;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrCanvas__ extends Canvas{
	private MsPaint__ msPaint__;
	private ShapeDTO[] shape;
	private ArrayList<ShapeDTO> list = new ArrayList<ShapeDTO>();
	private boolean fill;
	
	public DrCanvas__(MsPaint__ msPaint__) {
		this.msPaint__ = msPaint__;
		this.setBackground(new Color(255, 200, 255));
		
	}
	
	@Override
	public void paint(Graphics g) {
		//��ǥ
		int x1 = Integer.parseInt(msPaint__.getX1T().getText().trim());
		int y1 = Integer.parseInt(msPaint__.getY1T().getText().trim());
		int x2 = Integer.parseInt(msPaint__.getX2T().getText().trim());
		int y2 = Integer.parseInt(msPaint__.getY2T().getText().trim());
		int z1 = Integer.parseInt(msPaint__.getZ1T().getText().trim());
		int z2 = Integer.parseInt(msPaint__.getZ2T().getText().trim());
		
		shape = new ShapeDTO[20];
		
		for(int i=0; i<shape.length; i++) {
			shape[i].setX1T(x1);
			shape[i].setY1T(y1);
			
			shape[i].setX2T(Integer.parseInt(msPaint__.getX2T().getText().trim()));
			shape[i].setY2T(Integer.parseInt(msPaint__.getY2T().getText().trim()));
			
			shape[i].setZ1T(Integer.parseInt(msPaint__.getZ1T().getText().trim()));
			shape[i].setZ2T(Integer.parseInt(msPaint__.getZ2T().getText().trim()));
			
			shape[i].setFill(msPaint__.getFill().isSelected());
			shape[i].setCombo(msPaint__.getCombo().getSelectedIndex());
			
			shape[i].setCircle(msPaint__.getCircle().isSelected());
			shape[i].setLine(msPaint__.getLine().isSelected());
			shape[i].setRect(msPaint__.getRect().isSelected());
			shape[i].setRoundRect(msPaint__.getRoundRect().isSelected());
			
			list.add(shape[i]);
			}
		
		
		
		//��
		for(int i=0; i<list.size(); i++) {
			
			switch(list.get(i).getCombo()) {
				case 0: g.setColor(new Color(255,0,0)); break;
				case 1: g.setColor(new Color(200,91,1)); break;
				case 2: g.setColor(new Color(255,255,0)); break;
				case 3: g.setColor(new Color(0,255,0)); break;
				case 4: g.setColor(new Color(0,0,255)); break;
				case 5: g.setColor(new Color(24,2,176)); break;
				case 6: g.setColor(new Color(255,0,255)); break;
			}
			
			if(list.get(i).getFill()) {
				if(list.get(i).isLine()) {
					g.drawLine(list.get(i).getX1T(), list.get(i).getY1T(),
							list.get(i).getX2T(), list.get(i).getY2T());
				} else if(list.get(i).isCircle()) {
					g.fillOval(Math.min(list.get(i).getX1T(), list.get(i).getX2T()),
							Math.min(list.get(i).getY1T(), list.get(i).getY2T()),
							Math.abs(list.get(i).getX2T()-list.get(i).getX1T()),
							Math.abs(list.get(i).getY2T()-list.get(i).getY2T()));
				} else if(list.get(i).isRect()) {
					g.fillRect(Math.min(list.get(i).getX1T(), list.get(i).getX2T()),
							Math.min(list.get(i).getY1T(), list.get(i).getY2T()),
							Math.abs(list.get(i).getX2T()-list.get(i).getX1T()),
							Math.abs(list.get(i).getY2T()-list.get(i).getY2T()));
				} else if(list.get(i).isRoundRect()) {
					g.fillRoundRect(Math.min(list.get(i).getX1T(), list.get(i).getX2T()),
							Math.min(list.get(i).getY1T(), list.get(i).getY2T()),
							Math.abs(list.get(i).getX2T()-list.get(i).getX1T()),
							Math.abs(list.get(i).getY2T()-list.get(i).getY2T()),
							list.get(i).getZ1T(), list.get(i).getZ2T());
				}
			} else {
				if(list.get(i).isLine()) {
					g.drawLine(list.get(i).getX1T(), list.get(i).getY1T(),
							list.get(i).getX2T(), list.get(i).getY2T());
				} else if(list.get(i).isCircle()) {
					g.drawOval(Math.min(list.get(i).getX1T(), list.get(i).getX2T()),
							Math.min(list.get(i).getY1T(), list.get(i).getY2T()),
							Math.abs(list.get(i).getX2T()-list.get(i).getX1T()),
							Math.abs(list.get(i).getY2T()-list.get(i).getY2T()));
				} else if(list.get(i).isRect()) {
					g.drawRect(Math.min(list.get(i).getX1T(), list.get(i).getX2T()),
							Math.min(list.get(i).getY1T(), list.get(i).getY2T()),
							Math.abs(list.get(i).getX2T()-list.get(i).getX1T()),
							Math.abs(list.get(i).getY2T()-list.get(i).getY2T()));
				} else if(list.get(i).isRoundRect()) {
					g.drawRoundRect(Math.min(list.get(i).getX1T(), list.get(i).getX2T()),
							Math.min(list.get(i).getY1T(), list.get(i).getY2T()),
							Math.abs(list.get(i).getX2T()-list.get(i).getX1T()),
							Math.abs(list.get(i).getY2T()-list.get(i).getY2T()),
							list.get(i).getZ1T(), list.get(i).getZ2T());
				}
				
			}
		
		}
		//����
//		if(msPaint__.getFill().isSelected()) {
//			if(msPaint__.getLine().isSelected())
//				g.drawLine(x1, y1, x2, y2);
//			else if(msPaint__.getCircle().isSelected()) {
//				g.fillOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1));
//
//			}
//			else if(msPaint__.getRect().isSelected()) {
//				g.fillRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1));
//
//			}
//			else if(msPaint__.getRoundRect().isSelected()) {
//				g.fillRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1), z1, z2);
//
//			}
//			 	
//		}else {
//			if(msPaint__.getLine().isSelected())
//				g.drawLine(x1, y1, x2, y2);
//			else if(msPaint__.getCircle().isSelected()) {
//				g.drawOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1));
//
//			}
//			else if(msPaint__.getRect().isSelected()) {
//				g.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1));
//
//			}
//			else if(msPaint__.getRoundRect().isSelected()) {
//				g.drawRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1),z1, z2);
//			}
//		}
		
		
	}
	
//	private int num1, num2, num3, num4; 
//	private int sw;
//	
//	public DrCanvas(String num1, String num2, String num3, String num4, int sw) {
//		
//		this.num1 = Integer.parseInt(num1);
//		this.num2 = Integer.parseInt(num2);
//		this.num3 = Integer.parseInt(num3);
//		this.num4 = Integer.parseInt(num4);
//		this.sw = sw;
//		
//		this.setBackground(new Color(125,200,210));
//	}
//	
//	@Override
//	public void paint(Graphics g) { //Call Back, �ݹ�޼ҵ� (���� ������ �Ǹ� JVM�� ���ؼ� ȣ��ȴ�,frame â�� ����� �Ҷ�), repaint()
//		System.out.println("�׸��� ��Ӵ�");
//		if(sw==1) {
//			g.drawLine(num1, num2, num3, num4);
//			System.out.println("�� �׸���");
//		} else if(sw==2) {
//			g.drawOval(num1, num2, num3, num4);
//			System.out.println("�� �׸���");
//		} else if(sw==3) {
//			g.drawRect(num1, num2, num3, num4);
//			System.out.println("�簢 �׸���");
//		} else if(sw==4) {
//			g.drawRect(num1, num2, num3, num4);
//			System.out.println("�ձٻ簢 �׸���");
//		}	
//	}
}
