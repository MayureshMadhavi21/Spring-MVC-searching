package springmvcmodel;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
  
	private String name;
	private Long id;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dob;
	private List<String> subjects;
	private String gender;
	private String type;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, Long id, Date dob, List<String> subjects, String gender, String type) {
		super();
		this.name = name;
		this.id = id;
		this.dob = dob;
		this.subjects = subjects;
		this.gender = gender;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", dob=" + dob + ", subjects=" + subjects + ", gender=" + gender
				+ ", type=" + type + ", address=" + address + "]";
	}
	
}
