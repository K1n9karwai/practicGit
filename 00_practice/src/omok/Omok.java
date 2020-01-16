package omok;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Omok extends Frame {

	private int xPoint;
	private int yPoint;
	private int sw=1;
	private OmokCanvas can;
	private List<OmokDTO> list;

	public Omok() {
		// setLayout(null);
		
		can = new OmokCanvas(this);
		
		add(can);
		
		list = new ArrayList<OmokDTO>();
		
		setBounds(700, 100, 910, 960);
		setBackground(new Color(207, 146, 69));
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		can.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xPoint = e.getX();
				yPoint = e.getY();
				
				OmokDTO dto = new OmokDTO();
				dto.setxPoint(xPoint);
				dto.setyPoint(yPoint);
				dto.setSw(sw);
				
				System.out.println(xPoint);
				System.out.println(yPoint);
				System.out.println(sw);
				sw++;
				list.add(dto);
				System.out.println(sw);
				can.repaint();
			}
		});
	}
	
	

//	public int getxPoint() {
//		return xPoint;
//	}
//
//	public int getyPoint() {
//		return yPoint;
//	}
	
//	public int getSw() {
//		return sw;
//	}

	public List<OmokDTO> getList() {
		return list;
	}

	public static void main(String[] args) {
		new Omok();
	}
}
