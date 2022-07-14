package llmoraleslearn.curseplatzi.marker.web.controllers;

import llmoraleslearn.curseplatzi.marker.domain.Producto;
import llmoraleslearn.curseplatzi.marker.domain.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Producto> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Producto> getProduct(@PathVariable("id") int productoId) {
        return productService.getProducto(productoId);
    }

    @GetMapping("/category/{categoriaId}")
    public Optional<List<Producto>> getByCategoria(@PathVariable int categoriaId) {
        return productService.getByCategoria(categoriaId);
    }

    @PostMapping
    public Producto save(@RequestBody Producto producto){
        return productService.save(producto);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id) {
        return productService.delete(id);
    }
}
