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
		
		File file = new File("result.txt"); //�̶����� �� ������ �����ȴ�.
		FileOutputStream fos = new FileOutputStream(file); // ���Ϻ��� ���۱����� ��۱�
		DataOutputStream dos = new DataOutputStream(fos); // �ٽ� ���ۿ��� ���Ͽ� ���� �����͸� ����� �ڹ����ϱ����� ��۱�
		
		dos.writeUTF("ȫ�浿");
		dos.writeInt(25);
		dos.writeFloat(185.3f);
		
		dos.close();
		
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		System.out.println("�̸� = " + dis.readUTF());
		System.out.println("���� = " + dis.readInt());
		System.out.println(("Ű = " + dis.readFloat()));
		dos.close();
	}
}
