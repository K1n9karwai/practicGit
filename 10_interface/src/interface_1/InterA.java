package interface_1;

public interface InterA {
	
	public static final String NAME = "홍길동";//상수
	int AGE=25; // interface의 경우 앞에 static final 을 생략해도 상수로 취급해줌.
	
	public abstract void aa(); //메소드의 구현부는 클래스만 가질 수 있다.
							   //그러므로 옆에와 같이 처리하고 인터페이스에는 추상 메소드만 들어갈 수 있음
	public void bb(); // 앞에 abstract를 생략해도 추상메소드로 인식.
}
