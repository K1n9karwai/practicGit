package array;

public class MultiArray4 {

	public static void main(String[] args) {
		String[] name = {"홍길동", "코난", "또치"};
		double[] avg = new double[3];
		char[] grade = new char[3];
		int[][] jumsu = {{70, 49, 100, 0}, {66, 89, 75, 0}, {75, 80, 48, 0}};
		
		
		System.out.println("---------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("---------------------------------------------------");
		for(int i=0; i<jumsu.length; i++) {
			for(int j=0; j<jumsu[i].length-1; j++) {
				jumsu[i][3] += jumsu[i][j];
			}
			avg[i] = (jumsu[i][3])/3.0;
			if(avg[i]>=90) grade[i] = 'A';
			else if(avg[i]>=80) grade[i] = 'B';
			else if(avg[i]>=70) grade[i] = 'C';
			else if(avg[i]>=60) grade[i] = 'D';
			else grade[i] = 'F';
		}
		
		//출력
		for(int i=0; i<jumsu.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j]+"\t");
			}//for j
			System.out.println(String.format("%.2f", avg[i])+"\t"+grade[i]);
		}//for i
		
//		for(int i = 0; i<jumsu.length; i++) {
//			System.out.print(String.format("%-5s", name[i])+"\t");
//			for(int j=0; j<jumsu[i].length; j++) {
//				System.out.print(String.format("%-4d", jumsu[i][j])+"\t");
//			}
//			System.out.print(String.format("%.2f", avg[i])+"\t");
//			if(avg[i]>=90) {
//				grade[i] = 'A';
//				System.out.println(grade[i]);
//			} else if(avg[i]>=80) {
//				grade[i] = 'B';
//				System.out.println(grade[i]);
//			} else if(avg[i]>=70) {
//				grade[i] = 'C';
//				System.out.println(grade[i]);
//			} else if(avg[i]>=70) {
//				grade[i] = 'D';
//				System.out.println(grade[i]);
//			} else {
//				grade[i] = 'F';
//				System.out.println(grade[i]);
//			}
//		}
		
		System.out.println("---------------------------------------------------");
	}

}

/*
 *name 1차원 배열
 *jumsu 2차원 배열
 *avg 1차원 배열
 *grade 1차원 배열
 **/
 