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
		System.out.println("2�� 3�� ����� ���� = " + lcm_num);
		System.out.println("2�� 3�� ����� �� = " + lcm_sum);
	}	
}

/*
 * 1~500������ ������ 100�� �߻��Ͽ� 2�� 3�� ������� ����ϰ� �հ� ������ ����Ͻÿ� �� 1�ٿ� 7���� ����Ͻÿ�
 * 
 * [������] 36 12 ....
 * 
 * 2�� 3�� ����� ���� =
 * 2�� 3�� ����� �� =
 */