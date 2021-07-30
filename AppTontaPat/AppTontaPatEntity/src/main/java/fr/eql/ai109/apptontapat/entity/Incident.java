package fr.eql.ai109.apptontapat.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "incident")
public class Incident implements Serializable{
	
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
	@Column(name = "i_starting")
	private Date starting;
	@Column(name = "i_ending")
	private Date ending;
	@Column(name = "i_decision")
	private Date decision;
	@Column(name = "id_setter")
	private Integer idSetter;
	@Column(name = "id_admin")
	private Integer idAdmin;
	@Column(name = "i_description")
	private String description;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Service service;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Datum datum;

	/*****************************************************************************************/
	/*                                     Constructors                                      */
	/*****************************************************************************************/

	public Incident() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
	public Incident(Integer id, Date starting, Date ending, Date decision, Integer idSetter, Integer idAdmin,
			String description, Service service, Datum datum) {
		super();
		this.id = id;
		this.starting = starting;
		this.ending = ending;
		this.decision = decision;
		this.idSetter = idSetter;
		this.idAdmin = idAdmin;
		this.description = description;
		this.service = service;
		this.datum = datum;
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


	public Date getDecision() {
		return decision;
	}


	public void setDecision(Date decision) {
		this.decision = decision;
	}


	public Integer getIdSetter() {
		return idSetter;
	}


	public void setIdSetter(Integer idSetter) {
		this.idSetter = idSetter;
	}


	public Integer getIdAdmin() {
		return idAdmin;
	}


	public void setIdAdmin(Integer idAdmin) {
		this.idAdmin = idAdmin;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Service getService() {
		return service;
	}


	public void setService(Service service) {
		this.service = service;
	}





	public Datum getDatum() {
		return datum;
	}





	public void setDatum(Datum datum) {
		this.datum = datum;
	}
	
	
	
}
