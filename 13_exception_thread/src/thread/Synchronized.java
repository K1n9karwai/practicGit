package thread;

public class Synchronized extends Thread {
	private static int count;

	public static void main(String[] args) {

		Synchronized aa = new Synchronized();// 스레드 생성
		Synchronized bb = new Synchronized();// 스레드 생성
		Synchronized cc = new Synchronized();// 스레드 생성

		aa.setName("aa");
		bb.setName("bb");
		cc.setName("cc");
		aa.start();// 스레드 시작
		bb.start();
		cc.start();
	}

	// public synchronized void run() { // 동기화 X

	public void run() {
		//synchronized (this) { // 동기화 X
		synchronized(Synchronized.class) { // 동기화 O
			for (int i = 1; i <= 5; i++) {
				count++;
				System.out.println(Thread.currentThread().getName() + " : " + count);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
