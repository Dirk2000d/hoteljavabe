package nl.yc2309.javahotel.domein;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Klant extends Account{
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private long id;
	
	
	private String adres;
	private LocalDate geboorteDatum;
	private int paspoortNummer;

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
