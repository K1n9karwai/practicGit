package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//*interface
//1. implements : ��� �߻�޼ҵ带 override
//2. �͸� Ŭ���� : ��� �߻�޼ҵ带 override
//3. 
//4. �޼ҵ�

public class CollectionTest {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		
		Collection coll = new ArrayList();
		coll.add("ȣ����");
		coll.add("����");
		coll.add("ȣ����"); //�ߺ����, ����
		coll.add(25);
		coll.add(43.8);
		coll.add("�⸰");
		coll.add("�ڳ���");
		
		Iterator it = coll.iterator();
		//it.hasNext() �׸� T/F ���� ��ġ�� �׸��� �ִ��� ������ / �������� �̵�
		//it.next() ���� ��ġ�� �׸��� ������ �������� �̵�
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
