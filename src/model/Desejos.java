package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Desejos extends DefaultEntity<Desejos> {



	/**
	 * 
	 */
	private static final long serialVersionUID = -3378281168034814694L;
	
	
	private String desejo;

	public String getDesejo() {
		return desejo;
	}

	public void setDesejo(String desejo) {
		this.desejo = desejo;
	}
	
	public Desejos() {

	}

	public Desejos(String desejo) {
		super();

		this.desejo = desejo;
		
	}
	

	
	
}
