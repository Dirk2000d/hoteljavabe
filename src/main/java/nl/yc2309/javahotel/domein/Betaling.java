package nl.yc2309.javahotel.domein;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Betaling {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private float bedrag;
	private LocalDate betalingsDatum;
	private BetalingsMethode betalingsMethode;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public float getBedrag() {
		return bedrag;
	}
	public void setBedrag(float bedrag) {
		this.bedrag = bedrag;
	}
	public LocalDate getBetalingsDatum() {
		return betalingsDatum;
	}
	public void setBetalingsDatum(LocalDate betalingsDatum) {
		this.betalingsDatum = betalingsDatum;
	}
	public BetalingsMethode getBetalingsMethode() {
		return betalingsMethode;
	}
	public void setBetalingsMethode(BetalingsMethode betalingsMethode) {
		this.betalingsMethode = betalingsMethode;
	}
}
