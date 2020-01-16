package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiArray6 {

	public static void main(String[] args) throws IOException {
		
		int cnt;
		int subjectCnt=0;
		int jumsu = 0;
		int tot = 0;
		double avg;
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�ο��� : ");
		cnt = Integer.parseInt(br.readLine());
		
		String[][] ar = new String[cnt][1];
		int[] subject = new int[cnt];
		//System.out.println(ar[0].length);
		
		for(int i=0; i<ar.length; i++) {
			System.out.print("�̸� �Է� : ");
			String name = br.readLine();
			//System.out.println(ar[i][0]);
			System.out.print("����� �Է� : ");
			subjectCnt = Integer.parseInt(br.readLine());
			ar[i] = new String[subjectCnt*2+3];
			ar[i][0] = name;
			subject[i] = subjectCnt;
			for(int j=1; j<=subjectCnt; j++) {
				System.out.print("����� �Է� : ");
				ar[i][j] = br.readLine();
				//System.out.println(ar[i][j]);
			}
			for(int k=1+subjectCnt; k<ar[i].length-2; k++) {
				System.out.print(ar[i][k-subjectCnt] + "���� �Է� : ");
				ar[i][k] = br.readLine();
				//System.out.println(ar[i][k]);
				tot += Integer.parseInt(ar[i][k]);
				ar[i][subjectCnt*2+1] = String.format("%d", tot);
				//System.out.println(ar[i][subjectCnt*2+1]);
			} avg = (double)tot/subjectCnt;
			ar[i][subjectCnt*2+2] = String.format("%.2f", avg);
			tot = 0;
			System.out.println();
			System.out.println("---------------------------");
			System.out.println();
			
			//System.out.println(ar[i][subjectCnt*2+2]);
			
		}
		
		for(int i=0; i<ar.length; i++) {
			
			System.out.print("�̸�\t");
			
			for(int j=1; j<ar[i].length-(subject[i]+2); j++) {
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println("����\t���");
			System.out.print(ar[i][0] + "\t");
			for(int k=subject[i]+1; k<ar[i].length; k++) {
				System.out.print(ar[i][k] + "\t");
			}
			System.out.println();
			
//			for(int k=0; k<ar[i].length; k++) {
//				System.out.print(ar[i][k] + "\t");
			//}
		}
		
		
		
	}
}

/*
[����]
�ο����� �Է��Ͽ� �ο�����ŭ �����͸� �Է¹ް� ������ ����� ���Ͻÿ�
����� �Ҽ����� 2°�ڸ����� ���

[������]
�ο��� : 2 (cnt)

�̸��Է� : ȫ�浿 (name)
����� �Է� : 2   (subjectCnt)
����� �Է� : ���� (subject)
����� �Է� : ����
���� ���� �Է� : 95 (jumsu)
���� ���� �Է� : 100
---------------------
�̸��Է� : �̱���
����� �Է� : 3
����� �Է� : ����
����� �Է� : ����
����� �Է� : ����
���� ���� �Է� : 95
���� ���� �Է� : 100
���� ���� �Է� : 90
---------------------

�̸�     ����	  ����   	����     ���
ȫ�浿    95	  100   xxx	xx.xx

�̸�	����  	����   	����    	����     	���
�̱���   	95   	100	   90	 xxx      xx.xx
 */