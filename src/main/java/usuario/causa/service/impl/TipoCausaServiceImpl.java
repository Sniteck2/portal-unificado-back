package usuario.causa.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usuario.causa.model.TipoCausaVO;
import usuario.causa.repository.TipoCausaDAO;
import usuario.causa.repository.model.TipoCausa;
import usuario.causa.service.TipoCausaService;

@Service
public class TipoCausaServiceImpl implements TipoCausaService {

  private final TipoCausaDAO tipoCausaDAO;

  @Autowired
  public TipoCausaServiceImpl(TipoCausaDAO tipoCausaDAO) {
    this.tipoCausaDAO = tipoCausaDAO;
  }

  @Override
  public List<TipoCausaVO> listarTipoCausas() {
    List<TipoCausa> tipoCausas = this.tipoCausaDAO.listarTipoCausas();
    List<TipoCausaVO> tipoCausaVOS = new ArrayList<>();
    if(tipoCausas.size() > 0){
      tipoCausas.forEach(tip ->{
        TipoCausaVO tipoCausaVO = new TipoCausaVO();
        tipoCausaVO.setId(tip.getId());
        tipoCausaVO.setTipoCausa(tip.getTipoCausa());
        tipoCausaVO.setGlosa(tip.getGlosa());
        tipoCausaVO.setFlgActivo(tip.getFlgActivo());
        tipoCausaVOS.add(tipoCausaVO);
      });
    }

    return tipoCausaVOS;
  }
}
