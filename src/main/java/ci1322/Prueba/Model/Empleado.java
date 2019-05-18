package ci1322.Prueba.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Empleado")
public class Empleado {
    @Id
    private int x;
    @Id
    private int y;
}

