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

//1. ó���� 0�� ������ 0�� ���δ�.
//.�� ������ 0�� ������ 0�� �߰��ȴ�.
//�տ� ��ȿ���ڰ� ������ 0�� �߰��ȴ�.

//2. .�� ������ ���̻� .�� �߰��Ǹ� �ȵȴ�.

//3. ���̻� ���� �� �� ������ 0���� ���������� �ȴ�.

//4. �����ڸ� ������ �������� inputL�� �����ְ� �����ڸ� ������ dispL�� ǥ���Ѵ�.

//5. = �� �ö󰡰��ϰ� �� ���� inputL�� �ߵ��� ���� 

//StringBuffer inputBuf = "2222"�̷������� ���۸� ����Ͽ� �ؾ���.
//inputL.setText(inputBuf)

public class Calculator extends Frame implements ActionListener{
	
	private int x = 20;
	private int y = 373;
	private JButton[] b = new JButton[18];
	private JLabel dispL, inputL;
	private StringBuffer dispBuf, inputBuf;
	private double result;
	private int op=0;
	
//result - ó���� ���� �� �Ǵ� �߰� ���
//op - ������
	
//result op
// 5     0
// 9	 +
//63	 *
//		 -
//1. op�� �����ڰ� 0�̸� result�� ���� �ִ´�.
//2. �����ڸ� op�� �ִ´�.
//3. op�� 0�� �ƴϸ� ���� ������ �Ͽ� ����� result�� �ִ´�.
//4. �����ڸ� op�� �ִ´�
//3���� 4���� �ݺ�
	public Calculator() {

		setLayout(null);
		
		dispL = new JLabel("", JLabel.RIGHT);
		inputL = new JLabel("0", JLabel.RIGHT);
		
		dispBuf = new StringBuffer();
		inputBuf = new StringBuffer("0");
		
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

		
		setBounds(950, 300, 250, 435);
		setVisible(true);
		setTitle("����");
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
		//����
		String pushB = e.getActionCommand();
		if(pushB=="1"||
		   pushB=="2"||
		   pushB=="3"||
		   pushB=="4"||
		   pushB=="5"||
		   pushB=="6"||
		   pushB=="7"||
		   pushB=="8"||
		   pushB=="9"||
		   pushB=="0") {
		 if(inputBuf.toString().equals("0")) inputBuf.delete(0,1);
			inputBuf.append(pushB);
			inputL.setText(inputBuf+"");
			
		} else if(pushB=="BackSpace") {
			inputBuf.delete(inputBuf.length()-1, inputBuf.length());
			if(inputBuf.length()==0) inputBuf.append("0");
			inputL.setText(inputBuf+"");
			
		} else if(pushB=="C") {
			dispBuf.delete(0, dispBuf.length());
			inputBuf.delete(0, inputBuf.length());
			inputBuf.append("0");
			
			dispL.setText("");
			inputL.setText("0");
			op=0;
			
		} else if(pushB==".") {
			if(inputBuf.indexOf(".")==-1) inputBuf.append(".");
			inputL.setText(inputBuf+"");
		} else if(pushB=="+"|| pushB=="-"|| pushB=="*" ||pushB=="/") {
			if(op==0) {
				result = Double.parseDouble(inputBuf.toString());
				op = pushB.charAt(0);
				inputBuf.append(pushB);
				dispL.setText(inputBuf+"");
				System.out.println(result);
				
				inputBuf.delete(0, inputBuf.length());
				inputBuf.append("0");
				inputL.setText("0");
			} else {
				if(op=='+') {
					result = (double)result + Double.parseDouble(inputBuf.toString());
					op = pushB.charAt(0);
					inputBuf.append(pushB);
					dispL.setText(dispL.getText() + inputBuf+"");
					System.out.println(result);
					
					inputBuf.delete(0, inputBuf.length());
					inputBuf.append("0");
					inputL.setText("0");
				} else if(op=='-') {
					result = (double)result - Double.parseDouble(inputBuf.toString());
					op = pushB.charAt(0);
					inputBuf.append(pushB);
					dispL.setText(dispL.getText() + inputBuf+"");
					System.out.println(result);
					
					inputBuf.delete(0, inputBuf.length());
					inputBuf.append("0");
					inputL.setText("0");
				} else if(op=='*') {
					result = (double)result * Double.parseDouble(inputBuf.toString());
					op = pushB.charAt(0);
					inputBuf.append(pushB);
					dispL.setText(dispL.getText() + inputBuf+"");
					System.out.println(result);
					
					inputBuf.delete(0, inputBuf.length());
					inputBuf.append("0");
					inputL.setText("0");
				} else if(op=='/') {
					result = (double)result / Double.parseDouble(inputBuf.toString());
					op = pushB.charAt(0);
					inputBuf.append(pushB);
					dispL.setText(dispL.getText() + inputBuf+"");
					System.out.println(result);
					
					inputBuf.delete(0, inputBuf.length());
					inputBuf.append("0");
					inputL.setText("0");
				}
			}
			
		}	else if(pushB=="=") {
			if(op=='+') {
				result = (double)result + Double.parseDouble(inputBuf.toString());
				op = 0;
				inputBuf.append(pushB);
				dispL.setText(dispL.getText() + inputBuf+"");
				System.out.println(result);
				
				inputBuf.delete(0, inputBuf.length());
				inputBuf.append("0");
				inputL.setText(String.format("%.2f", result));
			} else if(op=='-') {
				result = (double)result - Double.parseDouble(inputBuf.toString());
				op = 0;
				inputBuf.append(pushB);
				dispL.setText(dispL.getText() + inputBuf+"");
				System.out.println(result);
				
				inputBuf.delete(0, inputBuf.length());
				inputBuf.append("0");
				inputL.setText(String.format("%.2f", result));
			} else if(op=='*') {
				result = (double)result * Double.parseDouble(inputBuf.toString());
				op = 0;
				inputBuf.append(pushB);
				dispL.setText(dispL.getText() + inputBuf+"");
				System.out.println(result);
				
				inputBuf.delete(0, inputBuf.length());
				inputBuf.append("0");
				inputL.setText(String.format("%.2f", result));
			} else if(op=='/') {
				result = (double)result / Double.parseDouble(inputBuf.toString());
				op = 0;
				inputBuf.append(pushB);
				dispL.setText(dispL.getText() + inputBuf+"");
				System.out.println(result);
				
				inputBuf.delete(0, inputBuf.length());
				inputBuf.append("0");
				inputL.setText(String.format("%.2f", result));
			}
		}
		
//		if(op==0) {
//			result = Integer.parseInt(inputL.toString());
//			op = Integer.parseInt(pushB);
//		}
		
	}
}





