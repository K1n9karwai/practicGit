package exam;

class HelloTest {
	public static void main(String[] args) {
		System.out.println("�ȳ��ϼ���.");
		System.out.println("�ݰ����ϴ�.");
		System.out.println("���" + "������");
		System.out.println(25 + 36);
		System.out.println("25" + "36");
  		System.out.println("25 + 36 = " + 25 + 36);
		System.out.println("25 + 36 = " + (25 + 36));
		System.out.println("25 / 36 = " + (25 / 36));
		System.out.println("25 % 36 = " + (25 % 36));
		System.out.println("25 / 36 = " + (25.0 / 36)); //�Ҽ����� ù°�ڸ� 
		System.out.println("25 / 36 = " + ((25.0 / 36)*10));
		System.out.println("25 / 36 = " + (((25.0 / 36)*10)+0.5));
		System.out.println((int)(25.0 / 36*10+0.5));
		System.out.println("25 / 36 = " + ((int)(25.0 / 36 * 10 + 0.5) / 10.0));
		System.out.println("25 / 36 = " + String.format("%.1f", (25.0/36)));
		
		
	} 
}