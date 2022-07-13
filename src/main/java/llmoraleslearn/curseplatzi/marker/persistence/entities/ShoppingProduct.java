package llmoraleslearn.curseplatzi.marker.persistence.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "compras_productos")
public class ShoppingProduct {

    @EmbeddedId
    private ShoppingProductPK id;

    @Column(name = "cantidad")
    private Integer quantity;

    private Double total;

    @Column(name = "estado")
    private Integer state;

    public ShoppingProductPK id() {
        return id;
    }

    public void setId(ShoppingProductPK id) {
        this.id = id;
    }

    public Integer quantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double total() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer state() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
