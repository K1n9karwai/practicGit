package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

//18k 개수 세기 / 대소문자 상관없이 모두
//http://www.liebli.com/goods/goods_list.php?cateCd=001002&sort=&pageNum=100
public class URLTest2 {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.liebli.com/goods/goods_list.php?cateCd=001002&sort=&pageNum=100");
		System.out.println("프로토콜 : " + url.getProtocol());
		System.out.println("호스트 : " + url.getHost());
		System.out.println("포트 : " + url.getPort());
		System.out.println("기본 포트 : " + url.getDefaultPort());
		System.out.println("파일 : " + url.getFile());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		
		String line = null;
		
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
		
		line.
		
	}
}
