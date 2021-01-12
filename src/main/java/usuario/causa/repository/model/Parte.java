package usuario.causa.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TO_PARTE")
public class Parte {

  private Long id;
  private Long tipoLitiganteCompetencia;
  private Usuario usuario;
  private Tribunal tribunal;
  private Competencia competencia;

  public Parte() {
  }

  public Parte(Long id, Long tipoLitiganteCompetencia, Usuario usuario,
      Tribunal tribunal, Competencia competencia) {
    this.id = id;
    this.tipoLitiganteCompetencia = tipoLitiganteCompetencia;
    this.usuario = usuario;
    this.tribunal = tribunal;
    this.competencia = competencia;
  }

  @Id
  @Column(name = "CRR_PARTE")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name = "CRR_TIPO_LITIGANTE_COMPETENCIA")
  public Long getTipoLitiganteCompetencia() {
    return tipoLitiganteCompetencia;
  }

  public void setTipoLitiganteCompetencia(Long tipoLitiganteCompetencia) {
    this.tipoLitiganteCompetencia = tipoLitiganteCompetencia;
  }

  @ManyToOne
  @JoinColumn(name = "CRR_PERSONA")
  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  @ManyToOne
  @JoinColumn(name = "COD_TRIBUNAL")
  public Tribunal getTribunal() {
    return tribunal;
  }

  public void setTribunal(Tribunal tribunal) {
    this.tribunal = tribunal;
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
    return "Parte{" +
        "id=" + id +
        ", tipoLitiganteCompetencia=" + tipoLitiganteCompetencia +
        ", usuario=" + usuario +
        ", tribunal=" + tribunal +
        ", competencia=" + competencia +
        '}';
  }
}
