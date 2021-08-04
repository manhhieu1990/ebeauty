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
	
	@Column(name="s_province")
	private String province;
	
	@Column(name="n_zipcode")
	private String zipcode;
	
    @Column(name="s_email")
	private String email;
	
	@Column(name="n_phone")
	private String phone;
	
	@Column(name="s_full_name")
	private String fullName;
	
	@Column(name="s_password")
	private String password;
	
	@Column(name="s_statue")
	private String status;
	
	public User() {}

	public User(Long id, String address, String city, String province, String zipcode, String email, String phone,
			String fullName, String password, String status) {
		super();
		this.id = id;
		this.address = address;
		this.city = city;
		this.province = province;
		this.zipcode = zipcode;
		this.email = email;
		this.phone = phone;
		this.fullName = fullName;
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

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	
}
