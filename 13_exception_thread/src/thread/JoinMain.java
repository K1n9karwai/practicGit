package thread;

class JoinTest implements Runnable {

	@Override
	public void run() {
		
		for(int i=1; i<=5; i++) {
			System.out.print(i + " ");
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}

}

//----------------------
public class JoinMain {

	

	public static void main(String[] args) {
		
		JoinTest jt = new JoinTest();
		
		Thread t = new Thread(jt);
		System.out.println("������ ����");
		t.start();
		try {
			t.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("������ ����");
		//������ ������ ������� ������� �ʴ´�. ������ ����Ǿ ��׶��忡�� ������� ���ư���.
	}
}
