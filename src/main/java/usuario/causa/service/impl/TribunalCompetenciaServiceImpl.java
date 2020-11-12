package usuario.causa.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usuario.causa.model.TribunalCompetenciaVO;
import usuario.causa.model.TribunalVO;
import usuario.causa.repository.TribunalCompetenciaDAO;
import usuario.causa.repository.model.TribunalCompetencia;
import usuario.causa.service.TribunalCompetenciaService;

@Service
public class TribunalCompetenciaServiceImpl implements TribunalCompetenciaService {

  private final TribunalCompetenciaDAO tribunalCompetenciaDAO;

  @Autowired
  public TribunalCompetenciaServiceImpl(
      TribunalCompetenciaDAO tribunalCompetenciaDAO) {
    this.tribunalCompetenciaDAO = tribunalCompetenciaDAO;
  }


  @Override
  public List<TribunalVO> listarTribunalPorCompetencia(Long idCompetencia) {

    List<TribunalCompetenciaVO> tribunalCompetenciaVOS = new ArrayList<>();
    List<TribunalCompetencia> tribunalCompetencias = this.tribunalCompetenciaDAO.listarTribunalPorCompetencia(idCompetencia);
    List<TribunalVO> tribunalVOS = new ArrayList<>();
    if(tribunalCompetencias.size() > 0){
      tribunalCompetencias.forEach(tribunal ->{
        TribunalVO tribunalVO = new TribunalVO();
        tribunalVO.setId(tribunal.getTribunal().getId());
        tribunalVO.setGlosa(tribunal.getTribunal().getGlosa());
        tribunalVOS.add(tribunalVO);
      });
    }
    return tribunalVOS;
  }

}
