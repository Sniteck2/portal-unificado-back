package usuario.causa.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usuario.causa.model.ResumenCausaVO;
import usuario.causa.repository.ResumenCausaDAO;
import usuario.causa.repository.model.ResumenCausa;
import usuario.causa.service.ResumenCausaService;

@Service
public class ResumenCausaServiceImpl implements ResumenCausaService {

  private final ResumenCausaDAO resumenCausaDAO;

  @Autowired
  public ResumenCausaServiceImpl(ResumenCausaDAO resumenCausaDAO) {
    this.resumenCausaDAO = resumenCausaDAO;
  }

  @Override
  public List<ResumenCausaVO> listarTodo() {
    return this.cambiarVO(this.resumenCausaDAO.listarTodo());
  }

  private List<ResumenCausaVO> cambiarVO(List<ResumenCausa> resumenCausas){
    List<ResumenCausaVO> resumenCausaVOS = new ArrayList<>();
    ResumenCausaVO resumenCausaVO = new ResumenCausaVO();
    if(!resumenCausas.isEmpty()){
      resumenCausas.forEach(resumenCausa -> {
        resumenCausaVO.setId(resumenCausa.getId());
        resumenCausaVO.setFechaInicio(resumenCausa.getFechaInicio());
        resumenCausaVO.setFechaTermino(resumenCausa.getFechaTermino());
        resumenCausaVO.setTotalRegistroBase(resumenCausa.getTotalRegistroBase());
        resumenCausaVO.setTotalRegistroBaseEstimada(resumenCausa.getTotalRegistroBaseEstimada());
        resumenCausaVO.setTotalRegistroPortal(resumenCausa.getTotalRegistroPortal());
        resumenCausaVO.setTiempo(resumenCausa.getTiempo());
        resumenCausaVOS.add(resumenCausaVO);
      });
    }
    return resumenCausaVOS;
  }
}
