package constructor;

import java.util.Scanner;

public class MemberMain__ {

	MemberDTO__[] member = new MemberDTO__[5]; // Class 생성 X, MemberDTO 가 들어갈 수 있는 방 5개짜리 배열을 생성한 것
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		MemberMain__ aa = new MemberMain__();
		aa.menu();
		System.out.println("프로그램을 종료합니다.");

	}

	public void menu() {
		int num = 0;

		while (true) {
			System.out.println("*************");
			System.out.println("1. 가입");
			System.out.println("2. 출력");
			System.out.println("3. 수정");
			System.out.println("4. 탈퇴");
			System.out.println("5. 끝내기");
			System.out.println("*************");
			System.out.print("  번호 : ");
			num = scan.nextInt();
			if (num == 5)
				break;

			if (num == 1)
				this.insert(); // 다른 클래스와 연동되는 것이 아니기 때문에 this로 해도 괜찮다.
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
			System.out.println("5명 정원이 꽉 찼습니다.");
			return; // 메소드를 벗어나라
		}

		// 가입
		System.out.print("이름 입력 : ");
		String name = scan.next();

		System.out.print("나이 입력 : ");
		int age = scan.nextInt();

		System.out.print("핸드폰 입력 : ");
		String phoneNumber = scan.next();
		// if(!phoneNumber.matches("))

		System.out.print("주소 입력 : ");
		String address = scan.next();

		member[i] = new MemberDTO__(name, age, phoneNumber, address);
		int cnt = 0;
		System.out.println("1 row(s) created");

		for (i = 0; i < member.length; i++) {
			if (member[i] == null) {
				cnt++;
			}
		}
		System.out.println(cnt + "자리가 남았습니다.");
	}

	public void list() {
		System.out.println("이름\t나이\t핸드폰\t\t주소");
		for (int i = 0; i < member.length; i++) {
			if (member[i] != null) {
				System.out.println(member[i].getName() + "\t" + member[i].getAge() + "\t" + member[i].getPhoneNumber()
						+ "\t" + member[i].getAddress());
			}
		}
	}

	public void update() {
		System.out.println("핸드폰 번호 입력 : ");
		String Number = scan.next();
		int i;

		for (i = 0; i < member.length; i++) {
			if (member[i] != null && member[i].getPhoneNumber().equals(Number)) {
				System.out.println(member[i].getName() + "\t" + member[i].getAge() + "\t" + member[i].getPhoneNumber()
						+ "\t" + member[i].getAddress());

				System.out.print("수정 할 이름 입력 : ");
				member[i].setName(scan.next());
				System.out.print("수정 할 핸드폰 입려 : ");
				member[i].setPhoneNumber(scan.next());
				System.out.print("수정 할 주소 입력 : ");
				member[i].setAddress(scan.next());

				System.out.println("1 row(s) updated");
				break;
			} // if
		} // for

		if (i == 5) {
			System.out.println("찾는 회원이 없습니다.");
		}
	}

	public void delete() {
		System.out.println("핸드폰 번호 입력 : ");
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
			System.out.println("찾는 회원이 없습니다.");
		}
	}
}
