package instance;

/*
 * 문제
 * 320, 250을 변수에 저장하여 합을 구하시오.
 * 
 * [실행결과]
 * 320 + 258 = xxx (sum)
 * 320 - 258 = xxx (sub)
 * 320 * 258 = xxx (mul)
 * 320 / 258 = xxx (div)
 * 
 */

public class NumberTest {

	public static void main(String[] args) {
		short a = 320; //내가했던것 : double a = 320.0;
		short b = 258; //내가했던것 : short b = 258;
		int sum = a + b; //내가했던것 : double sum = a + b;
		int sub = a - b; //내가했던것 : double sum = a + b;
		int mul = a * b; //내가했던것 : double sum = a + b;
		double div = (double)a / b; //내가했던것 : double sum = a + b;
		//String div = String.format("%.2f", (double)a/b);
		
		char c = 'A';
		char d = 'B';
		short e = (short)(c + d); //형변환은 항상 오른쪽 변에서만 일어난다.
		
		System.out.println(a + " + " + b + " = " + sum); //내가했던것 :
		System.out.println(a + " - " + b + " = " + sub); //내가했던것 :
		System.out.println(a + " * " + b + " = " + mul); //내가했던것 :
		System.out.println(a + " / " + b + " = " + String.format("%.2f", div)); //내가했던것 :
		
		System.out.println("c + d = " + e);
	}

}
