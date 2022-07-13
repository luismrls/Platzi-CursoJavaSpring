package llmoraleslearn.curseplatzi.marker.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProduct;

    @Column(name = "nombre")
    private String name;

    @Column(name = "id_categoria")
    private Integer IdCategory;

    @Column(name = "codigo_barras")
    private String barCode;

    @Column(name = "precio_venta")
    private Double salePrice;

    @Column(name = "cantidad_stock")
    private Integer quantityStock;

    @Column(name = "estado")
    private Boolean state;

    public Integer idProducto() {
        return idProduct;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProduct = idProducto;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer IdCategory() {
        return IdCategory;
    }

    public void setIdCategory(Integer idCategory) {
        IdCategory = idCategory;
    }

    public String barCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Double salePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Integer quantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(Integer quantityStock) {
        this.quantityStock = quantityStock;
    }

    public Boolean state() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
