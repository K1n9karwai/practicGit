package nested;

public class Outer {
	private String name;
	
	public void output() {
//		System.out.println("이름 = " + name + "\t 나이 = " + age);
//		안에 있는 내부클래스는 외부의 클래스에 접근할 수 있지만 밖에서 내부클래스로 바로 접근은 불가능하다.
		System.out.println("이름 = " + this.name + "\t 나이 = " + new Inner().age);
		//그렇기 때문에 위와 같이 객체를 생성하여 사용한다.
	}
	
	class Inner {
		private int age;
		
		public void disp() {
			System.out.println("이름 = " + Outer.this.name + "\t 나이 = " + this.age);
		}
	}
	
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		//상속 관계가 아니기에 outer를 생성한다고 해서 inner클래스를 같이 생성하지 않고 본인만 생성한다.
		outer.name = "홍길동";
		System.out.println("이름 = " + outer.name);
		
		Outer.Inner inner = outer.new Inner(); 
		//파일 생성시 사이에 $가 붙음. Outer$Inner.class
		inner.age = 25;
		inner.disp();
		
		Outer.Inner inner2 = outer.new Inner();
		inner2.age = 30;
		inner2.disp();
		
		Outer.Inner inner3 = new Outer().new Inner();
		//outer 클래스가 static이 아니므로 위의 "홍길동"에는 접근할 수 없음.
		//생성한 클래스 안에서만 작용. 아래의 disp의 경우 naem에 null값이 들어가있음.
		inner3.age = 30;
		inner3.disp();
		
		
		
		
	}
}
