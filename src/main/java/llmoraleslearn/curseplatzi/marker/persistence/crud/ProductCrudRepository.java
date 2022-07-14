package llmoraleslearn.curseplatzi.marker.persistence.crud;

import llmoraleslearn.curseplatzi.marker.persistence.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository<Product, Integer> {
}
