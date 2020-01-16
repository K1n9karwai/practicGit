package io;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;



public class ScoreImpl2 implements Score {

	private ScoreDTO scoreDTO;
	private ArrayList<ScoreDTO> scoreList = new ArrayList<ScoreDTO>();
	private File file;

	@Override
	public void input(ScoreDTO dto) {
		System.out.println("저장완료");
		scoreList.add(dto);
	}

	@Override
	public void print(JTextArea area) {
		DecimalFormat dcf = new DecimalFormat("#.##");
		
		area.setText("학번\t이름\t국어\t영어\t수학\t총점\t평균\n\n\n\n");
		area.setFont(new Font("고딕체", Font.BOLD,10));
		for(int i=0; i<scoreList.size(); i++) {
			area.append(scoreList.get(i).getHak() + "\t" +
							   scoreList.get(i).getName()+ "\t" +
							   scoreList.get(i).getKor()+ "\t" +
							   scoreList.get(i).getEng()+ "\t" +
							   scoreList.get(i).getMath()+ "\t" +
							   scoreList.get(i).getTot()+ "\t" +
							   dcf.format(scoreList.get(i).getAvg())+"\n\n");			   
		}
	}

	@Override
	public void search(JTextArea area) {
		DecimalFormat dcf = new DecimalFormat("#.##");
		String hak = JOptionPane.showInputDialog("학번을 입력하세요");
		
		for(int i=0; i<scoreList.size(); i++) {
			if(hak.equals(null)||hak.equals(""))return;
			if(hak.equals(scoreList.get(i).getHak())) {
				area.setText("");
				area.setFont(new Font("고딕체", Font.BOLD,10));
				area.setText("학번\t이름\t국어\t영어\t수학\t총점\t평균\n\n\n\n" +
						scoreList.get(i).getHak() + "\t" +
						   scoreList.get(i).getName()+ "\t" +
						   scoreList.get(i).getKor()+ "\t" +
						   scoreList.get(i).getEng()+ "\t" +
						   scoreList.get(i).getMath()+ "\t" +
						   scoreList.get(i).getTot()+ "\t" +
						   dcf.format(scoreList.get(i).getAvg())+"\n\n");
			}
		}
		hak = ("");
	}

	@Override
	public void tot_desc() {
		
//		@Override
//		public int compareTo(ScoreDTO dto) {
//			if(tot < dto.tot) return 1;
//			else if(tot == dto.tot) return 0;
//			else if(tot>dto.tot) return -1;
//			
////			return tot > dto.getTot() ? -1 : 1; //위의 것을 한줄로 줄이면
//		}
	}

	@Override
	public void save(ScoreForm sf, JTextArea area) {
//		ScoreForm sf = new ScoreForm();
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(sf);

		if (result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		}

		if (file == null)
			return;

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			String data = area.getText();

			bw.write(data);
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void load(ScoreForm sf, JTextArea area) {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(sf);

		if (result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		}

		if (file == null)
			return;
		JOptionPane.showMessageDialog(sf, file);
		area.setText("");

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			try {
				while ((line = br.readLine()) != null) {
					area.append(line + "\n");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
