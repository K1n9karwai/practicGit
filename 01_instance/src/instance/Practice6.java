package instance;

/*
 * [����6]
ch�� �ִ� �����Ͱ� �빮���̸� �ҹ��ڷ� ����ϰ� �ƴϸ�(�ҹ���) �빮�ڷ� ����Ͻÿ�

[������]
T �� t (ch�� T�� ���� ��)
�Ǵ�
e �� E (ch�� e�� ���� ��)
 */
public class Practice6 {
	public static void main(String[] args) {
		char ch = 'Z';
		// char ch = 'e';

		int result = ch >= 65 && ch <= 90 ? ch + 32 : ch - 32;
		// int result = ch >= 'A' && ch <= 'B' ? ch + 32 : ch - 32;

		System.out.println(ch + " -> " + (char) result);
	}
}
