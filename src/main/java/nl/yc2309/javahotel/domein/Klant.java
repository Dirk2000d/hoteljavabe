package nl.yc2309.javahotel.domein;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Klant extends Account{

	private String adres;

	private LocalDate geboorteDatum;

	private int paspoortNummer;

	private long tel;

	@Override
	public String getRole() {
		return "ROLE_KLANT";
	}
	
	@JsonIgnore
	@OneToMany(mappedBy = "klant")
	private List<Reservering> reserveringen;

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

	public long getTel() {
		return tel;
	}

	public void setTel(long tel) {
		this.tel = tel;
	}

	public List<Reservering> getReserveringen() {
		return reserveringen;
	}

	public void setReserveringen(List<Reservering> reserveringen) {
		this.reserveringen = reserveringen;
	}

}
