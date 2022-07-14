package llmoraleslearn.curseplatzi.marker.persistence;

import llmoraleslearn.curseplatzi.marker.persistence.crud.ProductCrudRepository;
import llmoraleslearn.curseplatzi.marker.persistence.entities.Product;

import java.util.List;
import java.util.Optional;

public class ProductRepository {

    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll() {
        return (List<Product>) productCrudRepository.findAll();
    }

    public List<Product> findByCategory(int idCategory) {
        return  productCrudRepository.findByIdCategory(idCategory);
    }

    public Optional<List<Product>> getLessThat(int quantity) {
        return  productCrudRepository.findByQuantityStockLessThanAndState(quantity, true);
    }
}
