package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SungJukService {
	
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();

	Scanner scan = new Scanner(System.in);

	public void menu() {
		int number;
		
		while (true) {
			System.out.println("***************");
			System.out.println("   1. �Է�");
			System.out.println("   2. ���");
			System.out.println("   3. �˻�");
			System.out.println("   4. ����");
			System.out.println("   5. ����");
			System.out.println("   6. ��");
			System.out.println("***************");
			System.out.print("  ��ȣ : ");

			number = scan.nextInt();

			if (number == 1) {
				insertArticle();
			} else if (number == 2) {
				printArticle();
			} else if (number == 3) {
				searchArticle();
			} else if (number == 4) {
				deleteArticle();
			} else if (number == 5) {
				sortArticle();
			} else if (number == 6) {
				break;
			} else {
				System.out.println("1~6�߿� �����ϼ���.");
			}

		}

	}

	public void insertArticle() {
		int num, kor, eng, math;
		String name;

		System.out.print("��ȣ �Է� : ");
		num = scan.nextInt();
		System.out.print("�̸� �Է� : ");
		name = scan.next();
		System.out.print("���� �Է� : ");
		kor = scan.nextInt();
		System.out.print("���� �Է� : ");
		eng = scan.nextInt();
		System.out.print("���� �Է� : ");
		math = scan.nextInt();

		SungJukDTO sungJuk = new SungJukDTO(num, name, kor, eng, math);

		list.add(sungJuk);
		System.out.println("�Է� �Ϸ�");
	}

	public void printArticle() {
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");

		for(SungJukDTO dto : list) {
			System.out.println(dto);
		}
		
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getNum() + "\t" + list.get(i).getName() + "\t" + list.get(i).getKor() + "\t"
//					+ list.get(i).getEng() + "\t" + list.get(i).getMath() + "\t" + list.get(i).getTot() + "\t"
//					+ list.get(i).getAve());
//		}
	}

	public void searchArticle() {
		String searchName;
		int sw = 0;

		System.out.print("�˻� �� �̸��� �Է��ϼ��� : ");
		searchName = scan.next();
		
		for(SungJukDTO dto : list) {
			if(dto.getName().equals(searchName)) {
				System.out.println(dto);
				sw++;
			}
		}
		
		if (sw == 0) {
			System.out.println("ã���� �ϴ� �̸��� �����ϴ�.");
		}
		
//		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getName().equals(searchName)) {
//				sw = 1;
//				System.out.println(list.get(i).getNum() + "\t" + list.get(i).getName() + "\t" + list.get(i).getKor()
//						+ "\t" + list.get(i).getEng() + "\t" + list.get(i).getMath() + "\t" + list.get(i).getTot()
//						+ "\t" + list.get(i).getAve());
//			}
//		}
//		if (sw == 0) {
//			System.out.println("ã���� �ϴ� �̸��� �����ϴ�.");
//		}
	}

	public void deleteArticle() {
		System.out.print("���� �� �̸� �Է� : ");
		int sw = 0;
		String deleteName = scan.next();
		
		Iterator<SungJukDTO> it = list.iterator();
		
		while(it.hasNext()) {
			SungJukDTO dto = it.next();
			
			if (dto.getName().equals(deleteName)) {
				it.remove(); //it.next()�� ��ȯ�� ���� �����.
				sw++;
		}
		
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getName().equals(deleteName)) {
//				list.remove(i);
//				i -= 1;
//				sw = 1;
//			}
//		}
	}
		if (sw == 0) {
			System.out.println("��ġ�ϴ� �̸��� �����ϴ�.");
		} else {
			System.out.println(sw + "���� �����͸� �����Ͽ����ϴ�.");
		}
	}

	public void sortArticle() {
		int num;
		while (true) {
			System.out.println("1. �̸����� ��������");
			System.out.println("2. �������� ��������");
			System.out.println("3. ���� �޴�");
			System.out.print("  ��ȣ �Է� :");

			num = scan.nextInt();

			if (num == 1) { //�̹� �������� ������ ���� �� ���ο� �������� �������ϰ��� �Ҷ� comparator ���
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
					@Override
					public int compare(SungJukDTO dto1, SungJukDTO dto2) {
						return dto1.getName().compareTo(dto2.getName());
					}
				};
				Collections.sort(list,  com);
				printArticle();
				
			} else if (num == 2) {
				Collections.sort(list);
				printArticle();
			} else if (num == 3) {
				break;
			} else {
				System.out.println("��ȣ�� �߸� �Է��߽��ϴ�.");
			}
		}
	}
}
