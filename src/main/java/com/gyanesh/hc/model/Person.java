package com.gyanesh.hc.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;


/**
 * The persistent class for the Person database table.
 * 
 */
@Entity
@Table(name="Person")
public class Person extends BaseEntity<String> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;

	@Column(name="BIRTH_CITY")
	private String birthCity;

	@Column(name="BIRTH_COUNTRY_CD")
	private String birthCountryCd;

	@Column(name="BIRTH_STATE_CD")
	private String birthStateCd;

	@Column(name="DOB")
	private LocalDate dob;

	@Column(name="ETHNICITY")
	private String ethnicity;

	@Column(name="EYE_COLOR_CD")
	private String eyeColorCd;

	@Column(name="FATHER_NAME")
	private String fatherName;

	@Column(name="HAIR_COLOR_CD")
	private String hairColorCd;

	@Column(name="MOTHER_NAME")
	private String motherName;

	@Column(name="STATUS_CD")
	private String statusCd;

	//bi-directional many-to-one association to PersonConnection
	@OneToMany(mappedBy="person1")
	private List<PersonConnection> personConnections1;

	//bi-directional many-to-one association to PersonConnection
	@OneToMany(mappedBy="person2")
	private List<PersonConnection> personConnections2;

	//bi-directional many-to-one association to PersonName
	@OneToMany(cascade= CascadeType.ALL, mappedBy="person")
    @JsonManagedReference
	private List<PersonName> personNames;

	public Person() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBirthCity() {
		return this.birthCity;
	}

	public void setBirthCity(String birthCity) {
		this.birthCity = birthCity;
	}

	public String getBirthCountryCd() {
		return this.birthCountryCd;
	}

	public void setBirthCountryCd(String birthCountryCd) {
		this.birthCountryCd = birthCountryCd;
	}

	public String getBirthStateCd() {
		return this.birthStateCd;
	}

	public void setBirthStateCd(String birthStateCd) {
		this.birthStateCd = birthStateCd;
	}

	public LocalDate getDob() {
		return this.dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getEthnicity() {
		return this.ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getEyeColorCd() {
		return this.eyeColorCd;
	}

	public void setEyeColorCd(String eyeColorCd) {
		this.eyeColorCd = eyeColorCd;
	}

	public String getFatherName() {
		return this.fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getHairColorCd() {
		return this.hairColorCd;
	}

	public void setHairColorCd(String hairColorCd) {
		this.hairColorCd = hairColorCd;
	}

	public String getMotherName() {
		return this.motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getStatusCd() {
		return this.statusCd;
	}

	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}

	public List<PersonConnection> getPersonConnections1() {
		return this.personConnections1;
	}

	public void setPersonConnections1(List<PersonConnection> personConnections1) {
		this.personConnections1 = personConnections1;
	}

	public PersonConnection addPersonConnections1(PersonConnection personConnections1) {
		getPersonConnections1().add(personConnections1);
		personConnections1.setPerson1(this);

		return personConnections1;
	}

	public PersonConnection removePersonConnections1(PersonConnection personConnections1) {
		getPersonConnections1().remove(personConnections1);
		personConnections1.setPerson1(null);

		return personConnections1;
	}

	public List<PersonConnection> getPersonConnections2() {
		return this.personConnections2;
	}

	public void setPersonConnections2(List<PersonConnection> personConnections2) {
		this.personConnections2 = personConnections2;
	}

	public PersonConnection addPersonConnections2(PersonConnection personConnections2) {
		getPersonConnections2().add(personConnections2);
		personConnections2.setPerson2(this);

		return personConnections2;
	}

	public PersonConnection removePersonConnections2(PersonConnection personConnections2) {
		getPersonConnections2().remove(personConnections2);
		personConnections2.setPerson2(null);

		return personConnections2;
	}

	public List<PersonName> getPersonNames() {
		return this.personNames;
	}

	public void setPersonNames(List<PersonName> personNames) {
		this.personNames = personNames;
	}

	public PersonName addPersonName(PersonName personName) {
		getPersonNames().add(personName);
		personName.setPerson(this);

		return personName;
	}

	public PersonName removePersonName(PersonName personName) {
		getPersonNames().remove(personName);
		personName.setPerson(null);

		return personName;
	}

}