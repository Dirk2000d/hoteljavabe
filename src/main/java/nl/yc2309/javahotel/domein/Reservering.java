package nl.yc2309.javahotel.domein;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity


public class Reservering {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	LocalDate aankomstDatum, vertrekdatum;
	int aantalPersonen;
	boolean ontbijt;
	double totaalPrijs;
	boolean isBetaald;
	
	@ManyToOne
	private Kamer kamer;

	@ManyToOne
	private Klant klant;

	public long berekenAantalDagen(LocalDate aankomst, LocalDate vertrek) {
		long dagen = ChronoUnit.DAYS.between(aankomst, vertrek);
		System.out.println(dagen);
		return dagen;
	}
	
	public double berekenTotaalPrijs(long dagen, double prijs) {
		double totaalPrijs = dagen * prijs;
		this.totaalPrijs = totaalPrijs;
		System.out.println(totaalPrijs);
		return totaalPrijs;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public int getAantalPersonen() {
		return aantalPersonen;
	}

	public void setAantalPersonen(int aantalPersonen) {
		this.aantalPersonen = aantalPersonen;
	}

	public boolean isOntbijt() {
		return ontbijt;
	}

	public void setOntbijt(boolean ontbijt) {
		this.ontbijt = ontbijt;
	}

	public double getTotaalPrijs() {
		return totaalPrijs;
	}

	public void setTotaalPrijs(double totaalPrijs) {
		this.totaalPrijs = totaalPrijs;
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

	public Klant getKlant() {
		return klant;
	}

	public void setKlant(Klant klant) {
		this.klant = klant;
	}
	
}
