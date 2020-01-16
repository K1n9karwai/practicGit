package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ProtocolClient {
	private Socket socket;
	private BufferedReader br;
	private BufferedWriter bw;
	private BufferedReader keyboard;
	
	public ProtocolClient() {
		try {
			socket = new Socket("192.168.0.5", 9500);
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			keyboard = new BufferedReader(new InputStreamReader(System.in));
		
			
		} catch (UnknownHostException e) {
			System.out.println("서버를 찾을 수 없습니다.");
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			System.out.println("서버와 연결이 안되었습니다.");
			e.printStackTrace();
			System.exit(0);
		}
		
		String msg, line;
		while(true) {
			try {
				//서버로 보내는 쪽
				/*
				 * "100:angel"
				 * "200:angel"
				 * "300:angel:안녕"
				 */
				msg = keyboard.readLine();
				bw.write(msg+"\n");
				bw.flush(); // 버퍼 비우기
				
				//서버로 부터 받는 쪽
				/*
				 * angel님 입장
				 * angel님 퇴장
				 * [angel] 안녕
				 */
				
				line = br.readLine();
				System.out.println(line);
				
				String[] ar = msg.split(":");
				if(ar[0].equals("200")) {
					br.close();
					bw.close();
					socket.close();
					
					keyboard.close();
					
					System.exit(0);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	
		}//while 원래는 다른 메소드로 뺴야하는 부분, 이번 수업에서는 같이 진행한다.
	}

	
	public static void main(String[] args) {
		
		new ProtocolClient();
	}
}
