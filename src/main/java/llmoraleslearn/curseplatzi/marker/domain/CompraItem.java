package llmoraleslearn.curseplatzi.marker.domain;

public class CompraItem {

    private int productoId;
    private int cantidad;
    private double totalCompraItem;
    private boolean activo;

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotalCompraItem() {
        return totalCompraItem;
    }

    public void setTotalCompraItem(double totalCompraItem) {
        this.totalCompraItem = totalCompraItem;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
