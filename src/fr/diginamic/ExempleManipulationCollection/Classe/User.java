package fr.diginamic.ExempleManipulationCollection.Classe;

public class User {

	private String name;
	private Integer age;
	private boolean isMale;
	
	public User() {
		this("", 0, true);
	}
	
	public User(String name, Integer age, boolean isMale) {
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", isMale=");
		builder.append(isMale);
		builder.append("]");
		return builder.toString();
	}
	
	
}
