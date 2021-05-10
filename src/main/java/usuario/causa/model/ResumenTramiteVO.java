package usuario.causa.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ResumenTramiteVO implements Serializable {

  private static final long serialVersionUID = -4445086786931447092L;
  private Long id;
  private LocalDateTime fechaInicio;
  private LocalDateTime fechaTermino;
  private Long totalRegistroBase;
  private Long totalRegistroBaseEstimada;
  private Long totalRegistroPortal;
  private String tiempo;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDateTime getFechaInicio() {
    return fechaInicio;
  }

  public void setFechaInicio(LocalDateTime fechaInicio) {
    this.fechaInicio = fechaInicio;
  }

  public LocalDateTime getFechaTermino() {
    return fechaTermino;
  }

  public void setFechaTermino(LocalDateTime fechaTermino) {
    this.fechaTermino = fechaTermino;
  }

  public Long getTotalRegistroBase() {
    return totalRegistroBase;
  }

  public void setTotalRegistroBase(Long totalRegistroBase) {
    this.totalRegistroBase = totalRegistroBase;
  }

  public Long getTotalRegistroBaseEstimada() {
    return totalRegistroBaseEstimada;
  }

  public void setTotalRegistroBaseEstimada(Long totalRegistroBaseEstimada) {
    this.totalRegistroBaseEstimada = totalRegistroBaseEstimada;
  }

  public Long getTotalRegistroPortal() {
    return totalRegistroPortal;
  }

  public void setTotalRegistroPortal(Long totalRegistroPortal) {
    this.totalRegistroPortal = totalRegistroPortal;
  }

  public String getTiempo() {
    return tiempo;
  }

  public void setTiempo(String tiempo) {
    this.tiempo = tiempo;
  }

  @Override
  public String toString() {
    return "ResumenTramiteVO{" +
        "id=" + id +
        ", fechaInicio=" + fechaInicio +
        ", fechaTermino=" + fechaTermino +
        ", totalRegistroBase=" + totalRegistroBase +
        ", totalRegistroBaseEstimada=" + totalRegistroBaseEstimada +
        ", totalRegistroPortal=" + totalRegistroPortal +
        ", tiempo='" + tiempo + '\'' +
        '}';
  }
}
