package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

//a값 입력 : 25
//b값 입력 : 36
//연산자(+,-,*,/) 입력 : +
//25 + 36 = 
public class SwitchTest2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("a값 입력 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("b값 입력 : ");
		int b = Integer.parseInt(br.readLine());
		System.out.println("연산자(+,-,*,/) 입력 : ");
		String cal = br.readLine();
		//int val_int = 0;
		//double val_double=0.0;
		
		switch(cal) {
			case "+" : System.out.println(a + "+" + b + "=" + (a+b)); break;
			case "-" : System.out.println(a + "-" + b + "=" + (a-b)); break;
			case "*" : System.out.println(a + "*" + b + "=" + (a*b)); break;
			case "/" : 
				//System.out.println(a + "/" + b + "=" + String.format("%.3f", (double)a/b)); break;
				DecimalFormat df = new DecimalFormat("#.###");
				System.out.println(a + "/" + b + "=" + df.format((double)a/b)); break;
			default : System.out.println("연산자 error"); 
			
		}
		
		/*
		switch (cal) {
		case "+" :
			val_int = (a + b);
			System.out.println(a + cal + b + " = " + val_int);
			break;
		case "-" :
			val_int = (a - b);
			System.out.println(a + cal + b + " = " + val_int);
			break;
		case "*" :
			val_int = (a * b);
			System.out.println(a + cal + b + " = " + val_int);
			break;
		case "/" :
			val_double = (double)a / b;
			System.out.println(a + cal + b + " = " + String.format("%.3f", val_double));
			break;

		default:
			System.out.println("연산자 error");
			break;
		}
		*/
		
	}
}
