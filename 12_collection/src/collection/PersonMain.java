package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonMain {
	
	public ArrayList<PersonDTO> init() {
		
		PersonDTO aa = new PersonDTO("ȫ�浿", 25);
		PersonDTO bb = new PersonDTO("�ڳ�", 42);
		PersonDTO cc = new PersonDTO("��ġ", 33);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		
		list.add(aa); //�����Ͱ� ���� ���� �ƴ� �ּҰ��� ��� ���̴�.
		list.add(bb);
		list.add(cc);
		
		return list; //���� �������� �������� �����Ͱ� �ƴ� �ּҰ��� �Ѱ��ش�.
	}
	
	public static void main(String[] args) {
		
		PersonMain pm = new PersonMain();
		
		ArrayList<PersonDTO> list = pm.init(); //return���� ���� list�� �ּҰ��� �ٶ�
		for(int i=0; i<list.size(); i++) {
			System.out.println("�̸� = " + list.get(i).getName() + "  ���� = " + list.get(i).getAge());
		}
		System.out.println("-------------------------");
		
		for(PersonDTO dto : list) {
//			System.out.println("�̸� = " + data.getName() + "\t ���� = " + data.getAge());
			System.out.println(dto);
		}
		System.out.println("-----------ddd----------------");
		
		Iterator<PersonDTO> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	} 
}
