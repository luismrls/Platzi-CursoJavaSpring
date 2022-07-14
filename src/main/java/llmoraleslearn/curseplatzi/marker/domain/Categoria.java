package llmoraleslearn.curseplatzi.marker.domain;

public class Categoria {

    private int categoriasId;
    private String categoria;
    private boolean activo;

    public int categoriasId() {
        return categoriasId;
    }

    public void setCategoriasId(int categoriasId) {
        this.categoriasId = categoriasId;
    }

    public String categoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean activo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
