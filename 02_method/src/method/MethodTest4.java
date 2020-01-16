package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 이름(name)과 주민번호(id)를 입력하여 성별을 출력하시오.
 * 성별을 구별하는 comp() 메소드와 나이를 계산하는 calcAge() 메소드를 작성하시오.
 * 
 * 이름 입력 : 홍길동
 * 주민번호 입력 : 001023-1234567
 * 
 * 
 * 
 * [실행결과]
 * 홍길동님은 남자이고 20살 입니다.
 */

public class MethodTest4 {
	
	public String comp(String id) {
		return id.charAt(7) == '1' || id.charAt(7) == '3' ? "남자" : "여자";
	}
	
	public int calcAge(String id) {
		int num = Integer.parseInt(id.substring(0, 2));
		char backNum = id.charAt(7);
		int ageNum = num <= 99 && backNum != '3' && backNum != '4' ? num+1900 : num+2000;
		// 위에는 내가한거 / 아래는 강사님
		// num += backNum == '1' || backNum == '2' ? 1900 : 2000;
		// int age = 2019 - num + 1;
		//(num+1900) < 2000 && backNum != '3' && backNum != '4' && num > 19 
		return 2019 - ageNum + 1;
	}

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("이름을 입력하세요 : ");
		String name = br.readLine();
		System.out.println("주민번호를 입력하세요 (-포함) : ");
		String id = br.readLine();
		
		MethodTest4 mt4 = new MethodTest4();
		String gender = mt4.comp(id);
		//System.out.println(gender);
		
		int age = mt4.calcAge(id);
		//System.out.println(age);
		
		System.out.println(name + "님은 " + gender + "이고 " + age + "살 입니다.");
	
		
		
	}

}
