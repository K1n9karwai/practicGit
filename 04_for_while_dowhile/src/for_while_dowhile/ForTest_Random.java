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
		System.out.println("A�� ���� = " + a);
	}

}
//A~Z �������� 100���� ����Ͻÿ�.
//1�ٴ� 10���� ����Ͻÿ�.
//�� �߿��� A�� ����� ����Ͻÿ�.
//[������]
//F G O K N D J .........