package com.gyanesh.hc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the PERSON_CONNECTION database table. This class is
 * generated using the Eclipse JPA tool.
 * 
 * @author gyanesh.sharma
 *
 */
@Entity
@Table(name = "PERSON_CONNECTION")
public class PersonConnection extends BaseEntity<String> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Temporal(TemporalType.DATE)
	@Column(name = "BEGIN_DATE")
	private Date beginDate;

	@Column(name = "CONNECTION_TYPE_CD")
	private String connectionTypeCd;

	@Temporal(TemporalType.DATE)
	@Column(name = "END_DATE")
	private Date endDate;

	@Column(name = "STATUS_CD")
	private String statusCd;

	// bi-directional many-to-one association to Person
	@ManyToOne
	@JoinColumn(name = "SOURCE_PERSON_ID")
	private Person person1;

	// bi-directional many-to-one association to Person
	@ManyToOne
	@JoinColumn(name = "RELATED_PERSON_ID")
	private Person person2;

	public PersonConnection() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public String getConnectionTypeCd() {
		return this.connectionTypeCd;
	}

	public void setConnectionTypeCd(String connectionTypeCd) {
		this.connectionTypeCd = connectionTypeCd;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStatusCd() {
		return this.statusCd;
	}

	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}

	public Person getPerson1() {
		return this.person1;
	}

	public void setPerson1(Person person1) {
		this.person1 = person1;
	}

	public Person getPerson2() {
		return this.person2;
	}

	public void setPerson2(Person person2) {
		this.person2 = person2;
	}

}