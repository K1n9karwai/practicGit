package abstract_1;

import java.util.Scanner;

abstract class ShapeTest {
	protected Scanner scan = new Scanner(System.in);
	
	protected double area;
	
	public ShapeTest() {
		System.out.println("ShapeTest 기본 생성자");
	}
	public abstract void calcArea();
	
	public abstract void dispArea();
	
}
//---------------------

class SamTest extends ShapeTest {
	private int base, height;
	
		public SamTest() {
			System.out.println("삼각형 넓이 구하기");
			System.out.print("밑변 : ");
			base = scan.nextInt();
			System.out.print("높이 : ");
			height = scan.nextInt();
		}
		
		@Override
		public void calcArea() {
			area = base * height/2.0;
		}
		
		public void dispArea() {
			System.out.println("삼각형 넓이 = " + area);
		}
		
}

class SaTest extends ShapeTest {
	private int width, height;
	
	public SaTest() {
		System.out.println("사각형 넓이 구하기");
		System.out.print("가로 : ");
		width = scan.nextInt();
		System.out.print("세로 : ");
		height = scan.nextInt();
	}
	
	@Override
	public void calcArea() {
		area = width*height;
	}
	
	public void dispArea() {
		System.out.println("사각형 넓이 = " + area);
	}
}

class SadariTest extends ShapeTest {
	private int top, bottom, height;
	
	public SadariTest() {
		System.out.println("사다리꼴 넓이 구하기");
		System.out.print("윗변 : ");
		top = scan.nextInt();
		System.out.print("밑변 : ");
		bottom = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
	}
	
	@Override
	
	public void calcArea() {
		area = (top+bottom)*height/2.;
	}
	
	public void dispArea() {
		System.out.println("사다리꼴 넓이 : " + area);
	}
}
//---------------------
//---------------------
//---------------------
public class ShapeMain {

	public static void main(String[] args) {
		
//		SamTest sam = new SamTest(); //결합도 100%
//		sam.calcArea();
//		sam.dispArea();
//		System.out.println();
//		
//		SaTest sa = new SaTest();
//		sa.calcArea();
//		sa.dispArea();
//		System.out.println();
//		
//		SadariTest sadari = new SadariTest();
//		sadari.calcArea();
//		sadari.dispArea();
//		System.out.println();
		
		ShapeTest shape; // 결합도 낮추기, 부모=자식, 자식=(자식)부모 [다운캐스팅을 걸어야함]
		shape = new SamTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SaTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SadariTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
	}
}
