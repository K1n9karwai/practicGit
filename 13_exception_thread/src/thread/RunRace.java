package thread;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

import javax.swing.JButton;

public class RunRace extends Frame implements ActionListener {
	private int count;
	private String[] name;
	private JButton btn;
	private Button btn2;
	private Racer[] racer = new Racer[count];//배열만 생성한 단계, 클래스는 아직 생성하지 않음.
	
	public RunRace(int count, String[] name) {
		
		
		this.count = count;
		this.name = name;
		//btn = new JButton("출발");
		btn2 = new Button(" 출바알~ ");
		
		//btn.setBounds(420, 450, 70, 40);
		
		setTitle("경마공원");
		setBounds(800, 300, 600, 500);
		setResizable(false);
		setVisible(true);
		
		Panel p = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p.add(btn2);
		add("South", p);
		
		Panel p2 = new Panel(new GridLayout(count,1));
		add("Center", p2);
		
		racer = new Racer[count];
		for(int i=0; i<count; i++) {
			racer[i] = new Racer(name[i]); //Canvas 생성
			p2.add(racer[i]);
		}
		
		
		//add(btn);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		btn2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		btn2.setEnabled(false);
		
		Thread[] t = new Thread[count];
	
		for(int i=0; i<count; i++) {
			t[i] = new Thread(racer[i]);
			t[i].setPriority((int)Math.random()*10+1);
			t[i].start();
			
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("경주마 수를 입력해주세요 : ");
		int count = scan.nextInt();
		
		String[] name = new String[count];
		
		for(int i=0; i<count; i++) {
			System.out.print((i+1) + "번 경주마의 이름을 입력하세요 : ");
			name[i] = scan.next();
		}
		
		new RunRace(count, name);
	}
}
