package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

//18k ���� ���� / ��ҹ��� ������� ���
//http://www.liebli.com/goods/goods_list.php?cateCd=001002&sort=&pageNum=100
public class URLTest2 {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.liebli.com/goods/goods_list.php?cateCd=001002&sort=&pageNum=100");
		System.out.println("�������� : " + url.getProtocol());
		System.out.println("ȣ��Ʈ : " + url.getHost());
		System.out.println("��Ʈ : " + url.getPort());
		System.out.println("�⺻ ��Ʈ : " + url.getDefaultPort());
		System.out.println("���� : " + url.getFile());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		
		String line = null;
		
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
		
		line.
		
	}
}
