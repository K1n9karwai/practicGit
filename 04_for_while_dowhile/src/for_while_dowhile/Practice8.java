package for_while_dowhile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Practice8 {
	static int total;
	
	public int input(int deposit) {
		return total += deposit;
	}
	
	public int output(int withdraw) {
		return total -= withdraw;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Practice8 p1 = new Practice8();
		
		while(true) {
			System.out.println("*************************");
			System.out.println("1. ���� 2. ��� 3. �ܰ� 4. ����");
			System.out.println("*************************");
		System.out.print("��ȣ ���� : ");
		int num = Integer.parseInt(br.readLine());

		if (num == 1) {
			while (true) {
				System.out.print("���ݾ� : ");
				int deposit = Integer.parseInt(br.readLine());
				if (deposit % 10000 == 0) {
					p1.input(deposit);
					System.out.println("����� �ܾ��� " + total + "�� �Դϴ�.");
					break;
				} else {
					System.out.println("���� ������ �ٽ� �Է��ϼ���.");
				}
			}
		} else if(num == 2) {
			while(true) {
			System.out.println("��ݾ� : ");
			int withdraw = Integer.parseInt(br.readLine());
			if(withdraw<total) {
				p1.output(withdraw);
				System.out.println("����� �ܾ��� " + total + "�� �Դϴ�.");
				break;
			} else {
				System.out.println("�ܾ��� �����մϴ�.");
			}
			
			}
		} else if(num==3) {
			System.out.println("����� �ܾ��� " + total + "�Դϴ�.");
		} else if(num==4) {
			System.out.println("���α׷��� �����մϴ�.");
			break;
		} else {
			System.out.println("��ȣ�� �߸� �Է��Ͽ����ϴ�.");
		}
		}
	}
}

/*
 * [����8] ���°��� ���α׷� ����, ���, �ܰ�, ���� ����� �����ϴ� ���� ���°��� ���α׷��� �ۼ��Ͻÿ�. ����) ������ input(),
 * ����� output()���� ó���ϼ���
 * 
 * [������]
 ****************
 * 1. ���� 2. ��� 3. �ܰ� 4. ����
 ****************
 * ��ȣ ���� : 1
 * ���ݾ� : 10000
 * ����� �ܾ��� 10000�� �Դϴ� 
 * �Ǵ�
 * ���ݾ� : 12000 ���� ������ �Է��ϼ���
 ****************
 * 
 * 1. ���� 2. ��� 3. �ܰ� 4. ����
 ****************
 * ��ȣ ���� : 2
 * ��ݾ� : 8000
 * ����� �ܾ��� 2000�� �Դϴ�
 * �Ǵ�
 * ��ݾ� : 18000 �ܾ��� �����մϴ�
 * 
 * 1. ���� 2. ��� 3. �ܰ� 4. ����
 * ��ȣ ���� : 3
 * ����� �ܾ��� 2000�� �Դϴ�
 * 
 * 1. ���� 2. ��� 3. �ܰ� 4. ����
 * ��ȣ ���� : 4
 * ���α׷��� �����մϴ�.
 */
