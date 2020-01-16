package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4__ {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String start;
		String inputStr;
		int[] com = new int[3];
		int[] user = new int[3];
		int strike = 0;
		int ball = 0;

		do {
			System.out.print("������ �����Ͻðڽ��ϱ�?(Y/N) : ");
			start = br.readLine();

		} while (!start.equals("Y") && !start.equals("y") && !start.equals("n") && !start.equals("N"));

		if (start.equals("y") || start.equals("Y")) {
			System.out.println();
			System.out.println("������ �����մϴ�.");

			// �����߻�
			for (int i = 0; i < com.length; i++) {
				com[i] = (int) (Math.random() * 9) + 1;

				// �ߺ�üũ
				for (int j = 0; j < i; j++) {
					if (com[i] == com[j]) {
						i--;
						break;
					}
				}
			}
			while (true) {
				//System.out.println(com[0] + "," + com[1] + "," + com[2]);

				System.out.println();
				System.out.print("���� �Է� : ");
				inputStr = br.readLine();

				for (int i = 0; i < user.length; i++) {
					user[i] = inputStr.charAt(i) - 48;
				}

				// ��
				strike = ball = 0;
				for (int i = 0; i < com.length; i++) {
					for (int j = 0; j < user.length; j++) {
						if (com[i] == user[j]) {
							if (i == j) {
								strike++;
							} else {
								ball++;
							}
						}
					}
				} // for i
				System.out.println(strike + " ��Ʈ����ũ " + ball + " �� ");
				if (strike == 3)
					break;
			}//while

		}
		System.out.println("���α׷��� �����մϴ�.");

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