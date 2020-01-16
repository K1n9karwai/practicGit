package constructor;

import java.util.Scanner;

public class MemberMain__ {

	MemberDTO__[] member = new MemberDTO__[5]; // Class ���� X, MemberDTO �� �� �� �ִ� �� 5��¥�� �迭�� ������ ��
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		MemberMain__ aa = new MemberMain__();
		aa.menu();
		System.out.println("���α׷��� �����մϴ�.");

	}

	public void menu() {
		int num = 0;

		while (true) {
			System.out.println("*************");
			System.out.println("1. ����");
			System.out.println("2. ���");
			System.out.println("3. ����");
			System.out.println("4. Ż��");
			System.out.println("5. ������");
			System.out.println("*************");
			System.out.print("  ��ȣ : ");
			num = scan.nextInt();
			if (num == 5)
				break;

			if (num == 1)
				this.insert(); // �ٸ� Ŭ������ �����Ǵ� ���� �ƴϱ� ������ this�� �ص� ������.
			else if(num==2) list();
			else if(num==3) update();
			else if(num==4) delete();
		} // while
	}

	public void insert() {
		int i;
		for (i = 0; i < member.length; i++) {
			if (member[i] == null) {
				break;
			}
		}
		if (i == member.length) {
			System.out.println("5�� ������ �� á���ϴ�.");
			return; // �޼ҵ带 �����
		}

		// ����
		System.out.print("�̸� �Է� : ");
		String name = scan.next();

		System.out.print("���� �Է� : ");
		int age = scan.nextInt();

		System.out.print("�ڵ��� �Է� : ");
		String phoneNumber = scan.next();
		// if(!phoneNumber.matches("))

		System.out.print("�ּ� �Է� : ");
		String address = scan.next();

		member[i] = new MemberDTO__(name, age, phoneNumber, address);
		int cnt = 0;
		System.out.println("1 row(s) created");

		for (i = 0; i < member.length; i++) {
			if (member[i] == null) {
				cnt++;
			}
		}
		System.out.println(cnt + "�ڸ��� ���ҽ��ϴ�.");
	}

	public void list() {
		System.out.println("�̸�\t����\t�ڵ���\t\t�ּ�");
		for (int i = 0; i < member.length; i++) {
			if (member[i] != null) {
				System.out.println(member[i].getName() + "\t" + member[i].getAge() + "\t" + member[i].getPhoneNumber()
						+ "\t" + member[i].getAddress());
			}
		}
	}

	public void update() {
		System.out.println("�ڵ��� ��ȣ �Է� : ");
		String Number = scan.next();
		int i;

		for (i = 0; i < member.length; i++) {
			if (member[i] != null && member[i].getPhoneNumber().equals(Number)) {
				System.out.println(member[i].getName() + "\t" + member[i].getAge() + "\t" + member[i].getPhoneNumber()
						+ "\t" + member[i].getAddress());

				System.out.print("���� �� �̸� �Է� : ");
				member[i].setName(scan.next());
				System.out.print("���� �� �ڵ��� �Է� : ");
				member[i].setPhoneNumber(scan.next());
				System.out.print("���� �� �ּ� �Է� : ");
				member[i].setAddress(scan.next());

				System.out.println("1 row(s) updated");
				break;
			} // if
		} // for

		if (i == 5) {
			System.out.println("ã�� ȸ���� �����ϴ�.");
		}
	}

	public void delete() {
		System.out.println("�ڵ��� ��ȣ �Է� : ");
		String Number = scan.next();
		int i;

		for (i = 0; i < member.length; i++) {
			if (member[i] != null && member[i].getPhoneNumber().equals(Number)) {
				member[i] = null;
				System.out.println("1 row(s) deleted");
				break;
			} // if
		}//for
		
		if(i==5) {
			System.out.println("ã�� ȸ���� �����ϴ�.");
		}
	}
}
