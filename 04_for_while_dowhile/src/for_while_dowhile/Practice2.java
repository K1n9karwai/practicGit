package for_while_dowhile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Practice2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("x�� �Է� : ");
		int x = Integer.parseInt(br.readLine());
		System.out.println("y�� �Է� : ");
		int y = Integer.parseInt(br.readLine());
		int mul = 1;
		//int num = 0;
// �ּ��� �����Ѱ͵� / ������ �Է��� ����� �ۼ�
//		for (int i = 0; i < y; i++) {
//			if (i == 0) {
//				num += x;
//
//			} else {
//				num *= x;
//			}
//		}
		for(int i=1; i<=y; i++) {
			mul *= x;
		}
		
		System.out.println(x + "�� " + y + "�� " + mul);

	}
}

/*
 * [����2] ������ ���Ͻÿ� (x�� y�� ��) [������] x�� �Է� : 2 y�� �Է� : 5 2�� 5�� xx (2*2*2*2*2) �Ǵ�
 * x�� �Է� : 3 y�� �Է� : 4 3�� 4�� xx (3*3*3*3)
 */
