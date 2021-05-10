package usuario.causa.repository.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TG_TIPO_ESCRITO")
public class TipoEscrito {

  private Long id;
  private String glosa;
  private Long flgActivo;
  private Date fechaCreacion;

  public TipoEscrito() {
  }

  public TipoEscrito(Long id, String glosa, Long flgActivo, Date fechaCreacion) {
    this.id = id;
    this.glosa = glosa;
    this.flgActivo = flgActivo;
    this.fechaCreacion = fechaCreacion;
  }

  @Id
  @Column(name = "COD_TIPO_ESCRITO")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name = "GLS_TIPO_ESCRITO")
  public String getGlosa() {
    return glosa;
  }

  public void setGlosa(String glosa) {
    this.glosa = glosa;
  }

  @Column(name = "FLG_ACTIVO")
  public Long getFlgActivo() {
    return flgActivo;
  }

  public void setFlgActivo(Long flgActivo) {
    this.flgActivo = flgActivo;
  }

  @Column(name = "FEC_CREACION")
  public Date getFechaCreacion() {
    return fechaCreacion;
  }

  public void setFechaCreacion(Date fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
  }
}
