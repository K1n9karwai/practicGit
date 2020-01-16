package constructor;

public class MemberDTO {
	
	private String name;
	private String age;
	private String phoneNumber;
	private String address;
	
	public MemberDTO(String name, String age, String phoneNumber, String address) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public MemberDTO() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	
	public String getAddress() {
		return address;
	}

	
	public String getAge() {
		return age;
	}


}
