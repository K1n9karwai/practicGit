package inheritance;

class AA {
	public int a = 3;
	public void disp() {
		a += 5;
		System.out.print("AA : " + a + " ");
	}
}
//---------------

class BB extends AA {
	public int a = 8;
	public void disp() {
		this.a += 5;
		System.out.print("BB : " + a + " ");
	}
}
public class TestMain2 {

	public static void main(String[] args) {
		
		BB bb = new BB();
		bb.disp();
		System.out.println(bb.a + " ");
		
		AA aa = new BB(); // 부모 = 자식
		aa.disp();
		System.out.println(aa.a + " "); //변수는 overload, override 는 없다
										//메소드에만 가능하다.
										//그러므로 aa.a 는 AA를 가리켜 3이 떨어짐
		
		BB bb2 = (BB)aa; //자식 = (자식)부모
		System.out.println(bb2.a + " ");
	}
}
