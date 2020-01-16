package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 				 DataOutputStr
//               BufferedOuputStream           FileOutputStrema
//DataStream.java -------------------> buffer -------------------> result.txt


public class DataStream {

	public static void main(String[] args) throws IOException {
		//DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt"));
		
		File file = new File("result.txt"); //이때부터 빈 파일은 생성된다.
		FileOutputStream fos = new FileOutputStream(file); // 파일부터 버퍼까지의 길닦기
		DataOutputStream dos = new DataOutputStream(fos); // 다시 버퍼에서 파일에 넣을 데이터를 만드는 자바파일까지의 길닦기
		
		dos.writeUTF("홍길동");
		dos.writeInt(25);
		dos.writeFloat(185.3f);
		
		dos.close();
		
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		System.out.println("이름 = " + dis.readUTF());
		System.out.println("나이 = " + dis.readInt());
		System.out.println(("키 = " + dis.readFloat()));
		dos.close();
	}
}
