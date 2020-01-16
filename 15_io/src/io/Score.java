package io;

import javax.swing.JTable;
import javax.swing.JTextArea;

public interface Score {
	
	public void input(ScoreDTO dto);
	
//	public void print(JTextArea output);
//	
//	public void search(JTextArea output);
	public void print(JTable table);
	
	public void search(JTable table);
	
	public void tot_desc(); //¼øÀ§
	
	public void save();
	
	public void load();
}
