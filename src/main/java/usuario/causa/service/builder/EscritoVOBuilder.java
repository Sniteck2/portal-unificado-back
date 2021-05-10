package usuario.causa.service.builder;

import usuario.causa.model.EscritoVO;
import usuario.causa.repository.model.Escrito;

public class EscritoVOBuilder {

  private Escrito escrito;

  public EscritoVOBuilder fromEscritoVOBuilder(Escrito escrito){
    this.escrito = escrito;
    return this;
  }

  public EscritoVO build(){
    if(escrito == null){
      return null;
    }

    EscritoVO escritoVO = new EscritoVO();
    escritoVO.setId(escrito.getId());
    escritoVO.setIdCuaderno(escrito.getIdCuaderno());
    escritoVO.setFechaPresentacion(escrito.getFechaPresentacion());
    escritoVO.setIdDocumento(escrito.getIdDocumento());
    escritoVO.setNumeroFolio(escrito.getNumeroFolio());
    escritoVO.setReferencia(escrito.getReferencia());
    escritoVO.setTipoEscritoVO(VOBuilderFactory.getTipoEscritoVOBuilder(escrito.getTipoEscrito()).build());
    return escritoVO;
  }

}
