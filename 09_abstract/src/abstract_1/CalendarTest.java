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

		System.out.print("년도 입력 : ");
		this.year = scan.nextInt();
		System.out.print("월 입력 : ");
		this.month = scan.nextInt();

	}
	
	public void calculator() {
		//기준이 없으면 시스템 날짜 2020-01-03
		//기준을 바꾼다
		Calendar cal = Calendar.getInstance();
		
//		cal.set(cal.YEAR, year);
//		cal.set(cal.MONTH, month-1);
//		cal.set(cal.DAY_OF_MONTH, 1);
		
		cal.set(year, month-1, 1); //위의 과정을 한번에 집어넣은 것.
		
		this.endDate = cal.getActualMaximum(cal.DAY_OF_MONTH);
		this.week = cal.get(cal.DAY_OF_WEEK);
	
	}
	
	public void display() {
		System.out.println("=============== " + this.year + "년 " + this.month + "월 달력 ===============" );
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
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
