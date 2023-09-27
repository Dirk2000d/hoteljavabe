package nl.yc2309.javahotel.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.yc2309.javahotel.domein.Hotel;

@Service
public class HotelService {
	// Has relatie met Hotel repository
	@Autowired
	HotelRepository hr;
	//-------------------------------------------
	public void slaHotelOp(Hotel hotel) {
		hr.save(hotel);	
	}
	//-------------------------------------------
	public Iterable<Hotel> geefAlleHotels() {
		return hr.findAll();
	}
	//-------------------------------------------
	public void verwijderHotel(Long hotelid) {
		hr.deleteById(hotelid);
	}
	//-------------------------------------------
}
