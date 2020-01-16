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
		System.out.print("인원수 : ");
		cnt = Integer.parseInt(br.readLine());
		
		String[][] ar = new String[cnt][1];
		int[] subject = new int[cnt];
		//System.out.println(ar[0].length);
		
		for(int i=0; i<ar.length; i++) {
			System.out.print("이름 입력 : ");
			String name = br.readLine();
			//System.out.println(ar[i][0]);
			System.out.print("과목수 입력 : ");
			subjectCnt = Integer.parseInt(br.readLine());
			ar[i] = new String[subjectCnt*2+3];
			ar[i][0] = name;
			subject[i] = subjectCnt;
			for(int j=1; j<=subjectCnt; j++) {
				System.out.print("과목명 입력 : ");
				ar[i][j] = br.readLine();
				//System.out.println(ar[i][j]);
			}
			for(int k=1+subjectCnt; k<ar[i].length-2; k++) {
				System.out.print(ar[i][k-subjectCnt] + "점수 입력 : ");
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
			
			System.out.print("이름\t");
			
			for(int j=1; j<ar[i].length-(subject[i]+2); j++) {
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println("총점\t평균");
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
[문제]
인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
평균은 소수이하 2째자리까지 출력

[실행결과]
인원수 : 2 (cnt)

이름입력 : 홍길동 (name)
과목수 입력 : 2   (subjectCnt)
과목명 입력 : 국어 (subject)
과목명 입력 : 영어
국어 점수 입력 : 95 (jumsu)
영어 점수 입력 : 100
---------------------
이름입력 : 이기자
과목수 입력 : 3
과목명 입력 : 국어
과목명 입력 : 영어
과목명 입력 : 과학
국어 점수 입력 : 95
영어 점수 입력 : 100
과학 점수 입력 : 90
---------------------

이름     국어	  영어   	총점     평균
홍길동    95	  100   xxx	xx.xx

이름	국어  	영어   	과학    	총점     	평균
이기자   	95   	100	   90	 xxx      xx.xx
 */