package llmoraleslearn.curseplatzi.marker.persistence.mappers;

import llmoraleslearn.curseplatzi.marker.domain.Producto;
import llmoraleslearn.curseplatzi.marker.persistence.entities.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {MapperCategoria.class})
public interface MapperProducto {

    @Mappings({
            @Mapping(source = "idProduct", target = "productoId"),
            @Mapping(source = "name", target = "nombre"),
            @Mapping(source = "idCategory", target = "categoriaId"),
            @Mapping(source = "salePrice", target = "precio"),
            @Mapping(source = "quantityStock", target = "stock"),
            @Mapping(source = "state", target = "activo"),
            @Mapping(source = "category", target = "categoria"),
    })
    Producto toProducto(Product product);
    List<Producto> toProductos(List<Product> products);

    @InheritInverseConfiguration
    @Mapping(target = "barCode", ignore = true)
    Product toProduct(Producto producto);
}
