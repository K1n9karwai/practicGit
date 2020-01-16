package nested;

public class AbstractMain {

	public static void main(String[] args) {
		
		AbstractTest at = new AbstractTest() {
			@Override
			public void setName(String name) {
				this.name = name;
			}
			
		}; //익명 이너 클래스, 상속을 시키지 않고 메소드를 사용하기 위해 사용한다.
		   //익명 이너 클래스를 후원자로 두어 1회용으로 사용.
		
		InterA aa = new InterA() {//인터페이스는 new가 안먹기때문에 옆의 new는 이 괄호, 후원자를 생성하는 것이다.
			public void aa() {}
			public void bb() {}
		};
		
		AbstractExam ae = new AbstractExam() {};
		
	}
}
