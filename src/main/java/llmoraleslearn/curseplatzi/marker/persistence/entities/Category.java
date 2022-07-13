package llmoraleslearn.curseplatzi.marker.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "categorias")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategory;

    @Column(name = "descripcion")
    private String description;

    @Column(name = "estado")
    private Boolean state;

    public Integer idCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String description() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean state() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
