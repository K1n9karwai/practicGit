package class_2;

public class StringTest {

	public static void main(String[] args) {

		String a = "apple"; // literal 생성
		String b = "apple";
		if (a == b)
			System.out.println("a와 b의 참조값은 같다.");
		else
			System.out.println("a와 b의 참조값은 다르다.");
		if (a.equals(b))
			System.out.println("a와 b의 문자열은 같다.");
		else
			System.out.println("a와 b의 문자열은 다르다.");
		System.out.println();

		String c = new String("apple");
		String d = new String("apple");
		if (c == d)
			System.out.println("c와 d의 참조값은 같다.");
		else
			System.out.println("c와 d의 참조값은 다르다.");
		if (c.equals(d))
			System.out.println("c와 d의 문자열은 같다.");
		else
			System.out.println("c와 d의 문자열은 다르다.");
		System.out.println();

		String e = "오늘 날짜는 " + 2019 + 12 + 30;
		System.out.println("e = " + e);
		/*
		 * 문자열은 편집이 안되므로 위의 예 경우, 메모리를 4번 생성하게 된다.
		 * JVM에 의해서 삭제 시 Garbage Collector로 보낸다.
		 * Garbage Collector가 실행되면 컴퓨터는 멈춘다.
		 * "오늘 날짜는 "
		 * "오늘 날짜는 2019"
		 * "오늘 날짜는 201912"
		 * e ---> "오늘 날짜는 20191230"
		 */
		
		
		// 싱글톤
		// - 계속해서 new X
		//   딱 한번만 new
		// - 싱글톤을 하려면 static 영역
		
		System.out.println("문자열 크기 = " + e.length());
		
		for(int i=0; i<e.length(); i++) {
			System.out.println(i + " : " + e.charAt(i));
		}
		
		System.out.println("부분 문자열 추출 = " + e.substring(7));
		System.out.println("부분 문자열 추출 = " + e.substring(7, 11));
		
		System.out.println("대문자 변경 = " + "Hello".toUpperCase());
		System.out.println("소문자 변경 = " + "Hello".toLowerCase());
		
		System.out.println("문자열 검색 = " + e.indexOf("짜"));
		System.out.println("문자열 검색 = " + e.indexOf("날짜"));
		System.out.println("문자열 검색 = " + e.indexOf("개바부") );
		
		
		
	}
}
