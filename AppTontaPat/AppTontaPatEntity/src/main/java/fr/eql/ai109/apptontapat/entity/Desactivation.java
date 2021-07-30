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
@Table(name = "desactivation")
public class Desactivation implements Serializable{

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
	@Column(name = "d_label")
	private String label;
	@OneToMany(mappedBy = "desactivation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Account> accounts;

	
	/*****************************************************************************************/
	/*                                     Constructors                                      */
	/*****************************************************************************************/

	public Desactivation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Desactivation(Integer id, String label, Set<Account> accounts) {
		super();
		this.id = id;
		this.label = label;
		this.accounts = accounts;
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


	public Set<Account> getAccounts() {
		return accounts;
	}


	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}


}
