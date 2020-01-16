package class_2;

public class Practice2_Fruit {

	private String pum;
	private int jan, feb, mar, tot;
	private static int sumJan, sumFeb, sumMar;

	public Practice2_Fruit(String pum, int jan, int feb, int mar) {
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
	}

	public void calc() {
		tot = jan + feb + mar;
		sumJan += jan;
		sumFeb += feb;
		sumMar += mar;
	}

	public void display() {
		System.out.println(pum + "\t" + jan + "\t" + feb + "\t" + mar + "\t" + tot);
	}

	public static void output() {
			System.out.println("\t" + sumJan +"\t" + sumFeb + "\t" + sumMar);
	}

}
