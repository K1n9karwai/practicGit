package exception;

//개발자가 만든 Exception 클래스
public class MakeException extends Exception {

	private String errorMsg;
	
	public MakeException() {}
	
	public MakeException(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	@Override
	public String toString() {
		//return getClass() + ":" + errorMsg; 앞에 클래스명도 함께 붙여줌, Object 클래스에 속함
		return errorMsg;
	}
}
