package for_while_dowhile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Multiple {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.print("���� �Է� : ");
			int num = Integer.parseInt(br.readLine());
			
			if(num<0) {
				continue;
			} else if(num==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				for(int i=1; i<=7; i++) {
					System.out.print(num*i + " ");
				}
				System.out.println();
			}
		}
	}
}
//���ڸ� �Է��Ͽ� ����� 7���� ���Ͻÿ�
//�� �����̸� �ٽ� �Է��ϰ� 0�̸� �����Ͻÿ�
//[������]
//���� �Է� : -7
//���� �Է� : 8
//8 16 24 32 40 48 56
//���� �Է� : 0
//���α׷��� �����մϴ�.