package thread;

public class RoseTest extends Thread {
	private String name;
	
	public RoseTest(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(name + "\t" + Thread.currentThread() + "\t i=" +i);
		}
		
		System.out.println(name + " + 종료 ");
	}
	
	public static void main(String[] args) {
		
		RoseTest aa = new RoseTest("안락"); //스레드 생성
		RoseTest bb = new RoseTest("행복"); //스레드 생성
		RoseTest cc = new RoseTest("쾌락"); //스레드 생성
		
		aa.setName("안락");
		bb.setName("행복");
		cc.setName("쾌락");
		
		//우선순위 1~10, default는 5,  제일 먼저 끝내고 싶은것은 10번
		//하지만 그래도 우선권은 시스템이 갖기 때문에 너무 믿어서는 안됨.
//		aa.setPriority(MAX_PRIORITY); //10
//		bb.setPriority(1);
//		cc.setPriority(1);
		
		aa.start(); //스레드 시작 -> 스레드 실행(운영체제에 의해)
		try {
			aa.join(); //해당 스레드가 끝날때가지 기다린 후 나머지 섞여 스레드들이 돈다.
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		bb.start(); //스레드 시작 -> 스레드 실행(운영체제에 의해)
		cc.start(); //스레드 시작 -> 스레드 실행(운영체제에 의해)
		
		
	}
}
