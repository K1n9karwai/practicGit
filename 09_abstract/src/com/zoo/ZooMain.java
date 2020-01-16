package com.zoo;

public class ZooMain {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		
		zoo.giraffe();
		zoo.tiger();
		zoo.elephant();
//		zoo.lion(); 같은 패키지에 있기에 private 접근 제한자를 가지고 있는 lion메소드를 제외하고 다 실행 가능하다.

		
	}
}
