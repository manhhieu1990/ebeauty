package ebeauty.com.springbootbackend.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Tutorial")
public class Tutorial {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id; 
	
	@Column(name="s_expert_id")
	private Integer expertId;
	
	@Column(name="s_content")
	private String content;
	
	@Column(name="s_tutorial_type")
	private String tuotorialType;
	
	@Column(name="d_create_date")
	private Date createDate;
	
	@Column(name="d_update_date")
	private Date updateDate;
	
	public Tutorial() {}

	public Tutorial(Long id, Integer expertId, String content, String tutorialType, Date createDate,
			Date updateDate) {
		super();
		this.id = id;
		this.expertId = expertId;
		this.content = content;
		this.tuotorialType = tutorialType;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTutorialType() {
		return tuotorialType;
	}

	public void setTutorialType(String tuotorialType) {
		this.tuotorialType = tuotorialType;
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
