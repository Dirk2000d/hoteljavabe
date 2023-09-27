package nl.yc2309.javahotel.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.yc2309.javahotel.domein.Kamer;
import nl.yc2309.javahotel.domein.Reservering;

@Component
public interface ReserveringRepository extends CrudRepository<Reservering, Long>  {

}
