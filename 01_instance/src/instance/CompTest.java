package instance;

public class CompTest {
	public static void main(String[] args) {
		int score = 69;
		int score2 = 85;
		String result = score2 >= 80 && score2 <= 100 ? "�հ�" : "���հ�";
		System.out.println(score >= 80 && score <= 100 ? "�հ�" : "���հ�");
		System.out.println("��� = " + result);

		result = score % 2 == 0 ? "¦��" : "Ȧ��";
		System.out.println("��� = " + result);

		int b = 50;
		int result2 = score > b ? score : b;
		// String result2 = score > b ? score + "" : b + ""; �� ����.
		System.out.println("ū �� = " + result2);
	}
}
