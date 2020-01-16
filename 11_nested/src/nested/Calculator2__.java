package nested;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Calculator2__ {
	
	private int x = 20;
	private int y = 373;
	private JButton[] b = new JButton[18];
	private StringBuffer inputBuf = new StringBuffer();
	private JLabel dispL, inputL;
	private double total, firstNum, secondNum = 0;
	private String cal=null;
	
	public Calculator2__() {

		setLayout(null);
		
		dispL = new JLabel("", JLabel.RIGHT);
		inputL = new JLabel("", JLabel.RIGHT);
		
		String[] title = { ".", "0", "=", "+", "1", "2", "3",
							"-", "4", "5", "6", "*", "7", "8",
							"9", "/", "BackSpace", "C" };

		for (int i = 1; i <= b.length; i++) {

			if (i < 17) {
				b[i - 1] = new JButton(title[i - 1]);
				add(b[i - 1], title[i - 1]);
				b[i - 1].setBounds(x, y, 45, 45);
				x += 55;

				if (i % 4 == 0) {
					y -= 55;
					x = 20;
				}
			} else {
				b[i - 1] = new JButton(title[i - 1]);
				add(b[i - 1], title[i - 1]);
				b[i - 1].setBounds(x, y, 100, 45);
				x = 130;
			}
		}
		
		System.out.println("*******"+ b[1].getText() +" ********");
//		inputBuf.append(b[1].getText());
//		System.out.println(inputBuf);
		
		inputL.setBounds(20, 98, 210, 45);
		inputL.setBackground(Color.WHITE);
		inputL.setOpaque(true);
		add(inputL);
		
		dispL.setBounds(20, 43, 210, 45);
		dispL.setBackground(Color.WHITE);
		dispL.setOpaque(true);
		add(dispL);

		
		setBounds(700, 400, 250, 435);
		setVisible(true);
		setTitle("계산기");
		setBackground(new Color(110,115,115));
		setResizable(false);

//		b[0].setBounds(20, 288, 45, 45);

		for(int i=0; i<b.length; i++) {
			b[i].addActionListener(this);
		}
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}

	public static void main(String[] args) {

		new Calculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		for(int i=0; i<b.length; i++) {
			
			if(e.getSource()==b[i]) {
				//기존 입력값 및 현재 입력값 모두 0일때
				if(inputL.getText().equals("0")&&b[i].getText().equals("0")) {
					//inputL.setText("0");
					//System.out.println("들어왔다");
					
					
				} else { //그 외의 것들 계산 시작
				
					//기존의 값이 0이고 현재 입력된 값이 .일 경우 0. 출력
					if(inputL.getText().equals("0") && b[i].getText().equals(".")) {
					
						inputBuf.append(b[i].getText());
						inputL.setText(inputBuf.toString());  
						
						
					} else if (inputL.getText().equals("0")) {//
						 
						 if(b[i].getText().equals("+") || b[i].getText().equals("-") || b[i].getText().equals("*") || b[i].getText().equals("/") || b[i].getText().equals("=") || b[i].getText().equals("C") || b[i].getText().equals("BackSpace")) {
							 
						 } else {
						
						inputBuf.delete(0, 1);
						inputBuf.append(b[i].getText());
						inputL.setText(inputBuf.toString());
						 }
						 
					} else if (inputL.getText()=="" && dispL.getText()=="") {
						if(b[i].getText().equals("+") || b[i].getText().equals("-") || b[i].getText().equals("*") || b[i].getText().equals("/") || b[i].getText().equals("=") || b[i].getText().equals("C") || b[i].getText().equals("BackSpace")) {
							System.out.println("넣지마");
						} else if (b[i].getText()==".") {
							inputBuf.append(0);
							inputBuf.append(b[i].getText());
							inputL.setText(inputBuf.toString());
						} else if (b[i].getText()=="0") {
							inputBuf.append(b[i].getText());
							inputL.setText(inputBuf.toString());
						} else {
							inputBuf.append(b[i].getText());
							inputL.setText(inputBuf.toString());
						}
						
						
					} else if (b[i].getText().equals("+") || b[i].getText().equals("-") || b[i].getText().equals("*") || b[i].getText().equals("/")||b[i].getText().equals("=")) {
						
						
						if(dispL.getText()=="") {
							firstNum = (double)Integer.parseInt(inputBuf.toString());
							System.out.println(firstNum);
							cal = b[i].getText();
							System.out.println("0이라 들어왔");
							dispL.setText(inputBuf.toString() + b[i].getText());
							inputL.setText("");
							inputBuf.delete(0, inputBuf.length());
							
						} else if(firstNum!=0){
							secondNum = (double)Integer.parseInt(inputBuf.toString());
							System.out.println("영아니라 드와서");
							if(cal=="+") {
								total = firstNum + secondNum;
								System.out.println("더하기");
							} else if(cal=="-") {
								total = firstNum - secondNum;
							} else if(cal=="*") {
								total = firstNum * secondNum;
							} else if(cal=="/") {
								total = firstNum / secondNum;
							}
							
							cal = b[i].getText();
							
							dispL.setText(dispL.getText() + inputBuf.toString() + b[i].getText());
							inputL.setText("");
							inputBuf.delete(0, inputBuf.length());
							secondNum = 0;
							firstNum = 0;
							
						} else if(firstNum==0) {
							secondNum = (double)Integer.parseInt(inputBuf.toString());
							
							if(cal=="+") {
								total = total + secondNum;
							} else if(cal=="-") {
								total = total - secondNum;
							} else if(cal=="*") {
								total = total * secondNum;
							} else if(cal=="/") {
								total = total / secondNum;
							}
							
							cal = b[i].getText();
							
							dispL.setText(dispL.getText() + inputBuf.toString() + b[i].getText());
							inputL.setText("");
							inputBuf.delete(0, inputBuf.length());
							secondNum = 0;
						} //else if(b[i].getText()=="=") {
						
						
						inputBuf.delete(0, inputBuf.length());
						//System.out.println(total);
						inputBuf.append(total);
						System.out.println(inputBuf.toString());
						inputL.setText(inputBuf.toString());
						inputBuf.delete(0, inputBuf.length());
						//}
						
						
					} else if (b[i].getText().equals("C")) {
						dispL.setText("");
						inputL.setText("");
						inputBuf.delete(0, inputBuf.length());
						
						
					} else if (b[i].getText().equals("BackSpace")) {
						if(inputBuf.length()<0 && inputL.getText()=="") {
							System.out.println("숫자가 없습니다.");
						} else {
						inputBuf.delete(inputBuf.length()-1,inputBuf.length());
						inputL.setText(inputBuf.toString());
						}

					} else if (b[i].getText().equals("=")) {
						System.out.println("들어왔다");
						dispL.setText(dispL.getText() + inputBuf.toString() + b[i].getText());
						inputBuf.delete(0, inputBuf.length());
						System.out.println(total);
						inputBuf.append(total);
						System.out.println(inputBuf.toString());
						inputL.setText(inputBuf.toString());
						inputBuf.delete(0, inputBuf.length());
					} else if(b[i].getText().equals(".")) {
						int cnt=0;
						for(int j=0; j<inputL.getText().length(); j++) {
							if(inputBuf.toString().contains(".")) {
								cnt = 1;
							} else {
								cnt = 0;
							}
						}
						
						if(cnt==0) {
							inputBuf.append(b[i].getText());
							inputL.setText(inputBuf.toString());
						} else {
							System.out.println(". 이 이미 있음");
						}
					}
 					else {
						inputBuf.append(b[i].getText());
						System.out.println(inputBuf);
						inputL.setText(inputBuf.toString());
					}
				}
		}
//			if(inputBuf.toString().contains("+") || inputBuf.toString().contains("-") || inputBuf.toString().contains("*") || inputBuf.toString().contains("/")) {
//				inputBuf.delete(inputBuf.length()-1,inputBuf.length());
//				dispL.setText(dispL + inputBuf.toString());
//				inputL.setText(""); 
//			}
	}

	}
}


}
