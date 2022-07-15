package llmoraleslearn.curseplatzi.marker.domain.repositories;

import llmoraleslearn.curseplatzi.marker.domain.Compra;

import java.util.List;
import java.util.Optional;

public interface ComprasRepository {

    List<Compra> getAll();
    Optional<List<Compra>> getByClient();
    Compra save (Compra compra);

}
