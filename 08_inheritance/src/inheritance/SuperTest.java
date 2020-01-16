package inheritance;

public class SuperTest {
	
	protected double weight, height;
	
	public SuperTest() {
		System.out.println("SuperTest 扁夯 积己磊");
	}
	
	public SuperTest(double weight, double height) {
		System.out.println("SuperTest 积己磊");
		this.weight = weight;
		this.height = height;
	}
	
	public void disp() {
		System.out.println("个公霸 = " + weight);
		System.out.println("虐 = " + height);
	}
}
