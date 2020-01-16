package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//3개의 숫자(a, b, c)를 입력받아서 순서대로 출력하시오

//[실행결과]
// a값 입력 :
// b값 입력 :
// c값 입력 :
// 25 36 78

public class IfTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("a값 입력 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("b값 입력 : ");
		int b = Integer.parseInt(br.readLine());
		System.out.println("c값 입력 : ");
		int c = Integer.parseInt(br.readLine());
		
		if(a>b && a>c)
			if(b>c) System.out.println(c + "\t" + b + "\t" + a);
			else System.out.println(b + "\t" + c + "\t" + a);
		else if(b>c)
			if(a>c) System.out.println(c + "\t" + a + "\t" + b);
			else System.out.println(a + "\t" + c + "\t" + b);
		else
			if(b>a) System.out.println(a + "\t" + b + "\t" + c);
			else System.out.println(b + "\t" + a + "\t" + c);
	
	}
}
