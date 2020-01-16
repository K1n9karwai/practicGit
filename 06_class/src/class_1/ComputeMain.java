package class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComputeMain {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Compute[] ar = new Compute[3];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = new Compute();
			System.out.print("ar[" + i + "]의 x 입력 : ");
			ar[i].setX(Integer.parseInt(br.readLine()));
			System.out.print("ar[" + i + "]의 y 입력 : ");
			ar[i].setY(Integer.parseInt(br.readLine()));

			ar[i].calc();

			System.out.println();
		}

		System.out.println("X\tY\tSUM\tSUB\tMUL\tDIV");

		for (Compute data : ar) {
			System.out.println(data.getX() + "\t"
							+ data.getY() + "\t"
							+ data.getSum() + "\t"
							+ data.getSub() + "\t"
							+ data.getMul() + "\t"
							+ String.format("%.2f", data.getDiv()));
		}

//		Compute aa = new Compute();

//		System.out.print("x 입력 : ");
//		aa.setX(x = Integer.parseInt(br.readLine()));
//		System.out.print("y 입력 : ");
//		aa.setY(y = Integer.parseInt(br.readLine()));
//		aa.calc();
//		aa.div();
//		
//		System.out.println("X\tY\tSUM\tSUB\tMUL\tDIV");
//		
//		System.out.println(aa.getX() + "\t" + aa.getY() + "\t" + aa.getSum() + "\t" + aa.getSub() + "\t" + aa.getMul() + "\t" + String.format("%.2f", aa.getDiv()));
//		
//		System.out.println();

	}
}
