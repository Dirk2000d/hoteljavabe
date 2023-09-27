package nl.yc2309.javahotel.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.yc2309.javahotel.domein.Klant;

@Component
public interface KlantRepository extends CrudRepository<Klant,Long> {

}
