package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo {
	
	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		zoo.tiger();
//		zoo.giraffe(); �θ�Ŭ������ �ڽ�Ŭ������ �ִ��� ���θ� ���� ���ϱ� ������ �������� ���Ѵ�
//		zoo.elephant(); 
//		zoo.lion();
		
		Safari safari = new Safari();
		safari.tiger();
		safari.giraffe();
//		safari.elephant(); �Ʒ��ʰ� ���� �ڽ�Ŭ������ ��������� �ν��� �� ���� 
//		safari.lion();
	}

}
