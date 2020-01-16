package method;

public class Boxing {

	public static void main(String[] args) {
		int a = 25;
		double b = (double) a / 3; // cast연산 = 형변환
		
		//String a = "25";
		//int b = (int) a;
		//형변환은 같은 기본형 타입들끼리만 가능, 타입이 다를 경우 메소드를 통해서 변환
		
		int c = 5;
		Integer d = c; //AutoBoxing 기본형 -> 객체형
		//Integer d = new Integer(c); JDK 5.0 이전
		
		Integer e = 5;
		int f = e; //unAutoBoxing 객체형 -> 기본형
		//int f = e.intValue(); JDK 5.0 이전
	}
}
