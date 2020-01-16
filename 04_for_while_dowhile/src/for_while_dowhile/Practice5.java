package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice5 {
	
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
		
		if(totalPoint>=90) {
			grade = "A";
			grade2 = "excellent";
		} else if (totalPoint>=80) {
			grade = "B";
			grade2 = "excellent";
		} else if (totalPoint>=70) {
			grade = "C";
			grade2 = "good";
		} else if (totalPoint>=60) {
			grade = "D";
			grade2 = "good";
		} else {
			grade = "F";
			grade2 = "poor";
		}
		
		System.out.println("���� = " + String.format("%.2f", totalPoint));
		System.out.println("���� = " + grade);
		System.out.println("���� = " + grade2);
		
		
		
	}
}

/*  [����5] ���� ���� ���α׷�
�߰����, �⸻���, ����Ʈ, �⼮������ �Է¹޾Ƽ� ����Ͻÿ�

����1) (�߰�+�⸻)/2    ---> 60%
          ����   	     ---> 20%
          �⼮                ---> 20%     
����2)  90�̻� 'A'����     		
          80�̻� 'B'����        		  	 
          70�̻� 'C'����        		  	 
          60�̻� 'D'����        		  	 
          ������ 'F'����
����3)
         A, B����  ---->"excellent"     
         C, D����  ---->"good"
         F����    ---->"poor"

[������]
�߰���縦 �Է��Ͻÿ� : 90
�⸻��縦 �Է��Ͻÿ� : 89
���������� �Է��Ͻÿ� : 99
�⼮������ �Է��Ͻÿ� : 100

����=93.50         <---�Ҽ����� 2°�ڸ�����
����=A              
��=excellent
*/