package nl.yc2309.javahotel.persistence;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.yc2309.javahotel.domein.Reservering;

@Service
public class ReserveringService {
	@Autowired
	ReserveringRepository rm;
	public Iterable<Reservering> geefAlleReserveringen() {
		return rm.findAll();
	}	

	public void slaReserveringOp(Reservering reservering) {
		rm.save(reservering);
		
	}

	public Reservering updateReservering(Reservering reservering) {
		System.out.println("update revservering");
		return rm.save(reservering);
	}

	public void verwijderReservering(long reserveringid) {
		rm.deleteById(reserveringid);
		
	}

	public Optional<Reservering> geefReservering(long id) {
		return rm.findById(id);
	}

}
