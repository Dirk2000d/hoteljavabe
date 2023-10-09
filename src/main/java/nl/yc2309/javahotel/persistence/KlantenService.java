package nl.yc2309.javahotel.persistence;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.yc2309.javahotel.domein.Klant;
import nl.yc2309.javahotel.domein.Reservering;

@Service
public class KlantenService {
	@Autowired
	ReserveringRepository rr;
	
	@Autowired
	KlantRepository kr;
	// opslaan
	public void slaKlantOp(Klant klant) {
		kr.save(klant);
	}
	// view
	public Iterable<Klant> geefAlleKlanten() {
		//kr.save(new Klant());
		return kr.findAll();
	}
	public Optional<Klant> geefKlant(long id) {
		return kr.findById(id);
	}
	
	// update
	public Klant updateKlant(Klant klant) {
		System.out.println("update klant");
		return kr.save(klant);
	}
	// verwijderen
	public void verwijderKlant(long id) {
		kr.deleteById(id);	
	}
	public void kenreserveringtoeaanklant(long klantid, long reserveringid) {
		// TODO Auto-generated method stub
		Klant k = kr.findById(klantid).get();
		Reservering r = rr.findById(reserveringid).get();
		k.addReservering(r);
		kr.save(k);
	}


}
