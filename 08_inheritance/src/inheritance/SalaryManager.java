package inheritance;

import java.util.Scanner;

public class SalaryManager {
	
	Scanner scan = new Scanner(System.in);
	EmployeeDTO[] em = new EmployeeDTO[10];
	int cnt=0;
	
	public SalaryManager() {
		
		while (true) {
			int number;
			System.out.println("1. ��� ");
			System.out.println("2. ��� ");
			System.out.println("3. ���� ");
			System.out.println("4. �˻� ");
			System.out.println("5. ���� ");
			System.out.print(" ��ȣ : ");
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
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			} else {
				System.out.println("��ȣ�� �߸� �Է��߽��ϴ�.");
			}
		}

	}

	public void search() {
		System.out.print("������ ������ �̸��� �Է����ּ��� : ");
		String name = scan.next();
		int sw = 0;
		
		for(int i=0; i<cnt; i++) {
			if(name.equals(em[i].getName())) {
				System.out.println("�̸�\t����\t�⺻��\t����\t����\t����");
//				System.out.println(em[i].getName()+"\t"+em[i].getPosition()
//						+"\t"+em[i].getBasepay()+"\t"+em[i].getBenefit()
//						+"\t"+em[i].getTaxRate()+"\t"+em[i].getSalary());
				System.out.println(em[i]);
				sw = 1;
				break;
			}
		}
		if(sw==0) {
			System.out.println("�ش��ϴ� �̸��� ������ �����ϴ�.");
		}
		
	}

	public void update() {
		System.out.print("������ ������ �̸��� �Է����ּ��� : ");
		String name = scan.next();
		int sw = 0;
		
		for(int i=0; i<cnt; i++) {
			if(name.equals(em[i].getName())) {
				System.out.print("������ ���޸��� �Է��ϼ��� : ");
				String position = scan.next();
				
				System.out.print("�⺻���� �Է��ϼ��� : ");
				int basepay = scan.nextInt();
			
				System.out.print("������ �Է��ϼ��� : ");
				int benefit = scan.nextInt();
				
				em[i] = new EmployeeDTO(name, position, basepay, benefit);
				sw = 1;
				System.out.println("���� �Ϸ�");
				break;
			}
		}
		if(sw==0) {
			System.out.println("�ش��ϴ� �̸��� ������ �����ϴ�.");
		}
	}

	public void insert() {
		System.out.print("�̸� : ");
		String name = scan.next();
		System.out.print("���� : ");
		String position = scan.next();
		System.out.print("�⺻�� : ");
		int basepay = scan.nextInt();
		System.out.print("���� : ");
		int benefit = scan.nextInt();
	
		em[cnt] = new EmployeeDTO(name, position, basepay, benefit);
		cnt++;
		System.out.println("��� �Ϸ�");
	}

	public void list() {
		System.out.println("�̸�\t����\t�⺻��\t����\t����\t����");
		for(int i=0; i<cnt; i++) {
//			System.out.println(em[i].getName()+"\t"+em[i].getPosition()
//								+"\t"+em[i].getBasepay()+"\t"+em[i].getBenefit()
//								+"\t"+em[i].getTaxRate()+"\t"+em[i].getSalary());
			System.out.println(em[i]);
		}
	}
}

