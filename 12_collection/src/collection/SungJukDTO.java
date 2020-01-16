package collection;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SungJukDTO implements Comparable<SungJukDTO>{
	private int num, kor, eng, math, tot;
	private double ave;
	private String name;
	
	public SungJukDTO(int num, String name, int kor, int eng, int math) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math; 
		this.tot = kor + eng + math;
		this.ave = tot/3.0;
	}

	public int getNum() {
		return num;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getTot() {
		return tot;
	}

	public String getName() {
		return name;
	}

	public Double getAve() {
		return ave;
	}
	
	@Override
	public String toString() {
		return num + "\t"
			+ name + "\t"
			+ kor + "\t"
			+ eng + "\t"
			+ math + "\t"
			+ tot + "\t"
			+ new DecimalFormat("#.##").format(ave);
	}

	
	@Override
	public int compareTo(SungJukDTO dto) {
//		if(tot < dto.tot) return 1;
//		else if(tot == dto.tot) return 0;
//		else if(tot>dto.tot) return -1;
		
		return tot > dto.tot ? -1 : 1; //위의 것을 한줄로 줄이면
	}
	
//	@Override //String은 비교해주는 메소드들이 다 내장돼 있다.
//	public int compareTo(SungJukDTO dto) {
//		return name.compareTo(dto.getName());
//	}
	
}
