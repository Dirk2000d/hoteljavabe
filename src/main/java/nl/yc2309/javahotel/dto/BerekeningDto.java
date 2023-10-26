package nl.yc2309.javahotel.dto;

import java.time.LocalDate;

public class BerekeningDto {
	
	private LocalDate aankomstDatum;
	private LocalDate vertrekdatum;
	private boolean ontbijt;
	private int personen;
	
	private long kamerId;

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

	public boolean isOntbijt() {
		return ontbijt;
	}

	public void setOntbijt(boolean ontbijt) {
		this.ontbijt = ontbijt;
	}

	public int getPersonen() {
		return personen;
	}

	public void setPersonen(int personen) {
		this.personen = personen;
	}

	public long getKamerId() {
		return kamerId;
	}

	public void setKamerId(long kamerId) {
		this.kamerId = kamerId;
	}
	
	
}
