package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num_1, num_2, val, score = 0, sw = 0;
		int sw2 = 0;
		String out;
		
		while (sw2 == 0) {
			score = 0;
			sw = 0;
			for (int i = 1; i <= 5; i++) {
				num_1 = (int) (Math.random() * 90) + 10;
				num_2 = (int) (Math.random() * 90) + 10;
				
				for(int j = 1; j<=2; j++) {
					System.out.print("[" + i + "] " + num_1 + " + " + num_2 + " = ");
					val = Integer.parseInt(br.readLine());
					
					if (num_1 + num_2 == val) {
						System.out.println("������");
						score += 20;
						sw++;
						break;
					} else {
						if(j==2) System.out.println("Ʋ�ȴ�... ���� : " + (num_1 + num_2));
						else System.out.println("Ʋ�ȴ�.");
	//					System.out.print("[" + i + "] " + num_1 + " + " + num_2 + " = ");
	////					val = Integer.parseInt(br.readLine());
	////					System.out.println(val);
	////					if (num_1 + num_2 == val) {
	////						System.out.println("������");
	////						score += 20;
	////						sw++;
	////					} else {
	////						System.out.println("Ʋ�ȴ�... ���� : " + (num_1 + num_2));
	////					}
					}
				}//for j
			}//for i
			System.out.println("����� �� " + sw + "������ ���߾ " + score + "�� �Դϴ�.");

//			while (true) {
				
				do {
					System.out.print("continue(y/n) : ");
					out = br.readLine();
					
				}while(!out.equals("y") || !out.equals("Y") ||!out.equals("n") || !out.equals("N"));
				
//				if (out.equals("y") || out.equals("Y")) {
//					break;
//				} else if (out.equals("n") || out.equals("N")) {
//					System.out.println("���α׷��� �����մϴ�.");
//					sw2 = 1;
//					break;
//				} else {
//					continue;
//				}
			}
		}
}

/*
 * [����4] ���� ���� 10~99 ������ ������ 2��(a,b) �߻��Ͽ� ���� ���ߴ� ���� �������� �� 5������ �����Ѵ� 1������ ����
 * 20���� ��� ���� Ʋ���� ��ȸ�� 1�� �� �����Ѵ�
 * 
 * [������] [1] 25 + 36 = 45 Ʋ�ȴ� [1] 25 + 36 = 61 ������
 * 
 * [2] 78 + 10 = 100 Ʋ�ȴ� [2] 78 + 10 = 95 Ʋ�ȴ�...���� : ...
 * 
 * ����� �� x������ ���߾ xx�� �Դϴ�
 * 
 * continue(y/n) : w continue(y/n) : n ���α׷��� �����մϴ�
 */
