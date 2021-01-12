package usuario.causa.model;

import java.io.Serializable;

public class CuadernoParteVO implements Serializable {

  private static final long serialVersionUID = -7894990836247234577L;
  private Long id;
  private CuadernoVO cuadernoVO;
  private ParteVO parteVO;
  private TribunalVO tribunalVO;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CuadernoVO getCuadernoVO() {
    return cuadernoVO;
  }

  public void setCuadernoVO(CuadernoVO cuadernoVO) {
    this.cuadernoVO = cuadernoVO;
  }

  public ParteVO getParteVO() {
    return parteVO;
  }

  public void setParteVO(ParteVO parteVO) {
    this.parteVO = parteVO;
  }

  public TribunalVO getTribunalVO() {
    return tribunalVO;
  }

  public void setTribunalVO(TribunalVO tribunalVO) {
    this.tribunalVO = tribunalVO;
  }

  @Override
  public String toString() {
    return "CuadernoParteVO{" +
        "id=" + id +
        ", cuadernoVO=" + cuadernoVO +
        ", parteVO=" + parteVO +
        ", tribunalVO=" + tribunalVO +
        '}';
  }
}