/*
 * else if(pushB=="+") {
			if(op==0) {
				result = (double)Integer.parseInt(inputBuf.toString());
				op = '+';
				dispL.setText(inputBuf.toString()+"");
				inputBuf.delete(0, inputBuf.length());
				inputBuf.append("0");
				inputL.setText("0");
				System.out.println(result);
				
			} else {
				result = result + op + Integer.parseInt(inputBuf.toString());
				op = '+';
				dispL.setText(dispL.getText() + op + inputBuf.toString()+"");
				inputBuf.delete(0, inputBuf.length());
				inputBuf.append("0");
				inputL.setText("0");
				System.out.println(result);
			}
		} else if(pushB=="-") {
			if(op==0) {
				result = (double)Integer.parseInt(inputBuf.toString());
				op = '-';
				dispL.setText(inputBuf.toString()+"");
				inputBuf.delete(0, inputBuf.length());
				inputBuf.append("0");
				inputL.setText("0");
				System.out.println(result);
				
			} else {
				result = result - Integer.parseInt(inputBuf.toString());
				op = '-';
				dispL.setText(dispL.getText() + op + inputBuf.toString()+"");
				inputBuf.delete(0, inputBuf.length());
				inputBuf.append("0");
				inputL.setText("0");
				System.out.println(result);
			}
 */
