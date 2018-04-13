package fr.diginamic.ExempleManipulationCollection.Classe;

import java.util.Iterator;
import java.util.List;

public class User implements Comparable<User> {

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
	
	/**
	 * Permet d'afficher les utilisateurs d'une liste d'utilisateur via un iterateur
	 * @param users ( Liste d'utilisateur)
	 */
	public static void afficherList(List<User> users) {
	
		Iterator<User> iterationDeUser = users.iterator();
		
		while (iterationDeUser.hasNext()) {
			User user = (User) iterationDeUser.next();
			System.out.println(user.toString());
		}
		
		System.out.println("**********************************************************");
	}
	
	@Override
	public int compareTo(User user) {
		int position = name.compareTo(user.getName());
		if (position > 0) {
			return position;
		}
		if (position <0) {
			return position;
		}
		return 0;
	}
	
}
