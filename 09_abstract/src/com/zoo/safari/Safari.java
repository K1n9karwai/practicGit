package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo {
	
	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		zoo.tiger();
//		zoo.giraffe(); 부모클래스는 자식클래스가 있는지 여부를 알지 못하기 때문에 실행하지 못한다
//		zoo.elephant(); 
//		zoo.lion();
		
		Safari safari = new Safari();
		safari.tiger();
		safari.giraffe();
//		safari.elephant(); 아래쪽과 같이 자식클래스를 형성해줘야 인식할 수 있음 
//		safari.lion();
	}

}
