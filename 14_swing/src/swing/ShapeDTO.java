package swing;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//1. 도형을 그린다.
//2. ShapeDTO에 저장
//3. ArrayList에 보관
//좌표 6개
//채우기
//도형모양
//색
//다시 그리기 위해선 위에 나열한 것들의 정보에 대한 저장이 필요하다

//1. ArrayList에 보관 ShapeDTO를 꺼내서 그린다
//2. 새로 그린다

enum Figure {
	LINE, CIRCLE, RECT, ROUNDRECT, PEN
	//아래처럼 상수처리 하는 것보다 이런 식으로 하는 것이 더 좋다
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
