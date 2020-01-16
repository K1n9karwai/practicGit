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
			System.out.println("   1. 입력");
			System.out.println("   2. 출력");
			System.out.println("   3. 검색");
			System.out.println("   4. 삭제");
			System.out.println("   5. 정렬");
			System.out.println("   6. 끝");
			System.out.println("***************");
			System.out.print("  번호 : ");

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
				System.out.println("1~6중에 선택하세요.");
			}

		}

	}

	public void insertArticle() {
		int num, kor, eng, math;
		String name;

		System.out.print("번호 입력 : ");
		num = scan.nextInt();
		System.out.print("이름 입력 : ");
		name = scan.next();
		System.out.print("국어 입력 : ");
		kor = scan.nextInt();
		System.out.print("영어 입력 : ");
		eng = scan.nextInt();
		System.out.print("수학 입력 : ");
		math = scan.nextInt();

		SungJukDTO sungJuk = new SungJukDTO(num, name, kor, eng, math);

		list.add(sungJuk);
		System.out.println("입력 완료");
	}

	public void printArticle() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");

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

		System.out.print("검색 할 이름을 입력하세요 : ");
		searchName = scan.next();
		
		for(SungJukDTO dto : list) {
			if(dto.getName().equals(searchName)) {
				System.out.println(dto);
				sw++;
			}
		}
		
		if (sw == 0) {
			System.out.println("찾고자 하는 이름이 없습니다.");
		}
		
//		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getName().equals(searchName)) {
//				sw = 1;
//				System.out.println(list.get(i).getNum() + "\t" + list.get(i).getName() + "\t" + list.get(i).getKor()
//						+ "\t" + list.get(i).getEng() + "\t" + list.get(i).getMath() + "\t" + list.get(i).getTot()
//						+ "\t" + list.get(i).getAve());
//			}
//		}
//		if (sw == 0) {
//			System.out.println("찾고자 하는 이름이 없습니다.");
//		}
	}

	public void deleteArticle() {
		System.out.print("삭제 할 이름 입력 : ");
		int sw = 0;
		String deleteName = scan.next();
		
		Iterator<SungJukDTO> it = list.iterator();
		
		while(it.hasNext()) {
			SungJukDTO dto = it.next();
			
			if (dto.getName().equals(deleteName)) {
				it.remove(); //it.next()가 반환한 값을 지운다.
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
			System.out.println("일치하는 이름이 없습니다.");
		} else {
			System.out.println(sw + "개의 데이터를 삭제하였습니다.");
		}
	}

	public void sortArticle() {
		int num;
		while (true) {
			System.out.println("1. 이름으로 오름차순");
			System.out.println("2. 총점으로 내림차순");
			System.out.println("3. 이전 메뉴");
			System.out.print("  번호 입력 :");

			num = scan.nextInt();

			if (num == 1) { //이미 기준점을 가지고 있을 때 새로운 기준점을 재정의하고자 할때 comparator 사용
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
				System.out.println("번호를 잘못 입력했습니다.");
			}
		}
	}
}
