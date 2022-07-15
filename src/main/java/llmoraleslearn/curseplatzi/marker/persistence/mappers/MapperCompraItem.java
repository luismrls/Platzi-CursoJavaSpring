package llmoraleslearn.curseplatzi.marker.persistence.mappers;

import llmoraleslearn.curseplatzi.marker.domain.CompraItem;
import llmoraleslearn.curseplatzi.marker.persistence.entities.ShoppingProduct;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {MapperProducto.class})
public interface MapperCompraItem {

    @Mapping(source = "id.idProduct", target = "productoId")
    @Mapping(source = "quantity", target = "cantidad")
    @Mapping(source = "total", target = "totalCompraItem")
    @Mapping(source = "state", target = "activo")
    CompraItem toCompraItem(ShoppingProduct shoppingProduct);

    @InheritInverseConfiguration
    @Mapping(target = "purchase", ignore = true)
    @Mapping(target = "product", ignore = true)
    @Mapping(target = "id.idPurchase", ignore = true)
    ShoppingProduct toShoppingProduct(CompraItem compraItem);
}
