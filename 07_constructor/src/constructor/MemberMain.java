package constructor;

import java.util.Scanner;

public class MemberMain {

	MemberDTO[] member = new MemberDTO[5];

	public void insert() {
		String name, phoneNumber, address, age;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < member.length; i++) {
			if (member[i] == null) {
				System.out.print("이름 입력 : ");
				name = scan.next();

				System.out.print("나이 입력 : ");
				age = scan.next();

				System.out.print("핸드폰 입력 : ");
				phoneNumber = scan.next();

				System.out.print("주소 입력 : ");
				address = scan.next();

				member[i] = new MemberDTO(name, age, phoneNumber, address);
				System.out.println("1 row created");
				System.out.println(member.length - (i + 1) + "자리 남았습니다.");
				System.out.println("--------------------");
				break;
			} else {
				continue;
			}
		}

		if (member[member.length - 1] != null) {
			System.out.println("5명의 정원이 꽉 찼습니다...");
			System.out.println("--------------------");
		}

	}

	public void menu() {
		System.out.println("*************");
		System.out.println("1. 가입");
		System.out.println("2. 출력");
		System.out.println("3. 수정");
		System.out.println("4. 탈퇴");
		System.out.println("5. 끝내기");
		System.out.println("*************");
	}

	public void list() {
		if (member[0] != null) {
			System.out.println("이름\t나이\t핸드폰\t\t주소");
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
		System.out.print("핸드폰 번호 입력 : ");
		String number = scan.next();
		int numberCnt=0;
			for (int i = 0; i < member.length; i++) {
				if (number.equals(member[i].getPhoneNumber())) {
					System.out.println(member[i].getName() + "\t" + member[i].getAge() + "\t"
							+ member[i].getPhoneNumber() + "\t" + member[i].getAddress());
					System.out.print("수정 할 이름 입력 : ");
					String name = scan.next();
					System.out.print("수정 할 핸드폰 입려 : ");
					String phoneNumber = scan.next();
					System.out.print("수정 할 주소 입력 : ");
					String address = scan.next();

					member[i] = new MemberDTO(name, member[i].getAge(), phoneNumber, address);

					System.out.println("1 row(s) updated");
					System.out.println("--------------------");
					break;
				} else {
					numberCnt++;
					}
				if(numberCnt==5) {
					System.out.println("찾는 회원이 없습니다.");
					break;
				}
			}

		}

	public void delete() {
		Scanner scan = new Scanner(System.in);
		System.out.print("핸드폰 번호 입력 : ");
		String number = scan.next();

		for (int i = 0; i < member.length; i++) {
			if (number.equals(member[i].getPhoneNumber())) {
				member[i] = new MemberDTO();
				System.out.println("1 row deleted");
				break;
			} else {
				System.out.println("찾는 회원이 없습니다.");
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
			System.out.print("번호 입력 : ");
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
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("번호를 다시 입력해주세요.");
			}
		}

		scan.close();
	}
}
