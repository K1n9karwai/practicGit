package io;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ScoreForm extends JFrame implements ActionListener {
	private JLabel hakL, nameL, korL, engL, mathL;
	private JTextField hakT, nameT, korT, engT, mathT;
	private JButton input, print, search, tot_desc, save, load;
	private Score score;

	//private JTextArea output;
	private DefaultTableModel model;
	private JTable table;
	private ArrayList<ScoreDTO> scoreList = new ArrayList<ScoreDTO>();

	//private ScoreImpl scoreI = new ScoreImpl();
	// 내가 한 이 방법도 괜찮지만 스프링에서는 보통 부모로 접근하고 자식으로 생성한다.					

	public ScoreForm() {

		// 라벨
		hakL = new JLabel("학번\n");
		nameL = new JLabel("이름");
		korL = new JLabel("국어");
		engL = new JLabel("영어");
		mathL = new JLabel("수학");

		// 텍스트필드
		hakT = new JTextField("", 27);
		nameT = new JTextField("", 27);
		korT = new JTextField("", 27);
		engT = new JTextField("", 27);
		mathT = new JTextField("", 27);

		// 라벨 및 텍스트필드 패널
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
		panel1.add(hakL);
		panel1.add(hakT);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
		panel2.add(nameL);
		panel2.add(nameT);

		JPanel panel3 = new JPanel();
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
		panel3.add(korL);
		panel3.add(korT);

		JPanel panel4 = new JPanel();
		panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));
		panel4.add(engL);
		panel4.add(engT);

		JPanel panel5 = new JPanel();
		panel5.setLayout(new BoxLayout(panel5, BoxLayout.X_AXIS));
		panel5.add(mathL);
		panel5.add(mathT);

		JPanel panel6 = new JPanel();
		panel6.setLayout(new BoxLayout(panel6, BoxLayout.Y_AXIS));
		panel6.add(panel1);
		panel6.add(Box.createVerticalStrut(50));
		panel6.add(panel2);
		panel6.add(Box.createVerticalStrut(50));
		panel6.add(panel3);
		panel6.add(Box.createVerticalStrut(50));
		panel6.add(panel4);
		panel6.add(Box.createVerticalStrut(50));
		panel6.add(panel5);
		panel6.add(Box.createVerticalStrut(50));

		input = new JButton("입력");
		print = new JButton("출력");
		search = new JButton("학번검색");
		tot_desc = new JButton("순위");
		save = new JButton("파일저장");
		load = new JButton("파일읽기");

		score = new ScoreImpl(); // 접근은 부모가, 생성은 자식이

		JPanel buttonP = new JPanel();
		buttonP.setLayout(new GridLayout());

		buttonP.add(input);
		buttonP.add(print);
		buttonP.add(search);
		buttonP.add(tot_desc);
		buttonP.add(save);
		buttonP.add(load);

//		output = new JTextArea("", 22, 38);
//		JScrollPane scroll = new JScrollPane(output);
//		JPanel areaP = new JPanel();
//		areaP.add(scroll);
		// add(areaP);
		
		table = new JTable();
		JScrollPane scroll = new JScrollPane(table);

		Container con = this.getContentPane();

		con.add("South", buttonP);
		con.add("West", panel6);
		con.add("Center", scroll);

		setTitle("학생관리");
		setBounds(900, 200, 800, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void event() {
		input.addActionListener(this);
		print.addActionListener(this);
		search.addActionListener(this);
		tot_desc.addActionListener(this);
		save.addActionListener(this);
		load.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == input) {

			if (hakT.getText().equals("") || nameT.getText().equals("") || korT.getText().equals("")
					|| engT.getText().equals("") || mathT.getText().equals(""))
				return;
		
			ScoreDTO dto = new ScoreDTO(
					hakT.getText(),
					nameT.getText(),
					Integer.parseInt(korT.getText().trim()),
					Integer.parseInt(engT.getText().trim()),
					Integer.parseInt(mathT.getText().trim()));
			
			dto.calc(); //총점, 평균 계산
			score.input(dto);
			JOptionPane.showMessageDialog(this, "등록완료");
			
			hakT.setText("");
			nameT.setText("");
			korT.setText("");
			engT.setText("");
			mathT.setText("");

		} else if (e.getSource() == print) {
//			score.print(output);
			score.print(table);
		} else if (e.getSource() == search) {
//			score.search(output);
			score.search(table);
		} else if (e.getSource() == tot_desc) {
			score.tot_desc();
//			score.print(output);
			score.print(table);
		} else if (e.getSource() == save) {
			score.save();
		} else if (e.getSource() == load) {
			score.load();
//			score.print(output);
			score.print(table);
		}

	}

}
