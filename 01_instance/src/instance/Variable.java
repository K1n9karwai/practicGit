package instance;

public class Variable {
	public static void main(String[] args) {
		// �޸� �Ҵ�
		boolean a;
		a = true;
		System.out.println("a = " + a);

		char b;
		b = 'A';
		System.out.println("b = " + b);

		char c;
		c = 65;
		// c = 65536; - error (char�� 65535���� �ް� ���ķδ� int���̱� ������)
		System.out.println("c = " + c);

		int d = 65;
		System.out.println("d = " + d);

		int e = 'A';
		System.out.println("e = " + e);

		int f = (int) 25L; // 25L long��
		System.out.println(f);
		// int = long �� �ȵ����� long = int �� �����ϴ�. �ڷ����� ũ�� ����

		float g = 43.8f; // �Ǽ����� default double��
							// ��� ��ȯ�� �տ� (float) / ���� ����ȯ�� 43.8f
		System.out.println(g);
	}
}

//�޼ҵ�
//-��ɾ���� ����