package usuario.causa.model;

import java.io.Serializable;

public class CompetenciaVO implements Serializable {

  private static final long serialVersionUID = -8249868242293971220L;
  private Long id;
  private String glosa;
  private String idfLetra;
  private Long flgActivo;
  private Long orden;

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

  public String getIdfLetra() {
    return idfLetra;
  }

  public void setIdfLetra(String idfLetra) {
    this.idfLetra = idfLetra;
  }

  public Long getFlgActivo() {
    return flgActivo;
  }

  public void setFlgActivo(Long flgActivo) {
    this.flgActivo = flgActivo;
  }

  public Long getOrden() {
    return orden;
  }

  public void setOrden(Long orden) {
    this.orden = orden;
  }

  @Override
  public String toString() {
    return "CompetenciaVO{" +
        "id=" + id +
        ", glosa='" + glosa + '\'' +
        ", idfLetra='" + idfLetra + '\'' +
        ", flgActivo=" + flgActivo +
        ", orden=" + orden +
        '}';
  }
}
