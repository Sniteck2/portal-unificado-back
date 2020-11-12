package usuario.causa.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TG_TIPO_CAUSA")
public class TipoCausa {

  private Long id;
  private String glosa;
  private String tipoCausa;
  private Long flgActivo;

  public TipoCausa() {
  }

  public TipoCausa(Long id, String glosa, String tipoCausa, Long flgActivo) {
    this.id = id;
    this.glosa = glosa;
    this.tipoCausa = tipoCausa;
    this.flgActivo = flgActivo;
  }

  @Id
  @Column(name = "COD_TIPO_CAUSA")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name = "GLS_TIPO_CAUSA")
  public String getGlosa() {
    return glosa;
  }

  public void setGlosa(String glosa) {
    this.glosa = glosa;
  }

  @Column(name = "TIP_CAUSA")
  public String getTipoCausa() {
    return tipoCausa;
  }

  public void setTipoCausa(String tipoCausa) {
    this.tipoCausa = tipoCausa;
  }

  @Column(name = "FLG_ACTIVO")
  public Long getFlgActivo() {
    return flgActivo;
  }

  public void setFlgActivo(Long flgActivo) {
    this.flgActivo = flgActivo;
  }

  @Override
  public String toString() {
    return "TipoCausa{" +
        "id=" + id +
        ", glosa='" + glosa + '\'' +
        ", tipoCausa='" + tipoCausa + '\'' +
        ", flgActivo=" + flgActivo +
        '}';
  }
}
