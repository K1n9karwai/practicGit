package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		if(args.length!=0) System.out.println("args[0] = " + args[0]);
		
//		System.out.println("args[1] = " + args[1]);
//		System.out.println("args[2] = " + args[2]);
		
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("숫자 입력 : ");
			int num2 = scan.nextInt();
			int num = Integer.parseInt(args[0]);
			System.out.println(num + " / " + num2 + " = " + num/num2);
		
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됩니다.");
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력하세요.");
		}finally {
			System.out.println("error가 있건 없건 무조건 실행");
		}
				
	}
}
