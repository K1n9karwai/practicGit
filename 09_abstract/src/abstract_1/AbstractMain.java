package abstract_1;

public class AbstractMain extends AbstractTest {
//�߻�Ŭ������ ������ �ݵ�� override �ϴ� �� �ƴϸ� ���� ���� �߻�Ŭ������ �ž��Ѵ�.
//������ �׷��ÿ��� ���� ���� ��ü ������ �ȵǰ�, �������� ���� �ڽ� Ŭ������ ���� �����Ǿ�� �Ѵ�.
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
//		AbstractTest at = new AbstractTest(); �߻�Ŭ������ ��� ��ü ���� �Ұ�, ��ӹ޾� ����Ѵ�.	
		AbstractTest at = new AbstractMain();
		at.setName("ȫ�浿"); //ȣ��
		System.out.println("�̸� : " + at.getName());
	}
}
