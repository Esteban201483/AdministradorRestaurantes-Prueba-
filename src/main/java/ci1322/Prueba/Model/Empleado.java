package ci1322.Prueba.Model;


import javax.persistence.*;

@Entity
@Table(name = "Empleado")
public class Empleado {

    @JoinTable
    @JoinColumn
    @Column (name="IDRestaurante",length=12)

    @ManyToOne
    private int IDRestaurante;



    @Id
    @Column(name="tmp")
    private int tmp;

    @Lob
    @Column(name="lob")
    private int lob;
}

