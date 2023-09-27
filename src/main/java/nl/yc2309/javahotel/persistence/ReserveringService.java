package nl.yc2309.javahotel.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.yc2309.javahotel.domein.Reservering;

@Service
public class ReserveringService {
	@Autowired
	ReserveringRepository rm;
	public Iterable<Reservering> geefAlleReserveringen() {
		// TODO Auto-generated method stub
		return rm.findAll();
	}	

	public void slaReserveringOp(Reservering reservering) {
		// TODO Auto-generated method stub
		rm.save(reservering);
		
	}

	public void Reservering(int reserveringID) {
		// TODO Auto-generated method stub
		
	}

}
