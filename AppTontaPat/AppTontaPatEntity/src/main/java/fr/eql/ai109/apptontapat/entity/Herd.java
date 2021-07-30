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
@Table(name = "herd")
public class Herd implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "h_seize")
	private Integer seize;
	@Column(name = "h_adress")
	private String adress;
	@Column(name = "h_area")
	private Integer area;
	@Column(name = "h_photo")
	private String photo;
	@Column(name = "h_adding")
	private Date adding;
	@Column(name = "h_withdraw")
	private Date withdraw;
	@Column(name = "h_starting")
	private Date starting;
	@Column(name = "h_ending")
	private Date ending;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private ZipCode zipcode;
	@OneToMany(mappedBy = "herd", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Service> services;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Account account;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Race race;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private TakeOut takeout;
	
	/*****************************************************************************************/
	/*                                     Constructors                                      */
	/*****************************************************************************************/
	public Herd() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Herd(Integer id, Integer seize, String adress, Integer area, String photo, Date adding, Date withdraw,
			Date starting, Date ending, ZipCode zipcode, Set<Service> services, Account account, Race race,
			TakeOut takeout) {
		super();
		this.id = id;
		this.seize = seize;
		this.adress = adress;
		this.area = area;
		this.photo = photo;
		this.adding = adding;
		this.withdraw = withdraw;
		this.starting = starting;
		this.ending = ending;
		this.zipcode = zipcode;
		this.services = services;
		this.account = account;
		this.race = race;
		this.takeout = takeout;
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


	public Integer getSeize() {
		return seize;
	}


	public void setSeize(Integer seize) {
		this.seize = seize;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public Integer getArea() {
		return area;
	}


	public void setArea(Integer area) {
		this.area = area;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public Date getAdding() {
		return adding;
	}


	public void setAdding(Date adding) {
		this.adding = adding;
	}


	public Date getWithdraw() {
		return withdraw;
	}


	public void setWithdraw(Date withdraw) {
		this.withdraw = withdraw;
	}


	public Date getStarting() {
		return starting;
	}


	public void setStarting(Date starting) {
		this.starting = starting;
	}


	public Date getEnding() {
		return ending;
	}


	public void setEnding(Date ending) {
		this.ending = ending;
	}


	public ZipCode getZipcode() {
		return zipcode;
	}


	public void setZipcode(ZipCode zipcode) {
		this.zipcode = zipcode;
	}



	public Set<Service> getServices() {
		return services;
	}



	public void setServices(Set<Service> services) {
		this.services = services;
	}



	public Account getAccount() {
		return account;
	}



	public void setAccount(Account account) {
		this.account = account;
	}



	public Race getRace() {
		return race;
	}



	public void setRace(Race race) {
		this.race = race;
	}



	public TakeOut getTakeout() {
		return takeout;
	}



	public void setTakeout(TakeOut takeout) {
		this.takeout = takeout;
	}
	


	
}
