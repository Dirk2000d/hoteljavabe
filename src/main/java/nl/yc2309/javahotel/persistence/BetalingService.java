package nl.yc2309.javahotel.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.yc2309.javahotel.domein.Betaling;

@Service
public class BetalingService {
	@Autowired
	BetalingRepository br;
	
	public Iterable<Betaling> geefAlleBetalingen(){
		return br.findAll();
	}
	
	public Betaling slaBetalingOp(Betaling betaling) {
		return br.save(betaling);
	}
	
	public Betaling updateBetaling(Betaling betaling) {
		return br.save(betaling);
	}
	
	public void verwijderBetaling(long betalingid) {
		br.deleteById(betalingid);
	}

}
