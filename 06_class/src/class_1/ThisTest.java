package class_1;

class This {
	private String name;
	private int age;
	
	public void setName(String n) {//구현
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
//클ㄹ래스 안에서는 this 생략돼있을뿐 다 있다.
//위와 같이 변수 명이 겹칠때는 반드시 this를 사용해줘야한다.

public class ThisTest {

	
	public static void main(String[] args) { //static 안에는 this 없음)
		This aa = new This();
		System.out.println("객체 aa = " + aa);
		aa.setName("홍길동");
		aa.setAge(25);
		System.out.println("이름 = " + aa.getName() +"\t 나이 = " + aa.getAge());
		System.out.println();
		
		Person bb;
		bb = new Person();
		System.out.println("객체 bb = " + bb);
		bb.setAge(16);
		bb.setName("코난");
		System.out.println("이름 = " + bb.getName() + "\t나이 = " + bb.getAge());
		System.out.println();
	}
}
