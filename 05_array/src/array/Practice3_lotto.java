package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice3_lotto {

	private void input(int[] lotto) {

		for (int i = 0; i < lotto.length; i++) {

			lotto[i] = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				} // if
			} // for j
		} // for i
	}

	private void output(int[] lotto) {
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.print(lotto[i] + " ");
//		}
		for (int n : lotto)
			System.out.print(String.format("%3d", n) + " ");
		System.out.println();
	} 
	
	private void sort(int[] lotto) {
		//Selection Sort
		for(int i=0; i<lotto.length-1; i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Practice3_lotto pr = new Practice3_lotto();
		int[] lotto = new int[6];
		int money;
		
		while (true) {
			
			System.out.print("현금 입력 : ");
			money = Integer.parseInt(br.readLine());
			
			if (money % 1000 != 0) {
				System.out.println("1000원 단위로 다시 입력해주세요.");
				continue;
			} else {
				for(int i=1;i<=(money/1000); i++) {
					pr.input(lotto);
					//Arrays.sort(lotto);// 오름차순
					pr.sort(lotto);
					pr.output(lotto);
					if(i%5==0) {
						System.out.println();
						System.out.println("**************************");
						System.out.println();
					}
				}
				break;
			}
		}
	}
}

/*
 * [문제3] 로또 크기가 6개인 정수형 배열을 잡아서 1~45사이의 난수를 발생하여 저장 후 출력하시오 단, 숫자가 중복되면 안된다
 * 
 * input() - 난수 발생, 중복된 숫자가 나오면 다시 발생
 * 
 * 
 * 
 * output() - 출력
 */
