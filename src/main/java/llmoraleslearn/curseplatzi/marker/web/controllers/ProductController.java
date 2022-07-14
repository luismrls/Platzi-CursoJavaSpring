package llmoraleslearn.curseplatzi.marker.web.controllers;

import llmoraleslearn.curseplatzi.marker.domain.Producto;
import llmoraleslearn.curseplatzi.marker.domain.services.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public List<Producto> getAll() {
        return productService.getAll();
    }

    public Optional<Producto> getProduct(int productoId) {
        return productService.getProducto(productoId);
    }

    public Optional<List<Producto>> getByCategoria(int categoriaId) {
        return productService.getByCategoria(categoriaId);
    }

    public Producto save(Producto producto){
        return productService.save(producto);
    }

    public boolean delete(int prodcutoId) {
        return productService.delete(prodcutoId);
    }
}
