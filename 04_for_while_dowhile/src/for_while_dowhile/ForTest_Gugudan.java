package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest_Gugudan {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dan, i;
		System.out.println("원하는 단을 입력하세요 : ");
		dan = Integer.parseInt(br.readLine());
		
		System.out.println("======== " + dan + "단 ========");
		for(i=1; i<10; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
	}
}
