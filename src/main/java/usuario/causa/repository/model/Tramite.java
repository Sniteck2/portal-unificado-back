package usuario.causa.repository.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TO_TRAMITE")
public class Tramite {

  private Long id;
  private Long idCausa;
  private Long idDocumento;
  private Date fecha;
  private Long tipoTramite;
  private Long etapa;
  private String referencia;
  private Long estadoFirma;

  public Tramite() {
  }

  @Id
  @Column(name = "CRR_TRAMITE")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name = "CRR_CAUSA")
  public Long getIdCausa() {
    return idCausa;
  }

  public void setIdCausa(Long idCausa) {
    this.idCausa = idCausa;
  }

  @Column(name = "CRR_DOCUMENTO")
  public Long getIdDocumento() {
    return idDocumento;
  }

  public void setIdDocumento(Long idDocumento) {
    this.idDocumento = idDocumento;
  }

  @Column(name = "FEC_TRAMITE")
  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  @Column(name = "COD_TIPTRAMITE")
  public Long getTipoTramite() {
    return tipoTramite;
  }

  public void setTipoTramite(Long tipoTramite) {
    this.tipoTramite = tipoTramite;
  }

  @Column(name = "COD_ETAPA")
  public Long getEtapa() {
    return etapa;
  }

  public void setEtapa(Long etapa) {
    this.etapa = etapa;
  }

  @Column(name = "GLS_REFERENCIA")
  public String getReferencia() {
    return referencia;
  }

  public void setReferencia(String referencia) {
    this.referencia = referencia;
  }

  @Column(name = "COD_ESTADO_FIRMA")
  public Long getEstadoFirma() {
    return estadoFirma;
  }

  public void setEstadoFirma(Long estadoFirma) {
    this.estadoFirma = estadoFirma;
  }

  @Override
  public String toString() {
    return "Tramite{" +
        "id=" + id +
        ", idCausa=" + idCausa +
        ", idDocumento=" + idDocumento +
        ", fecha=" + fecha +
        ", tipoTramite='" + tipoTramite + '\'' +
        ", etapa='" + etapa + '\'' +
        ", referencia='" + referencia + '\'' +
        ", estadoFirma='" + estadoFirma + '\'' +
        '}';
  }
}
