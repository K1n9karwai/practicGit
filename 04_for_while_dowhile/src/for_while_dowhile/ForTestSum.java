package for_while_dowhile;

public class ForTestSum {

	public static void main(String[] args) {

		int a = 0;

		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 1) {
				a -= i;
				System.out.print("-" + i);
			} else {
				a += i;
				System.out.print("+" + i);
			}
		}
		System.out.println(" = " + a);
	}
}

//[실행결과]
//-1+2-3+4-5+6-7+8-9+10 = 5