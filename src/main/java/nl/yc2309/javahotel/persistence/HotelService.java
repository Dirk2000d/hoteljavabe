package nl.yc2309.javahotel.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.yc2309.javahotel.domein.Hotel;
import nl.yc2309.javahotel.domein.Kamer;

@Service
public class HotelService {
	// Has relatie met Hotel repository
	@Autowired
	HotelRepository hr;

	@Autowired	
	KamerRepository kr;
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
	public void kenkamertoeaanhotel(long hotelnum, long kamernum) {
		// TODO Auto-generated method stub
		Hotel h = hr.findById(hotelnum).get();
		Kamer k = kr.findById(kamernum).get();
		h.addKamer(k);
		hr.save(h);
		
	}
}
