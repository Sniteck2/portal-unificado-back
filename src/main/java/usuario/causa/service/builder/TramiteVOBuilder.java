package usuario.causa.service.builder;

import java.util.Objects;
import usuario.causa.model.TramiteVO;
import usuario.causa.repository.model.Tramite;
import usuario.causa.service.util.EstadoFirmaEnum;
import usuario.causa.service.util.EtapaEnum;
import usuario.causa.service.util.TipoTramiteEnum;

public class TramiteVOBuilder {

  private Tramite tramite;

  public TramiteVOBuilder fromTramiteVOBuilder(Tramite tramite) {
    this.tramite = tramite;
    return this;
  }

  public TramiteVO build() {
    if (tramite == null) {
      return null;
    }

    TramiteVO tramiteVO = new TramiteVO();
    tramiteVO.setId(tramite.getId());
    tramiteVO.setIdDocumento(tramite.getIdDocumento());
    tramiteVO.setFecha(tramite.getFecha());
    tramiteVO.setTipoTramite(
        Objects.requireNonNull(TipoTramiteEnum.findByValue(tramite.getTipoTramite())).toString());
    tramiteVO
        .setEtapa(Objects.requireNonNull(EtapaEnum.findByValue(tramite.getEtapa())).toString());
    tramiteVO.setReferencia(tramite.getReferencia());
    tramiteVO.setEstadoFirma(Objects.requireNonNull(EstadoFirmaEnum.findByValue(
        tramite.getEstadoFirma())).toString());
    tramiteVO.setIdCuaderno(tramite.getIdCuaderno());
    return tramiteVO;
  }

}
