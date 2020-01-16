package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest3 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public int input(int[] ar) throws IOException {//������
		int sum = 0;
		for(int i=0; i<ar.length; i++) {
			System.out.println("ar["+i+"] : ");
			ar[i] = Integer.parseInt(br.readLine());
			sum += ar[i];
		}
		return sum;
	}
	
	public int big(int[] ar) {
		int max = ar[0];
		for(int i=0; i<ar.length; i++) {
			if(ar[i] > max) max = ar[i]; 
		}
		return max;
	}
	
	public int small(int[] ar) {
		int min = ar[0];
		for(int i=0; i<ar.length; i++) {
			if(ar[i] < min) min = ar[i];
	}
		return min;
	}
	
	public void output(int[] ar, int sum, int max, int min) {
		for(int data : ar) {
			System.out.print(data + " ");
		}
		
		System.out.println();
		System.out.println("�� = " + sum);
		System.out.println("�ִ밪 = " + max);
		System.out.println("�ּҰ� = " + min);
	}

	public static void main(String[] args) throws IOException{
		ArrayTest3 at3 = new ArrayTest3();
		
		System.out.print("�迭 ũ�� �Է� : ");
		int size = Integer.parseInt(at3.br.readLine());
		
		int[] ar = new int[size];
		int sum = at3.input(ar);//ȣ���
		int max = at3.big(ar);
		int min = at3.small(ar);
		at3.output(ar, sum, max, min);
		
		
//		for(int i=0; i<ar.length; i++) {
//			System.out.println("ar["+i+"] : ");
//			ar[i] = Integer.parseInt(br.readLine());
//			//sum += ar[i]; �Ʒ��� sum += data;�� ����
//		}
		
//		max = min = ar[0];
//		for(int i=0; i<ar.length; i++) {
//			if(ar[i] > max) max = ar[i]; 
//			if(ar[i] < min) min = ar[i];
//		}
		
//		for(int data : ar) {
//			System.out.print(data + " ");
//		}
//		
//		System.out.println();
//		System.out.println("�� = " + sum);
//		System.out.println("�ִ밪 = " + max);
//		System.out.println("�ּҰ� = " + min);
//		
	}
}
