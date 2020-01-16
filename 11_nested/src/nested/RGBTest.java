package nested;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class RGBTest extends JFrame {
	
	private JButton redB, greenB, blueB;
	private DrCanvas can;
	
	public RGBTest() {
		
		
		
		
		//redB = new JButton("»¡°­");
		redB = new JButton(new ImageIcon("D:/java_se/workspace/11_nested/src/nested/smile.jpg"));
		greenB = new JButton("ÃÊ·Ï");
		blueB = new JButton("ÆÄ¶û");
		
		can = new DrCanvas();
		
		JPanel p = new JPanel();
		
		p.add(redB);
		p.add(greenB);
		p.add(blueB);
		
		Container c = this.getContentPane();
		c.add("North", p);
		c.add("Center", can);
	
		setTitle("RGB");
		setBounds(700, 400, 500, 500);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		redB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(new Color(255,70,70));
			}
			
		});
		
		greenB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(new Color(70,255,70));
			}
		});
		
		blueB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(new Color(70,70,255));
			}
		});
		
	}
	
	class DrCanvas extends Canvas {
		public DrCanvas() {
			this.setBackground(new Color(255,200,255));
		}
		
	}

	public static void main(String[] args) {
		
		new RGBTest();
		
	}

}
