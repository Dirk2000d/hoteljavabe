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
	public void slaKlantOp(Klant klant) 
	{
		Iterable<Klant> nkr = kr.findAll();
		boolean bestaat = false;
		
		for (Klant k : nkr) 
		{
			if (klant.getEmail().equals(k.getEmail())) 
			{
				bestaat = true;
			}
		}
		
		if (bestaat == false) {
			kr.save(klant);
		} else {
			System.out.println("email bestaat al");
		}
		
	}
	// view
	public Iterable<Klant> geefAlleKlanten() {
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
		Klant k = kr.findById(klantid).get();
		Reservering r = rr.findById(reserveringid).get();
		k.addReservering(r);
		kr.save(k);
	}
	
//	public String loginKlant(Klant klant) 
//	{
//		Iterable<Klant> nkr = kr.findAll();
//		boolean bestaat = false;
//		boolean wwcorrect = false;
//		boolean ingelogd = false;
//		long id = 0;
//		
//		for (Klant k : nkr) 
//		{
//			if (klant.getEmail().equals(k.getEmail()) & klant.getWachtwoord().equals(k.getWachtwoord()) ) 
//			{
//				bestaat = true;
//				wwcorrect = true;
//				id = k.getId();
//			}
//		}
//		
//		if ((bestaat == true) & (wwcorrect == true)) {
//			kr.findById(id);
//			ingelogd = true;
//		} else {
//			System.out.println("email of wachtwoord is incorect");
//			ingelogd = false;
//		}
//		//return ingelogd;
//		
//	}

	
}
