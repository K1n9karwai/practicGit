package inheritance;

public class EmployeeDTO {

	private String name;
	private String position;
	private int basepay;
	private int benefit;
	private double taxRate;
	private int salary;
	
	public EmployeeDTO(String name, String position, int basepay, int benefit) {
		this.name = name;
		this.position = position;
		this.basepay = basepay;
		this.benefit = benefit;
		
		int total = basepay + benefit;
		
		if(total<=2000000) {
			taxRate = 0.01;
			salary = (int)(total - total*taxRate);
		} else if(total<=4000000) {
			taxRate = 0.02;
			salary = (int)(total - total*taxRate);
		} else {
			taxRate = 0.03;
			salary = (int)(total - total*taxRate);
		}
	}
	
	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public int getBasepay() {
		return basepay;
	}

	public int getBenefit() {
		return benefit;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return name + "\t" 
				+ position + "\t"
				+ basepay + "\t"
				+ benefit + "\t"
				+ taxRate + "\t"
				+ salary;
	}
	
}
