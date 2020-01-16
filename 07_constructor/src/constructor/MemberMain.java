package constructor;

import java.util.Scanner;

public class MemberMain {

	MemberDTO[] member = new MemberDTO[5];

	public void insert() {
		String name, phoneNumber, address, age;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < member.length; i++) {
			if (member[i] == null) {
				System.out.print("�̸� �Է� : ");
				name = scan.next();

				System.out.print("���� �Է� : ");
				age = scan.next();

				System.out.print("�ڵ��� �Է� : ");
				phoneNumber = scan.next();

				System.out.print("�ּ� �Է� : ");
				address = scan.next();

				member[i] = new MemberDTO(name, age, phoneNumber, address);
				System.out.println("1 row created");
				System.out.println(member.length - (i + 1) + "�ڸ� ���ҽ��ϴ�.");
				System.out.println("--------------------");
				break;
			} else {
				continue;
			}
		}

		if (member[member.length - 1] != null) {
			System.out.println("5���� ������ �� á���ϴ�...");
			System.out.println("--------------------");
		}

	}

	public void menu() {
		System.out.println("*************");
		System.out.println("1. ����");
		System.out.println("2. ���");
		System.out.println("3. ����");
		System.out.println("4. Ż��");
		System.out.println("5. ������");
		System.out.println("*************");
	}

	public void list() {
		if (member[0] != null) {
			System.out.println("�̸�\t����\t�ڵ���\t\t�ּ�");
			for (int i = 0; i < member.length; i++) {

				if (member[i] != null) {
					System.out.println(member[i].getName() + "\t" + member[i].getAge() + "\t"
							+ member[i].getPhoneNumber() + "\t" + member[i].getAddress());
					System.out.println("--------------------");
				} else {
					continue;
				}
			}
		}
	}

	public void update() {
		Scanner scan = new Scanner(System.in);
		System.out.print("�ڵ��� ��ȣ �Է� : ");
		String number = scan.next();
		int numberCnt=0;
			for (int i = 0; i < member.length; i++) {
				if (number.equals(member[i].getPhoneNumber())) {
					System.out.println(member[i].getName() + "\t" + member[i].getAge() + "\t"
							+ member[i].getPhoneNumber() + "\t" + member[i].getAddress());
					System.out.print("���� �� �̸� �Է� : ");
					String name = scan.next();
					System.out.print("���� �� �ڵ��� �Է� : ");
					String phoneNumber = scan.next();
					System.out.print("���� �� �ּ� �Է� : ");
					String address = scan.next();

					member[i] = new MemberDTO(name, member[i].getAge(), phoneNumber, address);

					System.out.println("1 row(s) updated");
					System.out.println("--------------------");
					break;
				} else {
					numberCnt++;
					}
				if(numberCnt==5) {
					System.out.println("ã�� ȸ���� �����ϴ�.");
					break;
				}
			}

		}

	public void delete() {
		Scanner scan = new Scanner(System.in);
		System.out.print("�ڵ��� ��ȣ �Է� : ");
		String number = scan.next();

		for (int i = 0; i < member.length; i++) {
			if (number.equals(member[i].getPhoneNumber())) {
				member[i] = new MemberDTO();
				System.out.println("1 row deleted");
				break;
			} else {
				System.out.println("ã�� ȸ���� �����ϴ�.");
				break;
			}
		}

	}

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		MemberMain aa = new MemberMain();

		while (true) {
			aa.menu();
			System.out.print("��ȣ �Է� : ");
			num = scan.nextInt();
			System.out.println("--------------------");
			if (num == 1) {
				aa.insert();
			} else if (num == 2) {
				aa.list();
			} else if (num == 3) {
				aa.update();
			} else if (num == 4) {
				aa.delete();
			} else if (num == 5) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("��ȣ�� �ٽ� �Է����ּ���.");
			}
		}

		scan.close();
	}
}
