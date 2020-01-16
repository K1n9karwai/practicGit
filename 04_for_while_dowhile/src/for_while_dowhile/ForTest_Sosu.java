package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest_Sosu {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 입력 : ");
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i<=num; i++) {
			if(num==1) {
				System.out.println(num + "은 소수이다.");
				System.out.print("숫자 입력 : ");
				num = Integer.parseInt(br.readLine());
			} else if(num%i==0) {
				System.out.println(num + "는 소수가 아니다.");
				System.out.println();
				System.out.print("숫자 입력 : ");
				num = Integer.parseInt(br.readLine());
				
			} else if(num==0){
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println(num + "는 소수이다.");
				System.out.println();
				System.out.print("숫자 입력 : ");
				num = Integer.parseInt(br.readLine());
			}
		}
		
	}
}
