package instance;

import java.util.Scanner;

/*
 * 
[����7]
�̸�(name)�� ȫ�浿, ����(gender)M�� ���� ���ڶ�� ��� M�� �ƴϸ� ���ڶ�� ����Ͻÿ�

[������]
ȫ�浿�� �����̴�
�Ǵ� 
ȫ�浿�� �����̴�
 */
public class Practice7 {
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//System.out.println("�̸��� �Է��ϼ��� : ");
		//String name = scan.nextLine();
		//System.out.println(name + "�� ������ �Է��ϼ���. (M/W)");
		//String gender = scan.nextLine();

		String name = "ȫ�浿";
		String gender = "M";
		
		String result = gender == "M" ? "�����̴�." : "�����̴�.";
		System.out.println(name + "�� " + result);
		//String result = gender.equals("M") ? name + "�� �����̴�." : name + "�� �����̴�.";
		//System.out.println(result);
		//scan.close();
	}

}
