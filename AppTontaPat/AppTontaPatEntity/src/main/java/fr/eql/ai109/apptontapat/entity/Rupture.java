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
@Table(name = "rupture")
public class Rupture implements Serializable{

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
	@Column(name = "r_label")
	private String label;
	@OneToMany(mappedBy = "rupture", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Service> services;
	
	
	/*****************************************************************************************/
	/*                                     Constructors                                      */
	/*****************************************************************************************/
	

	public Rupture() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Rupture(Integer id, String label, Set<Service> services) {
		super();
		this.id = id;
		this.label = label;
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

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}



	public Set<Service> getServices() {
		return services;
	}



	public void setServices(Set<Service> services) {
		this.services = services;
	}

	
}
