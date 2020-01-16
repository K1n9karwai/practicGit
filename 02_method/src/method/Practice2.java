package method;

/*
[문제2]
주사위를 2번 던져서 나온 값의 합을 구하시오
주사위는 input()에서 1~6사이의 난수를 발생하여 리턴한다
합은 add()에서 구하여 리턴 받는다

[실행결과]
첫번째 주사위 값 : 3
두번째 주사위 값 : 6
합은 9 이다
 */
public class Practice2 {

	public int input() {
		return (int) (Math.random() * 6 + 1);
	}

	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Practice2 p2 = new Practice2();

		int firstNum = p2.input();
		int secondNum = p2.input();
		int sum = p2.add(firstNum, secondNum);

		System.out.println("첫번째 주사위 값 : " + firstNum);
		System.out.println("두번째 주사위 값 : " + secondNum);
		System.out.println("합은 " + sum + "이다.");

	}
}
