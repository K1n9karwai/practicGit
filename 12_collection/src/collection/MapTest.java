package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("book101", "백설공주");
		map.put("book201", "인어공주");
		map.put("book102", "백설공주");//Value 중복허용
		map.put("book301", "피오나");
		map.put("book101", "엄지공주");//Key 중복허용 덮어 씌워짐
		
		//System.out.println(map.get("book101"));
		Scanner scan = new Scanner(System.in);
		System.out.print("코드 입력 : ");
		String key = scan.next();
		
		if(map.containsKey(key)) {
			System.out.println(map.get(key));
		} else {
			System.out.println("없는 key 입니다.");
		}
		
//		if(map.get(key)!=null) {
//			System.out.println(map.get(key));
//		} else {
//			System.out.println("없는 key 입니다.");
//		}
		
	}
}
