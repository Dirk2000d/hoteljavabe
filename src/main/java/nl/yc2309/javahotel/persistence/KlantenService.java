package nl.yc2309.javahotel.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.yc2309.javahotel.domein.Klant;

@Service
public class KlantenService {

	@Autowired
	KlantRepository kr;
	// opslaan
	public void slaKlantOp(Klant klant) {
		kr.save(klant);
	}
	// view
	public Iterable<Klant> geefAlleKlanten() {
		kr.save(new Klant());
		return kr.findAll();
	}
	// update
	public Klant updateKlant(Klant klant) {
		System.out.println("update klant");
		return kr.save(klant);
	}
	// verwijderen
	public void verwijderKlant(long klantid) {
		kr.deleteById(klantid);	
	}


}
