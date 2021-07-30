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
@Table(name = "field")
public class Field implements Serializable{

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
	@Column(name = "f_name")
	private String name;
	@Column(name = "f_adress")
	private String adress;
	@Column(name = "f_surface")
	private Integer surface;
	@Column(name = "f_adding")
	private Date adding;
	@Column(name = "f_withdraw")
	private Date withdraw;
	@Column(name = "f_starting")
	private Date starting;
	@Column(name = "f_ending")
	private Date ending;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Retret retret;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Account account;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private ZipCode zipcode;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Vegetation vegetation;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Shelter shelter;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Water water;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Slope slope;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private GlassHeight glassheight;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Enclosure enclosure;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Humidity humidity;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Composition composition;
	@OneToMany(mappedBy = "field", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Service> services;
	
	/*****************************************************************************************/
	/*                                     Constructors                                      */
	/*****************************************************************************************/
	public Field() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Field(Integer id, String name, String adress, Integer surface, Date adding, Date withdraw, Date starting,
			Date ending, Retret retret, Account account, ZipCode zipcode, Vegetation vegetation, Shelter shelter,
			Water water, Slope slope, GlassHeight glassheight, Enclosure enclosure, Humidity humidity,
			Composition composition, Set<Service> services) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
		this.surface = surface;
		this.adding = adding;
		this.withdraw = withdraw;
		this.starting = starting;
		this.ending = ending;
		this.retret = retret;
		this.account = account;
		this.zipcode = zipcode;
		this.vegetation = vegetation;
		this.shelter = shelter;
		this.water = water;
		this.slope = slope;
		this.glassheight = glassheight;
		this.enclosure = enclosure;
		this.humidity = humidity;
		this.composition = composition;
		this.services = services;
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
	public Integer getSurface() {
		return surface;
	}
	public void setSurface(Integer surface) {
		this.surface = surface;
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



	public Retret getRetret() {
		return retret;
	}



	public void setRetret(Retret retret) {
		this.retret = retret;
	}



	public Account getAccount() {
		return account;
	}



	public void setAccount(Account account) {
		this.account = account;
	}



	public ZipCode getZipcode() {
		return zipcode;
	}



	public void setZipcode(ZipCode zipcode) {
		this.zipcode = zipcode;
	}



	public Vegetation getVegetation() {
		return vegetation;
	}



	public void setVegetation(Vegetation vegetation) {
		this.vegetation = vegetation;
	}



	public Shelter getShelter() {
		return shelter;
	}



	public void setShelter(Shelter shelter) {
		this.shelter = shelter;
	}



	public Water getWater() {
		return water;
	}



	public void setWater(Water water) {
		this.water = water;
	}



	public Slope getSlope() {
		return slope;
	}



	public void setSlope(Slope slope) {
		this.slope = slope;
	}



	public GlassHeight getGlassheight() {
		return glassheight;
	}



	public void setGlassheight(GlassHeight glassheight) {
		this.glassheight = glassheight;
	}



	public Enclosure getEnclosure() {
		return enclosure;
	}



	public void setEnclosure(Enclosure enclosure) {
		this.enclosure = enclosure;
	}



	public Humidity getHumidity() {
		return humidity;
	}



	public void setHumidity(Humidity humidity) {
		this.humidity = humidity;
	}



	public Composition getComposition() {
		return composition;
	}



	public void setComposition(Composition composition) {
		this.composition = composition;
	}



	public Set<Service> getServices() {
		return services;
	}



	public void setServices(Set<Service> services) {
		this.services = services;
	}

	
}
