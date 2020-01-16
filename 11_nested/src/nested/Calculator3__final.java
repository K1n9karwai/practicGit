package nested;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator3__final extends Frame implements ActionListener {

	private int x = 20;
	private int y = 373;
	private JButton[] b = new JButton[18];
	private JLabel dispL, inputL;
	private StringBuffer dispBuf, inputBuf;
	private double result;
	private int op;
	private boolean opCheck;
	private DecimalFormat df = new DecimalFormat("#.#######");

	public Calculator3__final() {

		setLayout(null);


		dispL = new JLabel("", JLabel.RIGHT);
		inputL = new JLabel("0", JLabel.RIGHT);

		dispBuf = new StringBuffer();
		inputBuf = new StringBuffer("0");

		String[] title = { ".", "0", "=", "+", "1", "2", "3", "-", "4", "5", "6", "*", "7", "8", "9", "/", "BackSpace",
				"C" };

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

		Container c = new this.
		
		inputL.setBounds(20, 98, 210, 45);
		inputL.setBackground(Color.WHITE);
		inputL.setOpaque(true);
		inputL.setFont(new Font("Arial", Font.BOLD, 15));
		c.add(inputL);

		dispL.setBounds(20, 43, 210, 45);
		dispL.setBackground(Color.WHITE);
		dispL.setOpaque(true);
		dispL.setFont(new Font("Arial", Font.BOLD, 15));
		c.add(dispL);

		setBounds(950, 300, 250, 435);
		setVisible(true);
		setTitle("계산기");
		setBackground(new Color(110, 115, 115));
		setResizable(false);

//			b[0].setBounds(20, 288, 45, 45);

		for (int i = 0; i < b.length; i++) {
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

		new Calculator3__final();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 숫자
		String pushB = e.getActionCommand();
		if (pushB == "1" || pushB == "2" || pushB == "3" || pushB == "4" || pushB == "5" || pushB == "6" || pushB == "7"
				|| pushB == "8" || pushB == "9" || pushB == "0") {
			if (inputBuf.toString().equals("0"))
				inputBuf.delete(0, 1);
			inputBuf.append(pushB);
			inputL.setText(inputBuf + "");

			opCheck = false;

		} else if (pushB == "BackSpace") {
			inputBuf.delete(inputBuf.length() - 1, inputBuf.length());
			if (inputBuf.length() == 0)
				inputBuf.append("0");
			inputL.setText(inputBuf + "");

		} else if (pushB == "C") {
			dispBuf.delete(0, dispBuf.length());
			inputBuf.delete(0, inputBuf.length());
			inputBuf.append("0");

			dispL.setText("");
			inputL.setText("0");

			result = 0;
			op = 0;
			opCheck = false;

		} else if (pushB == ".") {
			if (inputBuf.indexOf(".") == -1)
				inputBuf.append(".");
			inputL.setText(inputBuf + "");

		} else if (pushB == "+") {
			if (!opCheck) {
				calc();// 계산

				dispBuf.append(inputBuf + " + ");
				op = '+';

				dispL.setText(dispBuf + "");
				inputL.setText(df.format(result));
				inputBuf.delete(0, inputBuf.length());

				opCheck = true;
			}

		} else if (pushB == "-") {
			if (!opCheck) {
				calc();// 계산

				dispBuf.append(inputBuf + " - ");
				op = '-';

				dispL.setText(dispBuf + "");
				inputL.setText(df.format(result));
				inputBuf.delete(0, inputBuf.length());

				opCheck = true;
			}

		} else if (pushB == "*") {
			if (!opCheck) {
				calc();// 계산

				dispBuf.append(inputBuf + " * ");
				op = '*';

				dispL.setText(dispBuf + "");
				inputL.setText(df.format(result));
				inputBuf.delete(0, inputBuf.length());

				opCheck = true;
			}

		} else if (pushB == "/") {
			if (!opCheck) {
				calc();// 계산

				dispBuf.append(inputBuf + " / ");
				op = '/';

				dispL.setText(dispBuf + "");
				inputL.setText(df.format(result));
				inputBuf.delete(0, inputBuf.length());

				opCheck = true;
			}
		} else if (pushB == "=") {
			if (!opCheck) {

				calc(); // 계산

				dispBuf.append(inputBuf + " = ");
				dispL.setText(dispBuf + "");
				inputL.setText(df.format(result));

				dispBuf.delete(0, dispBuf.length());
				inputBuf.delete(0, inputBuf.length());

				op = 0;
				opCheck = false;
			}
		}
	}

	public void calc() {
		if (op == 0)
			result = Double.parseDouble(inputBuf + "");
		else if (op == '+')
			result += Double.parseDouble(inputBuf + "");
		else if (op == '-')
			result -= Double.parseDouble(inputBuf + "");
		else if (op == '*')
			result *= Double.parseDouble(inputBuf + "");
		else if (op == '/')
			result /= Double.parseDouble(inputBuf + "");

	}
}
