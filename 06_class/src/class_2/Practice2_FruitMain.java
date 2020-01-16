package class_2;

public class Practice2_FruitMain {

	public static void main(String[] args) {
		
		Practice2_Fruit[] fr = new Practice2_Fruit[3];
		fr[0] = new Practice2_Fruit("���", 100, 80, 75);
		fr[1] = new Practice2_Fruit("����", 30, 25, 10);
		fr[2] = new Practice2_Fruit("����", 25, 30, 90);
		
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
 [����2]
���� �Ǹŷ� ���ϱ�
���� �����հ赵 ���Ͻÿ�

Ŭ���� : Fruit
pum, jan, feb, mar, tot
sumJan, sumFeb, sumMar

������
calcTot()
display()
output() - static

Ŭ���� : FruitMain

[������]
---------------------------------
PUM	JAN   	FEB   	MAR	TOT
---------------------------------
���    	100   	80    	75     	255
����     	30    	25    	10     	xxx
����     	25    	30    	90     	xxx
---------------------------------
        	xxx   	xxx   	xxx		output()�� ó��
 */