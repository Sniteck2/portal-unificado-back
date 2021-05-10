package usuario.causa.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "RTO_CUADERNO")
public class ResumenCuaderno {

    private Long id;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaTermino;
    private Long totalRegistroBase;
    private Long totalRegistroBaseEstimada;
    private Long totalRegistroPortal;
    private String tiempo;

    public ResumenCuaderno() {
    }

    public ResumenCuaderno(Long id, LocalDateTime fechaInicio, LocalDateTime fechaTermino, Long totalRegistroBase, Long totalRegistroBaseEstimada, Long totalRegistroPortal, String tiempo) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.totalRegistroBase = totalRegistroBase;
        this.totalRegistroBaseEstimada = totalRegistroBaseEstimada;
        this.totalRegistroPortal = totalRegistroPortal;
        this.tiempo = tiempo;
    }

    @Id
    @Column(name = "CRR_RTOCUADERNO")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "Fecha_inicio")
    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Column(name = "Fecha_termino")
    public LocalDateTime getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(LocalDateTime fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    @Column(name = "Total_reg_Base")
    public Long getTotalRegistroBase() {
        return totalRegistroBase;
    }

    public void setTotalRegistroBase(Long totalRegistroBase) {
        this.totalRegistroBase = totalRegistroBase;
    }

    @Column(name = "Total_reg_base_estimada")
    public Long getTotalRegistroBaseEstimada() {
        return totalRegistroBaseEstimada;
    }

    public void setTotalRegistroBaseEstimada(Long totalRegistroBaseEstimada) {
        this.totalRegistroBaseEstimada = totalRegistroBaseEstimada;
    }

    @Column(name = "Total_reg_Portal")
    public Long getTotalRegistroPortal() {
        return totalRegistroPortal;
    }

    public void setTotalRegistroPortal(Long totalRegistroPortal) {
        this.totalRegistroPortal = totalRegistroPortal;
    }

    @Column(name = "Tiempo_Segundos")
    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "ResumenCausa{" +
                "fechaInicio=" + fechaInicio +
                ", fechaTermino=" + fechaTermino +
                ", totalRegistroBase=" + totalRegistroBase +
                ", totalRegistroBaseEstimada=" + totalRegistroBaseEstimada +
                ", totalRegistroPortal=" + totalRegistroPortal +
                ", tiempo='" + tiempo + '\'' +
                '}';
    }

}
