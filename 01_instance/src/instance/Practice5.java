package instance;

/*
 * [����5]
���� score�� ���� 2�� 3�� ��������� �ƴ����� ����Ͻÿ�

[������]
25�� 2�� 3�� ������� �ƴϴ� (score=25�϶�)
�Ǵ�
12�� 2�� 3�� ������̴� (score=12�϶�)

 */
public class Practice5 {
	public static void main(String[] args) {
		 int score = 25;
		// int score = 12;

		String result = score % 2 == 0 && score % 3 == 0 ? score + "�� 2�� 3�� ������̴�." : score + "�� 2�� 3�� ������� �ƴϴ�.";
		// String result = score % 6 == 0 ? "�����O" : "�����X";

		System.out.println(result);
	}
}
