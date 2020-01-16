package collection;

public class PersonDTO implements Comparable<PersonDTO>{
	private String name;
	private int age;
	
	public PersonDTO() {}
	
	public PersonDTO(String name, int age) {
		this.name =name;
		this.age = age;
		}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		
		return "이름 = " + name + "  나이 = " +age;
	}

	@Override
	public int compareTo(PersonDTO dto) {
		if(age < dto.age) return -1;
		else if(age == dto.age) return 0;
		else return 1;
	}
}
