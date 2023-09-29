package nl.yc2309.javahotel.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// maakt database aan
@Entity
public class Kamer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//Colommen in de database
	private KamerType kamerType;
	private float prijs;
	private int kamerNummer;
	private boolean beschikbaar;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public KamerType getKamerType() {
		return kamerType;
	}
	public void setKamerType(KamerType kamerType) {
		this.kamerType = kamerType;
	}
	public float getPrijs() {
		return prijs;
	}
	public void setPrijs(float prijs) {
		this.prijs = prijs;
	}
	public int getKamerNummer() {
		return kamerNummer;
	}
	public void setKamerNummer(int kamerNummer) {
		this.kamerNummer = kamerNummer;
	}
	public boolean isBeschikbaar() {
		return beschikbaar;
	}
	public void setBeschikbaar(boolean beschikbaar) {
		this.beschikbaar = beschikbaar;
	}	

	
}
