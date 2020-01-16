package class_1;

class Person {
	private String name; //필드, 초기값
	private int age;
	
	public void setName(String n) {//구현
		name = n;
	}
	public void setAge(int a) {
		age = a;
	}
	public void setData(String n, int a) {
		name = n;
		age = a;
	}
	public void setData() {	
	}	
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}
//----------------
public class PersonMain {

	public static void main(String[] args) {
		Person aa;
		aa = new Person(); // Person aa = new Person(); 과 동일
		System.out.println("객체 aa = " + aa);
		aa.setName("홍길동");//호출
		aa.setAge(25);
		System.out.println("이름 = " + aa.getName() + "\t나이 = " + aa.getAge());
		System.out.println();

		Person bb;
		bb = new Person();
		System.out.println("객체 bb = " + bb);
		bb.setAge(16);
		bb.setName("코난");
		System.out.println("이름 = " + bb.getName() + "\t나이 = " + bb.getAge());
		System.out.println();
		
		Person cc;
		cc = new Person();
		cc.setData("또치", 30);
		System.out.println("객체 cc = " + cc);
		System.out.println("이름 = " + cc.getName() + "\t나이 = " + cc.getAge());
		System.out.println();
		
		Person dd;
		dd = new Person();
		dd.setData();
		System.out.println("객체 dd = " + dd);
		System.out.println("이름 = " + dd.getName() + "\t나이 = " + dd.getAge());
		System.out.println();
		
	}
}

//int aa; 정수형 변수
//double aa; 실수형 변수
//char aa; 문자형 변수
//
//Person aa; 객체
//객체란 클래스형 변수이지만 변수란 데이터를 넣는 것으로 사용되기에 객체라 부르는 것이 더 적합

//void 메소드(1000) = > 보통 set****()
//변수가 안들어오는 메소드 예 : 커피 메소드() = > 보통 get****()
                                   //boolean is****()
