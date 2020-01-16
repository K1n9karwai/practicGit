package class_1;

class ShapeTest {
	public static final double PI = 3.141592;//상수화

	
	public double area(int x) {
		return PI*x*x;
	}
	
	public double area(int x, int y) {
		return (x*y)/2.0;
	}
	
	public double area(int x, int y, int z) {
		return ((x+y)*z)/2.0;
	}
}

public class Practice2 {

	public static void main(String[] args) {
		//ShapeTest.PI = 100; -error 상수화된 변수는 바꿀 수 없다.
		System.out.println("PI = " + ShapeTest.PI);
		ShapeTest aa = new ShapeTest();
		
		System.out.println("원의 넓이 : " + String.format("%.3f", aa.area(3)));
		System.out.println("삼각형의 넓이 : " + String.format("%.2f", aa.area(5, 7)));
		System.out.println("사다리꼴의 넓이 : " + String.format("%.2f", aa.area(2, 3, 5)));
		
	}
}

/*
arae(3) 를 호출하여 원의 넓이
area(5,7)를 호출하여 삼각형 넓이
area(2,3 5)를 호출하여 사다리꼴 넓이를 구하시오

클래스명 : ShapeTest
필드 : PI (3.141592)

[실행결과]
원의 넓이 : 28.274337
사각형의 넓이 : 20.0
사다리꼴의 넓이 : 24.5
*/
