package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//*interface
//1. implements : 모든 추상메소드를 override
//2. 익명 클래스 : 모든 추상메소드를 override
//3. 
//4. 메소드

public class CollectionTest {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		
		Collection coll = new ArrayList();
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이"); //중복허용, 순서
		coll.add(25);
		coll.add(43.8);
		coll.add("기린");
		coll.add("코끼리");
		
		Iterator it = coll.iterator();
		//it.hasNext() 항목 T/F 현재 위치에 항목이 있느냐 없느냐 / 다음으로 이동
		//it.next() 현재 위치의 항목을 꺼내고 다음으로 이동
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
