package instance;

import java.util.Scanner;

/*
 * 
[문제7]
이름(name)이 홍길동, 성별(gender)M일 때는 남자라고 출력 M이 아니면 여자라고 출력하시오

[실행결과]
홍길동은 남자이다
또는 
홍길동은 여자이다
 */
public class Practice7 {
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//System.out.println("이름을 입력하세요 : ");
		//String name = scan.nextLine();
		//System.out.println(name + "의 성별을 입력하세요. (M/W)");
		//String gender = scan.nextLine();

		String name = "홍길동";
		String gender = "M";
		
		String result = gender == "M" ? "남자이다." : "여자이다.";
		System.out.println(name + "은 " + result);
		//String result = gender.equals("M") ? name + "은 남자이다." : name + "은 여자이다.";
		//System.out.println(result);
		//scan.close();
	}

}
