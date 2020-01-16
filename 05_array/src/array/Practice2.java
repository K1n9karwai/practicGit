package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
		System.out.print("10���� �Է� : ");
		int dec = Integer.parseInt(br.readLine());
		
		if(dec<0) {
			System.out.println("���Է��ϼ���.");
			continue;
		} else if(dec==0) {
			System.out.println("���α׷��� �����մϴ�.");
			break;
		} else {
			String tmp = "";
			String tmp2 = "";
			int cnt = 0;
			
			while(true) {
				int portion = dec/2;
				int remain = dec%2;
				
				tmp += remain;
				dec = portion;
				tmp2 = tmp;
				
				if(portion == 1) {
					tmp2 += portion;
					break;
				}
			}
			
			int length = tmp2.length();
			
			char[] bin = new char[length];
			
			for(int i=0; i<bin.length; i++) {
				bin[i] = tmp2.charAt(--length);
				
				System.out.print(bin[i]);
				++cnt;
				if(cnt%4==0) {
					System.out.print(" ");
				}
			}
			System.out.println();
	}
	}
}
}

/*
[����2]
10������ �Է��Ͽ� 2������ ��ȯ�Ͻÿ�
0�� �ԷµǸ� ���α׷��� �����ϼ���
������ �ԷµǸ� ���Է��ϼ���
4���� ��� �����ֱ�
Integer.toBinaryString() ��������

[������]
10���� �Է� : -5

10���� �Է� : 250
1111 1010 

10���� �Է� : 12
1100

10���� �Է� : 0
���α׷��� ����
*/

