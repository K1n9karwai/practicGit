package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		//Collection coll = new ArrayList();
		set.add("호랑이");
		set.add("사자");
		set.add("호랑이"); // 중복허용 X , 순서 X
		set.add("기린");
		set.add("코끼리");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
