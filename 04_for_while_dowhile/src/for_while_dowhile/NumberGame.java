package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGame {

	public static void main(String[] args) throws IOException {
		int com, user;
		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			count = 0;
			com = (int) (Math.random() * 100 + 1);// 1~100
		while (true) {
			System.out.println("���� �Է� : ");
			user = Integer.parseInt(br.readLine());
			count++;
			
			if (user == com) {
				break;
			} else if (user > com) {
				System.out.println(user + "���� �۽��ϴ�.");
			} else {
				System.out.println(user + "���� Ů�ϴ�.");
			}
		}
		
		System.out.println("������ " + count + "������ ���߼̽��ϴ�.");
		System.out.println("�� �ҷ�?(Y/N)");
		String again = br.readLine();
		if(again.equals("N")||again.equals("n")) break;
		}while(true);
		System.out.println("���α׷��� �����մϴ�.");
	}
}
		
	

////���ڸ��߱� ����
//1~100������ ������ �߻��Ͽ� ���ߴ� ����
//
//[������]
//���� �Է� : 50
//50���� Ů�ϴ�.
//
//�����Է� : 90
//90���� �۽��ϴ�.
//
//...
//
//���� �Է� : 87
//������ xx������ ���߼̽��ϴ�.