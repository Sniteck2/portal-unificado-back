package usuario.causa.model;

import java.io.Serializable;

public class TribunalVO implements Serializable {

  private static final long serialVersionUID = -5576371850587762418L;
  private Long id;
  private Long codCorte;
  private Long tipJuridisccion;
  private String glosa;
  private Long flgActivo;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getCodCorte() {
    return codCorte;
  }

  public void setCodCorte(Long codCorte) {
    this.codCorte = codCorte;
  }

  public Long getTipJuridisccion() {
    return tipJuridisccion;
  }

  public void setTipJuridisccion(Long tipJuridisccion) {
    this.tipJuridisccion = tipJuridisccion;
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

  @Override
  public String toString() {
    return "TribunalVO{" +
        "id=" + id +
        ", codCorte=" + codCorte +
        ", tipJuridisccion=" + tipJuridisccion +
        ", glosa='" + glosa + '\'' +
        ", flgActivo=" + flgActivo +
        '}';
  }
}
