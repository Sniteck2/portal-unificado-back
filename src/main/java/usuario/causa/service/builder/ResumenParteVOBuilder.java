package usuario.causa.service.builder;

import usuario.causa.model.ResumenParteVO;
import usuario.causa.repository.model.ResumenParte;

public class ResumenParteVOBuilder {

  private ResumenParte resumenParte;

  public ResumenParteVOBuilder fromResumenParte(ResumenParte resumenParte){
    this.resumenParte = resumenParte;
    return this;
  }

  public ResumenParteVO build(){
    if(resumenParte == null){
      return null;
    }
    ResumenParteVO resumenParteVO = new ResumenParteVO();
    resumenParteVO.setId(resumenParte.getId());
    resumenParteVO.setFechaInicio(resumenParte.getFechaInicio());
    resumenParteVO.setFechaTermino(resumenParte.getFechaTermino());
    resumenParteVO.setTotalRegistroBase(resumenParte.getTotalRegistroBase());
    resumenParteVO.setTotalRegistroBaseEstimada(resumenParte.getTotalRegistroBaseEstimada());
    resumenParteVO.setTotalRegistroPortal(resumenParte.getTotalRegistroPortal());
    resumenParteVO.setTiempo(resumenParte.getTiempo());
    return resumenParteVO;
  }

}
