package fr.eql.ai109.apptontapat.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "datum")
public class Datum implements Serializable{

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
	@Column(name = "t_label")
	private String label;
	@OneToMany(mappedBy = "datum", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Incident> incidents;


	

	/*****************************************************************************************/
	/*                                     Constructors                                      */
	/*****************************************************************************************/
	public Datum() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Datum(Integer id, String label, Set<Incident> incidents) {
		super();
		this.id = id;
		this.label = label;
		this.incidents = incidents;
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

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}


	public Set<Incident> getIncidents() {
		return incidents;
	}


	public void setIncidents(Set<Incident> incidents) {
		this.incidents = incidents;
	}
	
	
	
}
