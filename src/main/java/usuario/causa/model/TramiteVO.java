package usuario.causa.model;

import java.io.Serializable;
import java.util.Date;

public class TramiteVO implements Serializable {

  private static final long serialVersionUID = 7446622982158540484L;
  private Long id;
  private Long idDocumento;
  private Date fecha;
  private String tipoTramite;
  private String etapa;
  private String referencia;
  private String estadoFirma;

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

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public String getTipoTramite() {
    return tipoTramite;
  }

  public void setTipoTramite(String tipoTramite) {
    this.tipoTramite = tipoTramite;
  }

  public String getEtapa() {
    return etapa;
  }

  public void setEtapa(String etapa) {
    this.etapa = etapa;
  }

  public String getReferencia() {
    return referencia;
  }

  public void setReferencia(String referencia) {
    this.referencia = referencia;
  }

  public String getEstadoFirma() {
    return estadoFirma;
  }

  public void setEstadoFirma(String estadoFirma) {
    this.estadoFirma = estadoFirma;
  }

  @Override
  public String toString() {
    return "TramiteVO{" +
        "id=" + id +
        ", idDocumento=" + idDocumento +
        ", fecha=" + fecha +
        ", tipoTramite='" + tipoTramite + '\'' +
        ", etapa='" + etapa + '\'' +
        ", referencia='" + referencia + '\'' +
        ", estadoFirma='" + estadoFirma + '\'' +
        '}';
  }
}
