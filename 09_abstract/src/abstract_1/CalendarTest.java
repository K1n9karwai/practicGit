package abstract_1;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {

	private int year;
	private int month;
	private int endDate;
	private int week;
	
	public CalendarTest() {
		Scanner scan = new Scanner(System.in);

		System.out.print("�⵵ �Է� : ");
		this.year = scan.nextInt();
		System.out.print("�� �Է� : ");
		this.month = scan.nextInt();

	}
	
	public void calculator() {
		//������ ������ �ý��� ��¥ 2020-01-03
		//������ �ٲ۴�
		Calendar cal = Calendar.getInstance();
		
//		cal.set(cal.YEAR, year);
//		cal.set(cal.MONTH, month-1);
//		cal.set(cal.DAY_OF_MONTH, 1);
		
		cal.set(year, month-1, 1); //���� ������ �ѹ��� ������� ��.
		
		this.endDate = cal.getActualMaximum(cal.DAY_OF_MONTH);
		this.week = cal.get(cal.DAY_OF_WEEK);
	
	}
	
	public void display() {
		System.out.println("=============== " + this.year + "�� " + this.month + "�� �޷� ===============" );
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		for(int i=1; i<week; i++) {
			System.out.print("\t");
		}
//		for(int i=1; i<=this.endDate; i++) {
//			cal.set(Calendar.DATE, i);
//			int today = cal.get(cal.DAY_OF_WEEK);
//			System.out.print(i + "\t");
//			if(today%7==0) {
//				System.out.println();
//			}
//		}
		
		for(int i=1; i<=endDate; i++) {
			System.out.print(i+"\t");
			if(week%7==0) {
				System.out.println();
			}
			week++;
		}
		
	}

}
