package abstract_1;

/*
 *class Object {
 *		public boolean equals(Object ob) {} //참조값 비교
 *		public String toString(){}//기본 object 클래스의 toString은 클래스@16진수
 * 		public int hashCode(){}//위의 16진수를 10진수로 바꾸는 것이기에, 신뢰 가능
 *
 * }
 * 
 * class String extends Object {
 * 		public boolean equals(Object ob) {} //문자열 비교
 * 		public String toString(){}//문자열로 나가라, 라고 오버라이딩이 돼있는 상황
 * 		public int hashCode(){}// 문자열의 갯수(무한대)가 int의 21억을 훨씬 넘으므로 신뢰 불가능
 * }
 */

class Test extends Object {
	
	@Override
	public String toString() {
		return getClass() + "@개바부"; //클래스@16진수를 @개바부로 오버라이딩
	}
}

//---------------
public class ObjectMain {

	public static void main(String[] args) {
		
		Test t = new Test();
		System.out.println("객체 t = " + t);
		System.out.println("객체 t = " + t.toString());
		System.out.println("객체 t = " + t.hashCode()); //가진 값을 10진수로
		System.out.println();
		
		String str = "apple";
		System.out.println("객체 str = " + str);
		System.out.println("객체 str = " + str.toString());
		System.out.println("객체 str = " + str.hashCode());
		System.out.println();
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa==bb : " + (aa==bb));//참조값 - false
		System.out.println("aa.equals(bb) : " + aa.equals(bb));//문자열 - true
		System.out.println();
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc==dd : " + (cc==dd));//참조값 - false
		System.out.println("cc.equals(dd) : " + cc.equals(dd));//참조값 - false
		System.out.println();
		
		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println("ee==ff : " + (ee==ff));//참조값 - false
		System.out.println("ee.equals(ff) : " + ee.equals(ff));//문자열 - true
		System.out.println();
	}
}
