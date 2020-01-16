package io;

import javax.swing.JTextArea;

public interface Score2 {
	
	public void input(ScoreDTO dto);
	
	public void print(JTextArea area);
	
	public void search(JTextArea area);
	
	public void tot_desc(); //¼øÀ§
	
	public void save(ScoreForm sf, JTextArea area);
	
	public void load(ScoreForm sf, JTextArea area);
}
