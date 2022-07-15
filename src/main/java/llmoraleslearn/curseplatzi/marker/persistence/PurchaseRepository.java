package llmoraleslearn.curseplatzi.marker.persistence;

import llmoraleslearn.curseplatzi.marker.domain.Compra;
import llmoraleslearn.curseplatzi.marker.domain.repositories.ComprasRepository;
import llmoraleslearn.curseplatzi.marker.persistence.crud.PurchaseCrudRepository;
import llmoraleslearn.curseplatzi.marker.persistence.entities.Purchase;
import llmoraleslearn.curseplatzi.marker.persistence.mappers.MapperCompra;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PurchaseRepository implements ComprasRepository {

    private PurchaseCrudRepository purchaseCrudRepository;
    private MapperCompra mapperCompra;

    public PurchaseRepository(PurchaseCrudRepository purchaseCrudRepository, MapperCompra mapperCompra) {
        this.purchaseCrudRepository = purchaseCrudRepository;
        this.mapperCompra = mapperCompra;
    }

    @Override
    public List<Compra> getAll() {
        return mapperCompra.toCompras((List<Purchase>) purchaseCrudRepository.findAll());
    }

    @Override
    public Optional<List<Compra>> getByClient() {
        return Optional.empty();
    }

    @Override
    public Compra save(Compra compra) {
        return null;
    }
}
