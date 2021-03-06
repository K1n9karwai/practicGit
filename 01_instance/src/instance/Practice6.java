package instance;

/*
 * [문제6]
ch에 있는 데이터가 대문자이면 소문자로 출력하고 아니면(소문자) 대문자로 출력하시오

[실행결과]
T → t (ch에 T에 있을 때)
또는
e → E (ch에 e가 있을 때)
 */
public class Practice6 {
	public static void main(String[] args) {
		char ch = 'Z';
		// char ch = 'e';

		int result = ch >= 65 && ch <= 90 ? ch + 32 : ch - 32;
		// int result = ch >= 'A' && ch <= 'B' ? ch + 32 : ch - 32;

		System.out.println(ch + " -> " + (char) result);
	}
}
