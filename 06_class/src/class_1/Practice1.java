package class_1;

class BookShop {

	private String bookName, author;
	private int price;
	
	public void setBookName(String bn) {
		System.out.println("this = " + this);
		bookName = bn;
	}
	
	public void setAuthor(String at) {
		author = at;
	}
	
	public void setPrice(int p) {
		price = p;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPrice() {
		return price;
	}
	
}

//한 파일 안에서 두개의 클래스가 있는 경우 public이 붙은 클래스가 해당 파일의 주인되는 클래스이다.

public class Practice1 {

	public static void main(String[] args) {
		
		BookShop aa = new BookShop();
		
		System.out.println("객체aa = " + aa);
		
		aa.setBookName("자바완성");
		aa.setAuthor("김완성");
		aa.setPrice(25000);
		
		
		System.out.println("책이름 : " + aa.getBookName());
		System.out.println("저 자 : " + aa.getAuthor());
		System.out.println("가 격 : " + aa.getPrice() + "원");
		
		System.out.println();
		
		BookShop bb = new BookShop();
		System.out.println("객체bb = " + bb);
		bb.setBookName("JSP잡기");
		bb.setAuthor("송JP");
		bb.setPrice(35000);
		
		System.out.println("책이름 : " + bb.getBookName());
		System.out.println("저 자 : " + bb.getAuthor());
		System.out.println("가 격 : " + bb.getPrice());
		
		
	}
}

/*
 * 클래스명 : BookShop
 * 필드 : bookName, author, price
 * 
 *  [실행결과]
 *  책이름 : 자바완성
 *  저 자 : 김완성
 *  가 격 : 25000원
 *  
 *  책이름 : jsp잡기
 *  저 자 : 송jp
 *  가 격 : 35000원
 */
