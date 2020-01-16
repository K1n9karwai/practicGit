package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest2 {
	private int dan;

	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("원하는 단을 입력하세요 : ");
		dan = Integer.parseInt(br.readLine());
	}

	public void output() {

//		if (dan > 9 || dan < 2) {
//			System.out.println("범위 초과 (2~9까지 가능)");
//		} else {
//			System.out.println("********* 구구단 " + dan + "단 *********");
//			for (int i = 1; i <= 9; i++) {
//				System.out.println(dan + " x " + i + " = " + dan * i);
//			}
//		}

		if (dan >= 2 && dan <= 9) {
			System.out.println("********* 구구단 " + dan + "단 *********");
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " x " + i + " = " + dan * i);
			}
		} else {
			// System.out.println("범위 초과 (2~9까지 가능)");
			// 개발자가 강제로 Exception 발생
			try {
				//throw new Exception("범위 초과 (2~9까지 가능)"); //개발자가 사용자에게 강력하게 경고를 주기위해 사용
				throw new MakeException("범위 초과 (2~9까지 가능)");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws IOException {

		ExceptionTest2 et2 = new ExceptionTest2();

		et2.input(); // 호출부도 exception 처리를 요청한다.
		et2.output();

	}
}
