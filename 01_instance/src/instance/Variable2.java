package instance;

public class Variable2 {
	// �޼ҵ��
	// �޼ҵ� �ۿ����� ������ �����ϴ� �͸� �����ϰ� ������ ���� �����ϴ� ���� �Ұ����ϴ�.
	int a; // field, �ʱ�ȭ, �ν��Ͻ� ����
	static int b; // field, �ʱ�ȭ, Ŭ���� ����
	String str;
	static String str2;
	// field(��������) �� �⺻������ 0, null���� �ʱ�ȭ�� �Ǿ�����
	// static�� �̹� ������� ���İ� ���� new�� ���� �ֹ��� ������ ���� �̹� ������� �ִ�.

	public static void main(String[] args) {
		int a; // local variable(��������), ������ �ȵ� �����Ⱚ�̹Ƿ� �ݵ�� �ʱ�ȭ �ʿ�
		a = 15; // Ȥ�� ó������ int a = 15;�� �� �ο�
		System.out.println("���� a = " + a);
		System.out.println("�ʵ� a = " + new Variable2().a); // 1ȸ��
		System.out.println("�ʵ� b = " + b);
		System.out.println("�ʵ� str = " + new Variable2().str); // 1ȸ��
		System.out.println("�ʵ� str2 = " + str2);
	}
}
