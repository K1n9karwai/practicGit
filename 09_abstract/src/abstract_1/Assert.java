package abstract_1;

import java.util.Scanner;

public class Assert {
	private int x, y;

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("x 값 입력 : ");
		x = scan.nextInt();
		System.out.print("y 값 입력 : ");
		y = scan.nextInt();
	}

	public void output() {
		assert y>=0 : "y는 0보다 크거나 같아야 한다.";
		
		int num = 1;
		for (int i = 1; i <= y; i++) {
			num *= x;
		}
		System.out.println("---------------------------");
		System.out.println(x + "의 " + y + "승은 " + num);
	}

	public static void main(String[] args) {

		Assert as = new Assert();

		as.input();
		as.output();
	}

}
