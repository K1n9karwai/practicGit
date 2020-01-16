package for_while_dowhile;

public class ForTest_LCM {

	public static void main(String[] args) {
		int num;
		int lcm_num = 0;
		int lcm_sum = 0;
		
		for(int i=1; i<=100; i++) {
			num = (int)(Math.random()*500)+1;
			if(num%6==0) {
				System.out.print(String.format("%5d", num) + " ");
				lcm_sum+=num;
				lcm_num++;
			} else {
				continue;
			}
			if(lcm_num%7==0) System.out.println();
		}
		System.out.println();
		System.out.println("2와 3의 공배수 개수 = " + lcm_num);
		System.out.println("2와 3의 공배수 합 = " + lcm_sum);
	}	
}

/*
 * 1~500사이의 난수를 100개 발생하여 2와 3의 공배수만 출력하고 합과 개수를 출력하시오 단 1줄에 7개씩 출력하시오
 * 
 * [실행결과] 36 12 ....
 * 
 * 2와 3의 공배수 개수 =
 * 2와 3의 공배수 합 =
 */