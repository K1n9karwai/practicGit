package instance;

public class Operator2 {
	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println("a = " + a); // false
		System.out.println("!a = " + !a); // true
		System.out.println();

		// 클래스 메모리 생성 - new
		// String의 경우 왜 new를 안쓸까? => 문자열 literal이 가능하기 때문에. 하지만 데이터가 잡히는 구역이 다르다.

		String b = "apple";// 문자열literal//기본형 자료형은 방을 잡고 그 곳에 데이터를 직접 부여하지만
		String c = new String("apple"); // string은 메모리가 잡히고 주소 참조값을 전달
		System.out.println("b==c : " + (b == c ? "같다" : "다르다"));
		System.out.println("b!=c : " + (b != c ? "참" : "거짓"));
		System.out.println();
		System.out.println("b.equals(c) : " + (b.equals(c) ? "같다" : "다르다"));
		System.out.println("!b.equals(c) : " + (!b.equals(c) ? "참" : "거짓"));

	}
}
