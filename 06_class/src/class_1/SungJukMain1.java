package class_1;

public class SungJukMain1 {

	public static void main(String[] args) {
		
		SungJuk aa = new SungJuk();//按眉 积己
		
		aa.setName("全辨悼");
		//aa.setJumsu(90, 91, 100);
		aa.setKor(70);
		aa.setEng(61);
		aa.setMath(100);
		aa.calc();
		System.out.println(aa.getName() + "\t" + aa.getKor() + "\t" +
							aa.getEng() + "\t" + aa.getMath() + "\t" +
							aa.getTot() + String.format("%.2f", aa.getAvg()) +
							"\t" + aa.getGrade());
		
		SungJuk bb = new SungJuk();
		bb.setName("肚摹");
		bb.setKor(70);
		bb.setEng(61);
		bb.setMath(100);
		bb.calc();
		System.out.println(bb.getName() + "\t" + bb.getKor() + "\t" +
							bb.getEng() + "\t" + bb.getMath() + "\t" +
							bb.getTot() + String.format("%.2f", bb.getAvg()) +
							"\t" + bb.getGrade());

		
		SungJuk cc = new SungJuk();
		cc.setName("内抄");
		cc.setKor(70);
		cc.setEng(61);
		cc.setMath(100);
		cc.calc();
		System.out.println(cc.getName() + "\t" + cc.getKor() + "\t" + cc.getEng() + "\t" + cc.getMath() + "\t" + cc.getTot() + String.format("%.2f", cc.getAvg()) + "\t" + cc.getGrade());
//		
		
	}
}
