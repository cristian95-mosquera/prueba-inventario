package pruebaInventario.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "mercancia")
public class Mercancia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreProducto;
    private int cantidad;
    private LocalDate fechaIngresoProducto;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    public Mercancia() {
    }

    public Mercancia(String nombreProducto, int cantidad, LocalDate fechaIngresoProducto) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.fechaIngresoProducto = fechaIngresoProducto;
    }

    public int getIdMercancia() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFechaIngresoProducto() {
        return fechaIngresoProducto;
    }

    public void setFechaIngresoProducto(LocalDate fechaIngresoProducto) { this.fechaIngresoProducto = fechaIngresoProducto; }
}
