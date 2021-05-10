package usuario.causa.model;

import java.io.Serializable;
import java.util.Date;

public class EscritoVO implements Serializable {

  private static final long serialVersionUID = -7162265386413076246L;
  private Long id;
  private Long idDocumento;
  private Long numeroFolio;
  private Date fechaPresentacion;
  private TipoEscritoVO tipoEscritoVO;
  private String referencia;
  private Long idCuaderno;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getIdDocumento() {
    return idDocumento;
  }

  public void setIdDocumento(Long idDocumento) {
    this.idDocumento = idDocumento;
  }

  public Long getNumeroFolio() {
    return numeroFolio;
  }

  public void setNumeroFolio(Long numeroFolio) {
    this.numeroFolio = numeroFolio;
  }

  public Date getFechaPresentacion() {
    return fechaPresentacion;
  }

  public void setFechaPresentacion(Date fechaPresentacion) {
    this.fechaPresentacion = fechaPresentacion;
  }

  public TipoEscritoVO getTipoEscritoVO() {
    return tipoEscritoVO;
  }

  public void setTipoEscritoVO(TipoEscritoVO tipoEscritoVO) {
    this.tipoEscritoVO = tipoEscritoVO;
  }

  public String getReferencia() {
    return referencia;
  }

  public void setReferencia(String referencia) {
    this.referencia = referencia;
  }

  public Long getIdCuaderno() {
    return idCuaderno;
  }

  public void setIdCuaderno(Long idCuaderno) {
    this.idCuaderno = idCuaderno;
  }

  @Override
  public String toString() {
    return "EscritoVO{" +
        "id=" + id +
        ", idDocumento=" + idDocumento +
        ", numeroFolio=" + numeroFolio +
        ", fechaPresentacion=" + fechaPresentacion +
        ", tipoEscritoVO=" + tipoEscritoVO +
        ", referencia='" + referencia + '\'' +
        ", idCuaderno=" + idCuaderno +
        '}';
  }
}
