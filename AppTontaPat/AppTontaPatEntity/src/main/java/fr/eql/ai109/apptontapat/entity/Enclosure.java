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
@Table(name = "enclosure")
public class Enclosure implements Serializable{

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
	@Column(name = "e_label")
	private String label;
	@OneToMany(mappedBy = "enclosure", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Field> fields;
	
	/******************************************************************************************/
	/*                             Constructors                                  */
	/*****************************************************************************************/
	
	public Enclosure(Integer id, String label, Set<Field> fields) {
		super();
		this.id = id;
		this.label = label;
		this.fields = fields;
	}
	
	public Enclosure() {
		super();
		// TODO Auto-generated constructor stub
	}

	/******************************************************************************************/
	/*                              Getters and setters                                     */
	/*****************************************************************************************/
	
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
	public Set<Field> getFields() {
		return fields;
	}
	public void setFields(Set<Field> fields) {
		this.fields = fields;
	}
	

	
}
