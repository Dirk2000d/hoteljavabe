package nl.yc2309.javahotel.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.yc2309.javahotel.domein.Klant;

@Service
public class KlantenService {

	@Autowired
	KlantRepository kr;
	
	public void slaKlantOp(Klant klant) {
		kr.save(klant);
	}

	public Iterable<Klant> geefAlleKlanten() {
		return kr.findAll();
	}

}
