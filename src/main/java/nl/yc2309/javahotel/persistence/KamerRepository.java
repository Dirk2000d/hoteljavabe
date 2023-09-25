package nl.yc2309.javahotel.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.yc2309.javahotel.domein.Kamer;

// managed 1 entiteit
@Component
public interface KamerRepository extends CrudRepository<Kamer, Long> {

}
