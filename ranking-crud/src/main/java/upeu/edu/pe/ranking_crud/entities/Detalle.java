package upeu.edu.pe.ranking_crud.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "detalles")
public class Detalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    private String evidencia;

    private String resultado;

    @ManyToOne
    @JoinColumn(name = "area_id", nullable = false)
    private Area area;

    // Constructor vacío
    public Detalle() {
    }

    // Constructor con parámetros
    public Detalle(String descripcion, String evidencia, String resultado, Area area) {
        this.descripcion = descripcion;
        this.evidencia = evidencia;
        this.resultado = resultado;
        this.area = area;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEvidencia() {
        return evidencia;
    }

    public void setEvidencia(String evidencia) {
        this.evidencia = evidencia;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}
