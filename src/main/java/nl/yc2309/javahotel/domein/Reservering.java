package nl.yc2309.javahotel.domein;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity


public class Reservering {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	int reserveringId;
	LocalDate aankomstDatum, vertrekdatum;
	boolean isBetaald;
	
	@ManyToOne
	Kamer kamer;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getReserveringId() {
		return reserveringId;
	}
	public void setReserveringId(int reserveringId) {
		this.reserveringId = reserveringId;
	}
	public LocalDate getAankomstDatum() {
		return aankomstDatum;
	}
	public void setAankomstDatum(LocalDate aankomstDatum) {
		this.aankomstDatum = aankomstDatum;
	}
	public LocalDate getVertrekdatum() {
		return vertrekdatum;
	}
	public void setVertrekdatum(LocalDate vertrekdatum) {
		this.vertrekdatum = vertrekdatum;
	}
	public boolean isBetaald() {
		return isBetaald;
	}
	public void setBetaald(boolean isBetaald) {
		this.isBetaald = isBetaald;
	}
	public Kamer getKamer() {
		return kamer;
	}
	public void setKamer(Kamer kamer) {
		this.kamer = kamer;
	}
	
	
	
	
}
