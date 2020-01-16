package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableEx2 extends JFrame implements ActionListener {
	private ArrayList<PersonDTO> list;
	private Vector<String> vector;
	private DefaultTableModel model;
	private JTable table;
	private JButton addBtn, delBtn;
	private JScrollPane scroll;

	public JTableEx2() {
		list = new ArrayList<PersonDTO>();
		list.add(new PersonDTO("hong", "홍길동", "111", "010-123-1234"));
		list.add(new PersonDTO("conan", "코난", "333", "010-777-7777"));

		// 제목
		vector = new Vector<String>();
		vector.addElement("아이디");
		vector.addElement("이름");
		vector.add("비밀번호");
		vector.add("핸드폰");

		model = new DefaultTableModel(vector, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return (column != 0) ? true : false;
			}
		}; // 빈 행의 수를 만든다.
			// 추상이나 인터페이스의 경우에는 무조건 익명을 사용해줘야 하는 것이지만
			// 익명을 그 두개에서만 사용할 수 있는 것은 아니다.
			// 익명으로 1회용으로 잠시 처리하고 싶을때 어디든 오버라이드하여 사용할 수 있다.

		for (PersonDTO dto : list) {
			Vector<String> v = new Vector<String>();
			v.add(dto.getId());
			v.add(dto.getName());
			v.add(dto.getPwd());
			v.add(dto.getTel());

			model.addRow(v);
		}

		table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);
		
		addBtn = new JButton("추가");
		delBtn = new JButton("삭제");

		JPanel p = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p.add(addBtn);
		p.add(delBtn);

		Container con = this.getContentPane();
		
		con.add("Center", scroll);
		con.add("South", p);

		setBounds(800, 200, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addBtn.addActionListener(this);
		delBtn.addActionListener(this);
		
		//이벤트
		

//		addBtn.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				insert();
//			}
//		});
//
//		delBtn.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				delete();
//
//			}
//		});

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==addBtn) {
			insert();
		} else if(e.getSource()==delBtn) {
			delete();
		}
		
	}

	public void insert() {
		String id = JOptionPane.showInputDialog(this, "등록할 아이디를 입력하세요.");
		if(id==null) return;
		
		for(int i=0; i<model.getRowCount(); i++) {
			if(id.equals(model.getValueAt(i, 0))) {
				JOptionPane.showMessageDialog(this, "사용중인 아이디입니다.");
				return;
			}
		}//for
		
		String name = JOptionPane.showInputDialog(this, "이름을 입력하세요.");
		String pwd = JOptionPane.showInputDialog(this, "비밀번호를 입력하세요.");
		String tel = JOptionPane.showInputDialog(this, "휴대폰 번호를 입력하세요.");
		
		Vector<String> v = new Vector<String>();
		v.add(id);
		v.add(name);
		v.add(pwd);
		v.add(tel);

		JOptionPane.showMessageDialog(this, "등록 완료");
		model.addRow(v);
		
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getId().equals(id)) {
//				System.out.println("중복된 아이디 입니다.");
//				break;
//			} else {
//				String name = JOptionPane.showInputDialog("이름을 입력하세요.");
//				String pwd = JOptionPane.showInputDialog("비밀번호를 입력하세요.");
//				String tel = JOptionPane.showInputDialog("휴대폰 번호를 입력하세요.");
//
//				list.add(new PersonDTO(id, name, pwd, tel));
//				System.out.println("등록이 완료됐습니다.");
//				
//				Vector<String> v = new Vector<String>();
//				v.add(list.get(list.size()-1).getId());
//				v.add(list.get(list.size()-1).getName());
//				v.add(list.get(list.size()-1).getPwd());
//				v.add(list.get(list.size()-1).getTel());
//
//				model.addRow(v);
//				
//				table = new JTable(model);
//				scroll = new JScrollPane(table);
//
//				add("Center", scroll);
//			}
//				break;
//			}
		}

	public void delete() {
		String name = JOptionPane.showInputDialog("삭제할 이름을 입력하세요.");
		int sw = 0;
		
		for(int i=0; i<model.getRowCount(); i++) {
			if(name.equals(model.getValueAt(i, 1))) {
				model.removeRow(i);
				i--;
				sw=1;
			}
		}
		
		if(sw==0) JOptionPane.showMessageDialog(this, "없는 이름 입니다.");

//		Iterator<PersonDTO> it = list.iterator();
//
//		while (it.hasNext()) {
//			PersonDTO dto = it.next();
//
//			if (dto.getName().equals(name)) {
//				it.remove(); // it.next()가 반환한 값을 지운다.
//				sw++;
//			}
//		}
	}

	public static void main(String[] args) {
		new JTableEx2();
	}


}
