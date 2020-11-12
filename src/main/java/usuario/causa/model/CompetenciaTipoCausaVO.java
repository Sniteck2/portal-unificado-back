package usuario.causa.model;

import java.io.Serializable;

public class CompetenciaTipoCausaVO implements Serializable {

  private static final long serialVersionUID = -4568768695393493450L;
  private Long id;
  private TipoCausaVO tipoCausaVO;
  private CompetenciaVO competenciaVO;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TipoCausaVO getTipoCausaVO() {
    return tipoCausaVO;
  }

  public void setTipoCausaVO(TipoCausaVO tipoCausaVO) {
    this.tipoCausaVO = tipoCausaVO;
  }

  public CompetenciaVO getCompetenciaVO() {
    return competenciaVO;
  }

  public void setCompetenciaVO(CompetenciaVO competenciaVO) {
    this.competenciaVO = competenciaVO;
  }

  @Override
  public String toString() {
    return "CompetenciaTipoCausaVO{" +
        "id=" + id +
        ", tipoCausaVO=" + tipoCausaVO +
        ", competenciaVO=" + competenciaVO +
        '}';
  }
}
