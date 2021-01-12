package usuario.causa.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usuario.causa.model.CompetenciaVO;
import usuario.causa.repository.CompetenciaDAO;
import usuario.causa.repository.model.Competencia;
import usuario.causa.service.CompetenciaService;

@Service
public class CompetenciaServiceImpl implements CompetenciaService {

  private final CompetenciaDAO competenciaDAO;

  @Autowired
  public CompetenciaServiceImpl(CompetenciaDAO competenciaDAO) {
    this.competenciaDAO = competenciaDAO;
  }

  @Override
  public List<CompetenciaVO> listarCompetencias() {
    List<Competencia> competencias = competenciaDAO.listarCompetencias();
    List<CompetenciaVO> competenciaVOS = new ArrayList<>();
    if(competencias.size() > 0){
      competencias.forEach(comp ->{
        CompetenciaVO competenciaVO = new CompetenciaVO();
        competenciaVO.setId(comp.getId());
        competenciaVO.setGlosa(comp.getGlosa());
        competenciaVO.setIdfLetra(comp.getIdfLetra());
        competenciaVO.setFlgActivo(comp.getFlgActivo());
        competenciaVO.setOrden(comp.getOrden());
        competenciaVO.setNuevaGlosa(comp.getNuevaGlosa());
        competenciaVOS.add(competenciaVO);
      });
    }
    return competenciaVOS;
  }
}
