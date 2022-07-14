package llmoraleslearn.curseplatzi.marker.persistence;

import llmoraleslearn.curseplatzi.marker.domain.Producto;
import llmoraleslearn.curseplatzi.marker.domain.repositories.ProductoRepository;
import llmoraleslearn.curseplatzi.marker.persistence.crud.ProductCrudRepository;
import llmoraleslearn.curseplatzi.marker.persistence.entities.Product;
import llmoraleslearn.curseplatzi.marker.persistence.mappers.MapperProducto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository implements ProductoRepository {

    private ProductCrudRepository productCrudRepository;
    private MapperProducto mapperProducto;

    public ProductRepository(ProductCrudRepository productCrudRepository, MapperProducto mapperProducto) {
        this.productCrudRepository = productCrudRepository;
        this.mapperProducto = mapperProducto;
    }

    @Override
    public List<Producto> getAll() {
        List<Product> productList = (List<Product>) productCrudRepository.findAll();
        return mapperProducto.toProductos(productList);
    }

    @Override
    public Optional<List<Producto>> getByCategoria(int categoriaId) {
        List<Product> productList = productCrudRepository.findByIdCategory(categoriaId);
        return Optional.of(mapperProducto.toProductos(productList));
    }

    @Override
    public Optional<List<Producto>> getProductosEscasos(int cantidad) {
        Optional<List<Product>> optionalProductList = productCrudRepository.findByQuantityStockLessThanAndState(cantidad, true);
        return optionalProductList.map(products -> mapperProducto.toProductos(products));
    }

    @Override
    public Optional<Producto> getProducto(int productoId) {
        return productCrudRepository.findById(productoId).map(product -> mapperProducto.toProducto(product));
    }

    @Override
    public Producto save(Producto producto) {
        Product nuevoProducto = mapperProducto.toProduct(producto);
        return mapperProducto.toProducto(productCrudRepository.save(nuevoProducto));
    }

    @Override
    public void delete(int idProduct) {
        productCrudRepository.deleteById(idProduct);
    }


}
