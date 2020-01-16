package io;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class ScoreImpl implements Score {

	private ArrayList<ScoreDTO> scoreList;
	private DefaultTableModel model;

	public ScoreImpl() {
		scoreList = new ArrayList<ScoreDTO>();
	}

	@Override
	public void input(ScoreDTO dto) {
		scoreList.add(dto);
		System.out.println("list 크기 = " + scoreList.size());
	}

//	@Override
//	public void print(JTextArea output) {
//
//		output.setText("");
//		output.setText("학번\t이름\t국어\t영어\t수학\t총점\t평균\n\n\n\n");
//		output.setFont(new Font("고딕체", Font.BOLD, 10));
//
//		for (ScoreDTO dto : scoreList) {
//			output.append(dto.toString() + "\n");

//		for(int i=0; i<scoreList.size(); i++) {
//			output.append(scoreList.get(i).getHak() + "\t" +
//							   scoreList.get(i).getName()+ "\t" +
//							   scoreList.get(i).getKor()+ "\t" +
//							   scoreList.get(i).getEng()+ "\t" +
//							   scoreList.get(i).getMath()+ "\t" +
//							   scoreList.get(i).getTot()+ "\t" +
//							   dcf.format(scoreList.get(i).getAvg())+"\n\n");			   
//		}
//	}
	@Override
	public void print(JTable table) {
		
		Vector<String> vector = new Vector<String>();
		vector.add("학번");
		vector.add("이름");
		vector.add("국어");
		vector.add("영어");
		vector.add("수학");
		vector.add("총점");
		vector.add("평균");
		
		model = new DefaultTableModel(vector, 0);
		
		
		for (ScoreDTO dto : scoreList) {
			Vector<String> v = new Vector<String>();
			v.add(dto.getHak());
			v.add(dto.getName());
			v.add(dto.getKor()+"");
			v.add(dto.getEng()+"");
			v.add(dto.getMath()+"");
			v.add(dto.getTot()+"");
			v.add(String.format("%.2f", dto.getAvg()));
			
			model.addRow(v);
			
		}
		table.setModel(model);
	}

	
//	public void search(JTextArea output) {
	public void search(JTable table) {
		String hak = JOptionPane.showInputDialog(null, "학번을 입력하세요");
		if (hak == null || hak.equals("")) return;
		
		int sw = 0;

		for (ScoreDTO dto : scoreList) {
			if (hak.equals(dto.getHak())) {
//				if (sw == 0) model.setro
//				table.append(dto.toString() + "\n");
//				sw = 1;
				if(sw==0) model.setRowCount(0);
				Vector<String> v = new Vector<String>();
				v.add(dto.getHak());
				v.add(dto.getName());
				v.add(dto.getKor()+"");
				v.add(dto.getEng()+"");
				v.add(dto.getMath()+"");
				v.add(dto.getTot()+"");
				v.add(String.format("%.2f", dto.getAvg()));
				
				model.addRow(v);
				sw=1;
			}
		}
		if(sw==0)
		JOptionPane.showMessageDialog(null, "찾고자 하는 학번이 없습니다.");

//		for(int i=0; i<scoreList.size(); i++) {
//			
//			if(hak.equals(scoreList.get(i).getHak())) {
//				output.setText("");
//				output.setFont(new Font("고딕체", Font.BOLD,10));
//				output.setText("학번\t이름\t국어\t영어\t수학\t총점\t평균\n\n\n\n" +
//						scoreList.get(i).getHak() + "\t" +
//						   scoreList.get(i).getName()+ "\t" +
//						   scoreList.get(i).getKor()+ "\t" +
//						   scoreList.get(i).getEng()+ "\t" +
//						   scoreList.get(i).getMath()+ "\t" +
//						   scoreList.get(i).getTot()+ "\t" +
//						   );
//			}
//		}
	}

	@Override
	public void tot_desc() {
		Comparator<ScoreDTO> com = new Comparator<ScoreDTO>() {
			@Override
			public int compare(ScoreDTO dto1, ScoreDTO dto2) {
				return dto1.getTot() < dto2.getTot() ? 1 : -1;
			}
	};
	
	Collections.sort(scoreList, null);
	}

	@Override
	public void save() {
		// 저장 다이얼로그
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(null);

		File file = null;
		if (result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		}

		if (file == null)
			return;

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

//			oos.writeInt(scoreList.size());

			for (ScoreDTO dto : scoreList) {
				oos.writeObject(dto);
			}

			oos.close();
			// BufferedWriter bw = new BufferedWriter(new FileWriter(file));
//			String data = area.getText();
//
//			bw.write(data);
//			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void load() {

		// 열기 다이얼로그

		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(null);
		File file = null;

		if (result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		}

		if (file == null)
			return;

		scoreList.clear();
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

			while (true) {
				try {
					ScoreDTO dto = (ScoreDTO) ois.readObject();
					scoreList.add(dto);
				} catch (EOFException e) {
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

//
//		try {
//			BufferedReader br = new BufferedReader(new FileReader(file));
//			String line;
//			try {
//				while ((line = br.readLine()) != null) {
//					area.append(line + "\n");
//				}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			try {
//				br.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
	}

}
