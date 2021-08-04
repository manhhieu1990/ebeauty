package ebeauty.com.springbootbackend.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Expert")
public class Expert {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id; 
	
	@Column(name="s_first_name")
	private String firsName;
	
	@Column(name="s_last_name")
	private String lastName;
	
	@Column(name="s_gender")
	private String gender;
	
	@Column(name="d_dob")
	private Date dob;
	
	@Column(name="n_phone")
	private Integer phone;
	
	@Column(name="s_email")
	private String email;
	
	@Column(name="s_address")
	private String address;
	
	@Column(name="s_city")
	private String city;
	
	@Column(name="s_state")
	private String state;
	
	@Column(name="n_zipcode")
	private Integer zipcode;
	
	@Column(name="s_password")
	private String password;
	
	@Column(name="s_status")
	private String status;
	
	@Column(name="d_create_date")
	private Date createDate;
	
	@Column(name="d_update_date")
	private Date updateDate;

    public Expert() {}

	public Expert(Long id, String firsName, String lastName, String gender, Date dob, Integer phone, String email,
			String address, String city, String state, Integer zipcode, String password, String status, Date createDate,
			Date updateDate) {
		super();
		this.id = id;
		this.firsName = firsName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.password = password;
		this.status = status;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
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
