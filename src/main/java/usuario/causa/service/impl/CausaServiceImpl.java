package usuario.causa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usuario.causa.model.CausaVO;
import usuario.causa.model.CompetenciaVO;
import usuario.causa.model.TribunalVO;
import usuario.causa.repository.CausaDAO;
import usuario.causa.repository.model.Causa;
import usuario.causa.service.CausaService;

@Service
public class CausaServiceImpl implements CausaService {

  private final CausaDAO causaDAO;

  @Autowired
  public CausaServiceImpl(CausaDAO causaDAO) {
    this.causaDAO = causaDAO;
  }

  @Override
  public CausaVO buscarCausa(Long rolCausa, String eraCausa, char tipoCausa, Long idTribunal, Long idCompetencia) {
    Causa causa = new Causa();
    CausaVO causaVO = new CausaVO();
    TribunalVO tribunalVO = new TribunalVO();
    CompetenciaVO competenciaVO = new CompetenciaVO();
    causa = this.causaDAO.buscarCausa(rolCausa, eraCausa, tipoCausa, idTribunal, idCompetencia);
    if(causa.getId() != -1L){
      causaVO.setId(causa.getId());
      causaVO.setRolCausa(causa.getRolCausa());
      causaVO.setEraCausa(causa.getEraCausa());
      causaVO.setTipoCausa(causa.getTipoCausa());
      causaVO.setGlosaParte(causa.getGlosaParte());
      causaVO.setFechaIngresoCausa(causa.getFechaIngresoCausa());
      causaVO.setFechaIngresoSistema(causa.getFechaIngresoSistema());
      tribunalVO.setGlosa(causa.getTribunal().getGlosa());
      competenciaVO.setGlosa(causa.getCompetencia().getGlosa());
      causaVO.setTribunalVO(tribunalVO);
      causaVO.setCompetenciaVO(competenciaVO);
    }else{
      causaVO.setId(-1L);
    }

    return causaVO;
  }
}
