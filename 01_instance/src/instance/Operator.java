package instance;

public class Operator {
	public static void main(String[] args) {
		int a = 5;
		a += 2;
		a *= 3;
		a /= 9;
		System.out.println("a = " + a);

		int i;
		for (i = 0; i < 10; i++) {
			System.out.println(i);
		}
		int c = 2;
		int b = c++;
		System.out.println("b = " + b + "\t c = " + c);

		int d = ++b - c--; // ±âÁ¸ b=2, c=3
		System.out.println("d = " + d + "\t b =" + b + "\t c = " + c); //
	}
}
