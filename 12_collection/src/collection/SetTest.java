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
		set.add("ȣ����");
		set.add("����");
		set.add("ȣ����"); // �ߺ���� X , ���� X
		set.add("�⸰");
		set.add("�ڳ���");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
