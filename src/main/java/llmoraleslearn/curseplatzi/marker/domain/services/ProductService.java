package llmoraleslearn.curseplatzi.marker.domain.services;

import llmoraleslearn.curseplatzi.marker.domain.Producto;
import llmoraleslearn.curseplatzi.marker.domain.repositories.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private ProductoRepository productoRepository;

    public ProductService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> getAll() {
        return productoRepository.getAll();
    }

    public Optional<Producto> getProducto(int productoId) {
        return  productoRepository.getProducto(productoId);
    }

    public Optional<List<Producto>> getByCategoria(int categoriaId) {
        return productoRepository.getByCategoria(categoriaId);
    }

    public  Producto save(Producto producto){
        return productoRepository.save(producto);
    }

    public boolean delete(int prodcutoId) {
        return getProducto(prodcutoId).map(producto -> {
            productoRepository.delete(prodcutoId);
            return true;
        }).orElse(false);
    }
}
