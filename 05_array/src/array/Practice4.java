package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String start;
		String playNum;
		int[] com = new int[3];
		int[] user = new int[3];
		int strike = 0;
		int ball = 0;

		LOOP: while (true) {
			System.out.print("������ �����Ͻðڽ��ϱ�?(Y/N) : ");
			start = br.readLine();
			if (start.equals("Y") || start.equals("y")) {
				System.out.println("������ �����մϴ�.");

				for (int i = 0; i < com.length; i++) {
					com[i] = (int) (Math.random() * 9) + 1;

					for (int j = 0; j < i; j++) {
						if (com[i] == com[j]) {
							i--;
							break;
						}
					}
				}
//				System.out.print(rightAnswer[0]);
//				System.out.print(rightAnswer[1]);
//				System.out.print(rightAnswer[2]);
//				System.out.println();

				while (true) {
					System.out.print("���� �Է� : ");
					playNum = br.readLine();
					// System.out.println(playNum.charAt(0));
					for (int i = 0; i < user.length; i++) {
						user[i] = (playNum.charAt(i)) - 48;
						//System.out.print(playNumArr[i]);
					}
					System.out.println();
					for (int i = 0; i < com.length; i++) {
						for (int j = 0; j < user.length; j++) {
							if (com[i] == user[j]) {
								if (i == j) {
									strike++;
								} else {
									ball++;
								}
							} // else if(rightAnswer[i]==playNumArr[i+1]&&)
						} // System.out.println("��Ʈ����ũ : " + strike);
							// System.out.println("�� : " + ball);
					}
					if (strike == 0 && ball == 0) {
						System.out.println(strike + "��Ʈ����ũ " + ball + "��");
					} else if (strike == 3) {
						System.out.println(strike + "��Ʈ����ũ " + ball + "��");
						break LOOP;
					} else {
						System.out.println(strike + "��Ʈ����ũ " + ball + "��");
					}
					System.out.println();
					strike = 0;
					ball = 0;
				}
			} else if (start.equals("N") || start.equals("n")) {
				System.out.println("������ �����մϴ�.");
				break;
			} else {
				continue;
			}
		}

	}

}
/*
[����4] �߱�����
ũ�Ⱑ 3���� ������ �迭�� ��� 1~9������ ������ �߻��Ѵ�
�߻��� ���� ���ߴ� ����
�ߺ��� �����Ѵ�

[������]
������ �����Ͻðڽ��ϱ�(Y/N) : w
������ �����Ͻðڽ��ϱ�(Y/N) : u
������ �����Ͻðڽ��ϱ�(Y/N) : y

������ �����մϴ�

�����Է� : 123
0��Ʈ����ũ 0��

�����Է� : 567
0��Ʈ����ũ 2��

�����Է� : 758
1��Ʈ����ũ 2��
...

�����Է� : 785
3��Ʈ����ũ 0��
*/