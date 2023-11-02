package allAnnotations;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "empDetails")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )	//---AutoIncrement
	private int id;
	
	@Column(name = "name", nullable = false, length = 10)
	private String empName;
	private Double salary;
	
	@Temporal(TemporalType.TIMESTAMP)	//--type of stored it give both Time & Date
	//@Temporal(TemporalType.DATE)	//----it save with only date
	private Date joiningDate;
	private String email;
	private boolean status;
	
	@Transient		//----it skip token not created in table
	private String token;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String empName, Double salary, Date joiningDate, String email, boolean status,
			String token) {
		super();
		this.id = id;
		this.empName = empName;
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.email = email;
		this.status = status;
		this.token = token;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", salary=" + salary + ", joiningDate=" + joiningDate
				+ ", email=" + email + ", status=" + status + ", token=" + token + "]";
	}

	
	
	
}
