package inheritance;

class AAA {
}

class BBB extends AAA {
}

public class InstanceOf {

	public static void main(String[] args) {

		AAA aa = new AAA();
		BBB bb = new BBB();
		AAA aa2 = new BBB();

		AAA aa3 = aa;
		if (aa instanceof AAA) {
			System.out.println("1. TRUE");
		} else {
			System.out.println("1. FALSE");
		}

		AAA aa4 = bb; //�θ�=�ڽ�
		if (bb instanceof AAA) {
			System.out.println("2. TRUE");
		} else {
			System.out.println("2. FALSE");
		}
		
		//BBB bb2 = (BBB)aa; //�ڽ� = (�ڽ�)�θ� (�θ� ȣ���� ���� �ڽ��� ���� ���)
						     //������ ������ AAAŸ�Ը� �����Ʊ⿡ ĳ���� ��ü�� �Ұ���
		if(aa instanceof BBB) {
			System.out.println("3. TRUE");
		} else {
			System.out.println("3. FALSE");
		}
		
		BBB bb3 = (BBB)aa2;//�ڽ� = (�ڽ�)�θ� (�θ� ȣ���� �ڽ��� ���Ե� ���)
						   //������ �ڽ��� �����ϸ� �θ� Ŭ������ �Բ� �����Ǳ⿡
						   //�� ��쿡�� BBBŸ�Ե� �����Ͽ� ĳ���� ����
		if(aa2 instanceof BBB) {
			System.out.println("4. TRUE");
		} else {
			System.out.println("4. FALSE");
		}
	}
}
