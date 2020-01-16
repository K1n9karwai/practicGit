package abstract_1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberTest {

	public static void main(String[] args) {
		
		NumberFormat nf = new DecimalFormat();
		//3자리마다 , 찍고 소수이하 3째자리
		
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		NumberFormat nf2 = new DecimalFormat("#,###.##원");
		//유효숫자가 아닌것은 표현하지 않는다.
		
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		NumberFormat nf3 = new DecimalFormat("#,###.00원");
		//0을 강제로 표시
		
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		
		NumberFormat nf4 = NumberFormat.getCurrencyInstance();//원화표시가능
		//NumberFormat nf4 = NumberFormat.getInstance();
		//메소드를 이용한 생성
		//NumberFormat은 추상클래스 이므로 위의 decimal처럼 자식 클래스를 통해 생성해야 했지만
		//getInstance같이 메소드를 이용한 방법도 있다.
		nf4.setMaximumFractionDigits(2); // 소숫점 이하 나타내는 방법
		nf4.setMinimumFractionDigits(2);
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
		
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US);//$표시가능
		nf5.setMaximumFractionDigits(2); // 소숫점 이하 나타내는 방법
		nf5.setMinimumFractionDigits(2);
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();
		
	}
}
