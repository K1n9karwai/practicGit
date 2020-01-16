package inheritance;

import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("인웝수 입력 : ");
		int people = Integer.parseInt(scan.next());
		Exam[] ex = new Exam[people];
		
		for(int i=0; i<people; i++) {
			ex[i] = new Exam(); //클래스 생성 및 생성자 호출
			ex[i].compare();
		}
		
		System.out.println("이름\t1 2 3 4 5\t점수");
		for(int i=0; i<people; i++) {
			System.out.print(ex[i].getName()+"\t");
//			ex[i].getOx();
			for(int j=0; j<ex[i].getOx().length; j++) {
				System.out.print(ex[i].getOx()[j] + " ");
			}
			System.out.println("\t"+ex[i].getScore());
		}
		
	}
}
