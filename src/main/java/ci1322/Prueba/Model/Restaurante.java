package ci1322.Prueba.Model;


import javax.persistence.*;

@Entity
@Table(name = "Restaurante")
public class Restaurante {




    @OneToMany(mappedBy="Empleado")
    @Id
    @Column(name="Id" ,length=12)
    private int Id;

    @Column(name="Address")
    private String address;



}
