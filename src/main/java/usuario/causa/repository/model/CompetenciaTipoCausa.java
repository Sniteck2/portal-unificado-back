package usuario.causa.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TREL_COMPETENCIA_TIPO_CAUSA")
public class CompetenciaTipoCausa {

  private Long id;
  private TipoCausa tipoCausa;
  private Competencia competencia;

  public CompetenciaTipoCausa() {
  }

  public CompetenciaTipoCausa(Long id, TipoCausa tipoCausa,
      Competencia competencia) {
    this.id = id;
    this.tipoCausa = tipoCausa;
    this.competencia = competencia;
  }

  @Id
  @Column(name = "CRR_COMP_TIP_CAUSA")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @ManyToOne
  @JoinColumn(name = "COD_TIPO_CAUSA")
  public TipoCausa getTipoCausa() {
    return tipoCausa;
  }

  public void setTipoCausa(TipoCausa tipoCausa) {
    this.tipoCausa = tipoCausa;
  }

  @ManyToOne
  @JoinColumn(name = "COD_COMPETENCIA")
  public Competencia getCompetencia() {
    return competencia;
  }

  public void setCompetencia(Competencia competencia) {
    this.competencia = competencia;
  }

  @Override
  public String toString() {
    return "CompetenciaTipoCausa{" +
        "id=" + id +
        ", tipoCausa=" + tipoCausa +
        ", competencia=" + competencia +
        '}';
  }
}
