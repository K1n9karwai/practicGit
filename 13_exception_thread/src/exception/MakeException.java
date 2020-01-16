package exception;

//�����ڰ� ���� Exception Ŭ����
public class MakeException extends Exception {

	private String errorMsg;
	
	public MakeException() {}
	
	public MakeException(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	@Override
	public String toString() {
		//return getClass() + ":" + errorMsg; �տ� Ŭ�������� �Բ� �ٿ���, Object Ŭ������ ����
		return errorMsg;
	}
}