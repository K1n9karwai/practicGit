package abstract_1;

public abstract class AbstractTest { //POJO (Plain Old Java Object)
//추상메소드가 있으면 반드시 그 클래스도 추상클래스로 만들어줘야한다.
//하지만 추상클래스라고 해서 반드시 추상메소드가 있어야 하는 것은 아니다.
//또한 추상클래스는 new 로 자체 생성할수가 없다.
//상속이 필요하다.
	String name;
	
	public abstract void setName(String name); //추상 메소드
	
	public String getName() { //구현
		return name;
	}
}
