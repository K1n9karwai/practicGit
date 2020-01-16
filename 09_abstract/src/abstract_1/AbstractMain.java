package abstract_1;

public class AbstractMain extends AbstractTest {
//추상클래스를 쓰려면 반드시 override 하는 것 아니면 본인 또한 추상클래스가 돼야한다.
//하지만 그럴시에는 본인 또한 자체 생성이 안되고, 연좌제와 같이 자식 클래스에 의해 생성되어야 한다.
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
//		AbstractTest at = new AbstractTest(); 추상클래스의 경우 자체 생성 불가, 상속받아 사용한다.	
		AbstractTest at = new AbstractMain();
		at.setName("홍길동"); //호출
		System.out.println("이름 : " + at.getName());
	}
}
