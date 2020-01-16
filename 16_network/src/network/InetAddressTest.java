package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) throws UnknownHostException {
		
//		InetAddress naver = new InetAddress(); ������ ��ü�� ���� �������� ���Ѵ�.
		InetAddress naver = InetAddress.getByName("www.naver.com");
		System.out.println("NAVER IP = " + naver.getHostAddress());
		System.out.println();
		
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("LOCALHOST IP = " + local.getHostAddress());
		System.out.println();
		
		InetAddress[] daum = InetAddress.getAllByName("www.daum.net");
		for(InetAddress data : daum) {
			System.out.println("DAUM IP = " + data.getHostAddress());
		}
//		for(int i=0; i<daum.length; i++) {
//			System.out.println("DAUM " + (i+1) +"��° "  +"IP = " + daum[i].getHostAddress());
//		}
		
		System.out.println();
	}
}

