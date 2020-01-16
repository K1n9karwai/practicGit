package constructor;

import java.util.Random;

public class RandomTest {

	public RandomTest() {
		System.out.println("난수 = " + Math.random());
		System.out.println("난수 = " + new Random().nextDouble());
		System.out.println("난수 = " + new Random().nextInt());
		System.out.println("난수 = " + new Random().nextInt(100));//0~99
		System.out.println("난수 = " + (new Random().nextInt(100)+1));//0~100
	}
	
	public static void main(String[] args) {
		new RandomTest();//변수를 따로 안잡아주고 일회용으로도 사용 가능
	}
}
