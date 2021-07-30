package fr.eql.ai109.apptontapat.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "account")
public class Account implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/******************************************************************************************/
	/*                              Variable declaration                                      */
	/*****************************************************************************************/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "a_surname")
	private String surName;
	@Column(name = "a_name")
	private String name;
	@Column(name = "a_adress")
	private String adress;
	@Column(name = "a_phone")
	private String phone;
	@Column(name = "a_email")
	private String email;
	@Column(name = "a_password")
	private String password;
	@Column(name = "a_siret")
	private String siret;
	@Column(name = "a_description")
	private String description;
	@Column(name = "a_photo")
	private String photo;
	@Column(name = "a_birth")
	private Date birth;
	@Column(name = "a_registration")
	private Date registration;
	@Column(name = "a_withdraw")
	private Date withdraw;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Role role;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private ZipCode zipcode;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Desactivation desactivation;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private EvacuateA evacuatea;
	@OneToMany(mappedBy = "account", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Herd> herds;
	@OneToMany(mappedBy = "account", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Field> fields;
	
	/*****************************************************************************************/
	/*                                     Constructors                                      */
	/*****************************************************************************************/
	



	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(Integer id, String surName, String name, String adress, String phone, String email, String password,
			String siret, String description, String photo, Date birth, Date registration, Date withdraw, Role role,
			ZipCode zipcode, Desactivation desactivation, EvacuateA evacuatea, Set<Herd> herds, Set<Field> fields) {
		super();
		this.id = id;
		this.surName = surName;
		this.name = name;
		this.adress = adress;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.siret = siret;
		this.description = description;
		this.photo = photo;
		this.birth = birth;
		this.registration = registration;
		this.withdraw = withdraw;
		this.role = role;
		this.zipcode = zipcode;
		this.desactivation = desactivation;
		this.evacuatea = evacuatea;
		this.herds = herds;
		this.fields = fields;
	}

	/******************************************************************************************/
	/*                             Getters and setters                                        */
	/******************************************************************************************/
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getSurName() {
		return surName;
	}


	public void setSurName(String surName) {
		this.surName = surName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getSiret() {
		return siret;
	}


	public void setSiret(String siret) {
		this.siret = siret;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public Date getBirth() {
		return birth;
	}


	public void setBirth(Date birth) {
		this.birth = birth;
	}


	public Date getRegistration() {
		return registration;
	}


	public void setRegistration(Date registration) {
		this.registration = registration;
	}


	public Date getWithdraw() {
		return withdraw;
	}


	public void setWithdraw(Date withdraw) {
		this.withdraw = withdraw;
	}
	


	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}



	public ZipCode getZipcode() {
		return zipcode;
	}



	public void setZipcode(ZipCode zipcode) {
		this.zipcode = zipcode;
	}



	public Desactivation getDesactivation() {
		return desactivation;
	}



	public void setDesactivation(Desactivation desactivation) {
		this.desactivation = desactivation;
	}



	public EvacuateA getEvacuateA() {
		return evacuatea;
	}



	public void setEvacuateA(EvacuateA evacuateA) {
		this.evacuatea = evacuateA;
	}

	public EvacuateA getEvacuatea() {
		return evacuatea;
	}

	public void setEvacuatea(EvacuateA evacuatea) {
		this.evacuatea = evacuatea;
	}

	public Set<Herd> getHerds() {
		return herds;
	}

	public void setHerds(Set<Herd> herds) {
		this.herds = herds;
	}

	public Set<Field> getFields() {
		return fields;
	}

	public void setFields(Set<Field> fields) {
		this.fields = fields;
	}
	
	
	
}
