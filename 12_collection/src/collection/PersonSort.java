package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {
	
	public static void main(String[] args) {
		String[] ar = {"orange", "apple", "banana", "pear", "peach", "applemango"};
		
		
		
		
		System.out.print("정렬 전 = ");
		for(String data : ar) {
			System.out.print(data + "  ");
		}
		System.out.println();
		
		Arrays.sort(ar);//string 클래스에는 이미 컴페어 함수가 있기에 정렬 가능
		System.out.print("정렬 후 = ");
		for(String data : ar) {
			System.out.print(data + "  ");

		}
		
		System.out.println();
		
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("코난", 40);
		PersonDTO cc = new PersonDTO("또치", 16);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa); //데이터가 담기는 것이 아닌 주소값을 담는 것이다.
		list.add(bb);
		list.add(cc);
		System.out.println("정렬 전 = " + list);
		Collections.sort(list);
		System.out.println("정렬 후 = " + list);
		System.out.println();
		
		//정렬기준을 이름으로 새롭게 변경
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {

			@Override
			public int compare(PersonDTO dto1, PersonDTO dto2) {
				//return dto1.getName().compareTo(dto2.getName()); - 오름차순
				
				//내림차순
				//return dto2.getName().compareTo(dto1.getName());
				return dto1.getName().compareTo(dto2.getName()) * -1;
			}
			
		};
		System.out.println("이름으로 새롭게 변경");
		Collections.sort(list, com);
		System.out.println(list);
	}
}
