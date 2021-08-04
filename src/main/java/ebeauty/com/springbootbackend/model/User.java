package ebeauty.com.springbootbackend.model;

import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name="User")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id; 
	
	@Column(name="s_address")
	private String address;
	
	@Column(name="s_city")
	private String city;
	
	@Column(name="s_state")
	private String state;
	
	@Column(name="n_zipcode")
	private Integer zipcode;
	
	@Column(name="d_create_date")
	private Date createDate;
	
	@Column(name="d_updat_date")
	private Date updateDate;
	
	@Column(name="d_dob")
	private Date dob;
	
	@Column(name="s_email")
	private String email;
	
	@Column(name="n_phone")
	private Integer phone;
	
	@Column(name="s_first_name")
	private String firstName;
	
	@Column(name="s_last_name")
	private String lastName;
	
	@Column(name="s_gender")
	private String gender;
	
	@Column(name="s_password")
	private String password;
	
	@Column(name="s_statue")
	private String status;
	
	public User() {}

	public User(Long id, String address, String city, String state, Integer zipcode, Date createDate,
			Date updateDate, Date dob, String email, Integer phone, String firstName, String lastName, String gender,
			String password, String status) {
		super();
		this.id = id;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.dob = dob;
		this.email = email;
		this.phone = phone;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.password = password;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipcode() {
		return zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	};
	
	@PrePersist
	protected void onCreate() {
		createDate = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
	  updateDate = new Date();
	}
}
