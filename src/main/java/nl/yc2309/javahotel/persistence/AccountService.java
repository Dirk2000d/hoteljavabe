package nl.yc2309.javahotel.persistence;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.yc2309.javahotel.domein.Account;
import nl.yc2309.javahotel.domein.Klant;

@Service
public class AccountService {

	@Autowired
	private KlantRepository klantRepo;
	
	public Optional<? extends Account> login(String email, String wachtwoord) {
		// Als er een klent is met email en wachtwoord
		Optional<Klant> klantOptional = klantRepo.findByEmailAndWachtwoord(email, wachtwoord);
		if (klantOptional.isPresent()) {
			// Haal de klant op uit de optional
			Klant klant = klantOptional.get();
			
			// Zet een nieuwe token voor de klant
			klant.setToken(generateRandomString());
			
			// We moeten de klant opslaan want dan wordt dus de nieuwe token ook opgeslagen 
			klantRepo.save(klant);
			
			// En de gevonden account teruggeven
			return klantOptional;
		}
		
		// In die toekomst als er een andere account soort komt dan kunnen we die hier testen
		
		return Optional.empty();
	}
	
	private String generateRandomString() {
		Random rand = new Random();

	    return rand.ints(48, 123)
	    	.filter(num -> (num<58 || num>64) && (num<91 || num>96))
	    	.limit(90)
	    	.mapToObj(c -> (char)c).collect(StringBuffer::new, StringBuffer::append, StringBuffer::append)
	    	.toString();
	}
	
}
