package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTestSosu2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sw;
		
		while (true) {
			sw=0;
			System.out.print("���ڸ� �Է����ּ��� : ");
			int num = Integer.parseInt(br.readLine());
			if(num==0) break;
			
			for (int i = 2; i < num; i++) {
				if (num % i == 0)sw=1;
			}
			if(sw==0) System.out.println(num + "�� �Ҽ��̴�.");
			else System.out.println(num + "�� �Ҽ��� �ƴϴ�.");
			System.out.println();
		} // while
		System.out.println("���α׷��� �����մϴ�.");
	}
}
