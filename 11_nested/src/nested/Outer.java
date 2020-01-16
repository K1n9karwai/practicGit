package nested;

public class Outer {
	private String name;
	
	public void output() {
//		System.out.println("�̸� = " + name + "\t ���� = " + age);
//		�ȿ� �ִ� ����Ŭ������ �ܺ��� Ŭ������ ������ �� ������ �ۿ��� ����Ŭ������ �ٷ� ������ �Ұ����ϴ�.
		System.out.println("�̸� = " + this.name + "\t ���� = " + new Inner().age);
		//�׷��� ������ ���� ���� ��ü�� �����Ͽ� ����Ѵ�.
	}
	
	class Inner {
		private int age;
		
		public void disp() {
			System.out.println("�̸� = " + Outer.this.name + "\t ���� = " + this.age);
		}
	}
	
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		//��� ���谡 �ƴϱ⿡ outer�� �����Ѵٰ� �ؼ� innerŬ������ ���� �������� �ʰ� ���θ� �����Ѵ�.
		outer.name = "ȫ�浿";
		System.out.println("�̸� = " + outer.name);
		
		Outer.Inner inner = outer.new Inner(); 
		//���� ������ ���̿� $�� ����. Outer$Inner.class
		inner.age = 25;
		inner.disp();
		
		Outer.Inner inner2 = outer.new Inner();
		inner2.age = 30;
		inner2.disp();
		
		Outer.Inner inner3 = new Outer().new Inner();
		//outer Ŭ������ static�� �ƴϹǷ� ���� "ȫ�浿"���� ������ �� ����.
		//������ Ŭ���� �ȿ����� �ۿ�. �Ʒ��� disp�� ��� naem�� null���� ������.
		inner3.age = 30;
		inner3.disp();
		
		
		
		
	}
}
