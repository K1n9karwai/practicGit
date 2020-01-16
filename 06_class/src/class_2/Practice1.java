package class_2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice1 {

	public static void main(String[] args) {
		String inputStr;
		String oldStr;
		String newStr;
		String tmp;
		int cnt = 0;
		Scanner scan = new Scanner(System.in);

			System.out.print("문자열 입력 : ");
			inputStr = scan.next();
			inputStr = inputStr.toLowerCase();
			tmp = inputStr;
			System.out.print("현재 문자열 입력 : ");
			oldStr = scan.next();
			System.out.print("바꿀 문자열 입력 : ");
			newStr = scan.next();

			while (true) {
				if (inputStr.indexOf(oldStr) != -1) {
					cnt++;
					inputStr = inputStr.substring(inputStr.indexOf(oldStr)+oldStr.length());
				} else {
					break;
				}
				//System.out.println(aa);
				//System.out.println(cnt + "번 치환");
		}
		
		if(tmp.length()<oldStr.length()) {
			System.out.println("입력한 문자열의 크기가 작습니다.");
		} else if(cnt == 0) {
			System.out.println("치환 불가");
		} else {
			tmp = tmp.replace(oldStr, newStr);
			System.out.println(tmp);
			System.out.println(cnt + "번 치환");
		}
		
	}
}

/*
 * [문제1]
치환하는 프로그램을 작성하시오
String 클래스의 메소드(indexOf(), replace())를 이용하시오
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환

문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환

문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
 * /
 */