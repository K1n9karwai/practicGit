package method;

/*
[����3]
�ʸ� �Է¹޾Ƽ� time()���� ��,��,�ʸ� ���Ͽ� ����Ѵ�

[������]
�ʸ� �Է��Ͻÿ� : 3850
1�ð� 4�� 10�� �Դϴ�

 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Practice3 {

	public void time(int sec) {
		int hour = sec / 3600;
		int minute = sec % 3600 / 60;
		int second = sec % 3600 % 60;
		System.out.println(sec + "�ʴ� " + hour + "�ð� " + minute + "�� " + second + "�� �Դϴ�.");
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�ʸ� �Է��Ͻÿ� : ");
		int sec = Integer.parseInt(br.readLine());

		Practice3 p3 = new Practice3();
		p3.time(sec);
		System.out.println("���α׷��� �����մϴ�.");

	}
}
