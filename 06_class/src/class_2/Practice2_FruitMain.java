package class_2;

public class Practice2_FruitMain {

	public static void main(String[] args) {
		
		Practice2_Fruit[] fr = new Practice2_Fruit[3];
		fr[0] = new Practice2_Fruit("사과", 100, 80, 75);
		fr[1] = new Practice2_Fruit("포도", 30, 25, 10);
		fr[2] = new Practice2_Fruit("딸기", 25, 30, 90);
		
		System.out.println("-----------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("-----------------------------------");
		
//		for(int i=0; i<fr.length; i++) {
//			fr[i].calc();
//			fr[i].display();
//		}
		
		for(Practice2_Fruit f : fr) {
			f.calc();
			f.display();
		}
		
		System.out.println("-----------------------------------");
		Practice2_Fruit.output();
	}
}

/*
 [문제2]
과일 판매량 구하기
월별 매출합계도 구하시오

클래스 : Fruit
pum, jan, feb, mar, tot
sumJan, sumFeb, sumMar

생성자
calcTot()
display()
output() - static

클래스 : FruitMain

[실행결과]
---------------------------------
PUM	JAN   	FEB   	MAR	TOT
---------------------------------
사과    	100   	80    	75     	255
포도     	30    	25    	10     	xxx
딸기     	25    	30    	90     	xxx
---------------------------------
        	xxx   	xxx   	xxx		output()로 처리
 */