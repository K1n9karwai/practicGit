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
		data = bis.read(); //첫 한글자마나 내보내주고, 끝까지 읽어내야한다, 읽을것이 없으면 -1
		while((data = bis.read()) != -1) {
			System.out.print((char)data); //엔터는 두바이트를 처리하며
									//두가지 기능이 존재 \r\n 앞으로 가서 한칸 내려라
									//이것을 int형으로 나타낸 것이 1310
		}
		bis.close(); 
	}
}
