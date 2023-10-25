package nl.yc2309.javahotel.dto;

import java.time.LocalDate;

public class SaveReserveringDto {

	private LocalDate aankomstDatum;
	
	private LocalDate vertrekdatum;
	
	private int aantalPersonen;
	
	private boolean ontbijt;
	
	private long kamerId;
	
	private long klantId;

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

	public long getKamerId() {
		return kamerId;
	}

	public void setKamerId(long kamerId) {
		this.kamerId = kamerId;
	}

	public long getKlantId() {
		return klantId;
	}

	public void setKlantId(long klantId) {
		this.klantId = klantId;
	}
	
}
