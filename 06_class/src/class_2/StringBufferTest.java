package class_2;

import java.util.Scanner;

public class StringBufferTest {
	private int dan;
	
	public StringBufferTest() {
		Scanner scan = new Scanner(System.in);
		System.out.print("���ϴ� ���� �Է� : ");
		dan = scan.nextInt();
	}
	
	public void output() {
		StringBuffer sb = new StringBuffer();
		
		System.out.println("***** ������ " + dan + "�� *****");
		for(int i=1; i<=9; i++) {
			//System.out.println(dan + " x " + i + " = " + dan*i);
			sb.append(dan);
			sb.append("*");
			sb.append(i);
			sb.append("=");
			sb.append(dan*i);
			
			System.out.println(sb.toString());
			
			sb.delete(0, sb.length());
		}//for
		System.out.println("*******************");
	}

	public static void main(String[] args) {
		
		//StringBufferTest st = new StringBufferTest();
		new StringBufferTest().output();
		
	}
}
