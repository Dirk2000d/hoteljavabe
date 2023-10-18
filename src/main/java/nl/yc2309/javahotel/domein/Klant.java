package nl.yc2309.javahotel.domein;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Klant extends Account{
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private long id;
	
	
	private String adres;
	private LocalDate geboorteDatum;
	private int paspoortNummer;
	private long tel;
	
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
	@OneToMany
	List<Reservering> reserveringen;

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
	
	public void addReservering(Reservering reservering) {
		this.reserveringen.add(reservering);
	}
	
	public List<Reservering> getReservering() {
		return reserveringen;
	}
	public void setReservering(List<Reservering> reservering) {
		this.reserveringen = reservering;
	}
}
