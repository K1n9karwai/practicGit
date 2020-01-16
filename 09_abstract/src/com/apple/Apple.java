package com.apple;

import com.zoo.Zoo;

public class Apple {

	public static void main(String[] args) {
		
		System.out.println("빨간 사과");
		
		Zoo zoo = new Zoo(); // static이 아니기에 생성부터 들어가야함.
		
		zoo.tiger();
//		zoo.giraffe(); 접근제한자에 의해 아래 세가지 메소드는 실행 불가능함.
//		zoo.elephant();
//		zoo.lion();
		
	}
}
