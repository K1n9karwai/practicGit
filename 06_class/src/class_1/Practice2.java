package class_1;

class ShapeTest {
	public static final double PI = 3.141592;//���ȭ

	
	public double area(int x) {
		return PI*x*x;
	}
	
	public double area(int x, int y) {
		return (x*y)/2.0;
	}
	
	public double area(int x, int y, int z) {
		return ((x+y)*z)/2.0;
	}
}

public class Practice2 {

	public static void main(String[] args) {
		//ShapeTest.PI = 100; -error ���ȭ�� ������ �ٲ� �� ����.
		System.out.println("PI = " + ShapeTest.PI);
		ShapeTest aa = new ShapeTest();
		
		System.out.println("���� ���� : " + String.format("%.3f", aa.area(3)));
		System.out.println("�ﰢ���� ���� : " + String.format("%.2f", aa.area(5, 7)));
		System.out.println("��ٸ����� ���� : " + String.format("%.2f", aa.area(2, 3, 5)));
		
	}
}

/*
arae(3) �� ȣ���Ͽ� ���� ����
area(5,7)�� ȣ���Ͽ� �ﰢ�� ����
area(2,3 5)�� ȣ���Ͽ� ��ٸ��� ���̸� ���Ͻÿ�

Ŭ������ : ShapeTest
�ʵ� : PI (3.141592)

[������]
���� ���� : 28.274337
�簢���� ���� : 20.0
��ٸ����� ���� : 24.5
*/
