package pruebaInventario.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int edad;
    private Date fechaIngresoCompañia;

    @ManyToOne
    @JoinColumn(name = "id_cargo")
    private Cargo cargo;

    public Usuario() {
    }

    public Usuario(String nombre, int edad, Date fechaIngresoCompañia, Cargo cargo) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaIngresoCompañia = fechaIngresoCompañia;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaIngresoCompañia() {
        return fechaIngresoCompañia;
    }

    public void setFechaIngresoCompañia(Date fechaIngresoCompañia) {
        this.fechaIngresoCompañia = fechaIngresoCompañia;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
