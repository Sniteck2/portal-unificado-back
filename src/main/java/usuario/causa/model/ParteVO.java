package usuario.causa.model;

import java.io.Serializable;

public class ParteVO implements Serializable {

  private static final long serialVersionUID = 4733745626293621665L;
  private Long id;
  private Long tipoLitiganteCompetencia;
  private UsuarioVO usuarioVO;
  private TribunalVO tribunalVO;
  private CompetenciaVO competencia;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getTipoLitiganteCompetencia() {
    return tipoLitiganteCompetencia;
  }

  public void setTipoLitiganteCompetencia(Long tipoLitiganteCompetencia) {
    this.tipoLitiganteCompetencia = tipoLitiganteCompetencia;
  }

  public UsuarioVO getUsuarioVO() {
    return usuarioVO;
  }

  public void setUsuarioVO(UsuarioVO usuarioVO) {
    this.usuarioVO = usuarioVO;
  }

  public TribunalVO getTribunalVO() {
    return tribunalVO;
  }

  public void setTribunalVO(TribunalVO tribunalVO) {
    this.tribunalVO = tribunalVO;
  }

  public CompetenciaVO getCompetencia() {
    return competencia;
  }

  public void setCompetencia(CompetenciaVO competencia) {
    this.competencia = competencia;
  }

  @Override
  public String toString() {
    return "ParteVO{" +
        "id=" + id +
        ", tipoLitiganteCompetencia=" + tipoLitiganteCompetencia +
        ", usuarioVO=" + usuarioVO +
        ", tribunalVO=" + tribunalVO +
        ", competencia=" + competencia +
        '}';
  }
}
