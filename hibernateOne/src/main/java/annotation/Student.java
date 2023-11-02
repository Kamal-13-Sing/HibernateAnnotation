package annotation;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * @Entity helps to create table with attributes name as same Class nameS
 */
@Entity			
public class Student {

	@Id				//-----@Id make id become a primary key
	private int id;
	private String name;
	private String email;
	private String address;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String email, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
	
}
