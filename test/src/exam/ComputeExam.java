package exam;

class ComputeExam{
	public static void main(String[] args) {
		System.out.println("576을 백, 십, 일의 자리수로 구분하시오");
		System.out.println("백의 자리 = " + (576 / 100));
		System.out.println("십의 자리 = " + ((576 % 100) / 10));
		System.out.println("일의 자리 = " + ((576 % 100) % 10));
	
	}
}