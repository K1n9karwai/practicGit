package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice6 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�߰���� ������ �Է��ϼ��� : ");
		int mt = Integer.parseInt(br.readLine());
		System.out.print("�⸻��� ������ �Է��ϼ��� : ");
		int ft = Integer.parseInt(br.readLine());
		System.out.print("����Ʈ ������ �Է��ϼ��� : ");
		int report = Integer.parseInt(br.readLine());
		System.out.print("�⼮ ������ �Է��ϼ��� : ");
		int come = Integer.parseInt(br.readLine());
		
		double mfPoint = ((mt+ft)/2*0.6);
		double rPoint = report*0.2;
		double cPoint = come*0.2;
		double totalPoint = mfPoint + rPoint + cPoint;
		String grade = null;
		String grade2 = null;
		
		switch (((int)totalPoint/10)) {

		case 10:
		case 9: {
			grade = "A";
			grade2 = "excellent";
		} break;
		case 8: {
			grade = "B";
			grade2 = "excellent";
		} break;
		case 7: {
			grade = "C";
			grade2 = "good";
		} break;
		case 6: {
			grade = "D";
			grade2 = "good";
		} break;

		default: {
			grade = "F";
			grade2 = "poor";
		} break;
		}
		
		System.out.println("���� = " + String.format("%.2f", totalPoint));
		System.out.println("���� = " + grade);
		System.out.println("���� = " + grade2);
		
	}
}
/*
[����6]
����5������ ����2, ����3�� if������ ó���� ���� switch�� �ٲٽÿ�
*/
 