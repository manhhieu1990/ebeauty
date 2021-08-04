package ebeauty.com.springbootbackend.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Appointment")
public class Appointment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id; 
	
	@Column(name="s_expert_id")
	private Integer expertId;
	
	@Column(name="s_client_id")
	private Integer clientId;
	
	@Column(name="d_start_time")
	private Date startTime;
	
	@Column(name="n_duration")
	private Integer duration;
	
	@Column(name="d_create_date")
	private Date createDate;
	
	@Column(name="d_update_date")
	private Date updateDate;
	
	public Appointment() {}

	public Appointment(Long id, Integer expertId, Integer clientId, Date startTime, Integer duration,
			Date createDate, Date updateDate) {
		super();
		this.id = id;
		this.expertId = expertId;
		this.clientId = clientId;
		this.startTime = startTime;
		this.duration = duration;
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

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
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
