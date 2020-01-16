package swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MsPaint__2 extends JFrame {

	private JLabel x1L, y1L, x2L, y2L, z1L, z2L;
	private JTextField x1T, y1T, x2T, y2T, z1T, z2T;
	private JCheckBox fill;
	private JRadioButton line, circle, rect, roundRect, pen;
	private JComboBox combo;
	private JButton draw;
	private DrCanvas can;
	private ShapeDTO[] shape = new ShapeDTO][20];

	public MsPaint__2(String title) {

		x1L = new JLabel("x1L");
		y1L = new JLabel("y1L");
		x2L = new JLabel("x2L");
		y2L = new JLabel("y2L");
		z1L = new JLabel("z1L");
		z2L = new JLabel("z2L");

		x1T = new JTextField("0",4);
		y1T = new JTextField("0",4);
		x2T = new JTextField("0",4);
		y2T = new JTextField("0",4);
		z1T = new JTextField("50",4);
		z2T = new JTextField("50",4);

		fill = new JCheckBox("채우기");

		line = new JRadioButton("선");
		circle = new JRadioButton("원");
		rect = new JRadioButton("사각형", true);
		roundRect = new JRadioButton("둥근 사각형");
		pen = new JRadioButton("연필");
		
		ButtonGroup group = new ButtonGroup();
		group.add(line);
		group.add(circle);
		group.add(rect);
		group.add(roundRect);
		

		String rainbow[] = { "빨강색", "주황색", "노랑색", "초록색", "파랑색", "남색", "보라색" };
		combo = new JComboBox<String>(rainbow);

		draw = new JButton("그리기");
		
		can = new DrCanvas(this);
		

		JPanel northP = new JPanel();
		northP.add(x1L);
		northP.add(x1T);
		northP.add(y1L);
		northP.add(y1T);
		northP.add(x2L);
		northP.add(x2T);
		northP.add(y2L);
		northP.add(y2T);
		northP.add(z1L);
		northP.add(z1T);
		northP.add(z2L);
		northP.add(z2T);
		northP.add(fill);

		JPanel southP = new JPanel();
		southP.add(line);
		southP.add(circle);
		southP.add(rect);
		southP.add(roundRect);
		southP.add(pen);
		southP.add(combo);
		southP.add(draw);

		Container c = this.getContentPane();
		c.add("North", northP);
		c.add("South", southP);
		c.add("Center", can);
		
		setTitle(title);
		setBounds(900, 100, 700, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//이벤트
		draw.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//this.repaint(); 여기서 this는 익명클래스를 가리킴
				can.repaint();
			}
		
		});
		
		can.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				x1T.setText(e.getX()+"");
				y1T.setText(e.getY()+"");
			}
			
		});
		
		can.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				x2T.setText(e.getX()+"");
				y2T.setText(e.getY()+"");
			
				can.repaint();
			}
		});

	}
	
	
	public JTextField getX1T() {
		return x1T;
	}
	
	public JTextField getY1T() {
		return y1T;
	}
	
	public JTextField getX2T() {
		return x2T;
	}
	
	public JTextField getY2T() {
		return y2T;
	}
	
	public JTextField getZ1T() {
		return z1T;
	}
	
	public JTextField getZ2T() {
		return z2T;
	}
	
	public JComboBox<String> getCombo() {
		return combo;
	}
	
	public JCheckBox getFill() {
		return fill;
	}
	
	public JRadioButton getLine() {
		return line;
	}
	
	public JRadioButton getCircle() {
		return circle;
	}
	
	public JRadioButton getRect() {
		return rect;
	}
	
	public JRadioButton getRoundRect() {
		return roundRect;
	}
	
	public JButton getDraw() {
		return draw;
	}

	public static void main(String[] args) {
		new MsPaint__2("간단 그림판");
	}

}
