package nl.yc2309.javahotel.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.yc2309.javahotel.domein.Betaling;

@Component
public interface BetalingRepository extends CrudRepository<Betaling, Long> {

}
