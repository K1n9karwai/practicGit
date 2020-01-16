package instance;

public class Variable {
	public static void main(String[] args) {
		// 메모리 할당
		boolean a;
		a = true;
		System.out.println("a = " + a);

		char b;
		b = 'A';
		System.out.println("b = " + b);

		char c;
		c = 65;
		// c = 65536; - error (char은 65535까지 받고 이후로는 int형이기 때문에)
		System.out.println("c = " + c);

		int d = 65;
		System.out.println("d = " + d);

		int e = 'A';
		System.out.println("e = " + e);

		int f = (int) 25L; // 25L long형
		System.out.println(f);
		// int = long 은 안되지만 long = int 는 가능하다. 자료형의 크기 때문

		float g = 43.8f; // 실수형은 default double형
							// 잠시 변환은 앞에 (float) / 완전 형변환은 43.8f
		System.out.println(g);
	}
}

//메소드
//-명령어들의 집합