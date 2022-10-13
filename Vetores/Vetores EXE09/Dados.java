package entities;

public class Dados {
	private String name;
	private int age;
	
	public Dados(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		
		this.age = age;
	
	}
	public String setName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
