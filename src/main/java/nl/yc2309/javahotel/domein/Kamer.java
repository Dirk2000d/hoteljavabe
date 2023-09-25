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
	private String naam;
	private int bedden;
	private boolean beschikbaar;
	
	
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
	public int getBedden() {
		return bedden;
	}
	public void setBedden(int bedden) {
		this.bedden = bedden;
	}
	public boolean isBeschikbaar() {
		return beschikbaar;
	}
	public void setBeschikbaar(boolean beschikbaar) {
		this.beschikbaar = beschikbaar;
	}
	
	

}
