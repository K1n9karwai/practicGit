package thread;

public class SingleTon {
	private int num = 3;
	private static SingleTon instance;
	
	public static SingleTon getInstance() {
		if(instance==null) {
			synchronized(SingleTon.class) {
//instance가 null인 경우는 어차피 한번뿐이 없어서
//윗부분이 없어도 동일하지만 원칙적으론 동기화 해주는 것이 맞다.
				instance = new SingleTon(); //딱 1번만 처리된다.
			}
		}
		
		return instance;
	}
	
	public static void main(String[] args) {
		
		SingleTon aa = new SingleTon();
		
		aa.num++;
		System.out.println("aa = " + aa );
		System.out.println("num = " + aa.num);
		System.out.println();
		
		SingleTon bb = new SingleTon();
		bb.num++;
		System.out.println("bb = " + bb);
		System.out.println("num = " + bb.num);
		System.out.println();
		
		System.out.println("*** 싱글톤 ***");
		SingleTon cc = SingleTon.getInstance();
		cc.num++;
		System.out.println("cc = " + cc);
		System.out.println("num = " + cc.num);
		System.out.println();
		
		SingleTon dd = SingleTon.getInstance();
		dd.num++;
		System.out.println("dd = " + dd);
		System.out.println("num = " + dd.num);
		System.out.println();
		

	}
}
