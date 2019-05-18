package ci1322.Prueba.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Restaurante")
public class Restaurante {


    @Id
    @Column(name="Id" ,length=12)
    private int Id;

    @Column(name="Address")
    private String address;



}
