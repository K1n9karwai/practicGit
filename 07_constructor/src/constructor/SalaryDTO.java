package constructor;

public class SalaryDTO {
	
	private String name, position;
	private int basePay, benefit, tax, salary;
	private double taxRate;
	
	public SalaryDTO(String name, String position, int basePay, int benefit) {
		this.name = name;
		this.position = position;
		this.basePay = basePay;
		this.benefit = benefit;
	}

	public void calc() {
		
		int total = basePay+benefit;
		
		if(total<=2000000) {
			taxRate = 0.01;
		} else if(total <=4000000) {
			taxRate = 0.02;
		} else {
			taxRate = 0.03;
		}
		
		tax = (int)(total*taxRate);
		salary = total-tax;
	}
	
	public int getBasePay() {
		return basePay;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public int getBenefit() {
		return benefit;
	}
	
	public double getTaxRate() {
		return taxRate;
	}
	
	public int getTax() {
		return tax;
	}
	
	public int getSalary() {
		return salary;
	}
	
	
}

/*
 직원들의 월급을 계산하는 프로그램을 작성하시오
객체 배열로 작성하시오
생성자를 통해서 데이터를 입력
계산은 calc()
name, position, basePay, benefit, taxRate, tax, salary

세금 = (기본급 + 수당) * 세율;
월급 = 기본급 + 수당 - 세금;

세율은 200만원 이하 : 1%(0.01), 
     400만원 이하 : 2%(0.02), 
     400만원 초과 : 3%(0.03)으로 설정한다.

[실행결과]
이름		직급		기본급		수당		세율		세금		월급
홍길동		부장		5000000		200000
유재석		과장		3500000		150000
박명수		사원		1800000		100000
*/
