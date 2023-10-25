package nl.yc2309.javahotel.dto;

import java.time.LocalDate;

public class BerekeningDto {
	
	private LocalDate aankomstDatum;
	private LocalDate vertrekdatum;
	
	private long kamerId;

	public long getKamerId() {
		return kamerId;
	}

	public void setKamerId(long kamerId) {
		this.kamerId = kamerId;
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
}
