package usuario.causa.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usuario.causa.model.CompetenciaVO;
import usuario.causa.model.ParteVO;
import usuario.causa.model.TribunalVO;
import usuario.causa.repository.ParteDAO;
import usuario.causa.repository.model.Parte;
import usuario.causa.service.ParteService;

@Service
public class ParteServiceImpl implements ParteService {

  private final ParteDAO parteDAO;

  @Autowired
  public ParteServiceImpl(ParteDAO parteDAO) {
    this.parteDAO = parteDAO;
  }

  @Override
  public List<ParteVO> buscarPartes(Long idUsuario, List<Long> competencias) {
    List<ParteVO> parteVOS = new ArrayList<>();
    List<Parte> partes = this.parteDAO.buscarPartes(idUsuario, competencias);
    if(!partes.isEmpty()){
      partes.forEach(parte ->{
        ParteVO parteVO = new ParteVO();
        parteVO.setId(parte.getId());
        parteVOS.add(parteVO);
      });
    }
    return parteVOS;
  }
}
