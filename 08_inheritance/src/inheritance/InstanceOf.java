package inheritance;

class AAA {
}

class BBB extends AAA {
}

public class InstanceOf {

	public static void main(String[] args) {

		AAA aa = new AAA();
		BBB bb = new BBB();
		AAA aa2 = new BBB();

		AAA aa3 = aa;
		if (aa instanceof AAA) {
			System.out.println("1. TRUE");
		} else {
			System.out.println("1. FALSE");
		}

		AAA aa4 = bb; //부모=자식
		if (bb instanceof AAA) {
			System.out.println("2. TRUE");
		} else {
			System.out.println("2. FALSE");
		}
		
		//BBB bb2 = (BBB)aa; //자식 = (자식)부모 (부모 호적에 없는 자식이 없는 경우)
						     //하지만 생성시 AAA타입만 생성됐기에 캐스팅 자체가 불가능
		if(aa instanceof BBB) {
			System.out.println("3. TRUE");
		} else {
			System.out.println("3. FALSE");
		}
		
		BBB bb3 = (BBB)aa2;//자식 = (자식)부모 (부모 호적에 자식이 포함된 경우)
						   //생성시 자식을 생성하면 부모 클래스도 함께 생성되기에
						   //이 경우에는 BBB타입도 생성하여 캐스팅 가능
		if(aa2 instanceof BBB) {
			System.out.println("4. TRUE");
		} else {
			System.out.println("4. FALSE");
		}
	}
}
