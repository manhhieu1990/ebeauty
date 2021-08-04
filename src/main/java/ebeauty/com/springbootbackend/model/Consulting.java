package ebeauty.com.springbootbackend.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Consulting")
public class Consulting {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id; 
	
	@Column(name="s_expert_id")
	private Integer expertId;
	
	@Column(name="s_consulting_type")
	private String consultingType;
	
	@Column(name="d_create_date")
	private Date createDate;
	
	@Column(name="d_update_date")
	private Date updateDate;
	
	public Consulting() {}

	public Consulting(Long id, Integer expertId, String consultingType, Date createDate, Date updateDate) {
		super();
		this.id = id;
		this.expertId = expertId;
		this.consultingType = consultingType;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getExpertId() {
		return expertId;
	}

	public void setExpertId(Integer expertId) {
		this.expertId = expertId;
	}

	public String getConsultingType() {
		return consultingType;
	}

	public void setConsultingType(String consultingType) {
		this.consultingType = consultingType;
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
