package class_1;

public class SungJukMain2 {
	
	public static void main(String[] args) {
		
		SungJuk[] ar = new SungJuk[3];//객체 배열 생성
		ar[0] = new SungJuk();
		ar[1] = new SungJuk();
		ar[2] = new SungJuk();
		
		ar[0].setName("홍길동");
		ar[0].setKor(70);
		ar[0].setEng(61);
		ar[0].setMath(100);
		
		ar[1].setName("또치");
		ar[1].setKor(40);
		ar[1].setEng(81);
		ar[1].setMath(90);
		
		ar[2].setName("코난");
		ar[2].setKor(98);
		ar[2].setEng(75);
		ar[2].setMath(88);
		
		System.out.println("---------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("---------------------------------------------------");
		
		for(SungJuk data : ar) {
			data.calc();
			System.out.println(data.getName() + "\t" +
					data.getKor() + "\t" + data.getEng() + "\t" +
					data.getMath() + "\t" + data.getTot() + "\t" +
					String.format("%.2f", data.getAvg()) + "\t" +
					data.getGrade());
		}
		System.out.println("---------------------------------------------------");	

//		for(int i=0; i<ar.length; i++) {
//			ar[i].calc();
//			System.out.println(ar[i].getName() + "\t" +
//			ar[i].getKor() + "\t" + ar[i].getEng() + "\t" +
//			ar[i].getMath() + "\t" + ar[i].getTot() + "\t" +
//			String.format("%.2f", ar[i].getAvg()) + "\t" +
//			ar[i].getGrade());
//		}
		
	}

}
