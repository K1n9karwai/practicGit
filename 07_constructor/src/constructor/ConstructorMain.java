package constructor;

class ConstructorTest {
	private String name;
	private int age;
	
	public ConstructorTest() {
		System.out.println("�⺻ ������");
	}
	
	public ConstructorTest(String name) {
		this();//Overload�� �ٸ� �����ڸ� ȣ��
		this.name = name;
	}
	
	public ConstructorTest(int age) {
		this("�ڳ�"); // ���� ������ ȣ��
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}

public class ConstructorMain {

	public static void main(String[] args) {
		
	
		
		ConstructorTest aa = new ConstructorTest();
		System.out.print("�̸� = " + aa.getName() + "\t");
		System.out.println("���� = " + aa.getAge());
		System.out.println();
		
		ConstructorTest bb = new ConstructorTest("ȫ�浿");
		System.out.print("�̸� = " + bb.getName() + "\t");
		System.out.println("���� = " + bb.getAge());
		
		ConstructorTest cc = new ConstructorTest(25);
		System.out.print("�̸� = " + cc.getName() + "\t");
		System.out.println("���� = " + cc.getAge());
	}
}
