package llmoraleslearn.curseplatzi.marker.web.controllers;

import llmoraleslearn.curseplatzi.marker.domain.Compra;
import llmoraleslearn.curseplatzi.marker.domain.services.PurchaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {

    private PurchaseService purchaseService;

    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @GetMapping
    public ResponseEntity<List<Compra>> getAll() {
        return new ResponseEntity<>(purchaseService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/client/{idClient}")
    public ResponseEntity<List<Compra>> getByClient(@PathVariable String idClient){
        return purchaseService.getByClient(idClient)
                .map(compras -> new ResponseEntity<>(compras, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Compra> save(@RequestBody Compra compra) {
        return new ResponseEntity<>(compra, HttpStatus.CREATED);
    }

}
