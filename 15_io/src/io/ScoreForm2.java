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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ScoreForm2 extends JFrame implements ActionListener {
	private JLabel hakL, nameL, korL, engL, mathL;
	private JTextField hakT, nameT, korT, engT, mathT;
	private JButton input, print, search, tot_desc, save, load;
	private Score score;
	
	private JTextArea area;
	private ScoreDTO scoreDTO;
	private ArrayList<ScoreDTO> scoreList = new ArrayList<ScoreDTO>();

	private ScoreImpl scoreI = new ScoreImpl();
	
	public ScoreForm2() {
	
		//��
		hakL = new JLabel("�й�\n");
		nameL = new JLabel("�̸�");
		korL = new JLabel("����");
		engL = new JLabel("����");
		mathL = new JLabel("����");
		
		//�ؽ�Ʈ�ʵ�
		hakT = new JTextField("", 27);
		nameT = new JTextField("", 27);
		korT = new JTextField("", 27);
		engT = new JTextField("", 27);
		mathT = new JTextField("", 27);
		
		//�� �� �ؽ�Ʈ�ʵ� �г�
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
		
		input = new JButton("�Է�");
		print = new JButton("���");
		search = new JButton("�й��˻�");
		tot_desc = new JButton("����");
		save = new JButton("��������");
		load = new JButton("�����б�");
		
		JPanel buttonP = new JPanel();
		buttonP.setLayout(new GridLayout());
		
		buttonP.add(input);
		buttonP.add(print);
		buttonP.add(search);
		buttonP.add(tot_desc);
		buttonP.add(save);
		buttonP.add(load);
		
		
		
		area = new JTextArea("", 22, 37);
	//	area.setFont(new Font("���ü", Font.BOLD, 15));
		//area.setBounds(50, 50, 110, 100);
		JPanel areaP = new JPanel();
		areaP.add(area);
		//add(areaP);
		
		Container con = this.getContentPane();
		
		con.add("South", buttonP);
		con.add("West", panel6);
		con.add("Center", areaP);
		
		
		
		setTitle("�л�����");
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
		if(e.getSource()==input) {
			if(hakT.getText().equals("")||
			   nameT.getText().equals("")||
			   korT.getText().equals("")||
			   engT.getText().equals("")||
			   mathT.getText().equals("")) return;
		
			scoreDTO = new ScoreDTO(hakT.getText(), nameT.getText(),
					Integer.parseInt(korT.getText()),
					Integer.parseInt(engT.getText()),
					Integer.parseInt(mathT.getText()));
			
			scoreI.input(scoreDTO);
			hakT.setText(""); nameT.setText(""); korT.setText("");
			engT.setText(""); mathT.setText("");
			
		} else if (e.getSource()==print) {
			scoreI.print(area);
		} else if (e.getSource()==search) {
			scoreI.search(area);
		} else if (e.getSource()==tot_desc) {
			scoreI.tot_desc();
		} else if (e.getSource()==save) {
			scoreI.save(this, area);
		} else if (e.getSource()==load) {
			scoreI.load(this, area);
		}
		
	}

}
