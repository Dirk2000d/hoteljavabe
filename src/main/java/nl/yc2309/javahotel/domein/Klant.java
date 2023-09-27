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
}
