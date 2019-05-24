package ci1322.Prueba.Model;


import javax.persistence.*;

@Entity
@Table(name = "Empleado")
public class Empleado {

    @JoinTable(name = "Estudiante")
    @JoinColumn
    @Column (name="IDRestaurante",length=12)

    @ManyToOne
    private int IDRestaurante;


    @Id
    @Column(name="tmp")
    private int tmp;


    @Column(name="salario")
    private float salario;

    @Lob
    @Column(name="pruebaLob")
    private int lob;

    @Column(name="asegurado")
    private boolean asegurado;
}

