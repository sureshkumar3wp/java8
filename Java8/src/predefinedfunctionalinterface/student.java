package predefinedfunctionalinterface;

public class student{
	private String name;
	private int age;
	private String gender;
	public student(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	

	     
	}
	


