package inheritance;

import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ο��� �Է� : ");
		int people = Integer.parseInt(scan.next());
		Exam[] ex = new Exam[people];
		
		for(int i=0; i<people; i++) {
			ex[i] = new Exam(); //Ŭ���� ���� �� ������ ȣ��
			ex[i].compare();
		}
		
		System.out.println("�̸�\t1 2 3 4 5\t����");
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
