package nl.yc2309.javahotel.domein;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Klant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	String adres;
	LocalDate geboorteDatum;
	int paspoortNummer;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public LocalDate getGeboorteDatum() {
		return geboorteDatum;
	}
	public void setGeboorteDatum(LocalDate geboorteDatum) {
		this.geboorteDatum = geboorteDatum;
	}
	public int getPaspoortNummer() {
		return paspoortNummer;
	}
	public void setPaspoortNummer(int paspoortNummer) {
		this.paspoortNummer = paspoortNummer;
	}
	
	
	
	
}
