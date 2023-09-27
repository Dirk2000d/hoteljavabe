package nl.yc2309.javahotel.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	String naam;
	String adres;
	int gemiddeldeWaardering;
	int aantalKamers;
	int aantalBeschikbareKamers;
	//--------------------------------
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public int getGemiddeldeWaardering() {
		return gemiddeldeWaardering;
	}
	public void setGemiddeldeWaardering(int gemiddeldeWaardering) {
		this.gemiddeldeWaardering = gemiddeldeWaardering;
	}
	public int getAantalKamers() {
		return aantalKamers;
	}
	public void setAantalKamers(int aantalKamers) {
		this.aantalKamers = aantalKamers;
	}
	public int getAantalBeschikbareKamers() {
		return aantalBeschikbareKamers;
	}
	public void setAantalBeschikbareKamers(int aantalBeschikbareKamers) {
		this.aantalBeschikbareKamers = aantalBeschikbareKamers;
	}

}
