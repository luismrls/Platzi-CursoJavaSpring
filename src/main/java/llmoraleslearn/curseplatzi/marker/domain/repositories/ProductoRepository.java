package llmoraleslearn.curseplatzi.marker.domain.repositories;

import llmoraleslearn.curseplatzi.marker.domain.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository {

    List<Producto> getAll();

    Optional<List<Producto>> getByCategoria(int categoriaId);

    Optional<List<Producto>> getProductosEscasos(int cantidad);

    Optional<Producto> getProducto(int productoId);

    Producto save(Producto producto);

    void delete(int prodcutoId);

}
