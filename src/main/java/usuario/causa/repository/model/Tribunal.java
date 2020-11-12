package usuario.causa.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TG_TRIBUNAL")
public class Tribunal {

  private Long id;
  private Long codCorte;
  private Long tipJuridisccion;
  private String glosa;
  private Long flgActivo;

  public Tribunal() {
  }

  public Tribunal(Long id, Long codCorte, Long tipJuridisccion, String glosa,
      Long flgActivo) {
    this.id = id;
    this.codCorte = codCorte;
    this.tipJuridisccion = tipJuridisccion;
    this.glosa = glosa;
    this.flgActivo = flgActivo;
  }

  @Id
  @Column(name = "COD_TRIBUNAL")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name = "COD_CORTE")
  public Long getCodCorte() {
    return codCorte;
  }

  public void setCodCorte(Long codCorte) {
    this.codCorte = codCorte;
  }

  @Column(name = "TIP_JURISDICCION")
  public Long getTipJuridisccion() {
    return tipJuridisccion;
  }

  public void setTipJuridisccion(Long tipJuridisccion) {
    this.tipJuridisccion = tipJuridisccion;
  }

  @Column(name = "GLS_TRIBUNAL")
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

  @Override
  public String toString() {
    return "Tribunal{" +
        "id=" + id +
        ", codCorte=" + codCorte +
        ", tipJuridisccion=" + tipJuridisccion +
        ", glosa='" + glosa + '\'' +
        ", flgActivo=" + flgActivo +
        '}';
  }
}
