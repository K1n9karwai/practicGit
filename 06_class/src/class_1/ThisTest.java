package class_1;

class This {
	private String name;
	private int age;
	
	public void setName(String n) {//����
		this.name = name;
	}
	public void setAge(int a) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
}
//Ŭ������ �ȿ����� this ������������ �� �ִ�.
//���� ���� ���� ���� ��ĥ���� �ݵ�� this�� ���������Ѵ�.

public class ThisTest {

	
	public static void main(String[] args) { //static �ȿ��� this ����)
		This aa = new This();
		System.out.println("��ü aa = " + aa);
		aa.setName("ȫ�浿");
		aa.setAge(25);
		System.out.println("�̸� = " + aa.getName() +"\t ���� = " + aa.getAge());
		System.out.println();
		
		Person bb;
		bb = new Person();
		System.out.println("��ü bb = " + bb);
		bb.setAge(16);
		bb.setName("�ڳ�");
		System.out.println("�̸� = " + bb.getName() + "\t���� = " + bb.getAge());
		System.out.println();
	}
}
