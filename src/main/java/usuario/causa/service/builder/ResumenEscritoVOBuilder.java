package usuario.causa.service.builder;

import usuario.causa.model.ResumenEscritoVO;
import usuario.causa.repository.model.ResumenEscrito;

public class ResumenEscritoVOBuilder {

    private ResumenEscrito resumenEscrito;

    public ResumenEscritoVOBuilder fromResumenEscrito(ResumenEscrito resumenEscrito){
        this.resumenEscrito = resumenEscrito;
        return this;
    }

    public ResumenEscritoVO build(){
        if(resumenEscrito == null){
            return null;
        }
        ResumenEscritoVO resumenEscritoVO = new ResumenEscritoVO();
        resumenEscritoVO.setId(resumenEscrito.getId());
        resumenEscritoVO.setFechaInicio(resumenEscrito.getFechaInicio());
        resumenEscritoVO.setFechaTermino(resumenEscrito.getFechaTermino());
        resumenEscritoVO.setTotalRegistroBase(resumenEscrito.getTotalRegistroBase());
        resumenEscritoVO.setTotalRegistroBaseEstimada(resumenEscrito.getTotalRegistroBaseEstimada());
        resumenEscritoVO.setTotalRegistroPortal(resumenEscrito.getTotalRegistroPortal());
        resumenEscritoVO.setTiempo(resumenEscrito.getTiempo());
        return resumenEscritoVO;
    }

}
