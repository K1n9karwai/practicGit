package instance;

public class Variable2 {
	// 메소드는
	// 메소드 밖에서는 변수를 설정하는 것만 가능하고 변수에 값을 대입하는 것은 불가능하다.
	int a; // field, 초기화, 인스턴스 변수
	static int b; // field, 초기화, 클래스 변수
	String str;
	static String str2;
	// field(전역변수) 는 기본적으로 0, null으로 초기화가 되어있음
	// static은 이미 만들어진 음식과 같이 new를 통해 주문이 들어오기 전에 이미 만들어져 있다.

	public static void main(String[] args) {
		int a; // local variable(지역변수), 정리가 안된 쓰레기값이므로 반드시 초기화 필요
		a = 15; // 혹은 처음부터 int a = 15;로 값 부여
		System.out.println("지역 a = " + a);
		System.out.println("필드 a = " + new Variable2().a); // 1회성
		System.out.println("필드 b = " + b);
		System.out.println("필드 str = " + new Variable2().str); // 1회성
		System.out.println("필드 str2 = " + str2);
	}
}
