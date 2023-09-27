package nl.yc2309.javahotel.persistence;

import java.util.Objects;

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
	// opslaan
	public void slaKamerOp(Kamer kamer) {
		kr.save(kamer);	
	}
	// verwijderen
	public void verwijderKamer(long kamerid) {
		kr.deleteById(kamerid);	
	}
	// update
	public Kamer updateKamer(Kamer kamer, long kamerid) {
		System.out.println("update kamer");
		{ 
	        Kamer kamerDB = kr.findById(kamerid).get();
	        
	        if (Objects.nonNull(kamer.getPrijs())) {
	                kamerDB.setPrijs(kamer.getPrijs());
	            }
	        if (Objects.nonNull(kamer.getKamerType())) {
                kamerDB.setKamerType(kamer.getKamerType());
            }
	        if (Objects.nonNull(kamer.getKamerNummer())) {
                kamerDB.setKamerNummer(kamer.getKamerNummer());
            }
	        if (Objects.nonNull(kamer.isBeschikbaar())) {
                kamerDB.setBeschikbaar(kamer.isBeschikbaar());
            }
	        
	        return kr.save(kamerDB);
	    }
	}
	
}
