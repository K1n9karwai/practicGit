package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStream {

	
	public static void main(String[] args) throws IOException {
	
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		int data;
		data = bis.read(); //ù �ѱ��ڸ��� �������ְ�, ������ �о���Ѵ�, �������� ������ -1
		while((data = bis.read()) != -1) {
			System.out.print((char)data); //���ʹ� �ι���Ʈ�� ó���ϸ�
									//�ΰ��� ����� ���� \r\n ������ ���� ��ĭ ������
									//�̰��� int������ ��Ÿ�� ���� 1310
		}
		bis.close(); 
	}
}
