package nested;

public class AbstractMain {

	public static void main(String[] args) {
		
		AbstractTest at = new AbstractTest() {
			@Override
			public void setName(String name) {
				this.name = name;
			}
			
		}; //�͸� �̳� Ŭ����, ����� ��Ű�� �ʰ� �޼ҵ带 ����ϱ� ���� ����Ѵ�.
		   //�͸� �̳� Ŭ������ �Ŀ��ڷ� �ξ� 1ȸ������ ���.
		
		InterA aa = new InterA() {//�������̽��� new�� �ȸԱ⶧���� ���� new�� �� ��ȣ, �Ŀ��ڸ� �����ϴ� ���̴�.
			public void aa() {}
			public void bb() {}
		};
		
		AbstractExam ae = new AbstractExam() {};
		
	}
}
