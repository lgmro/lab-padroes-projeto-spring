package one.digitalInnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderencoRepository extends CrudRepository<Cliente, String> {

}
