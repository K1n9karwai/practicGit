package for_while_dowhile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.function.Function;

public class ForPractice {
	
	public static int function(int a, int b, int c) {
		int min;
		if(a>b) {
			if(b>c) {
				min = c;
			} else {
				min = b;
			}
		} else {
			if(a>c) {
				min = c;
			} else {
				min = a;
			}
		} for(int i = min; i > 0; i-- ) {
			if(a%i==0 && b%i==0 && c%1==0) {
				System.out.println(i);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(function(400, 300, 750
				));
	}
		
}

/*		File file = new File("input.txt");

try {
	Scanner sc = new Scanner(file);
	while(sc.hasNextInt()) {
		System.out.println(sc.nextInt() * 100);
	}
	sc.close();
} catch (FileNotFoundException e) {
	System.out.println("파일을 읽어오는 도중에 오류가 발생했습니다.");
}
*/