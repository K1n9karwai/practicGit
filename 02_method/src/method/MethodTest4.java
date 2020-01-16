package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * �̸�(name)�� �ֹι�ȣ(id)�� �Է��Ͽ� ������ ����Ͻÿ�.
 * ������ �����ϴ� comp() �޼ҵ�� ���̸� ����ϴ� calcAge() �޼ҵ带 �ۼ��Ͻÿ�.
 * 
 * �̸� �Է� : ȫ�浿
 * �ֹι�ȣ �Է� : 001023-1234567
 * 
 * 
 * 
 * [������]
 * ȫ�浿���� �����̰� 20�� �Դϴ�.
 */

public class MethodTest4 {
	
	public String comp(String id) {
		return id.charAt(7) == '1' || id.charAt(7) == '3' ? "����" : "����";
	}
	
	public int calcAge(String id) {
		int num = Integer.parseInt(id.substring(0, 2));
		char backNum = id.charAt(7);
		int ageNum = num <= 99 && backNum != '3' && backNum != '4' ? num+1900 : num+2000;
		// ������ �����Ѱ� / �Ʒ��� �����
		// num += backNum == '1' || backNum == '2' ? 1900 : 2000;
		// int age = 2019 - num + 1;
		//(num+1900) < 2000 && backNum != '3' && backNum != '4' && num > 19 
		return 2019 - ageNum + 1;
	}

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�̸��� �Է��ϼ��� : ");
		String name = br.readLine();
		System.out.println("�ֹι�ȣ�� �Է��ϼ��� (-����) : ");
		String id = br.readLine();
		
		MethodTest4 mt4 = new MethodTest4();
		String gender = mt4.comp(id);
		//System.out.println(gender);
		
		int age = mt4.calcAge(id);
		//System.out.println(age);
		
		System.out.println(name + "���� " + gender + "�̰� " + age + "�� �Դϴ�.");
	
		
		
	}

}
