package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATMTest implements Runnable {
	private long depositeMoney = 100000;// �ܾ�
	private long balance;// ã���� �ϴ� �ݾ�

	public static void main(String[] args) {
		ATMTest atm = new ATMTest();
		System.out.println("atm = " + atm);
		Thread mom = new Thread(atm, "����");// �Ʒ�ó�� set�� �ƴ�
		Thread son = new Thread(atm, "�Ƶ�");// �ѹ��� �̸����� ����ִ� ���

		// son.setName("�Ƶ�");
		// mom.setName("����");

		mom.start();
		son.start();

	}

	@Override
	// public synchronized void run() { // - ����ȭ O

	public void run() {
		synchronized (this) { // - ����ȭ O
		//sychronized(ATMTest.class { // - ����ȭ O
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(Thread.currentThread().getName() + "�� �ȳ��ϼ���.");

			try {
				System.out.print("ã���� �ϴ� �ݾ� �Է� : ");
				balance = Long.parseLong(br.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			withDraw(); // �ܾװ��
		}
	}

	public void withDraw() {
		if (depositeMoney < balance) {
			System.out.println("�ܾ� ����");
		} else if (balance % 10000 != 0) {
			System.out.println("���� ������ �Է��ϼ���.");
		} else {
			depositeMoney -= balance;
			System.out.println("�ܾ��� " + depositeMoney + "�Դϴ�.");
		}
		System.out.println();
	}
}
