package method;

/*
[����2]
�ֻ����� 2�� ������ ���� ���� ���� ���Ͻÿ�
�ֻ����� input()���� 1~6������ ������ �߻��Ͽ� �����Ѵ�
���� add()���� ���Ͽ� ���� �޴´�

[������]
ù��° �ֻ��� �� : 3
�ι�° �ֻ��� �� : 6
���� 9 �̴�
 */
public class Practice2 {

	public int input() {
		return (int) (Math.random() * 6 + 1);
	}

	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Practice2 p2 = new Practice2();

		int firstNum = p2.input();
		int secondNum = p2.input();
		int sum = p2.add(firstNum, secondNum);

		System.out.println("ù��° �ֻ��� �� : " + firstNum);
		System.out.println("�ι�° �ֻ��� �� : " + secondNum);
		System.out.println("���� " + sum + "�̴�.");

	}
}
