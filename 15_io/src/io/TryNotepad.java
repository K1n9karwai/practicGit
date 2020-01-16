package io;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//종료 다이얼로그가 뜬다 (반드시 JFrame 위에 뜬다)
//다이얼로그에서 '취소'를 누르면 JFrame 창이 그냥 떠있다.

public class TryNotepad extends JFrame implements ActionListener {

	private JTextArea area;
	private MenuPane menu;
	private File file;

	public TryNotepad() {

		area = new JTextArea();
		JScrollPane scroll = new JScrollPane(area);
		area.setFont(new Font("고딕체", Font.BOLD, 20));

		menu = new MenuPane();
		this.setJMenuBar(menu); 

		Container con = this.getContentPane();
		con.add("Center", scroll);

		setTitle("간단 메모장");
		setBounds(900, 200, 700, 500);
		setVisible(true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				int result = JOptionPane.showConfirmDialog(TryNotepad.this, "저장하시겠습니까?", "메모장", JOptionPane.YES_NO_CANCEL_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					//  파일저장
					if (area.getText().length() != 0) {
						saveDialog();
						fileWrite();
					}
					System.exit(0);
				} else if (result == JOptionPane.NO_OPTION) {
					System.exit(0);
				}
			}
		});
	}

	public void event() {
		menu.getNewM().addActionListener(this);
		menu.getOpenM().addActionListener(this);
		menu.getSaveM().addActionListener(this);
		menu.getExitM().addActionListener(this);
		menu.getCutM().addActionListener(this);
		menu.getCopyM().addActionListener(this);
		menu.getPasteM().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menu.getNewM()) {
			area.setText("");
		} else if (e.getSource() == menu.getOpenM()) {
			openDialog(); // 열기 다이얼로그
			fileRead(); // 파일읽기

		} else if (e.getSource() == menu.getSaveM()) {
			saveDialog();
			fileWrite();
		
		} else if (e.getSource() == menu.getExitM()) {
			int result = JOptionPane.showConfirmDialog(this, "저장하시겠습니까?", "메모장", JOptionPane.YES_NO_CANCEL_OPTION);
			if (result == JOptionPane.YES_OPTION) {
				// 파일저장
				if (area.getText().length() != 0) {
					saveDialog();
					fileWrite();
				}
				System.exit(0);
			} else if (result == JOptionPane.NO_OPTION) {
				System.exit(0);
			}
		} else if (e.getSource() == menu.getCutM()) {
			area.cut();
		} else if (e.getSource() == menu.getCopyM()) {
			area.copy();
		} else if (e.getSource() == menu.getPasteM()) {
			area.paste();
		}
	}

	public void openDialog() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(this);

		if (result == JFileChooser.APPROVE_OPTION) {
			// 선택한 경로와 파일명이 필요하다
			file = chooser.getSelectedFile();
		}
		if (file == null)
			return;
		JOptionPane.showMessageDialog(this, file);

	}

	public void fileRead() {
		if (file == null)
			return;
		area.setText("");

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				// area.setText(line); 계속해서 덮어버려서 마지막 글자만 보이게 됨
				area.append(line + "\n");
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// throws를 걸 경우에 연쇄반응으로 위에도 걸어줘야 하지만 오버라이드 된 메소드에는 throws를 걸 수 없다
		// 그러므로 try/catch로 잡아야함
	}

	public void saveDialog() {

		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(this);
		if (result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		}
	}

	public void fileWrite() {
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

	public static void main(String[] args) {

		new TryNotepad().event();

	}

}
