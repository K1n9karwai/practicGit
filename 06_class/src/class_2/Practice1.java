package class_2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice1 {

	public static void main(String[] args) {
		String inputStr;
		String oldStr;
		String newStr;
		String tmp;
		int cnt = 0;
		Scanner scan = new Scanner(System.in);

			System.out.print("���ڿ� �Է� : ");
			inputStr = scan.next();
			inputStr = inputStr.toLowerCase();
			tmp = inputStr;
			System.out.print("���� ���ڿ� �Է� : ");
			oldStr = scan.next();
			System.out.print("�ٲ� ���ڿ� �Է� : ");
			newStr = scan.next();

			while (true) {
				if (inputStr.indexOf(oldStr) != -1) {
					cnt++;
					inputStr = inputStr.substring(inputStr.indexOf(oldStr)+oldStr.length());
				} else {
					break;
				}
				//System.out.println(aa);
				//System.out.println(cnt + "�� ġȯ");
		}
		
		if(tmp.length()<oldStr.length()) {
			System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�.");
		} else if(cnt == 0) {
			System.out.println("ġȯ �Ұ�");
		} else {
			tmp = tmp.replace(oldStr, newStr);
			System.out.println(tmp);
			System.out.println(cnt + "�� ġȯ");
		}
		
	}
}

/*
 * [����1]
ġȯ�ϴ� ���α׷��� �ۼ��Ͻÿ�
String Ŭ������ �޼ҵ�(indexOf(), replace())�� �̿��Ͻÿ�
��ҹ��� ������� ������ ����Ͻÿ�

[������]
���ڿ� �Է� : aabba
���� ���ڿ� �Է� : aa
�ٲ� ���ڿ� �Է� : dd
ddbba
1�� ġȯ

���ڿ� �Է� : aAbbA
���� ���ڿ� �Է� : aa
�ٲ� ���ڿ� �Է� : dd
ddbba
1�� ġȯ

���ڿ� �Է� : aabbaa
���� ���ڿ� �Է� : aa
�ٲ� ���ڿ� �Է� : dd
ddbbdd
2�� ġȯ

���ڿ� �Է� : AAccaabbaaaaatt
���� ���ڿ� �Է� : aa
�ٲ� ���ڿ� �Է� : dd
ddccddbbddddatt
4�� ġȯ

���ڿ� �Է� : aabb
���� ���ڿ� �Է� : aaaaa
�ٲ� ���ڿ� �Է� : ddddd
�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�
 * /
 */