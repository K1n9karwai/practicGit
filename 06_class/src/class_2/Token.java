package class_2;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {

		String str = "�п�,��,,���ӹ�";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		System.out.println("��ū ���� = " + st.countTokens());
		
		//������ t/f ��ū�� �ִ�/���ٸ� ������ �� ��ū�� ������ �������� �̵�
		//true/false�� ���еǱ� ������ �ݺ��� �ÿ� while�� �� ����
		while(st.hasMoreTokens()) { // ��ū�� �ִ� / ����
			System.out.println(st.nextToken()); // ��ū�� ������ �������� �̵�
		}
		System.out.println("--------------------------");
		
		String[] ar = str.split(",");
		for(String data : ar) { 
			System.out.println(data);
		}
	}
}
