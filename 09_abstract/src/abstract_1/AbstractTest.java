package abstract_1;

public abstract class AbstractTest { //POJO (Plain Old Java Object)
//�߻�޼ҵ尡 ������ �ݵ�� �� Ŭ������ �߻�Ŭ������ ���������Ѵ�.
//������ �߻�Ŭ������� �ؼ� �ݵ�� �߻�޼ҵ尡 �־�� �ϴ� ���� �ƴϴ�.
//���� �߻�Ŭ������ new �� ��ü �����Ҽ��� ����.
//����� �ʿ��ϴ�.
	String name;
	
	public abstract void setName(String name); //�߻� �޼ҵ�
	
	public String getName() { //����
		return name;
	}
}
