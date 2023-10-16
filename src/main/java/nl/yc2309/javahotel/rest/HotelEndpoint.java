package nl.yc2309.javahotel.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.yc2309.javahotel.domein.Hotel;
import nl.yc2309.javahotel.persistence.HotelService;

@RestController
public class HotelEndpoint {
	@Autowired
	HotelService hs;
	//-------------------------------------------
	@GetMapping("allehotels") 
	public Iterable<Hotel> alleHotels() {
		return hs.geefAlleHotels();
	}
	//-------------------------------------------
	@PostMapping("voeghoteltoe")
	public void voegHotelToe(@RequestBody Hotel hotel) {
		hs.slaHotelOp(hotel);
	}
	//-------------------------------------------
	@DeleteMapping("verwijderhotel/{hotelid}")
	public void verwijderHotel(@PathVariable("hotelid") Long hotelid) {
		hs.verwijderHotel(hotelid);
	}
	//-------------------------------------------
	@PostMapping("werkhotelbij")
	public void werkHotelBij(@RequestBody Hotel hotel) {
		hs.slaHotelOp(hotel);
	}
	//-------------------------------------------
	@GetMapping("voegkameraanhoteltoe/{hotelid}/{kamerid}")
	public void kenKamerAanHotelToe(@PathVariable("hotelid") int hotelnum,@PathVariable("kamerid") int kamernum ) {
		hs.kenkamertoeaanhotel(hotelnum, kamernum);
	}
}
