package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest4 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		boolean[] ar = new boolean[5];
		ArrayTest4 at = new ArrayTest4();

		at.menu(ar);
		System.out.println("���α׷��� �����մϴ�.");

	}

	public void menu(boolean[] ar) throws IOException {
		int num;

		while (true) {
			System.out.println("***************");
			System.out.println("1. ����");
			System.out.println("2. ����");
			System.out.println("3. ����Ʈ");
			System.out.println("4. ����");
			System.out.println("***************");
			System.out.print("  ��ȣ :");
			num = Integer.parseInt(br.readLine());
			if (num == 4)
				break;
			if (num < 1 || num > 4) {
				System.out.println("1~4���� �Է� �����մϴ�.");
				continue;
			}
			if (num == 1)
				input(ar);
			else if (num == 2)
				output(ar);
			else if (num == 3)
				list(ar);
		}
	}

	private void input(boolean[] ar) throws IOException {

		System.out.print("��ġ �Է� : ");
		int index = Integer.parseInt(br.readLine());

		if (ar[index - 1]) {
			System.out.println(index + "��ġ�� �̹� �����Ǿ��ֽ��ϴ�.");
		} else {
			ar[index - 1] = true;
			System.out.println(index + "��ġ�� �����Ǿ����ϴ�.");
		}
	}

	private void output(boolean[] ar) throws IOException {
		
			System.out.println("��ġ �Է� : ");
			int index = Integer.parseInt(br.readLine());
			
			if(ar[index-1]) {
				ar[index-1] = false;
				System.out.println(index + "��ġ���� �����Ǿ����ϴ�.");
			} else {
				System.out.println(index + "��ġ�� �����Ǿ� �����ʽ��ϴ�.");
			}
	}
	private void list(boolean[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println((i + 1) + "��ġ :" + ar[i]);
		}
	}
}