package nl.yc2309.javahotel.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.yc2309.javahotel.domein.Kamer;


@Service
public class KamerService {
	// Has relatie met Kamer repository
	@Autowired
	KamerRepository kr;
	
	// methode
	public Iterable<Kamer> geefAlleKamers() {
		return kr.findAll();
	}

	public void slaKamerOp(Kamer kamer) {
		kr.save(kamer);	
	}

	public void verwijderKamer(long kamerid) {
		kr.deleteById(kamerid);
		
	}
	
}
