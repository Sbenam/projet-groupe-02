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
@Table(name = "clocking")
public class Clocking implements Serializable{

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
	@Column(name = "c_done")
	private Date done;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Service service;

	
	/*****************************************************************************************/
	/*                                     Constructors                                      */
	/*****************************************************************************************/
	
	public Clocking() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Clocking(Integer id, Date done, Service service) {
		super();
		this.id = id;
		this.done = done;
		this.service = service;
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


	public Date getDone() {
		return done;
	}


	public void setDone(Date done) {
		this.done = done;
	}


	public Service getService() {
		return service;
	}


	public void setService(Service service) {
		this.service = service;
	}
	
}
