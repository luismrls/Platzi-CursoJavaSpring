package llmoraleslearn.curseplatzi.marker.persistence.mappers;

import llmoraleslearn.curseplatzi.marker.domain.Compra;
import llmoraleslearn.curseplatzi.marker.persistence.entities.Purchase;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {MapperCompraItem.class})
public interface MapperCompra {

    @Mapping(source = "idPurchase", target = "compraId")
    @Mapping(source = "idClient", target = "clienteId")
    @Mapping(source = "date", target = "fecha")
    @Mapping(source = "paymentMethod", target = "metodoPago")
    @Mapping(source = "comment", target = "comentario")
    @Mapping(source = "state", target = "estado")
    @Mapping(source = "products", target = "items")
    Compra toCompra(Purchase purchase);
    List<Compra> toCompras(List<Purchase> purchaseList);

    @InheritInverseConfiguration
    @Mapping(target = "client", ignore = true)
    Purchase toPurchase(Compra compra);

}
