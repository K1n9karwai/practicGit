package network;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ChatClient extends JFrame {
	private JTextArea output;
	private JTextField input;
	private JButton send;
	
	public ChatClient() {
		
		output = new JTextArea();
		JScrollPane scroll = new JScrollPane(output);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		output.setEditable(false);
		
		input = new JTextField();
		send = new JButton("전송");
		
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());
		jp.add("Center", input);
		jp.add("East", send);

		Container con = this.getContentPane();
		
		con.add("Center", scroll);
		con.add("South", jp);
		
		setBounds(800,200,400,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public void service() {
		String serverIP = JOptionPane.showInputDialog(this, "서버 IP를 입력하세요.", "192.168.0.5");
		if(serverIP==null || serverIP.length()==0) {
			System.out.println("서버 IP가 입력되지 않았습니다.");
			System.exit(0);
		}
		
		String nickName = JOptionPane.showInputDialog(this, "닉네임을 입력하세요.", "닉네임",
				JOptionPane.INFORMATION_MESSAGE);
		if(nickName==null || nickName.length()==0) {
			nickName = "guest";
		}
		System.out.println(nickName);
	}
	public static void main(String[] args) {
		new ChatClient().service();
	}

}
