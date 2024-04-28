package net.javaguides.sms.entity;






import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name= "patient")
public class patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
    private Long id;
	
	@Column(name ="first_name", nullable = false)
    private String firstname;
	
	@Column(name ="last_name")
    private String lastname;
	
	
	

	



	@Column(name = "email")
    private String email;
	
	@Column(name = "phone")
    private String phone;
	
	@Column(name = "age")
    private int age;
	
	@Column(name = "gender")
    private String gender;
	
	@Column(name = "room_no")
    private int room_no;
	
	@Column(name = "patient_type")
    private String patient_type;
	
	
	public String getPatient_type() {
		return patient_type;
	}
	public void setPatient_type(String patient_type) {
		this.patient_type = patient_type;
	}
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public patient() {
		
	}
	

	

	public patient(Long id, String firstname, String lastname, String email, String phone, int age, String gender,
			int room_no, String patient_type) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.gender = gender;
		this.room_no = room_no;
		this.patient_type = patient_type;
	}
	
	
    
}
