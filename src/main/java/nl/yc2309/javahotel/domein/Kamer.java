package nl.yc2309.javahotel.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// maakt database aan
@Entity
public class Kamer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//Colommen in de database
	private KamerType kamerType;
	private float prijs;
	private int kamerNummer;
	private boolean beschikbaar;	

}
