package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

//a�� �Է� : 25
//b�� �Է� : 36
//������(+,-,*,/) �Է� : +
//25 + 36 = 
public class SwitchTest2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("a�� �Է� : ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("b�� �Է� : ");
		int b = Integer.parseInt(br.readLine());
		System.out.println("������(+,-,*,/) �Է� : ");
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
			default : System.out.println("������ error"); 
			
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
			System.out.println("������ error");
			break;
		}
		*/
		
	}
}
