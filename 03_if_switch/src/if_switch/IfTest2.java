package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//3���� ����(a, b, c)�� �Է¹޾Ƽ� ������� ����Ͻÿ�

//[������]
// a�� �Է� :
// b�� �Է� :
// c�� �Է� :
// 25 36 78

public class IfTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("a�� �Է� : ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("b�� �Է� : ");
		int b = Integer.parseInt(br.readLine());
		System.out.println("c�� �Է� : ");
		int c = Integer.parseInt(br.readLine());
		
		if(a>b && a>c)
			if(b>c) System.out.println(c + "\t" + b + "\t" + a);
			else System.out.println(b + "\t" + c + "\t" + a);
		else if(b>c)
			if(a>c) System.out.println(c + "\t" + a + "\t" + b);
			else System.out.println(a + "\t" + c + "\t" + b);
		else
			if(b>a) System.out.println(a + "\t" + b + "\t" + c);
			else System.out.println(b + "\t" + a + "\t" + c);
	
	}
}
