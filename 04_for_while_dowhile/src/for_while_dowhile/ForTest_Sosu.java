package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest_Sosu {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� �Է� : ");
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i<=num; i++) {
			if(num==1) {
				System.out.println(num + "�� �Ҽ��̴�.");
				System.out.print("���� �Է� : ");
				num = Integer.parseInt(br.readLine());
			} else if(num%i==0) {
				System.out.println(num + "�� �Ҽ��� �ƴϴ�.");
				System.out.println();
				System.out.print("���� �Է� : ");
				num = Integer.parseInt(br.readLine());
				
			} else if(num==0){
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println(num + "�� �Ҽ��̴�.");
				System.out.println();
				System.out.print("���� �Է� : ");
				num = Integer.parseInt(br.readLine());
			}
		}
		
	}
}
