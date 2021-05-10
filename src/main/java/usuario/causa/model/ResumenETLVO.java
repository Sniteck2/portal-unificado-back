package usuario.causa.model;

import java.io.Serializable;
import java.util.List;

public class ResumenETLVO implements Serializable {

  private static final long serialVersionUID = 8793110700938049480L;
  private List<ResumenCausaVO> resumenCausaVOS;
  private List<ResumenCuadernoVO> resumenCuadernoVOS;
  private List<ResumenEscritoVO> resumenEscritoVOS;
  private List<ResumenParteVO> resumenParteVOS;
  private List<ResumenTramiteVO> resumenTramiteVOS;

  public List<ResumenCausaVO> getResumenCausaVOS() {
    return resumenCausaVOS;
  }

  public void setResumenCausaVOS(List<ResumenCausaVO> resumenCausaVOS) {
    this.resumenCausaVOS = resumenCausaVOS;
  }

  public List<ResumenCuadernoVO> getResumenCuadernoVOS() {
    return resumenCuadernoVOS;
  }

  public void setResumenCuadernoVOS(
      List<ResumenCuadernoVO> resumenCuadernoVOS) {
    this.resumenCuadernoVOS = resumenCuadernoVOS;
  }

  public List<ResumenEscritoVO> getResumenEscritoVOS() {
    return resumenEscritoVOS;
  }

  public void setResumenEscritoVOS(List<ResumenEscritoVO> resumenEscritoVOS) {
    this.resumenEscritoVOS = resumenEscritoVOS;
  }

  public List<ResumenParteVO> getResumenParteVOS() {
    return resumenParteVOS;
  }

  public void setResumenParteVOS(List<ResumenParteVO> resumenParteVOS) {
    this.resumenParteVOS = resumenParteVOS;
  }

  public List<ResumenTramiteVO> getResumenTramiteVOS() {
    return resumenTramiteVOS;
  }

  public void setResumenTramiteVOS(List<ResumenTramiteVO> resumenTramiteVOS) {
    this.resumenTramiteVOS = resumenTramiteVOS;
  }

  @Override
  public String toString() {
    return "ResumenETLVO{" +
        "resumenCausaVOS=" + resumenCausaVOS +
        ", resumenCuadernoVOS=" + resumenCuadernoVOS +
        ", resumenEscritoVOS=" + resumenEscritoVOS +
        ", resumenParteVOS=" + resumenParteVOS +
        ", resumenTramiteVOS=" + resumenTramiteVOS +
        '}';
  }
}
