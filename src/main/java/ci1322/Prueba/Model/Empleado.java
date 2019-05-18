package ci1322.Prueba.Model;


import javax.persistence.*;

@Entity
@Table(name = "Empleado")
public class Empleado {
    @Id
    @Column(name="tmp")
    private int tmp;

    @Lob
    @Column(name="lob")
    private int lob;
}

