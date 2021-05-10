package usuario.causa.repository.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TO_ESCRITO")
public class Escrito {

  private Long id;
  private Long idDocumento;
  private Long numeroFolio;
  private Date fechaPresentacion;
  private TipoEscrito tipoEscrito;
  private String referencia;
  private Long idCuaderno;

  public Escrito() {
  }

  public Escrito(Long id, Long idDocumento, Long numeroFolio, Date fechaPresentacion,
      TipoEscrito tipoEscrito, String referencia, Long idCuaderno) {
    this.id = id;
    this.idDocumento = idDocumento;
    this.numeroFolio = numeroFolio;
    this.fechaPresentacion = fechaPresentacion;
    this.tipoEscrito = tipoEscrito;
    this.referencia = referencia;
    this.idCuaderno = idCuaderno;
  }

  @Id
  @Column(name = "CRR_ESCRITO")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name = "CRR_DOCUMENTO_ESC")
  public Long getIdDocumento() {
    return idDocumento;
  }

  public void setIdDocumento(Long idDocumento) {
    this.idDocumento = idDocumento;
  }

  @Column(name = "NUM_FOLIO")
  public Long getNumeroFolio() {
    return numeroFolio;
  }

  public void setNumeroFolio(Long numeroFolio) {
    this.numeroFolio = numeroFolio;
  }

  @Column(name = "FEC_INGRESO")
  public Date getFechaPresentacion() {
    return fechaPresentacion;
  }

  public void setFechaPresentacion(Date fechaPresentacion) {
    this.fechaPresentacion = fechaPresentacion;
  }

  @ManyToOne
  @JoinColumn(name = "CRR_TIP_ESCRITO")
  public TipoEscrito getTipoEscrito() {
    return tipoEscrito;
  }

  public void setTipoEscrito(TipoEscrito tipoEscrito) {
    this.tipoEscrito = tipoEscrito;
  }

  @Column(name = "GLS_REFERENCIA")
  public String getReferencia() {
    return referencia;
  }

  public void setReferencia(String referencia) {
    this.referencia = referencia;
  }

  @Column(name = "CRR_CUADERNO")
  public Long getIdCuaderno() {
    return idCuaderno;
  }

  public void setIdCuaderno(Long idCuaderno) {
    this.idCuaderno = idCuaderno;
  }

  @Override
  public String toString() {
    return "Escrito{" +
        "id=" + id +
        ", idDocumento=" + idDocumento +
        ", numeroFolio=" + numeroFolio +
        ", fechaPresentacion=" + fechaPresentacion +
        ", tipoEscrito=" + tipoEscrito +
        ", referencia='" + referencia + '\'' +
        '}';
  }
}
