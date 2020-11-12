package usuario.causa.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TG_COMPETENCIA")
public class Competencia {

  private Long id;
  private String glosa;
  private String idfLetra;
  private Long flgActivo;
  private Long orden;


  public Competencia() {
  }

  public Competencia(Long id, String glosa, String idfLetra, Long flgActivo, Long orden) {
    this.id = id;
    this.glosa = glosa;
    this.idfLetra = idfLetra;
    this.flgActivo = flgActivo;
    this.orden = orden;
  }

  @Id
  @Column(name = "COD_COMPETENCIA")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name = "GLS_COMPETENCIA")
  public String getGlosa() {
    return glosa;
  }

  public void setGlosa(String glosa) {
    this.glosa = glosa;
  }

  @Column(name = "IDF_LETRA")
  public String getIdfLetra() {
    return idfLetra;
  }

  public void setIdfLetra(String idfLetra) {
    this.idfLetra = idfLetra;
  }

  @Column(name = "FLG_ACTIVO")
  public Long getFlgActivo() {
    return flgActivo;
  }

  public void setFlgActivo(Long flgActivo) {
    this.flgActivo = flgActivo;
  }

  @Column(name = "ORDEN")
  public Long getOrden() {
    return orden;
  }

  public void setOrden(Long orden) {
    this.orden = orden;
  }

  @Override
  public String toString() {
    return "Competencia{" +
        "id=" + id +
        ", glosa='" + glosa + '\'' +
        ", idfLetra='" + idfLetra + '\'' +
        ", flgActivo=" + flgActivo +
        ", orden=" + orden +
        '}';
  }
}
