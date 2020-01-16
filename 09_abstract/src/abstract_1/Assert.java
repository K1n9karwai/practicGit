package abstract_1;

import java.util.Scanner;

public class Assert {
	private int x, y;

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("x �� �Է� : ");
		x = scan.nextInt();
		System.out.print("y �� �Է� : ");
		y = scan.nextInt();
	}

	public void output() {
		assert y>=0 : "y�� 0���� ũ�ų� ���ƾ� �Ѵ�.";
		
		int num = 1;
		for (int i = 1; i <= y; i++) {
			num *= x;
		}
		System.out.println("---------------------------");
		System.out.println(x + "�� " + y + "���� " + num);
	}

	public static void main(String[] args) {

		Assert as = new Assert();

		as.input();
		as.output();
	}

}
