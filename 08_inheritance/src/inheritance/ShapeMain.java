package inheritance;

import java.util.Scanner;

class ShapeTest {
	protected Scanner scan = new Scanner(System.in);
	
	protected double area;
	
	public ShapeTest() {
		System.out.println("ShapeTest �⺻ ������");
	}
	public void calcArea() {
		System.out.println("������ ����մϴ�.");
	}
	
	public void dispArea() {
		System.out.println("������ ����մϴ�.");
	}
	
}
//---------------------

class SamTest extends ShapeTest {
	private int base, height;
	
		public SamTest() {
			System.out.println("�ﰢ�� ���� ���ϱ�");
			System.out.print("�غ� : ");
			base = scan.nextInt();
			System.out.print("���� : ");
			height = scan.nextInt();
		}
		
		@Override
		public void calcArea() {
			area = base * height/2.0;
		}
		
		public void dispArea() {
			System.out.println("�ﰢ�� ���� = " + area);
		}
		
}

class SaTest extends ShapeTest {
	private int width, height;
	
	public SaTest() {
		System.out.println("�簢�� ���� ���ϱ�");
		System.out.print("���� : ");
		width = scan.nextInt();
		System.out.print("���� : ");
		height = scan.nextInt();
	}
	
	@Override
	public void calcArea() {
		area = width*height;
	}
	
	public void dispArea() {
		System.out.println("�簢�� ���� = " + area);
	}
}

class SadariTest extends ShapeTest {
	private int top, bottom, height;
	
	public SadariTest() {
		System.out.println("��ٸ��� ���� ���ϱ�");
		System.out.print("���� : ");
		top = scan.nextInt();
		System.out.print("�غ� : ");
		bottom = scan.nextInt();
		System.out.print("���� : ");
		height = scan.nextInt();
	}
	
	@Override
	
	public void calcArea() {
		area = (top+bottom)*height/2.;
	}
	
	public void dispArea() {
		System.out.println("��ٸ��� ���� : " + area);
	}
}
//---------------------
//---------------------
//---------------------
public class ShapeMain {

	public static void main(String[] args) {
		
//		SamTest sam = new SamTest(); //���յ� 100%
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
		
		ShapeTest shape; // ���յ� ���߱�, �θ�=�ڽ�, �ڽ�=(�ڽ�)�θ� [�ٿ�ĳ������ �ɾ����]
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
