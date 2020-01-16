package class_2;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {

		String str = "학원,집,,게임방";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		System.out.println("토큰 개수 = " + st.countTokens());
		
		//먼저는 t/f 토큰이 있다/없다를 구분한 뒤 토큰을 꺼내고 다음으로 이동
		//true/false로 구분되기 때문에 반복문 시에 while이 더 유용
		while(st.hasMoreTokens()) { // 토큰이 있다 / 없다
			System.out.println(st.nextToken()); // 토큰을 꺼내고 다음으로 이동
		}
		System.out.println("--------------------------");
		
		String[] ar = str.split(",");
		for(String data : ar) { 
			System.out.println(data);
		}
	}
}
