package usuario.causa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usuario.causa.model.CuadernoVO;
import usuario.causa.repository.CuadernoDAO;
import usuario.causa.repository.model.Causa;
import usuario.causa.repository.model.Cuaderno;
import usuario.causa.service.CuadernoService;

@Service
public class CuadernoServiceImpl implements CuadernoService {

  private final CuadernoDAO cuadernoDAO;

  @Autowired
  public CuadernoServiceImpl(CuadernoDAO cuadernoDAO) {
    this.cuadernoDAO = cuadernoDAO;
  }

  @Override
  public CuadernoVO buscarId(Long id) {
    Causa causa = new Causa();
    Cuaderno cuaderno = this.cuadernoDAO.buscarId(id);
    CuadernoVO cuadernoVO = new CuadernoVO();
    cuadernoVO.setId(cuaderno.getId());
    causa.setId(cuaderno.getCausa().getId());
    cuadernoVO.setCausa(causa);
    return cuadernoVO;
  }
}
