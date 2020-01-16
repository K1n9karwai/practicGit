package instance;

public class CompTest {
	public static void main(String[] args) {
		int score = 69;
		int score2 = 85;
		String result = score2 >= 80 && score2 <= 100 ? "합격" : "불합격";
		System.out.println(score >= 80 && score <= 100 ? "합격" : "불합격");
		System.out.println("결과 = " + result);

		result = score % 2 == 0 ? "짝수" : "홀수";
		System.out.println("결과 = " + result);

		int b = 50;
		int result2 = score > b ? score : b;
		// String result2 = score > b ? score + "" : b + ""; 와 같다.
		System.out.println("큰 값 = " + result2);
	}
}
