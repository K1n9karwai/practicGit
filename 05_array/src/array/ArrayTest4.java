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
		System.out.println("프로그램을 종료합니다.");

	}

	public void menu(boolean[] ar) throws IOException {
		int num;

		while (true) {
			System.out.println("***************");
			System.out.println("1. 입차");
			System.out.println("2. 출차");
			System.out.println("3. 리스트");
			System.out.println("4. 종료");
			System.out.println("***************");
			System.out.print("  번호 :");
			num = Integer.parseInt(br.readLine());
			if (num == 4)
				break;
			if (num < 1 || num > 4) {
				System.out.println("1~4번만 입력 가능합니다.");
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

		System.out.print("위치 입력 : ");
		int index = Integer.parseInt(br.readLine());

		if (ar[index - 1]) {
			System.out.println(index + "위치에 이미 주차되어있습니다.");
		} else {
			ar[index - 1] = true;
			System.out.println(index + "위치에 입차되었습니다.");
		}
	}

	private void output(boolean[] ar) throws IOException {
		
			System.out.println("위치 입력 : ");
			int index = Integer.parseInt(br.readLine());
			
			if(ar[index-1]) {
				ar[index-1] = false;
				System.out.println(index + "위치에서 출차되었습니다.");
			} else {
				System.out.println(index + "위치에 주차되어 있지않습니다.");
			}
	}
	private void list(boolean[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println((i + 1) + "위치 :" + ar[i]);
		}
	}
}
