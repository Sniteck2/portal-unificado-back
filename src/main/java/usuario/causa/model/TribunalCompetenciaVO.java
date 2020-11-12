package usuario.causa.model;

import java.io.Serializable;

public class TribunalCompetenciaVO implements Serializable {

  private static final long serialVersionUID = 7151693187436561128L;
  private TribunalVO tribunalVO;
  private CompetenciaVO competenciaVO;
  private Long flgActivo;

  public TribunalVO getTribunalVO() {
    return tribunalVO;
  }

  public void setTribunalVO(TribunalVO tribunalVO) {
    this.tribunalVO = tribunalVO;
  }

  public CompetenciaVO getCompetenciaVO() {
    return competenciaVO;
  }

  public void setCompetenciaVO(CompetenciaVO competenciaVO) {
    this.competenciaVO = competenciaVO;
  }

  public Long getFlgActivo() {
    return flgActivo;
  }

  public void setFlgActivo(Long flgActivo) {
    this.flgActivo = flgActivo;
  }

  @Override
  public String toString() {
    return "TribunalCompetenciaVO{" +
        "tribunalVO=" + tribunalVO +
        ", competenciaVO=" + competenciaVO +
        ", flgActivo=" + flgActivo +
        '}';
  }
}
