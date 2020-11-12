package usuario.causa.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TREL_TRIBUNAL_COMPETENCIA")
public class TribunalCompetencia {

  private Long id;
  private Tribunal tribunal;
  private Competencia competencia;
  private Long flgActivo;

  public TribunalCompetencia() {
  }

  public TribunalCompetencia(Long id, Tribunal tribunal,
      Competencia competencia, Long flgActivo) {
    this.id = id;
    this.tribunal = tribunal;
    this.competencia = competencia;
    this.flgActivo = flgActivo;
  }

  @Id
  @Column(name = "CRR_TRIBUNAL_COMPETENCIA")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "COD_TRIBUNAL")
  public Tribunal getTribunal() {
    return tribunal;
  }

  public void setTribunal(Tribunal tribunal) {
    this.tribunal = tribunal;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "COD_COMPETENCIA")
  public Competencia getCompetencia() {
    return competencia;
  }

  public void setCompetencia(Competencia competencia) {
    this.competencia = competencia;
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
    return "TribunalCompetencia{" +
        "tribunal=" + tribunal +
        ", competencia=" + competencia +
        ", flgActivo=" + flgActivo +
        '}';
  }
}
