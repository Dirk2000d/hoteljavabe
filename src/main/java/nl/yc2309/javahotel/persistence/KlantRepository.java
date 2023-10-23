package nl.yc2309.javahotel.persistence;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.yc2309.javahotel.domein.Klant;

@Component
public interface KlantRepository extends CrudRepository<Klant,Long> {

	Optional<Klant> findByEmailAndWachtwoord(String email, String wachtwoord);
	
}
