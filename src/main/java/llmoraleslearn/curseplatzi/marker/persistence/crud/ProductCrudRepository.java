package llmoraleslearn.curseplatzi.marker.persistence.crud;

import llmoraleslearn.curseplatzi.marker.persistence.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCrudRepository extends CrudRepository<Product, Integer> {

    List<Product> findByIdCategory(int idCategoria);

    Optional<List<Product>> findByQuantityStockLessThanAndState(int quantityStock, boolean state);

}
