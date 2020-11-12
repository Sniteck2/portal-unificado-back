package usuario.causa.model;

import java.io.Serializable;

public class TipoCausaVO implements Serializable {

  private static final long serialVersionUID = 2568162100244045646L;
  private Long id;
  private String glosa;
  private String tipoCausa;
  private Long flgActivo;

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

  public String getTipoCausa() {
    return tipoCausa;
  }

  public void setTipoCausa(String tipoCausa) {
    this.tipoCausa = tipoCausa;
  }

  public Long getFlgActivo() {
    return flgActivo;
  }

  public void setFlgActivo(Long flgActivo) {
    this.flgActivo = flgActivo;
  }

  @Override
  public String toString() {
    return "TipoCausaVO{" +
        "id=" + id +
        ", glosa='" + glosa + '\'' +
        ", tipoCausa='" + tipoCausa + '\'' +
        ", flgActivo=" + flgActivo +
        '}';
  }
}
