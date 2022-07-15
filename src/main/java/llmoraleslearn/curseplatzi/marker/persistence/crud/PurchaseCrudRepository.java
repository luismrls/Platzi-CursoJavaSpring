package llmoraleslearn.curseplatzi.marker.persistence.crud;

import llmoraleslearn.curseplatzi.marker.persistence.entities.Purchase;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PurchaseCrudRepository extends CrudRepository<Purchase, Integer> {

    Optional<List<Purchase>> findByIdClient(String idClient);
}
