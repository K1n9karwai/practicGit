package instance;

/*
 * ����
 * 320, 250�� ������ �����Ͽ� ���� ���Ͻÿ�.
 * 
 * [������]
 * 320 + 258 = xxx (sum)
 * 320 - 258 = xxx (sub)
 * 320 * 258 = xxx (mul)
 * 320 / 258 = xxx (div)
 * 
 */

public class NumberTest {

	public static void main(String[] args) {
		short a = 320; //�����ߴ��� : double a = 320.0;
		short b = 258; //�����ߴ��� : short b = 258;
		int sum = a + b; //�����ߴ��� : double sum = a + b;
		int sub = a - b; //�����ߴ��� : double sum = a + b;
		int mul = a * b; //�����ߴ��� : double sum = a + b;
		double div = (double)a / b; //�����ߴ��� : double sum = a + b;
		//String div = String.format("%.2f", (double)a/b);
		
		char c = 'A';
		char d = 'B';
		short e = (short)(c + d); //����ȯ�� �׻� ������ �������� �Ͼ��.
		
		System.out.println(a + " + " + b + " = " + sum); //�����ߴ��� :
		System.out.println(a + " - " + b + " = " + sub); //�����ߴ��� :
		System.out.println(a + " * " + b + " = " + mul); //�����ߴ��� :
		System.out.println(a + " / " + b + " = " + String.format("%.2f", div)); //�����ߴ��� :
		
		System.out.println("c + d = " + e);
	}

}
