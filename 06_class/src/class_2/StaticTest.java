package class_2;

public class StaticTest {

	private int a; //필드, 인스턴스 변수
	private static int b; //필드, 클래스변수
	
	static {
		System.out.println("static의 초기화 영역");
		b=3;
	}
	
	public StaticTest() {
		System.out.println("기본 생성자");
		a=3;
	}
	
	public void calc() {
		a++;
		b++;
	}
	
	public void disp() {
		System.out.println("a = " + a + "\t b = " + b);
	}
	
	public static void output() {
		System.out.println("static method...");
		//System.out.println("a = " + a + "\t b = " + b); - error
		//static메소드 안에서는 일반 변수, 일반 필드들은 사용할 수가 없다.
	}
	
	public static void main(String[] args) {
		
		StaticTest st = new StaticTest();
		st.calc();
		st.disp();
		System.out.println();
		
		StaticTest st2 = new StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();
		
		StaticTest st3 = new StaticTest();
		st3.calc();
		st3.disp();
		System.out.println();
		
		StaticTest.output();
		output();
		st.output();
	}
	
}
