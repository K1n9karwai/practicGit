package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest3 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public int input(int[] ar) throws IOException {//구현부
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
		System.out.println("합 = " + sum);
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);
	}

	public static void main(String[] args) throws IOException{
		ArrayTest3 at3 = new ArrayTest3();
		
		System.out.print("배열 크기 입력 : ");
		int size = Integer.parseInt(at3.br.readLine());
		
		int[] ar = new int[size];
		int sum = at3.input(ar);//호출부
		int max = at3.big(ar);
		int min = at3.small(ar);
		at3.output(ar, sum, max, min);
		
		
//		for(int i=0; i<ar.length; i++) {
//			System.out.println("ar["+i+"] : ");
//			ar[i] = Integer.parseInt(br.readLine());
//			//sum += ar[i]; 아래의 sum += data;와 동일
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
//		System.out.println("합 = " + sum);
//		System.out.println("최대값 = " + max);
//		System.out.println("최소값 = " + min);
//		
	}
}
