package usuario.causa.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usuario.causa.model.CompetenciaTipoCausaVO;
import usuario.causa.model.TipoCausaVO;
import usuario.causa.repository.CompetenciaTipoCausaDAO;
import usuario.causa.repository.model.CompetenciaTipoCausa;
import usuario.causa.service.CompetenciaTipoCausaService;

@Service
public class CompetenciaTipoCausaServiceImpl implements CompetenciaTipoCausaService {

  private final CompetenciaTipoCausaDAO competenciaTipoCausaDAO;

  @Autowired
  public CompetenciaTipoCausaServiceImpl(CompetenciaTipoCausaDAO competenciaTipoCausaDAO) {
    this.competenciaTipoCausaDAO = competenciaTipoCausaDAO;
  }

  @Override
  public List<TipoCausaVO> listarTipoCausaPorCompetencia(Long idCompetencia) {
    List<CompetenciaTipoCausa> competenciaTipoCausas = this.competenciaTipoCausaDAO.listarTipoCausaPorCompetencia(idCompetencia);
    List<TipoCausaVO> tipoCausaVOS = new ArrayList<>();
    if(competenciaTipoCausas.size() > 0){
      competenciaTipoCausas.forEach(ctipo ->{
       TipoCausaVO tipoCausaVO = new TipoCausaVO();
       tipoCausaVO.setId(ctipo.getTipoCausa().getId());
       tipoCausaVO.setTipoCausa(ctipo.getTipoCausa().getTipoCausa());
       tipoCausaVOS.add(tipoCausaVO);
      });
    }

    return tipoCausaVOS;
  }
}
