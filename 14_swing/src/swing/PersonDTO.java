package swing;

public class PersonDTO {

	private String id;
	private String name;
	private String pwd;
	private String tel;
	
	public PersonDTO(String id, String name, String pwd, String tel) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.tel = tel;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String email) {
		this.pwd = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
