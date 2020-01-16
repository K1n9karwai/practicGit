package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest2 {
	private int dan;

	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("���ϴ� ���� �Է��ϼ��� : ");
		dan = Integer.parseInt(br.readLine());
	}

	public void output() {

//		if (dan > 9 || dan < 2) {
//			System.out.println("���� �ʰ� (2~9���� ����)");
//		} else {
//			System.out.println("********* ������ " + dan + "�� *********");
//			for (int i = 1; i <= 9; i++) {
//				System.out.println(dan + " x " + i + " = " + dan * i);
//			}
//		}

		if (dan >= 2 && dan <= 9) {
			System.out.println("********* ������ " + dan + "�� *********");
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " x " + i + " = " + dan * i);
			}
		} else {
			// System.out.println("���� �ʰ� (2~9���� ����)");
			// �����ڰ� ������ Exception �߻�
			try {
				//throw new Exception("���� �ʰ� (2~9���� ����)"); //�����ڰ� ����ڿ��� �����ϰ� ��� �ֱ����� ���
				throw new MakeException("���� �ʰ� (2~9���� ����)");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws IOException {

		ExceptionTest2 et2 = new ExceptionTest2();

		et2.input(); // ȣ��ε� exception ó���� ��û�Ѵ�.
		et2.output();

	}
}
