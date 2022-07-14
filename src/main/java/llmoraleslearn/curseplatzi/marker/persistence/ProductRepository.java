package llmoraleslearn.curseplatzi.marker.persistence;

import llmoraleslearn.curseplatzi.marker.persistence.crud.ProductCrudRepository;
import llmoraleslearn.curseplatzi.marker.persistence.entities.Product;

import java.util.List;

public class ProductRepository {

    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll() {
        return (List<Product>) productCrudRepository.findAll();
    }
}
