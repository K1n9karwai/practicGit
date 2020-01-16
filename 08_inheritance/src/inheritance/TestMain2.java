package inheritance;

class AA {
	public int a = 3;
	public void disp() {
		a += 5;
		System.out.print("AA : " + a + " ");
	}
}
//---------------

class BB extends AA {
	public int a = 8;
	public void disp() {
		this.a += 5;
		System.out.print("BB : " + a + " ");
	}
}
public class TestMain2 {

	public static void main(String[] args) {
		
		BB bb = new BB();
		bb.disp();
		System.out.println(bb.a + " ");
		
		AA aa = new BB(); // �θ� = �ڽ�
		aa.disp();
		System.out.println(aa.a + " "); //������ overload, override �� ����
										//�޼ҵ忡�� �����ϴ�.
										//�׷��Ƿ� aa.a �� AA�� ������ 3�� ������
		
		BB bb2 = (BB)aa; //�ڽ� = (�ڽ�)�θ�
		System.out.println(bb2.a + " ");
	}
}
