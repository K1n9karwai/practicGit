package inheritance;

import java.util.Scanner;

public class SalaryManager {
	
	Scanner scan = new Scanner(System.in);
	EmployeeDTO[] em = new EmployeeDTO[10];
	int cnt=0;
	
	public SalaryManager() {
		
		while (true) {
			int number;
			System.out.println("1. 등록 ");
			System.out.println("2. 출력 ");
			System.out.println("3. 수정 ");
			System.out.println("4. 검색 ");
			System.out.println("5. 종료 ");
			System.out.print(" 번호 : ");
			number = scan.nextInt();

			if (number == 1) {
				insert();
			} else if (number == 2) {
				list();
			} else if (number == 3) {
				update();
			} else if (number == 4) {
				search();
			} else if (number == 5) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			} else {
				System.out.println("번호를 잘못 입력했습니다.");
			}
		}

	}

	public void search() {
		System.out.print("열람할 직원의 이름을 입력해주세요 : ");
		String name = scan.next();
		int sw = 0;
		
		for(int i=0; i<cnt; i++) {
			if(name.equals(em[i].getName())) {
				System.out.println("이름\t직급\t기본급\t수당\t세율\t월급");
//				System.out.println(em[i].getName()+"\t"+em[i].getPosition()
//						+"\t"+em[i].getBasepay()+"\t"+em[i].getBenefit()
//						+"\t"+em[i].getTaxRate()+"\t"+em[i].getSalary());
				System.out.println(em[i]);
				sw = 1;
				break;
			}
		}
		if(sw==0) {
			System.out.println("해당하는 이름의 직원이 없습니다.");
		}
		
	}

	public void update() {
		System.out.print("수정할 직원의 이름을 입력해주세요 : ");
		String name = scan.next();
		int sw = 0;
		
		for(int i=0; i<cnt; i++) {
			if(name.equals(em[i].getName())) {
				System.out.print("수정할 직급명을 입력하세요 : ");
				String position = scan.next();
				
				System.out.print("기본급을 입력하세요 : ");
				int basepay = scan.nextInt();
			
				System.out.print("수당을 입력하세요 : ");
				int benefit = scan.nextInt();
				
				em[i] = new EmployeeDTO(name, position, basepay, benefit);
				sw = 1;
				System.out.println("수정 완료");
				break;
			}
		}
		if(sw==0) {
			System.out.println("해당하는 이름의 직원이 없습니다.");
		}
	}

	public void insert() {
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("직급 : ");
		String position = scan.next();
		System.out.print("기본급 : ");
		int basepay = scan.nextInt();
		System.out.print("수당 : ");
		int benefit = scan.nextInt();
	
		em[cnt] = new EmployeeDTO(name, position, basepay, benefit);
		cnt++;
		System.out.println("등록 완료");
	}

	public void list() {
		System.out.println("이름\t직급\t기본급\t수당\t세율\t월급");
		for(int i=0; i<cnt; i++) {
//			System.out.println(em[i].getName()+"\t"+em[i].getPosition()
//								+"\t"+em[i].getBasepay()+"\t"+em[i].getBenefit()
//								+"\t"+em[i].getTaxRate()+"\t"+em[i].getSalary());
			System.out.println(em[i]);
		}
	}
}

