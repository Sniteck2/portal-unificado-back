package usuario.causa.service.builder;

import usuario.causa.model.TipoEscritoVO;
import usuario.causa.repository.model.TipoEscrito;

public class TipoEscritoVOBuilder {

  private TipoEscrito tipoEscrito;

  public TipoEscritoVOBuilder fromTipoEscritoVOBuilder(TipoEscrito tipoEscrito){
    this.tipoEscrito = tipoEscrito;
    return this;
  }

  public TipoEscritoVO build(){
    if(tipoEscrito == null){
      return null;
    }

    TipoEscritoVO tipoEscritoVO = new TipoEscritoVO();
    tipoEscritoVO.setId(tipoEscrito.getId());
    tipoEscritoVO.setGlosa(tipoEscrito.getGlosa());
    tipoEscritoVO.setFlgActivo(tipoEscrito.getFlgActivo());
    tipoEscritoVO.setFechaCreacion(tipoEscrito.getFechaCreacion());
    return tipoEscritoVO;
  }

}
