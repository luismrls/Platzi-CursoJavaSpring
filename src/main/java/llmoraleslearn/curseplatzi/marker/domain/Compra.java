package llmoraleslearn.curseplatzi.marker.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Compra {

    private int compraId;
    private String clienteId;
    private LocalDateTime fecha;
    private String metodoPago;
    private String comentario;
    private String estado;
    private List<CompraItem> items;

    public int getCompraId() {
        return compraId;
    }

    public void setCompraId(int compraId) {
        this.compraId = compraId;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<CompraItem> getItems() {
        return items;
    }

    public void setItems(List<CompraItem> items) {
        this.items = items;
    }
}
