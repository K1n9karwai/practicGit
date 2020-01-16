package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonMain {
	
	public ArrayList<PersonDTO> init() {
		
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("코난", 42);
		PersonDTO cc = new PersonDTO("또치", 33);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		
		list.add(aa); //데이터가 담기는 것이 아닌 주소값을 담는 것이다.
		list.add(bb);
		list.add(cc);
		
		return list; //위와 마찬가지 개념으로 데이터가 아닌 주소값을 넘겨준다.
	}
	
	public static void main(String[] args) {
		
		PersonMain pm = new PersonMain();
		
		ArrayList<PersonDTO> list = pm.init(); //return에서 날린 list의 주소값을 바라봄
		for(int i=0; i<list.size(); i++) {
			System.out.println("이름 = " + list.get(i).getName() + "  나이 = " + list.get(i).getAge());
		}
		System.out.println("-------------------------");
		
		for(PersonDTO dto : list) {
//			System.out.println("이름 = " + data.getName() + "\t 나이 = " + data.getAge());
			System.out.println(dto);
		}
		System.out.println("-----------ddd----------------");
		
		Iterator<PersonDTO> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	} 
}
