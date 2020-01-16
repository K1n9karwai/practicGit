package interface_1;

//public class InterMain implements InterA, InterB {
	
public class InterMain implements InterC { //InterC가 두개의 인터페이스를 상속받았으므로 위와 동일

//인터페이스의 경우도 추상클래스와 마찬가지로 반드시 오버라이드를 해줘야한다.
//하지만 그게 싫다면 abstract를 통해 본 클래스도 추상클래스로 만들어주는 방법이 있다.
//추상클래스와 인터페이스는 관련이 많지만 목적이 다르다.
//추상클래스는 서브 클래스의 통제가 주 목적이고 인터페이스는 다중상속이 주된 목적이다. 하지만
//implements로 받을때는 엄밀히 말하면 상속의 개념은 아니고, 인터페이스 여러개가 들어온다고 생각하면 되겠다.
//상속은 extends이고 extends의 경우 인터페이스와 클래스에서 모두 사용할 수 있지만
//양쪽의 타입을 동일하게 맞춰줘야 한다.
	
	public static void main(String[] args) {
		
		
		
	}
	
	@Override
	public void aa() {}
	
	public void bb( ) {}

	@Override
	public void cc() {}
	
	public void dd() {}
	
}
