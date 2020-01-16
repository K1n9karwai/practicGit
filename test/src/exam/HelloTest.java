package exam;

class HelloTest {
	public static void main(String[] args) {
		System.out.println("안녕하세요.");
		System.out.println("반갑습니다.");
		System.out.println("사과" + "오렌지");
		System.out.println(25 + 36);
		System.out.println("25" + "36");
  		System.out.println("25 + 36 = " + 25 + 36);
		System.out.println("25 + 36 = " + (25 + 36));
		System.out.println("25 / 36 = " + (25 / 36));
		System.out.println("25 % 36 = " + (25 % 36));
		System.out.println("25 / 36 = " + (25.0 / 36)); //소수이하 첫째자리 
		System.out.println("25 / 36 = " + ((25.0 / 36)*10));
		System.out.println("25 / 36 = " + (((25.0 / 36)*10)+0.5));
		System.out.println((int)(25.0 / 36*10+0.5));
		System.out.println("25 / 36 = " + ((int)(25.0 / 36 * 10 + 0.5) / 10.0));
		System.out.println("25 / 36 = " + String.format("%.1f", (25.0/36)));
		
		
	} 
}
