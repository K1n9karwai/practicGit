package swing;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//1. ������ �׸���.
//2. ShapeDTO�� ����
//3. ArrayList�� ����
//��ǥ 6��
//ä���
//�������
//��
//�ٽ� �׸��� ���ؼ� ���� ������ �͵��� ������ ���� ������ �ʿ��ϴ�

//1. ArrayList�� ���� ShapeDTO�� ������ �׸���
//2. ���� �׸���

enum Figure {
	LINE, CIRCLE, RECT, ROUNDRECT, PEN
	//�Ʒ�ó�� ���ó�� �ϴ� �ͺ��� �̷� ������ �ϴ� ���� �� ����
}
public class ShapeDTO {
	
//	public static final int LINE = 0;
//	public static final int CIRCLE = 1;
//	public static final int RECT = 2;
//	public static final int ROUNDRECT = 3;
//	public static final int PEN = 4;
	
	
	private int x1T, y1T, x2T, y2T, z1T, z2T;
	private boolean fill;
	private Figure shape;
	private int color;
	public int getX1T() {
		return x1T;
	}
	public void setX1T(int x1t) {
		x1T = x1t;
	}
	public int getY1T() {
		return y1T;
	}
	public void setY1T(int y1t) {
		y1T = y1t;
	}
	public int getX2T() {
		return x2T;
	}
	public void setX2T(int x2t) {
		x2T = x2t;
	}
	public int getY2T() {
		return y2T;
	}
	public void setY2T(int y2t) {
		y2T = y2t;
	}
	public int getZ1T() {
		return z1T;
	}
	public void setZ1T(int z1t) {
		z1T = z1t;
	}
	public int getZ2T() {
		return z2T;
	}
	public void setZ2T(int z2t) {
		z2T = z2t;
	}
	public boolean isFill() {
		return fill;
	}
	public void setFill(boolean fill) {
		this.fill = fill;
	}
	public Figure getShape() {
		return shape;
	}
	public void setShape(Figure shape) {
		this.shape = shape;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	
	
	

}
