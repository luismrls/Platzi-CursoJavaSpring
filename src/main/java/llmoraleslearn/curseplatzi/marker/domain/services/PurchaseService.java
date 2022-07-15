package llmoraleslearn.curseplatzi.marker.domain.services;

import llmoraleslearn.curseplatzi.marker.domain.Compra;
import llmoraleslearn.curseplatzi.marker.persistence.PurchaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    private PurchaseRepository purchaseRepository;

    public PurchaseService(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    public List<Compra> getAll() {
        return purchaseRepository.getAll();
    }

    public Optional<List<Compra>> getByClient(String idClient) {
        return purchaseRepository.getByClient(idClient);
    }

    public Compra save(Compra compra) {
        return purchaseRepository.save(compra);
    }
}
