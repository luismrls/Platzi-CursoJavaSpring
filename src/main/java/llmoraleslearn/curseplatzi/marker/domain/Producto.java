package llmoraleslearn.curseplatzi.marker.domain;

public class Producto {

    private int productoId;
    private String nombre;
    private int categoriaId;
    private double precio;
    private int stock;
    private boolean activo;
    private Categoria categoria;

    public int productoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public String nombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int categoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    public double precio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int stock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean activo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Categoria categoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
