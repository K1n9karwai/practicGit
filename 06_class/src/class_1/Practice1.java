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

//�� ���� �ȿ��� �ΰ��� Ŭ������ �ִ� ��� public�� ���� Ŭ������ �ش� ������ ���εǴ� Ŭ�����̴�.

public class Practice1 {

	public static void main(String[] args) {
		
		BookShop aa = new BookShop();
		
		System.out.println("��üaa = " + aa);
		
		aa.setBookName("�ڹٿϼ�");
		aa.setAuthor("��ϼ�");
		aa.setPrice(25000);
		
		
		System.out.println("å�̸� : " + aa.getBookName());
		System.out.println("�� �� : " + aa.getAuthor());
		System.out.println("�� �� : " + aa.getPrice() + "��");
		
		System.out.println();
		
		BookShop bb = new BookShop();
		System.out.println("��übb = " + bb);
		bb.setBookName("JSP���");
		bb.setAuthor("��JP");
		bb.setPrice(35000);
		
		System.out.println("å�̸� : " + bb.getBookName());
		System.out.println("�� �� : " + bb.getAuthor());
		System.out.println("�� �� : " + bb.getPrice());
		
		
	}
}

/*
 * Ŭ������ : BookShop
 * �ʵ� : bookName, author, price
 * 
 *  [������]
 *  å�̸� : �ڹٿϼ�
 *  �� �� : ��ϼ�
 *  �� �� : 25000��
 *  
 *  å�̸� : jsp���
 *  �� �� : ��jp
 *  �� �� : 35000��
 */
