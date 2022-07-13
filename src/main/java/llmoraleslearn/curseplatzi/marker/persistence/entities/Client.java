package llmoraleslearn.curseplatzi.marker.persistence.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Client {

    @Id
    private String id;

    @Column(name="nombre")
    private String firstName;

    @Column(name="apellidos")
    private String lastName;

    @Column(name="celular")
    private Long numberPhone;

    @Column(name="direccion")
    private String address;

    @Column(name="correo_electronico")
    private String email;

    public String id() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String firstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String lastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long numberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(Long numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String address() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
