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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "race")
public class Race implements Serializable{

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
	@OneToMany(mappedBy = "race", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Herd> herd;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Specie specie;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Composition composition;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Humidity humidity;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private GlassHeight glassheight;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Slope slope;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Vegetation vegetation;
	/*****************************************************************************************/
	/*                                     Constructors                                      */
	/*****************************************************************************************/

	public Race() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Race(Integer id, String label, Set<Herd> herd, Specie specie, Composition composition, Humidity humidity,
			GlassHeight glassheight, Slope slope, Vegetation vegetation) {
		super();
		this.id = id;
		this.label = label;
		this.herd = herd;
		this.specie = specie;
		this.composition = composition;
		this.humidity = humidity;
		this.glassheight = glassheight;
		this.slope = slope;
		this.vegetation = vegetation;
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


	public Set<Herd> getHerd() {
		return herd;
	}


	public void setHerd(Set<Herd> herd) {
		this.herd = herd;
	}


	public Specie getSpecie() {
		return specie;
	}


	public void setSpecie(Specie specie) {
		this.specie = specie;
	}


	public Composition getComposition() {
		return composition;
	}


	public void setComposition(Composition composition) {
		this.composition = composition;
	}


	public Humidity getHumidity() {
		return humidity;
	}


	public void setHumidity(Humidity humidity) {
		this.humidity = humidity;
	}


	public GlassHeight getGlassheight() {
		return glassheight;
	}


	public void setGlassheight(GlassHeight glassheight) {
		this.glassheight = glassheight;
	}


	public Slope getSlope() {
		return slope;
	}


	public void setSlope(Slope slope) {
		this.slope = slope;
	}


	public Vegetation getVegetation() {
		return vegetation;
	}


	public void setVegetation(Vegetation vegetation) {
		this.vegetation = vegetation;
	}


	
	
	
}
