package usuario.causa.service.builder;

import usuario.causa.model.ResumenTramiteVO;
import usuario.causa.repository.model.ResumenTramite;

public class ResumenTramiteVOBuilder {

  private ResumenTramite resumenTramite;

  public ResumenTramiteVOBuilder fromResumenTramite(ResumenTramite resumenTramite){
    this.resumenTramite = resumenTramite;
    return this;
  }

  public ResumenTramiteVO build(){
    if(resumenTramite == null){
      return null;
    }
    ResumenTramiteVO resumenTramiteVO = new ResumenTramiteVO();
    resumenTramiteVO.setId(resumenTramite.getId());
    resumenTramiteVO.setFechaInicio(resumenTramite.getFechaInicio());
    resumenTramiteVO.setFechaTermino(resumenTramite.getFechaTermino());
    resumenTramiteVO.setTotalRegistroBase(resumenTramite.getTotalRegistroBase());
    resumenTramiteVO.setTotalRegistroBaseEstimada(resumenTramite.getTotalRegistroBaseEstimada());
    resumenTramiteVO.setTotalRegistroPortal(resumenTramite.getTotalRegistroPortal());
    resumenTramiteVO.setTiempo(resumenTramite.getTiempo());
    return resumenTramiteVO;
  }

}
