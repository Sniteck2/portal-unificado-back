package usuario.causa.model;

import java.io.Serializable;
import java.util.Date;

public class TipoEscritoVO implements Serializable {

  private static final long serialVersionUID = 7711141461113524793L;
  private Long id;
  private String glosa;
  private Long flgActivo;
  private Date fechaCreacion;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getGlosa() {
    return glosa;
  }

  public void setGlosa(String glosa) {
    this.glosa = glosa;
  }

  public Long getFlgActivo() {
    return flgActivo;
  }

  public void setFlgActivo(Long flgActivo) {
    this.flgActivo = flgActivo;
  }

  public Date getFechaCreacion() {
    return fechaCreacion;
  }

  public void setFechaCreacion(Date fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
  }

  @Override
  public String toString() {
    return "TipoEscritoVO{" +
        "id=" + id +
        ", glosa='" + glosa + '\'' +
        ", flgActivo=" + flgActivo +
        ", fechaCreacion=" + fechaCreacion +
        '}';
  }
}
