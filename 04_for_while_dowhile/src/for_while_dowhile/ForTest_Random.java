package for_while_dowhile;

public class ForTest_Random {

	public static void main(String[] args) {
		int num;
		int a=0;
		
		for(int i=1; i<=100; i++) {
			num = (int)(Math.random()*26+65);
			System.out.print((char)num+ " ");
			
			if(i%10==0) System.out.println();
			if((char)num=='A') a++;
		}
		System.out.println();
		System.out.println("A의 개수 = " + a);
	}

}
//A~Z 무작위로 100개를 출력하시오.
//1줄당 10개씩 출력하시오.
//이 중에서 A가 몇개인지 출력하시오.
//[실행결과]
//F G O K N D J .........